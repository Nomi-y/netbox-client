package dev.icelabs.netbox.model.response;

import java.util.Optional;

public record DeviceRole(
        String name,
        String slug,
        Optional<DeviceRole> parent,
        Optional<String> color,
        Optional<String> description) {
}
