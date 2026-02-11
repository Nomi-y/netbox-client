package dev.icelabs.netbox.model.response;

import dev.icelabs.netbox.model.common.SiteStatus;

public record Site(
        String name,
        String slug,
        SiteStatus status,
        String description) {

}
