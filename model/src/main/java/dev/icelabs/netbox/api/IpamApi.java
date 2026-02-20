package dev.icelabs.netbox.api;

import java.util.List;

import dev.icelabs.netbox.model.*;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface IpamApi {
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/aggregates/")
    Call<Void> ipamAggregatesBulkDestroy(
            @retrofit2.http.Body List<AggregateRequest> aggregateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/aggregates/")
    Call<List<Aggregate>> ipamAggregatesBulkPartialUpdate(
            @retrofit2.http.Body List<AggregateRequest> aggregateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/aggregates/")
    Call<List<Aggregate>> ipamAggregatesBulkUpdate(
            @retrofit2.http.Body List<AggregateRequest> aggregateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/aggregates/")
    Call<Aggregate> ipamAggregatesCreate(
            @retrofit2.http.Body IpamAggregatesCreateRequest ipamAggregatesCreateRequest);

    @DELETE("api/ipam/aggregates/{id}/")
    Call<Void> ipamAggregatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/aggregates/")
    Call<PaginatedAggregateList> ipamAggregatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/aggregates/{id}/")
    Call<Aggregate> ipamAggregatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableAggregateRequest patchedWritableAggregateRequest);

    @GET("api/ipam/aggregates/{id}/")
    Call<Aggregate> ipamAggregatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/aggregates/{id}/")
    Call<Aggregate> ipamAggregatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableAggregateRequest writableAggregateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/asn-ranges/{id}/available-asns/")
    Call<List<ASN>> ipamAsnRangesAvailableAsnsCreate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body List<ASNRequest> asNRequest);

    @GET("api/ipam/asn-ranges/{id}/available-asns/")
    Call<List<AvailableASN>> ipamAsnRangesAvailableAsnsList(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/asn-ranges/")
    Call<Void> ipamAsnRangesBulkDestroy(
            @retrofit2.http.Body List<ASNRangeRequest> asNRangeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/asn-ranges/")
    Call<List<ASNRange>> ipamAsnRangesBulkPartialUpdate(
            @retrofit2.http.Body List<ASNRangeRequest> asNRangeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/asn-ranges/")
    Call<List<ASNRange>> ipamAsnRangesBulkUpdate(
            @retrofit2.http.Body List<ASNRangeRequest> asNRangeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/asn-ranges/")
    Call<ASNRange> ipamAsnRangesCreate(
            @retrofit2.http.Body IpamAsnRangesCreateRequest ipamAsnRangesCreateRequest);

    @DELETE("api/ipam/asn-ranges/{id}/")
    Call<Void> ipamAsnRangesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/asn-ranges/")
    Call<PaginatedASNRangeList> ipamAsnRangesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/asn-ranges/{id}/")
    Call<ASNRange> ipamAsnRangesPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedASNRangeRequest patchedASNRangeRequest);

    @GET("api/ipam/asn-ranges/{id}/")
    Call<ASNRange> ipamAsnRangesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/asn-ranges/{id}/")
    Call<ASNRange> ipamAsnRangesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ASNRangeRequest asNRangeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/asns/")
    Call<Void> ipamAsnsBulkDestroy(
            @retrofit2.http.Body List<ASNRequest> asNRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/asns/")
    Call<List<ASN>> ipamAsnsBulkPartialUpdate(
            @retrofit2.http.Body List<ASNRequest> asNRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/asns/")
    Call<List<ASN>> ipamAsnsBulkUpdate(
            @retrofit2.http.Body List<ASNRequest> asNRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/asns/")
    Call<ASN> ipamAsnsCreate(
            @retrofit2.http.Body IpamAsnsCreateRequest ipamAsnsCreateRequest);

    @DELETE("api/ipam/asns/{id}/")
    Call<Void> ipamAsnsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/asns/")
    Call<PaginatedASNList> ipamAsnsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/asns/{id}/")
    Call<ASN> ipamAsnsPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedASNRequest patchedASNRequest);

    @GET("api/ipam/asns/{id}/")
    Call<ASN> ipamAsnsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/asns/{id}/")
    Call<ASN> ipamAsnsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ASNRequest asNRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/fhrp-group-assignments/")
    Call<Void> ipamFhrpGroupAssignmentsBulkDestroy(
            @retrofit2.http.Body List<FHRPGroupAssignmentRequest> fhRPGroupAssignmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/fhrp-group-assignments/")
    Call<List<FHRPGroupAssignment>> ipamFhrpGroupAssignmentsBulkPartialUpdate(
            @retrofit2.http.Body List<FHRPGroupAssignmentRequest> fhRPGroupAssignmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/fhrp-group-assignments/")
    Call<List<FHRPGroupAssignment>> ipamFhrpGroupAssignmentsBulkUpdate(
            @retrofit2.http.Body List<FHRPGroupAssignmentRequest> fhRPGroupAssignmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/fhrp-group-assignments/")
    Call<FHRPGroupAssignment> ipamFhrpGroupAssignmentsCreate(
            @retrofit2.http.Body IpamFhrpGroupAssignmentsCreateRequest ipamFhrpGroupAssignmentsCreateRequest);

    @DELETE("api/ipam/fhrp-group-assignments/{id}/")
    Call<Void> ipamFhrpGroupAssignmentsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/fhrp-group-assignments/")
    Call<PaginatedFHRPGroupAssignmentList> ipamFhrpGroupAssignmentsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/fhrp-group-assignments/{id}/")
    Call<FHRPGroupAssignment> ipamFhrpGroupAssignmentsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedFHRPGroupAssignmentRequest patchedFHRPGroupAssignmentRequest);

    @GET("api/ipam/fhrp-group-assignments/{id}/")
    Call<FHRPGroupAssignment> ipamFhrpGroupAssignmentsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/fhrp-group-assignments/{id}/")
    Call<FHRPGroupAssignment> ipamFhrpGroupAssignmentsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body FHRPGroupAssignmentRequest fhRPGroupAssignmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/fhrp-groups/")
    Call<Void> ipamFhrpGroupsBulkDestroy(
            @retrofit2.http.Body List<FHRPGroupRequest> fhRPGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/fhrp-groups/")
    Call<List<FHRPGroup>> ipamFhrpGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<FHRPGroupRequest> fhRPGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/fhrp-groups/")
    Call<List<FHRPGroup>> ipamFhrpGroupsBulkUpdate(
            @retrofit2.http.Body List<FHRPGroupRequest> fhRPGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/fhrp-groups/")
    Call<FHRPGroup> ipamFhrpGroupsCreate(
            @retrofit2.http.Body IpamFhrpGroupsCreateRequest ipamFhrpGroupsCreateRequest);

    @DELETE("api/ipam/fhrp-groups/{id}/")
    Call<Void> ipamFhrpGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/fhrp-groups/")
    Call<PaginatedFHRPGroupList> ipamFhrpGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/fhrp-groups/{id}/")
    Call<FHRPGroup> ipamFhrpGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedFHRPGroupRequest patchedFHRPGroupRequest);

    @GET("api/ipam/fhrp-groups/{id}/")
    Call<FHRPGroup> ipamFhrpGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/fhrp-groups/{id}/")
    Call<FHRPGroup> ipamFhrpGroupsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body FHRPGroupRequest fhRPGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/ip-addresses/")
    Call<Void> ipamIpAddressesBulkDestroy(
            @retrofit2.http.Body List<IPAddressRequest> ipAddressRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/ip-addresses/")
    Call<List<IPAddress>> ipamIpAddressesBulkPartialUpdate(
            @retrofit2.http.Body List<IPAddressRequest> ipAddressRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/ip-addresses/")
    Call<List<IPAddress>> ipamIpAddressesBulkUpdate(
            @retrofit2.http.Body List<IPAddressRequest> ipAddressRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/ip-addresses/")
    Call<IPAddress> ipamIpAddressesCreate(
            @retrofit2.http.Body IpamIpAddressesCreateRequest ipamIpAddressesCreateRequest);

    @DELETE("api/ipam/ip-addresses/{id}/")
    Call<Void> ipamIpAddressesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/ip-addresses/")
    Call<PaginatedIPAddressList> ipamIpAddressesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/ip-addresses/{id}/")
    Call<IPAddress> ipamIpAddressesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableIPAddressRequest patchedWritableIPAddressRequest);

    @GET("api/ipam/ip-addresses/{id}/")
    Call<IPAddress> ipamIpAddressesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/ip-addresses/{id}/")
    Call<IPAddress> ipamIpAddressesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableIPAddressRequest writableIPAddressRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/ip-ranges/{id}/available-ips/")
    Call<List<IPAddress>> ipamIpRangesAvailableIpsCreate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body List<AvailableIPRequestRequest> availableIPRequestRequest);

    @GET("api/ipam/ip-ranges/{id}/available-ips/")
    Call<List<AvailableIP>> ipamIpRangesAvailableIpsList(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/ip-ranges/")
    Call<Void> ipamIpRangesBulkDestroy(
            @retrofit2.http.Body List<IPRangeRequest> ipRangeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/ip-ranges/")
    Call<List<IPRange>> ipamIpRangesBulkPartialUpdate(
            @retrofit2.http.Body List<IPRangeRequest> ipRangeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/ip-ranges/")
    Call<List<IPRange>> ipamIpRangesBulkUpdate(
            @retrofit2.http.Body List<IPRangeRequest> ipRangeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/ip-ranges/")
    Call<IPRange> ipamIpRangesCreate(
            @retrofit2.http.Body IpamIpRangesCreateRequest ipamIpRangesCreateRequest);

    @DELETE("api/ipam/ip-ranges/{id}/")
    Call<Void> ipamIpRangesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/ip-ranges/")
    Call<PaginatedIPRangeList> ipamIpRangesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/ip-ranges/{id}/")
    Call<IPRange> ipamIpRangesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableIPRangeRequest patchedWritableIPRangeRequest);

    @GET("api/ipam/ip-ranges/{id}/")
    Call<IPRange> ipamIpRangesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/ip-ranges/{id}/")
    Call<IPRange> ipamIpRangesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableIPRangeRequest writableIPRangeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/prefixes/{id}/available-ips/")
    Call<List<IPAddress>> ipamPrefixesAvailableIpsCreate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body List<AvailableIPRequestRequest> availableIPRequestRequest);

    @GET("api/ipam/prefixes/{id}/available-ips/")
    Call<List<AvailableIP>> ipamPrefixesAvailableIpsList(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/prefixes/{id}/available-prefixes/")
    Call<List<Prefix>> ipamPrefixesAvailablePrefixesCreate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body List<PrefixRequest> prefixRequest);

    @GET("api/ipam/prefixes/{id}/available-prefixes/")
    Call<List<AvailablePrefix>> ipamPrefixesAvailablePrefixesList(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/prefixes/")
    Call<Void> ipamPrefixesBulkDestroy(
            @retrofit2.http.Body List<PrefixRequest> prefixRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/prefixes/")
    Call<List<Prefix>> ipamPrefixesBulkPartialUpdate(
            @retrofit2.http.Body List<PrefixRequest> prefixRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/prefixes/")
    Call<List<Prefix>> ipamPrefixesBulkUpdate(
            @retrofit2.http.Body List<PrefixRequest> prefixRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/prefixes/")
    Call<Prefix> ipamPrefixesCreate(
            @retrofit2.http.Body IpamPrefixesCreateRequest ipamPrefixesCreateRequest);

    @DELETE("api/ipam/prefixes/{id}/")
    Call<Void> ipamPrefixesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/prefixes/")
    Call<PaginatedPrefixList> ipamPrefixesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/prefixes/{id}/")
    Call<Prefix> ipamPrefixesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritablePrefixRequest patchedWritablePrefixRequest);

    @GET("api/ipam/prefixes/{id}/")
    Call<Prefix> ipamPrefixesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/prefixes/{id}/")
    Call<Prefix> ipamPrefixesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritablePrefixRequest writablePrefixRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/rirs/")
    Call<Void> ipamRirsBulkDestroy(
            @retrofit2.http.Body List<RIRRequest> riRRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/rirs/")
    Call<List<RIR>> ipamRirsBulkPartialUpdate(
            @retrofit2.http.Body List<RIRRequest> riRRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/rirs/")
    Call<List<RIR>> ipamRirsBulkUpdate(
            @retrofit2.http.Body List<RIRRequest> riRRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/rirs/")
    Call<RIR> ipamRirsCreate(
            @retrofit2.http.Body IpamRirsCreateRequest ipamRirsCreateRequest);

    @DELETE("api/ipam/rirs/{id}/")
    Call<Void> ipamRirsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/rirs/")
    Call<PaginatedRIRList> ipamRirsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/rirs/{id}/")
    Call<RIR> ipamRirsPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedRIRRequest patchedRIRRequest);

    @GET("api/ipam/rirs/{id}/")
    Call<RIR> ipamRirsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/rirs/{id}/")
    Call<RIR> ipamRirsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body RIRRequest riRRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/roles/")
    Call<Void> ipamRolesBulkDestroy(
            @retrofit2.http.Body List<RoleRequest> roleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/roles/")
    Call<List<Role>> ipamRolesBulkPartialUpdate(
            @retrofit2.http.Body List<RoleRequest> roleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/roles/")
    Call<List<Role>> ipamRolesBulkUpdate(
            @retrofit2.http.Body List<RoleRequest> roleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/roles/")
    Call<Role> ipamRolesCreate(
            @retrofit2.http.Body IpamRolesCreateRequest ipamRolesCreateRequest);

    @DELETE("api/ipam/roles/{id}/")
    Call<Void> ipamRolesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/roles/")
    Call<PaginatedRoleList> ipamRolesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/roles/{id}/")
    Call<Role> ipamRolesPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedRoleRequest patchedRoleRequest);

    @GET("api/ipam/roles/{id}/")
    Call<Role> ipamRolesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/roles/{id}/")
    Call<Role> ipamRolesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body RoleRequest roleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/route-targets/")
    Call<Void> ipamRouteTargetsBulkDestroy(
            @retrofit2.http.Body List<RouteTargetRequest> routeTargetRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/route-targets/")
    Call<List<RouteTarget>> ipamRouteTargetsBulkPartialUpdate(
            @retrofit2.http.Body List<RouteTargetRequest> routeTargetRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/route-targets/")
    Call<List<RouteTarget>> ipamRouteTargetsBulkUpdate(
            @retrofit2.http.Body List<RouteTargetRequest> routeTargetRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/route-targets/")
    Call<RouteTarget> ipamRouteTargetsCreate(
            @retrofit2.http.Body IpamRouteTargetsCreateRequest ipamRouteTargetsCreateRequest);

    @DELETE("api/ipam/route-targets/{id}/")
    Call<Void> ipamRouteTargetsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/route-targets/")
    Call<PaginatedRouteTargetList> ipamRouteTargetsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/route-targets/{id}/")
    Call<RouteTarget> ipamRouteTargetsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedRouteTargetRequest patchedRouteTargetRequest);

    @GET("api/ipam/route-targets/{id}/")
    Call<RouteTarget> ipamRouteTargetsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/route-targets/{id}/")
    Call<RouteTarget> ipamRouteTargetsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body RouteTargetRequest routeTargetRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/service-templates/")
    Call<Void> ipamServiceTemplatesBulkDestroy(
            @retrofit2.http.Body List<ServiceTemplateRequest> serviceTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/service-templates/")
    Call<List<ServiceTemplate>> ipamServiceTemplatesBulkPartialUpdate(
            @retrofit2.http.Body List<ServiceTemplateRequest> serviceTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/service-templates/")
    Call<List<ServiceTemplate>> ipamServiceTemplatesBulkUpdate(
            @retrofit2.http.Body List<ServiceTemplateRequest> serviceTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/service-templates/")
    Call<ServiceTemplate> ipamServiceTemplatesCreate(
            @retrofit2.http.Body IpamServiceTemplatesCreateRequest ipamServiceTemplatesCreateRequest);

    @DELETE("api/ipam/service-templates/{id}/")
    Call<Void> ipamServiceTemplatesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/service-templates/")
    Call<PaginatedServiceTemplateList> ipamServiceTemplatesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/service-templates/{id}/")
    Call<ServiceTemplate> ipamServiceTemplatesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableServiceTemplateRequest patchedWritableServiceTemplateRequest);

    @GET("api/ipam/service-templates/{id}/")
    Call<ServiceTemplate> ipamServiceTemplatesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/service-templates/{id}/")
    Call<ServiceTemplate> ipamServiceTemplatesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableServiceTemplateRequest writableServiceTemplateRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/services/")
    Call<Void> ipamServicesBulkDestroy(
            @retrofit2.http.Body List<ServiceRequest> serviceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/services/")
    Call<List<Service>> ipamServicesBulkPartialUpdate(
            @retrofit2.http.Body List<ServiceRequest> serviceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/services/")
    Call<List<Service>> ipamServicesBulkUpdate(
            @retrofit2.http.Body List<ServiceRequest> serviceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/services/")
    Call<Service> ipamServicesCreate(
            @retrofit2.http.Body IpamServicesCreateRequest ipamServicesCreateRequest);

    @DELETE("api/ipam/services/{id}/")
    Call<Void> ipamServicesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/services/")
    Call<PaginatedServiceList> ipamServicesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/services/{id}/")
    Call<Service> ipamServicesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableServiceRequest patchedWritableServiceRequest);

    @GET("api/ipam/services/{id}/")
    Call<Service> ipamServicesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/services/{id}/")
    Call<Service> ipamServicesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableServiceRequest writableServiceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/vlan-groups/{id}/available-vlans/")
    Call<List<VLAN>> ipamVlanGroupsAvailableVlansCreate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body List<VLANRequest> vlANRequest);

    @GET("api/ipam/vlan-groups/{id}/available-vlans/")
    Call<List<AvailableVLAN>> ipamVlanGroupsAvailableVlansList(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/vlan-groups/")
    Call<Void> ipamVlanGroupsBulkDestroy(
            @retrofit2.http.Body List<VLANGroupRequest> vlANGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vlan-groups/")
    Call<List<VLANGroup>> ipamVlanGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<VLANGroupRequest> vlANGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vlan-groups/")
    Call<List<VLANGroup>> ipamVlanGroupsBulkUpdate(
            @retrofit2.http.Body List<VLANGroupRequest> vlANGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/vlan-groups/")
    Call<VLANGroup> ipamVlanGroupsCreate(
            @retrofit2.http.Body IpamVlanGroupsCreateRequest ipamVlanGroupsCreateRequest);

    @DELETE("api/ipam/vlan-groups/{id}/")
    Call<Void> ipamVlanGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/vlan-groups/")
    Call<PaginatedVLANGroupList> ipamVlanGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vlan-groups/{id}/")
    Call<VLANGroup> ipamVlanGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedVLANGroupRequest patchedVLANGroupRequest);

    @GET("api/ipam/vlan-groups/{id}/")
    Call<VLANGroup> ipamVlanGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vlan-groups/{id}/")
    Call<VLANGroup> ipamVlanGroupsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body VLANGroupRequest vlANGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/vlan-translation-policies/")
    Call<Void> ipamVlanTranslationPoliciesBulkDestroy(
            @retrofit2.http.Body List<VLANTranslationPolicyRequest> vlANTranslationPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vlan-translation-policies/")
    Call<List<VLANTranslationPolicy>> ipamVlanTranslationPoliciesBulkPartialUpdate(
            @retrofit2.http.Body List<VLANTranslationPolicyRequest> vlANTranslationPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vlan-translation-policies/")
    Call<List<VLANTranslationPolicy>> ipamVlanTranslationPoliciesBulkUpdate(
            @retrofit2.http.Body List<VLANTranslationPolicyRequest> vlANTranslationPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/vlan-translation-policies/")
    Call<VLANTranslationPolicy> ipamVlanTranslationPoliciesCreate(
            @retrofit2.http.Body IpamVlanTranslationPoliciesCreateRequest ipamVlanTranslationPoliciesCreateRequest);

    @DELETE("api/ipam/vlan-translation-policies/{id}/")
    Call<Void> ipamVlanTranslationPoliciesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/vlan-translation-policies/")
    Call<PaginatedVLANTranslationPolicyList> ipamVlanTranslationPoliciesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vlan-translation-policies/{id}/")
    Call<VLANTranslationPolicy> ipamVlanTranslationPoliciesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedVLANTranslationPolicyRequest patchedVLANTranslationPolicyRequest);

    @GET("api/ipam/vlan-translation-policies/{id}/")
    Call<VLANTranslationPolicy> ipamVlanTranslationPoliciesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vlan-translation-policies/{id}/")
    Call<VLANTranslationPolicy> ipamVlanTranslationPoliciesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body VLANTranslationPolicyRequest vlANTranslationPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/vlan-translation-rules/")
    Call<Void> ipamVlanTranslationRulesBulkDestroy(
            @retrofit2.http.Body List<VLANTranslationRuleRequest> vlANTranslationRuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vlan-translation-rules/")
    Call<List<VLANTranslationRule>> ipamVlanTranslationRulesBulkPartialUpdate(
            @retrofit2.http.Body List<VLANTranslationRuleRequest> vlANTranslationRuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vlan-translation-rules/")
    Call<List<VLANTranslationRule>> ipamVlanTranslationRulesBulkUpdate(
            @retrofit2.http.Body List<VLANTranslationRuleRequest> vlANTranslationRuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/vlan-translation-rules/")
    Call<VLANTranslationRule> ipamVlanTranslationRulesCreate(
            @retrofit2.http.Body IpamVlanTranslationRulesCreateRequest ipamVlanTranslationRulesCreateRequest);

    @DELETE("api/ipam/vlan-translation-rules/{id}/")
    Call<Void> ipamVlanTranslationRulesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/vlan-translation-rules/")
    Call<PaginatedVLANTranslationRuleList> ipamVlanTranslationRulesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vlan-translation-rules/{id}/")
    Call<VLANTranslationRule> ipamVlanTranslationRulesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedVLANTranslationRuleRequest patchedVLANTranslationRuleRequest);

    @GET("api/ipam/vlan-translation-rules/{id}/")
    Call<VLANTranslationRule> ipamVlanTranslationRulesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vlan-translation-rules/{id}/")
    Call<VLANTranslationRule> ipamVlanTranslationRulesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body VLANTranslationRuleRequest vlANTranslationRuleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/vlans/")
    Call<Void> ipamVlansBulkDestroy(
            @retrofit2.http.Body List<VLANRequest> vlANRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vlans/")
    Call<List<VLAN>> ipamVlansBulkPartialUpdate(
            @retrofit2.http.Body List<VLANRequest> vlANRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vlans/")
    Call<List<VLAN>> ipamVlansBulkUpdate(
            @retrofit2.http.Body List<VLANRequest> vlANRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/vlans/")
    Call<VLAN> ipamVlansCreate(
            @retrofit2.http.Body IpamVlansCreateRequest ipamVlansCreateRequest);

    @DELETE("api/ipam/vlans/{id}/")
    Call<Void> ipamVlansDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/vlans/")
    Call<PaginatedVLANList> ipamVlansList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vlans/{id}/")
    Call<VLAN> ipamVlansPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableVLANRequest patchedWritableVLANRequest);

    @GET("api/ipam/vlans/{id}/")
    Call<VLAN> ipamVlansRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vlans/{id}/")
    Call<VLAN> ipamVlansUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableVLANRequest writableVLANRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/ipam/vrfs/")
    Call<Void> ipamVrfsBulkDestroy(
            @retrofit2.http.Body List<VRFRequest> vrFRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vrfs/")
    Call<List<VRF>> ipamVrfsBulkPartialUpdate(
            @retrofit2.http.Body List<VRFRequest> vrFRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vrfs/")
    Call<List<VRF>> ipamVrfsBulkUpdate(
            @retrofit2.http.Body List<VRFRequest> vrFRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/ipam/vrfs/")
    Call<VRF> ipamVrfsCreate(
            @retrofit2.http.Body IpamVrfsCreateRequest ipamVrfsCreateRequest);

    @DELETE("api/ipam/vrfs/{id}/")
    Call<Void> ipamVrfsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/ipam/vrfs/")
    Call<PaginatedVRFList> ipamVrfsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/ipam/vrfs/{id}/")
    Call<VRF> ipamVrfsPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedVRFRequest patchedVRFRequest);

    @GET("api/ipam/vrfs/{id}/")
    Call<VRF> ipamVrfsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/ipam/vrfs/{id}/")
    Call<VRF> ipamVrfsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body VRFRequest vrFRequest);

}
