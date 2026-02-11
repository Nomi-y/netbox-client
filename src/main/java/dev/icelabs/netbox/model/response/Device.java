package dev.icelabs.netbox.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Device(
        @JsonProperty(value = "role", required = true) DeviceRole role,

        @JsonProperty(value = "device_type", required = true) DeviceType device_type,

        @JsonProperty(value = "site", required = true) Site site,

        @JsonProperty(value = "status", required = true) NestedDeviceStatus status,

        @JsonProperty(value = "name", required = false) String name,

        @JsonProperty(value = "description", required = false) String description,

        @JsonProperty(value = "serial", required = false) String serial,

        @JsonProperty(value = "assert_tag", required = false) String asset_tag) {

}
