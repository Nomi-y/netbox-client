package dev.icelabs.netbox.api;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StatusApi {
    @GET("api/status/")
    Call<Map<String, Object>> statusRetrieve();

}
