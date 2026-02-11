package dev.icelabs.netbox;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.AuthenticationEndpoint;
import dev.icelabs.netbox.endpoints.StatusEndpoint;
import dev.icelabs.netbox.endpoints.dcim.DcimEndpoint;
import dev.icelabs.netbox.token.NetboxApiToken;

public class NetboxClient {
    public final String base_url;
    private final NetboxApiToken token;

    private final RestClient client;

    public NetboxClient(
            String base_url,
            NetboxApiToken token) {
        this.base_url = base_url;
        this.token = token;

        this.client = RestClient.builder()
                .baseUrl(this.base_url)
                .defaultHeader("Authorization", this.token.createAuthHeader())
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("Accept", "application/json")
                .build();
    }

    // INFO: api endpoint structure matches api doc

    public AuthenticationEndpoint auth() {
        return new AuthenticationEndpoint(client, null);
    }

    public StatusEndpoint status() {
        return new StatusEndpoint(client, null);
    }

    public DcimEndpoint dcim() {
        return new DcimEndpoint(client, null);
    }

}
