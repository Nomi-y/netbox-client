package dev.icelabs.netbox.endpoints;

import java.util.Map;

import dev.icelabs.netbox.api.StatusApi;
import retrofit2.Call;

public class StatusEndpoint extends Endpoint<StatusApi> {

    public StatusEndpoint(StatusApi service) {
        super(service);
    }

    public Call<Map<String, Object>> get() {
        return service.statusRetrieve();
    }
}
