package dev.icelabs.netbox.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import dev.icelabs.netbox.model.common.DeviceStatus;

public record NestedDeviceStatus(
        @JsonProperty(value = "value", required = true) DeviceStatus value) {
}
