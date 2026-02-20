package dev.icelabs.netbox.endpoints;

import java.util.Map;

import dev.icelabs.netbox.api.SchemaApi;
import retrofit2.Call;

public class SchemaEndpoint extends Endpoint<SchemaApi> {

    public SchemaEndpoint(SchemaApi service) {
        super(service);
    }

    public Call<Map<String, Object>> get() {
        return service.schemaRetrieve();
    }
}
