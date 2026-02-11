package dev.icelabs.netbox.endpoints.dcim.device_roles;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.ApiStrings;
import dev.icelabs.netbox.endpoints.Endpoint;
import dev.icelabs.netbox.model.response.DeviceRole;
import dev.icelabs.netbox.model.response.PagedResponse;

public class DcimDeviceRoles extends Endpoint {

    public DcimDeviceRoles(RestClient client, Endpoint caller) {
        super(client, ApiStrings.DCIM_DEVICE_ROLES, caller);
    }

    public PagedResponse<DeviceRole> get() {
        return this._get()
                .asPaged(DeviceRole.class);
    }

    public DeviceRole get(int id) {
        return this._get(id)
                .as(DeviceRole.class);
    }

}
