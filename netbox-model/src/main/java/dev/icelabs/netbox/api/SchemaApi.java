package dev.icelabs.netbox.api;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SchemaApi {
    @GET("api/schema/")
    Call<Map<String, Object>> schemaRetrieve();

}
