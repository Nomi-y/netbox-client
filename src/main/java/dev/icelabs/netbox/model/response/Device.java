package dev.icelabs.netbox.model.response;

import java.sql.Date;
import java.util.Optional;

public record Device(
        int id,
        String display,
        DeviceType device_type,
        DeviceRole role,
        Site site,
        Date created,
        Date last_updated,
        NestedDeviceStatus status,
        Optional<String> name,
        Optional<String> description,
        Optional<String> serial,
        Optional<String> asset_tag,
        Optional<String> comment) {

}
