package dev.icelabs.netbox;

import dev.icelabs.netbox.api.*;
import dev.icelabs.netbox.auth.ApiKeyAuth;
import dev.icelabs.netbox.auth.HttpBearerAuth;
import dev.icelabs.netbox.endpoints.*;
import dev.icelabs.netbox.token.*;

public class NetboxClient {
    public final String base_url;

    private final ApiClient client;

    public final AuthEndpoint auth;
    public final CircuitsEndpoint circuits;
    public final CoreEndpoint core;
    public final DcimEndpoint dcim;
    public final ExtrasEndpoint extras;
    public final IpamEndpoint ipam;
    public final SchemaEndpoint schema;
    public final StatusEndpoint status;
    public final TenancyEndpoint tenancy;
    public final UsersEndpoint users;
    public final VirtEndpoint virtualization;
    public final VpnEndpoint vpn;
    public final WirelessEndpoint wireless;

    public NetboxClient(
            String base_url,
            NetboxApiToken token) {
        this.base_url = base_url;
        this.client = new ApiClient();
        addAuth(token);

        client.createAdapter(base_url);

        auth = new AuthEndpoint(
                client.createService(AuthenticationCheckApi.class));

        circuits = new CircuitsEndpoint(
                client.createService(CircuitsApi.class));

        core = new CoreEndpoint(
                client.createService(CoreApi.class));

        dcim = new DcimEndpoint(
                client.createService(DcimApi.class));

        extras = new ExtrasEndpoint(
                client.createService(ExtrasApi.class));

        ipam = new IpamEndpoint(
                client.createService(IpamApi.class));

        schema = new SchemaEndpoint(
                client.createService(SchemaApi.class));

        status = new StatusEndpoint(
                client.createService(StatusApi.class));

        tenancy = new TenancyEndpoint(
                client.createService(TenancyApi.class));

        users = new UsersEndpoint(
                client.createService(UsersApi.class));

        virtualization = new VirtEndpoint(
                client.createService(VirtualizationApi.class));

        vpn = new VpnEndpoint(
                client.createService(VpnApi.class));

        wireless = new WirelessEndpoint(
                client.createService(WirelessApi.class));

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

    public AuthEndpoint auth() {
        return auth;
    }

    public CircuitsEndpoint circuits() {
        return circuits;
    }

    public CoreEndpoint core() {
        return core;
    }

    public DcimEndpoint dcim() {
        return dcim;
    }

    public ExtrasEndpoint extras() {
        return extras;
    }

    public IpamEndpoint ipam() {
        return ipam;
    }

    public SchemaEndpoint schema() {
        return schema;
    }

    public StatusEndpoint status() {
        return status;
    }

    public TenancyEndpoint tenancy() {
        return tenancy;
    }

    public UsersEndpoint users() {
        return users;
    }

    public VirtEndpoint virtualization() {
        return virtualization;
    }

    public VpnEndpoint vpn() {
        return vpn;
    }

    public WirelessEndpoint wireless() {
        return wireless;
    }

}
