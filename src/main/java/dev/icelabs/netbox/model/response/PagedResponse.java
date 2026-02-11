package dev.icelabs.netbox.model.response;

import java.util.List;

public record PagedResponse<T>(
        int count,
        String next,
        String previous,
        List<T> results) {

}
