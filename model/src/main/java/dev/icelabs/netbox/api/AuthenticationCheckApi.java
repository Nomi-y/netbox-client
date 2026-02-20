package dev.icelabs.netbox.api;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AuthenticationCheckApi {

    @GET("api/authentication-check/")
    Call<Map<String, Object>> authenticationCheckRetrieve();

}
