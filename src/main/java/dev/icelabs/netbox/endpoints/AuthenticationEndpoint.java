package dev.icelabs.netbox.endpoints;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.client.RestClient;

public class AuthenticationEndpoint extends Endpoint {

    public AuthenticationEndpoint(RestClient client, Endpoint caller) {
        super(client, ApiStrings.ATUH_CHECK, caller);
    }

    public User get() {
        return this._get().as(User.class);
    }

}
