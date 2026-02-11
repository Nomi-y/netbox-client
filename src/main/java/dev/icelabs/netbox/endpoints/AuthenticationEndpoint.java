package dev.icelabs.netbox.endpoints;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.model.response.AuthenticationResponse;

public class AuthenticationEndpoint extends Endpoint {

    public AuthenticationEndpoint(RestClient client, Endpoint caller) {
        super(client, ApiStrings.ATUH_CHECK, caller);
    }

    public AuthenticationResponse get() {
        return this._get()
                .toEntity(AuthenticationResponse.class)
                .getBody();
    }

}
