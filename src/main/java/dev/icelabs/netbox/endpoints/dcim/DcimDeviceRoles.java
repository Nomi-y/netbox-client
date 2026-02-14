
package dev.icelabs.netbox.endpoints.dcim;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.ApiStrings;
import dev.icelabs.netbox.endpoints.Endpoint;
import dev.icelabs.netbox.model.DeviceRole;
import dev.icelabs.netbox.model.PaginatedDeviceRoleList;

public class DcimDeviceRoles extends Endpoint {

    public DcimDeviceRoles(RestClient client, Endpoint caller) {
        super(client, ApiStrings.DCIM_DEVICE_ROLES, caller);
    }

    public PaginatedDeviceRoleList get() {
        return this._get()
                .as(PaginatedDeviceRoleList.class);
    }

    public DeviceRole get(int id) {
        return this._get(id)
                .as(DeviceRole.class);
    }

}
