package dev.icelabs.netbox.model.common;

import java.util.Objects;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class HexColor {

    @JsonValue
    public final String value;

    private static final Pattern HEX_PATTERN = Pattern.compile("^([0-9A-Fa-f]{3}|[0-9A-Fa-f]{6})$");

    @JsonCreator
    public HexColor(String value) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Hex color cannot be null or blank");

        String trimmed = value.trim();

        if (!HEX_PATTERN.matcher(trimmed).matches())
            throw new IllegalArgumentException("Invalid hex color: " + trimmed);

        this.value = trimmed;
    }

    public static HexColor fromRgb(int r, int g, int b) {
        if (r < 0
                || r > 255
                || g < 0
                || g > 255
                || b < 0
                || b > 255)
            throw new IllegalArgumentException("RGB values must be 0-255");

        return new HexColor(String.format("%02x%02x%02x", r, g, b));
    }

    public int[] toRgb() {
        String hex = value.substring(1);

        if (hex.length() == 3) {
            int r = Integer.parseInt(hex.substring(0, 1) + hex.substring(0, 1), 16);
            int g = Integer.parseInt(hex.substring(1, 2) + hex.substring(1, 2), 16);
            int b = Integer.parseInt(hex.substring(2, 3) + hex.substring(2, 3), 16);
            return new int[] { r, g, b };
        } else {
            int r = Integer.parseInt(hex.substring(0, 2), 16);
            int g = Integer.parseInt(hex.substring(2, 4), 16);
            int b = Integer.parseInt(hex.substring(4, 6), 16);
            return new int[] { r, g, b };
        }
    }

    public HexColor toUpperCase() {
        return new HexColor(value.toUpperCase());
    }

    public HexColor toLowerCase() {
        return new HexColor(value.toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        HexColor hexColor = (HexColor) o;
        return value.equalsIgnoreCase(hexColor.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value.toLowerCase());
    }

    @Override
    public String toString() {
        return value;
    }
}
