package dev.icelabs.netbox.api;

import dev.icelabs.netbox.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.time.OffsetDateTime;
import dev.icelabs.netbox.model.PaginatedWirelessLANGroupList;
import dev.icelabs.netbox.model.PaginatedWirelessLANList;
import dev.icelabs.netbox.model.PaginatedWirelessLinkList;
import dev.icelabs.netbox.model.PatchedWritableWirelessLANGroupRequest;
import dev.icelabs.netbox.model.PatchedWritableWirelessLANRequest;
import dev.icelabs.netbox.model.PatchedWritableWirelessLinkRequest;
import java.util.UUID;
import dev.icelabs.netbox.model.WirelessLAN;
import dev.icelabs.netbox.model.WirelessLANGroup;
import dev.icelabs.netbox.model.WirelessLANGroupRequest;
import dev.icelabs.netbox.model.WirelessLANRequest;
import dev.icelabs.netbox.model.WirelessLink;
import dev.icelabs.netbox.model.WirelessLinkRequest;
import dev.icelabs.netbox.model.WirelessWirelessLanGroupsCreateRequest;
import dev.icelabs.netbox.model.WirelessWirelessLansCreateRequest;
import dev.icelabs.netbox.model.WirelessWirelessLinksCreateRequest;
import dev.icelabs.netbox.model.WritableWirelessLANGroupRequest;
import dev.icelabs.netbox.model.WritableWirelessLANRequest;
import dev.icelabs.netbox.model.WritableWirelessLinkRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface WirelessApi {
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/wireless/wireless-lan-groups/")
  Call<Void> wirelessWirelessLanGroupsBulkDestroy(
    @retrofit2.http.Body List<WirelessLANGroupRequest> wirelessLANGroupRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/wireless/wireless-lan-groups/")
  Call<List<WirelessLANGroup>> wirelessWirelessLanGroupsBulkPartialUpdate(
    @retrofit2.http.Body List<WirelessLANGroupRequest> wirelessLANGroupRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/wireless/wireless-lan-groups/")
  Call<List<WirelessLANGroup>> wirelessWirelessLanGroupsBulkUpdate(
    @retrofit2.http.Body List<WirelessLANGroupRequest> wirelessLANGroupRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/wireless/wireless-lan-groups/")
  Call<WirelessLANGroup> wirelessWirelessLanGroupsCreate(
    @retrofit2.http.Body WirelessWirelessLanGroupsCreateRequest wirelessWirelessLanGroupsCreateRequest);

  @DELETE("api/wireless/wireless-lan-groups/{id}/")
  Call<Void> wirelessWirelessLanGroupsDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/wireless/wireless-lan-groups/")
  Call<PaginatedWirelessLANGroupList> wirelessWirelessLanGroupsList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/wireless/wireless-lan-groups/{id}/")
  Call<WirelessLANGroup> wirelessWirelessLanGroupsPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedWritableWirelessLANGroupRequest patchedWritableWirelessLANGroupRequest);

  @GET("api/wireless/wireless-lan-groups/{id}/")
  Call<WirelessLANGroup> wirelessWirelessLanGroupsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/wireless/wireless-lan-groups/{id}/")
  Call<WirelessLANGroup> wirelessWirelessLanGroupsUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableWirelessLANGroupRequest writableWirelessLANGroupRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/wireless/wireless-lans/")
  Call<Void> wirelessWirelessLansBulkDestroy(
    @retrofit2.http.Body List<WirelessLANRequest> wirelessLANRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/wireless/wireless-lans/")
  Call<List<WirelessLAN>> wirelessWirelessLansBulkPartialUpdate(
    @retrofit2.http.Body List<WirelessLANRequest> wirelessLANRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/wireless/wireless-lans/")
  Call<List<WirelessLAN>> wirelessWirelessLansBulkUpdate(
    @retrofit2.http.Body List<WirelessLANRequest> wirelessLANRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/wireless/wireless-lans/")
  Call<WirelessLAN> wirelessWirelessLansCreate(
    @retrofit2.http.Body WirelessWirelessLansCreateRequest wirelessWirelessLansCreateRequest);

  @DELETE("api/wireless/wireless-lans/{id}/")
  Call<Void> wirelessWirelessLansDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/wireless/wireless-lans/")
  Call<PaginatedWirelessLANList> wirelessWirelessLansList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/wireless/wireless-lans/{id}/")
  Call<WirelessLAN> wirelessWirelessLansPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedWritableWirelessLANRequest patchedWritableWirelessLANRequest);

  @GET("api/wireless/wireless-lans/{id}/")
  Call<WirelessLAN> wirelessWirelessLansRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/wireless/wireless-lans/{id}/")
  Call<WirelessLAN> wirelessWirelessLansUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableWirelessLANRequest writableWirelessLANRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/wireless/wireless-links/")
  Call<Void> wirelessWirelessLinksBulkDestroy(
    @retrofit2.http.Body List<WirelessLinkRequest> wirelessLinkRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/wireless/wireless-links/")
  Call<List<WirelessLink>> wirelessWirelessLinksBulkPartialUpdate(
    @retrofit2.http.Body List<WirelessLinkRequest> wirelessLinkRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/wireless/wireless-links/")
  Call<List<WirelessLink>> wirelessWirelessLinksBulkUpdate(
    @retrofit2.http.Body List<WirelessLinkRequest> wirelessLinkRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/wireless/wireless-links/")
  Call<WirelessLink> wirelessWirelessLinksCreate(
    @retrofit2.http.Body WirelessWirelessLinksCreateRequest wirelessWirelessLinksCreateRequest);

  @DELETE("api/wireless/wireless-links/{id}/")
  Call<Void> wirelessWirelessLinksDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/wireless/wireless-links/")
  Call<PaginatedWirelessLinkList> wirelessWirelessLinksList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/wireless/wireless-links/{id}/")
  Call<WirelessLink> wirelessWirelessLinksPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedWritableWirelessLinkRequest patchedWritableWirelessLinkRequest);

  @GET("api/wireless/wireless-links/{id}/")
  Call<WirelessLink> wirelessWirelessLinksRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/wireless/wireless-links/{id}/")
  Call<WirelessLink> wirelessWirelessLinksUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableWirelessLinkRequest writableWirelessLinkRequest);

}
