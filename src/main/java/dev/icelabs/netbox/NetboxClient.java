package dev.icelabs.netbox;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.AuthenticationEndpoint;
import dev.icelabs.netbox.endpoints.StatusEndpoint;
import dev.icelabs.netbox.endpoints.dcim.DcimEndpoint;
import dev.icelabs.netbox.endpoints.ipam.IpamEndpoint;
import dev.icelabs.netbox.token.NetboxApiToken;

public class NetboxClient {
    public final String base_url;
    private final NetboxApiToken token;

    private final RestClient client;

    private final AuthenticationEndpoint auth;
    private final StatusEndpoint status;
    private final DcimEndpoint dcim;
    private final IpamEndpoint ipam;

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

        auth = new AuthenticationEndpoint(client, null);
        status = new StatusEndpoint(client, null);
        dcim = new DcimEndpoint(client, null);
        ipam = new IpamEndpoint(client, null);
    }

    // INFO: api endpoint structure matches api doc

    public AuthenticationEndpoint auth() {
        return auth;
    }

    public StatusEndpoint status() {
        return status;
    }

    public DcimEndpoint dcim() {
        return dcim;
    }

    public IpamEndpoint ipam() {
        return ipam;
    }

}
