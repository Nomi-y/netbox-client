package dev.icelabs.netbox.api;

import dev.icelabs.netbox.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StatusApi {
  @GET("api/status/")
  Call<Map<String, Object>> statusRetrieve();
    

}
