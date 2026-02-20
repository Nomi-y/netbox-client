package dev.icelabs.netbox.api;

import dev.icelabs.netbox.model.DeviceWithConfigContext;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TestApi {
    @GET("api/dcim/devices/{id}/")
    Call<DeviceWithConfigContext> dcimDevicesRetrieve(
            @retrofit2.http.Path("id") Integer id);

}
