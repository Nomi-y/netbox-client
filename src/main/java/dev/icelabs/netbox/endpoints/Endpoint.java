package dev.icelabs.netbox.endpoints;

import java.util.Objects;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.lib.PathBuilder;
import dev.icelabs.netbox.lib.ResponseProcessor;

public abstract class Endpoint {

    protected final RestClient client;
    protected final String endpoint;

    protected Endpoint(
            RestClient client,
            String endpoint,
            Endpoint caller) {

        Objects.requireNonNull(client);
        Objects.requireNonNull(endpoint);

        this.client = client;

        var builder = new PathBuilder();
        if (caller != null)
            builder.addSegment(caller.endpoint);
        this.endpoint = builder
                .addSegment(endpoint)
                .toString();

    }

    public ResponseProcessor _get() {
        var spec = this.client.get()
                .uri(this.endpoint)
                .retrieve();
        return new ResponseProcessor(spec);
    }

    public ResponseProcessor _get(int id) {
        var spec = this.client.get()
                .uri(
                        new PathBuilder()
                                .addSegment(this.endpoint)
                                .addSegment("{id}")
                                .toString(),
                        id)
                .retrieve();
        return new ResponseProcessor(spec);
    }

}
