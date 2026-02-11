package dev.icelabs.netbox.model.common;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DeviceStatus {
    @JsonProperty("offline")
    Offline,

    @JsonProperty("active")
    Active,

    @JsonProperty("planned")
    Planned,

    @JsonProperty("staged")
    Staged,

    @JsonProperty("failed")
    Failed,

    @JsonProperty("inventory")
    Inventory,

    @JsonProperty("decommissioning")
    Decommissioning;
}
