package dev.icelabs.netbox.endpoints.dcim.devices;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.ApiStrings;
import dev.icelabs.netbox.endpoints.Endpoint;
import dev.icelabs.netbox.model.response.Device;
import dev.icelabs.netbox.model.response.PagedResponse;

public class DcimDevices extends Endpoint {

    public DcimDevices(RestClient client, Endpoint caller) {
        super(client, ApiStrings.DCIM_DEVICES, caller);
    }

    public PagedResponse<Device> get() {
        return this._get()
                .asPaged(Device.class);
    }

    public Device get(int id) {
        return this._get(id)
                .as(Device.class);
    }

}
