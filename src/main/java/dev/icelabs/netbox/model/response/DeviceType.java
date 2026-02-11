package dev.icelabs.netbox.model.response;

public record DeviceType(
        Manufacturer manufacturer,
        String model,
        String slug,
        String description

) {

}
