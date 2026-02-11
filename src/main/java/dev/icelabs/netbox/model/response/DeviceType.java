package dev.icelabs.netbox.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DeviceType(
        @JsonProperty(value = "manufacturer", required = true) Manufacturer manufacturer,
        @JsonProperty(value = "model", required = true) String model,
        @JsonProperty(value = "slug", required = true) String slug,
        @JsonProperty(value = "description", required = false) String description

) {

}
