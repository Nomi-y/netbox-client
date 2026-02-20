package dev.icelabs.netbox;

import dev.icelabs.netbox.api.AuthenticationCheckApi;
import dev.icelabs.netbox.api.DcimApi;
import dev.icelabs.netbox.api.StatusApi;
import dev.icelabs.netbox.api.TestApi;
import dev.icelabs.netbox.auth.ApiKeyAuth;
import dev.icelabs.netbox.auth.HttpBearerAuth;
import dev.icelabs.netbox.token.NetboxApiToken;
import dev.icelabs.netbox.token.NetboxApiV1Token;
import dev.icelabs.netbox.token.NetboxApiV2Token;

public class NetboxClient {
    public final String base_url;

    private final ApiClient client;

    public NetboxClient(
            String base_url,
            NetboxApiToken token) {
        this.base_url = base_url;
        this.client = new ApiClient();
        addAuth(token);

        client.createAdapter(base_url);

    }

    protected boolean addAuth(NetboxApiToken token) {

        if (token instanceof NetboxApiV1Token) {
            ApiKeyAuth apiKeyAuth = new ApiKeyAuth("header", "Authorization");
            apiKeyAuth.setApiKey(token.getAuthString());
            client.addAuthorization("tokenAuth", apiKeyAuth);
            return true;
        } else if (token instanceof NetboxApiV2Token) {
            HttpBearerAuth apiKeyAuth = new HttpBearerAuth("bearer");
            apiKeyAuth.setBearerToken(token.getAuthString());
            client.addAuthorization("bearerAuth", apiKeyAuth);
            return true;
        }

        return false;
    }

    // INFO: api endpoint structure matches api doc

    public AuthenticationCheckApi auth() {
        return client.createService(AuthenticationCheckApi.class);
    }

    public DcimApi dcim() {
        return client.createService(DcimApi.class);
    }

    public StatusApi status() {
        return client.createService(StatusApi.class);
    }

    public TestApi test() {
        return client.createService(TestApi.class);
    }

}
