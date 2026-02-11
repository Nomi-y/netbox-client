package dev.icelabs.netbox.model.response;

import java.util.Optional;

import dev.icelabs.netbox.model.common.HexColor;

public record DeviceRole(
        String name,
        String slug,
        HexColor color,
        Optional<DeviceRole> parent,
        Optional<String> description,
        Optional<String> comment) {
}
