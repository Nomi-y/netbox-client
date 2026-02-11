package dev.icelabs.netbox.model.common;

public class HexColor {
    public final String value;

    public HexColor(
            String value) {
        if (value.isBlank())
            throw new IllegalArgumentException();

        this.value = value;
    }

}
