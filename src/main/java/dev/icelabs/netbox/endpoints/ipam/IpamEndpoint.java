package dev.icelabs.netbox.endpoints.ipam;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.ApiStrings;
import dev.icelabs.netbox.endpoints.Endpoint;

public class IpamEndpoint extends Endpoint {

    public IpamEndpoint(RestClient client, Endpoint caller) {
        super(client, ApiStrings.IPAM, caller);
    }

}
