package dev.icelabs.netbox.endpoints;

import java.util.Map;

import dev.icelabs.netbox.api.AuthenticationCheckApi;
import retrofit2.Call;

public class AuthEndpoint extends Endpoint<AuthenticationCheckApi> {

    public AuthEndpoint(AuthenticationCheckApi service) {
        super(service);
    }

    public Call<Map<String, Object>> check() {
        return service.authenticationCheckRetrieve();
    }

}
