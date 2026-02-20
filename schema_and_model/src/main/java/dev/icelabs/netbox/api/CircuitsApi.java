package dev.icelabs.netbox.api;

import dev.icelabs.netbox.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import dev.icelabs.netbox.model.Circuit;
import dev.icelabs.netbox.model.CircuitGroup;
import dev.icelabs.netbox.model.CircuitGroupAssignment;
import dev.icelabs.netbox.model.CircuitGroupAssignmentRequest;
import dev.icelabs.netbox.model.CircuitGroupRequest;
import dev.icelabs.netbox.model.CircuitRequest;
import dev.icelabs.netbox.model.CircuitTermination;
import dev.icelabs.netbox.model.CircuitTerminationRequest;
import dev.icelabs.netbox.model.CircuitType;
import dev.icelabs.netbox.model.CircuitTypeRequest;
import dev.icelabs.netbox.model.CircuitsCircuitGroupAssignmentsCreateRequest;
import dev.icelabs.netbox.model.CircuitsCircuitGroupsCreateRequest;
import dev.icelabs.netbox.model.CircuitsCircuitTerminationsCreateRequest;
import dev.icelabs.netbox.model.CircuitsCircuitTypesCreateRequest;
import dev.icelabs.netbox.model.CircuitsCircuitsCreateRequest;
import dev.icelabs.netbox.model.CircuitsProviderAccountsCreateRequest;
import dev.icelabs.netbox.model.CircuitsProviderNetworksCreateRequest;
import dev.icelabs.netbox.model.CircuitsProvidersCreateRequest;
import dev.icelabs.netbox.model.CircuitsVirtualCircuitTerminationsCreateRequest;
import dev.icelabs.netbox.model.CircuitsVirtualCircuitTypesCreateRequest;
import dev.icelabs.netbox.model.CircuitsVirtualCircuitsCreateRequest;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import dev.icelabs.netbox.model.PaginatedCircuitGroupAssignmentList;
import dev.icelabs.netbox.model.PaginatedCircuitGroupList;
import dev.icelabs.netbox.model.PaginatedCircuitList;
import dev.icelabs.netbox.model.PaginatedCircuitTerminationList;
import dev.icelabs.netbox.model.PaginatedCircuitTypeList;
import dev.icelabs.netbox.model.PaginatedProviderAccountList;
import dev.icelabs.netbox.model.PaginatedProviderList;
import dev.icelabs.netbox.model.PaginatedProviderNetworkList;
import dev.icelabs.netbox.model.PaginatedVirtualCircuitList;
import dev.icelabs.netbox.model.PaginatedVirtualCircuitTerminationList;
import dev.icelabs.netbox.model.PaginatedVirtualCircuitTypeList;
import dev.icelabs.netbox.model.PatchedCircuitGroupRequest;
import dev.icelabs.netbox.model.PatchedCircuitTerminationRequest;
import dev.icelabs.netbox.model.PatchedCircuitTypeRequest;
import dev.icelabs.netbox.model.PatchedProviderAccountRequest;
import dev.icelabs.netbox.model.PatchedProviderNetworkRequest;
import dev.icelabs.netbox.model.PatchedProviderRequest;
import dev.icelabs.netbox.model.PatchedVirtualCircuitTypeRequest;
import dev.icelabs.netbox.model.PatchedWritableCircuitGroupAssignmentRequest;
import dev.icelabs.netbox.model.PatchedWritableCircuitRequest;
import dev.icelabs.netbox.model.PatchedWritableVirtualCircuitRequest;
import dev.icelabs.netbox.model.PatchedWritableVirtualCircuitTerminationRequest;
import dev.icelabs.netbox.model.Provider;
import dev.icelabs.netbox.model.ProviderAccount;
import dev.icelabs.netbox.model.ProviderAccountRequest;
import dev.icelabs.netbox.model.ProviderNetwork;
import dev.icelabs.netbox.model.ProviderNetworkRequest;
import dev.icelabs.netbox.model.ProviderRequest;
import java.util.UUID;
import dev.icelabs.netbox.model.VirtualCircuit;
import dev.icelabs.netbox.model.VirtualCircuitRequest;
import dev.icelabs.netbox.model.VirtualCircuitTermination;
import dev.icelabs.netbox.model.VirtualCircuitTerminationRequest;
import dev.icelabs.netbox.model.VirtualCircuitType;
import dev.icelabs.netbox.model.VirtualCircuitTypeRequest;
import dev.icelabs.netbox.model.WritableCircuitGroupAssignmentRequest;
import dev.icelabs.netbox.model.WritableCircuitRequest;
import dev.icelabs.netbox.model.WritableVirtualCircuitRequest;
import dev.icelabs.netbox.model.WritableVirtualCircuitTerminationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface CircuitsApi {
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/circuit-group-assignments/")
  Call<Void> circuitsCircuitGroupAssignmentsBulkDestroy(
    @retrofit2.http.Body List<CircuitGroupAssignmentRequest> circuitGroupAssignmentRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuit-group-assignments/")
  Call<List<CircuitGroupAssignment>> circuitsCircuitGroupAssignmentsBulkPartialUpdate(
    @retrofit2.http.Body List<CircuitGroupAssignmentRequest> circuitGroupAssignmentRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuit-group-assignments/")
  Call<List<CircuitGroupAssignment>> circuitsCircuitGroupAssignmentsBulkUpdate(
    @retrofit2.http.Body List<CircuitGroupAssignmentRequest> circuitGroupAssignmentRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/circuit-group-assignments/")
  Call<CircuitGroupAssignment> circuitsCircuitGroupAssignmentsCreate(
    @retrofit2.http.Body CircuitsCircuitGroupAssignmentsCreateRequest circuitsCircuitGroupAssignmentsCreateRequest);

  @DELETE("api/circuits/circuit-group-assignments/{id}/")
  Call<Void> circuitsCircuitGroupAssignmentsDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/circuit-group-assignments/")
  Call<PaginatedCircuitGroupAssignmentList> circuitsCircuitGroupAssignmentsList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuit-group-assignments/{id}/")
  Call<CircuitGroupAssignment> circuitsCircuitGroupAssignmentsPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedWritableCircuitGroupAssignmentRequest patchedWritableCircuitGroupAssignmentRequest);

  @GET("api/circuits/circuit-group-assignments/{id}/")
  Call<CircuitGroupAssignment> circuitsCircuitGroupAssignmentsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuit-group-assignments/{id}/")
  Call<CircuitGroupAssignment> circuitsCircuitGroupAssignmentsUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableCircuitGroupAssignmentRequest writableCircuitGroupAssignmentRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/circuit-groups/")
  Call<Void> circuitsCircuitGroupsBulkDestroy(
    @retrofit2.http.Body List<CircuitGroupRequest> circuitGroupRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuit-groups/")
  Call<List<CircuitGroup>> circuitsCircuitGroupsBulkPartialUpdate(
    @retrofit2.http.Body List<CircuitGroupRequest> circuitGroupRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuit-groups/")
  Call<List<CircuitGroup>> circuitsCircuitGroupsBulkUpdate(
    @retrofit2.http.Body List<CircuitGroupRequest> circuitGroupRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/circuit-groups/")
  Call<CircuitGroup> circuitsCircuitGroupsCreate(
    @retrofit2.http.Body CircuitsCircuitGroupsCreateRequest circuitsCircuitGroupsCreateRequest);

  @DELETE("api/circuits/circuit-groups/{id}/")
  Call<Void> circuitsCircuitGroupsDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/circuit-groups/")
  Call<PaginatedCircuitGroupList> circuitsCircuitGroupsList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuit-groups/{id}/")
  Call<CircuitGroup> circuitsCircuitGroupsPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedCircuitGroupRequest patchedCircuitGroupRequest);

  @GET("api/circuits/circuit-groups/{id}/")
  Call<CircuitGroup> circuitsCircuitGroupsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuit-groups/{id}/")
  Call<CircuitGroup> circuitsCircuitGroupsUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body CircuitGroupRequest circuitGroupRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/circuit-terminations/")
  Call<Void> circuitsCircuitTerminationsBulkDestroy(
    @retrofit2.http.Body List<CircuitTerminationRequest> circuitTerminationRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuit-terminations/")
  Call<List<CircuitTermination>> circuitsCircuitTerminationsBulkPartialUpdate(
    @retrofit2.http.Body List<CircuitTerminationRequest> circuitTerminationRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuit-terminations/")
  Call<List<CircuitTermination>> circuitsCircuitTerminationsBulkUpdate(
    @retrofit2.http.Body List<CircuitTerminationRequest> circuitTerminationRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/circuit-terminations/")
  Call<CircuitTermination> circuitsCircuitTerminationsCreate(
    @retrofit2.http.Body CircuitsCircuitTerminationsCreateRequest circuitsCircuitTerminationsCreateRequest);

  @DELETE("api/circuits/circuit-terminations/{id}/")
  Call<Void> circuitsCircuitTerminationsDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/circuit-terminations/")
  Call<PaginatedCircuitTerminationList> circuitsCircuitTerminationsList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuit-terminations/{id}/")
  Call<CircuitTermination> circuitsCircuitTerminationsPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedCircuitTerminationRequest patchedCircuitTerminationRequest);

  @GET("api/circuits/circuit-terminations/{id}/paths/")
  Call<CircuitTermination> circuitsCircuitTerminationsPathsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/circuit-terminations/{id}/")
  Call<CircuitTermination> circuitsCircuitTerminationsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuit-terminations/{id}/")
  Call<CircuitTermination> circuitsCircuitTerminationsUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body CircuitTerminationRequest circuitTerminationRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/circuit-types/")
  Call<Void> circuitsCircuitTypesBulkDestroy(
    @retrofit2.http.Body List<CircuitTypeRequest> circuitTypeRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuit-types/")
  Call<List<CircuitType>> circuitsCircuitTypesBulkPartialUpdate(
    @retrofit2.http.Body List<CircuitTypeRequest> circuitTypeRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuit-types/")
  Call<List<CircuitType>> circuitsCircuitTypesBulkUpdate(
    @retrofit2.http.Body List<CircuitTypeRequest> circuitTypeRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/circuit-types/")
  Call<CircuitType> circuitsCircuitTypesCreate(
    @retrofit2.http.Body CircuitsCircuitTypesCreateRequest circuitsCircuitTypesCreateRequest);

  @DELETE("api/circuits/circuit-types/{id}/")
  Call<Void> circuitsCircuitTypesDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/circuit-types/")
  Call<PaginatedCircuitTypeList> circuitsCircuitTypesList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuit-types/{id}/")
  Call<CircuitType> circuitsCircuitTypesPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedCircuitTypeRequest patchedCircuitTypeRequest);

  @GET("api/circuits/circuit-types/{id}/")
  Call<CircuitType> circuitsCircuitTypesRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuit-types/{id}/")
  Call<CircuitType> circuitsCircuitTypesUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body CircuitTypeRequest circuitTypeRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/circuits/")
  Call<Void> circuitsCircuitsBulkDestroy(
    @retrofit2.http.Body List<CircuitRequest> circuitRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuits/")
  Call<List<Circuit>> circuitsCircuitsBulkPartialUpdate(
    @retrofit2.http.Body List<CircuitRequest> circuitRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuits/")
  Call<List<Circuit>> circuitsCircuitsBulkUpdate(
    @retrofit2.http.Body List<CircuitRequest> circuitRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/circuits/")
  Call<Circuit> circuitsCircuitsCreate(
    @retrofit2.http.Body CircuitsCircuitsCreateRequest circuitsCircuitsCreateRequest);

  @DELETE("api/circuits/circuits/{id}/")
  Call<Void> circuitsCircuitsDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/circuits/")
  Call<PaginatedCircuitList> circuitsCircuitsList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/circuits/{id}/")
  Call<Circuit> circuitsCircuitsPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedWritableCircuitRequest patchedWritableCircuitRequest);

  @GET("api/circuits/circuits/{id}/")
  Call<Circuit> circuitsCircuitsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/circuits/{id}/")
  Call<Circuit> circuitsCircuitsUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableCircuitRequest writableCircuitRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/provider-accounts/")
  Call<Void> circuitsProviderAccountsBulkDestroy(
    @retrofit2.http.Body List<ProviderAccountRequest> providerAccountRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/provider-accounts/")
  Call<List<ProviderAccount>> circuitsProviderAccountsBulkPartialUpdate(
    @retrofit2.http.Body List<ProviderAccountRequest> providerAccountRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/provider-accounts/")
  Call<List<ProviderAccount>> circuitsProviderAccountsBulkUpdate(
    @retrofit2.http.Body List<ProviderAccountRequest> providerAccountRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/provider-accounts/")
  Call<ProviderAccount> circuitsProviderAccountsCreate(
    @retrofit2.http.Body CircuitsProviderAccountsCreateRequest circuitsProviderAccountsCreateRequest);

  @DELETE("api/circuits/provider-accounts/{id}/")
  Call<Void> circuitsProviderAccountsDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/provider-accounts/")
  Call<PaginatedProviderAccountList> circuitsProviderAccountsList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/provider-accounts/{id}/")
  Call<ProviderAccount> circuitsProviderAccountsPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedProviderAccountRequest patchedProviderAccountRequest);

  @GET("api/circuits/provider-accounts/{id}/")
  Call<ProviderAccount> circuitsProviderAccountsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/provider-accounts/{id}/")
  Call<ProviderAccount> circuitsProviderAccountsUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ProviderAccountRequest providerAccountRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/provider-networks/")
  Call<Void> circuitsProviderNetworksBulkDestroy(
    @retrofit2.http.Body List<ProviderNetworkRequest> providerNetworkRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/provider-networks/")
  Call<List<ProviderNetwork>> circuitsProviderNetworksBulkPartialUpdate(
    @retrofit2.http.Body List<ProviderNetworkRequest> providerNetworkRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/provider-networks/")
  Call<List<ProviderNetwork>> circuitsProviderNetworksBulkUpdate(
    @retrofit2.http.Body List<ProviderNetworkRequest> providerNetworkRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/provider-networks/")
  Call<ProviderNetwork> circuitsProviderNetworksCreate(
    @retrofit2.http.Body CircuitsProviderNetworksCreateRequest circuitsProviderNetworksCreateRequest);

  @DELETE("api/circuits/provider-networks/{id}/")
  Call<Void> circuitsProviderNetworksDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/provider-networks/")
  Call<PaginatedProviderNetworkList> circuitsProviderNetworksList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/provider-networks/{id}/")
  Call<ProviderNetwork> circuitsProviderNetworksPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedProviderNetworkRequest patchedProviderNetworkRequest);

  @GET("api/circuits/provider-networks/{id}/")
  Call<ProviderNetwork> circuitsProviderNetworksRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/provider-networks/{id}/")
  Call<ProviderNetwork> circuitsProviderNetworksUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ProviderNetworkRequest providerNetworkRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/providers/")
  Call<Void> circuitsProvidersBulkDestroy(
    @retrofit2.http.Body List<ProviderRequest> providerRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/providers/")
  Call<List<Provider>> circuitsProvidersBulkPartialUpdate(
    @retrofit2.http.Body List<ProviderRequest> providerRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/providers/")
  Call<List<Provider>> circuitsProvidersBulkUpdate(
    @retrofit2.http.Body List<ProviderRequest> providerRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/providers/")
  Call<Provider> circuitsProvidersCreate(
    @retrofit2.http.Body CircuitsProvidersCreateRequest circuitsProvidersCreateRequest);

  @DELETE("api/circuits/providers/{id}/")
  Call<Void> circuitsProvidersDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/providers/")
  Call<PaginatedProviderList> circuitsProvidersList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/providers/{id}/")
  Call<Provider> circuitsProvidersPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedProviderRequest patchedProviderRequest);

  @GET("api/circuits/providers/{id}/")
  Call<Provider> circuitsProvidersRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/providers/{id}/")
  Call<Provider> circuitsProvidersUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ProviderRequest providerRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/virtual-circuit-terminations/")
  Call<Void> circuitsVirtualCircuitTerminationsBulkDestroy(
    @retrofit2.http.Body List<VirtualCircuitTerminationRequest> virtualCircuitTerminationRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/virtual-circuit-terminations/")
  Call<List<VirtualCircuitTermination>> circuitsVirtualCircuitTerminationsBulkPartialUpdate(
    @retrofit2.http.Body List<VirtualCircuitTerminationRequest> virtualCircuitTerminationRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/virtual-circuit-terminations/")
  Call<List<VirtualCircuitTermination>> circuitsVirtualCircuitTerminationsBulkUpdate(
    @retrofit2.http.Body List<VirtualCircuitTerminationRequest> virtualCircuitTerminationRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/virtual-circuit-terminations/")
  Call<VirtualCircuitTermination> circuitsVirtualCircuitTerminationsCreate(
    @retrofit2.http.Body CircuitsVirtualCircuitTerminationsCreateRequest circuitsVirtualCircuitTerminationsCreateRequest);

  @DELETE("api/circuits/virtual-circuit-terminations/{id}/")
  Call<Void> circuitsVirtualCircuitTerminationsDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/virtual-circuit-terminations/")
  Call<PaginatedVirtualCircuitTerminationList> circuitsVirtualCircuitTerminationsList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/virtual-circuit-terminations/{id}/")
  Call<VirtualCircuitTermination> circuitsVirtualCircuitTerminationsPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedWritableVirtualCircuitTerminationRequest patchedWritableVirtualCircuitTerminationRequest);

  @GET("api/circuits/virtual-circuit-terminations/{id}/paths/")
  Call<VirtualCircuitTermination> circuitsVirtualCircuitTerminationsPathsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/virtual-circuit-terminations/{id}/")
  Call<VirtualCircuitTermination> circuitsVirtualCircuitTerminationsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/virtual-circuit-terminations/{id}/")
  Call<VirtualCircuitTermination> circuitsVirtualCircuitTerminationsUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableVirtualCircuitTerminationRequest writableVirtualCircuitTerminationRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/virtual-circuit-types/")
  Call<Void> circuitsVirtualCircuitTypesBulkDestroy(
    @retrofit2.http.Body List<VirtualCircuitTypeRequest> virtualCircuitTypeRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/virtual-circuit-types/")
  Call<List<VirtualCircuitType>> circuitsVirtualCircuitTypesBulkPartialUpdate(
    @retrofit2.http.Body List<VirtualCircuitTypeRequest> virtualCircuitTypeRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/virtual-circuit-types/")
  Call<List<VirtualCircuitType>> circuitsVirtualCircuitTypesBulkUpdate(
    @retrofit2.http.Body List<VirtualCircuitTypeRequest> virtualCircuitTypeRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/virtual-circuit-types/")
  Call<VirtualCircuitType> circuitsVirtualCircuitTypesCreate(
    @retrofit2.http.Body CircuitsVirtualCircuitTypesCreateRequest circuitsVirtualCircuitTypesCreateRequest);

  @DELETE("api/circuits/virtual-circuit-types/{id}/")
  Call<Void> circuitsVirtualCircuitTypesDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/virtual-circuit-types/")
  Call<PaginatedVirtualCircuitTypeList> circuitsVirtualCircuitTypesList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/virtual-circuit-types/{id}/")
  Call<VirtualCircuitType> circuitsVirtualCircuitTypesPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedVirtualCircuitTypeRequest patchedVirtualCircuitTypeRequest);

  @GET("api/circuits/virtual-circuit-types/{id}/")
  Call<VirtualCircuitType> circuitsVirtualCircuitTypesRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/virtual-circuit-types/{id}/")
  Call<VirtualCircuitType> circuitsVirtualCircuitTypesUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body VirtualCircuitTypeRequest virtualCircuitTypeRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/circuits/virtual-circuits/")
  Call<Void> circuitsVirtualCircuitsBulkDestroy(
    @retrofit2.http.Body List<VirtualCircuitRequest> virtualCircuitRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/virtual-circuits/")
  Call<List<VirtualCircuit>> circuitsVirtualCircuitsBulkPartialUpdate(
    @retrofit2.http.Body List<VirtualCircuitRequest> virtualCircuitRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/virtual-circuits/")
  Call<List<VirtualCircuit>> circuitsVirtualCircuitsBulkUpdate(
    @retrofit2.http.Body List<VirtualCircuitRequest> virtualCircuitRequest);

  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/circuits/virtual-circuits/")
  Call<VirtualCircuit> circuitsVirtualCircuitsCreate(
    @retrofit2.http.Body CircuitsVirtualCircuitsCreateRequest circuitsVirtualCircuitsCreateRequest);

  @DELETE("api/circuits/virtual-circuits/{id}/")
  Call<Void> circuitsVirtualCircuitsDestroy(
    @retrofit2.http.Path("id") Integer id);

  @GET("api/circuits/virtual-circuits/")
  Call<PaginatedVirtualCircuitList> circuitsVirtualCircuitsList(
    );

  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("api/circuits/virtual-circuits/{id}/")
  Call<VirtualCircuit> circuitsVirtualCircuitsPartialUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedWritableVirtualCircuitRequest patchedWritableVirtualCircuitRequest);

  @GET("api/circuits/virtual-circuits/{id}/")
  Call<VirtualCircuit> circuitsVirtualCircuitsRetrieve(
    @retrofit2.http.Path("id") Integer id);

  @Headers({
    "Content-Type:application/json"
  })
  @PUT("api/circuits/virtual-circuits/{id}/")
  Call<VirtualCircuit> circuitsVirtualCircuitsUpdate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableVirtualCircuitRequest writableVirtualCircuitRequest);

}
