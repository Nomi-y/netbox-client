package dev.icelabs.netbox.endpoints.dcim.manufacturers;

import org.springframework.web.client.RestClient;

import dev.icelabs.netbox.endpoints.ApiStrings;
import dev.icelabs.netbox.endpoints.Endpoint;
import dev.icelabs.netbox.model.response.Manufacturer;
import dev.icelabs.netbox.model.response.PagedResponse;

public class DcimManufacturers extends Endpoint {

    public DcimManufacturers(RestClient client, Endpoint caller) {
        super(client, ApiStrings.DCIM_MANUFACTURERS, caller);
    }

    public PagedResponse<Manufacturer> get() {
        return _get()
                .asPaged(Manufacturer.class);
    }

    public Manufacturer get(int id) {
        return _get(id)
                .as(Manufacturer.class);
    }

}
