package dev.icelabs.netbox.endpoints;

import org.springframework.web.client.RestClient;

public class StatusEndpoint extends Endpoint {

    public StatusEndpoint(RestClient client, Endpoint caller) {
        super(client, ApiStrings.STATUS, caller);
    }

    public boolean isApiReachable() {
        try {
            return _get()
                    .toBodiless()
                    .getStatusCode()
                    .is2xxSuccessful();
        } catch (Exception e) {
            return false;
        }
    }
}
