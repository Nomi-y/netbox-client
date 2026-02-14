package dev.icelabs.netbox.endpoints.dcim;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.ApiStrings;
import dev.icelabs.netbox.endpoints.Endpoint;
import dev.icelabs.netbox.model.DeviceWithConfigContext;
import dev.icelabs.netbox.model.PaginatedDeviceWithConfigContextList;

public class DcimDevices extends Endpoint {

    public DcimDevices(RestClient client, Endpoint caller) {
        super(client, ApiStrings.DCIM_DEVICES, caller);
    }

    public PaginatedDeviceWithConfigContextList get() {
        return this._get()
                .as(PaginatedDeviceWithConfigContextList.class);
    }

    public DeviceWithConfigContext get(int id) {
        return this._get(id)
                .as(DeviceWithConfigContext.class);
    }

}
