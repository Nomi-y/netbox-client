package dev.icelabs.netbox.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Manufacturer(
        @JsonProperty(value = "name", required = true) String name,
        @JsonProperty(value = "slug", required = true) String slug,
        @JsonProperty(value = "description", required = false) String description) {

}
