package dev.icelabs.netbox.lib;

import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient.ResponseSpec;

import dev.icelabs.netbox.model.response.PagedResponse;

public class ResponseProcessor {

    private final ResponseSpec spec;

    public ResponseProcessor(
            ResponseSpec spec) {
        Objects.requireNonNull(spec);
        this.spec = spec;
    }

    public <T> ResponseEntity<T> toEntity(Class<T> type) {
        return spec.toEntity(type);
    }

    public <T> T as(Class<T> type) {
        return spec.toEntity(type).getBody();
    }

    public ResponseEntity<Void> toBodiless() {
        return spec.toBodilessEntity();
    }

    public <T> PagedResponse<T> asPaged(Class<T> type) {
        var response = spec.toEntity(String.class);
        return ResponseUtils.parseResponseList(response.getBody(), type);
    }

}
