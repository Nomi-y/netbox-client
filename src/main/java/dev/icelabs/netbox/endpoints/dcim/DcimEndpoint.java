package dev.icelabs.netbox.endpoints.dcim;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.ApiStrings;
import dev.icelabs.netbox.endpoints.Endpoint;
import dev.icelabs.netbox.endpoints.dcim.devices.DcimDevices;
import dev.icelabs.netbox.endpoints.dcim.manufacturers.DcimManufacturers;

public class DcimEndpoint extends Endpoint {

    public DcimEndpoint(RestClient client, Endpoint caller) {
        super(client, ApiStrings.DCIM, caller);
    }

    public DcimDevices devices() {
        return new DcimDevices(client, this);
    }

    public DcimManufacturers manufacturers() {
        return new DcimManufacturers(client, this);
    }

}
