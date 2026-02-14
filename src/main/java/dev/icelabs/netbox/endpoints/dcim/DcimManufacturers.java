package dev.icelabs.netbox.endpoints.dcim;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.ApiStrings;
import dev.icelabs.netbox.endpoints.Endpoint;
import dev.icelabs.netbox.model.Manufacturer;
import dev.icelabs.netbox.model.PaginatedManufacturerList;

public class DcimManufacturers extends Endpoint {

    public DcimManufacturers(RestClient client, Endpoint caller) {
        super(client, ApiStrings.DCIM_MANUFACTURERS, caller);
    }

    public PaginatedManufacturerList get() {
        return _get()
                .as(PaginatedManufacturerList.class);
    }

    public Manufacturer get(int id) {
        return _get(id)
                .as(Manufacturer.class);
    }

}
