package dev.icelabs.netbox.api;

import java.util.List;

import dev.icelabs.netbox.model.Cluster;
import dev.icelabs.netbox.model.ClusterGroup;
import dev.icelabs.netbox.model.ClusterGroupRequest;
import dev.icelabs.netbox.model.ClusterRequest;
import dev.icelabs.netbox.model.ClusterType;
import dev.icelabs.netbox.model.ClusterTypeRequest;
import dev.icelabs.netbox.model.PaginatedClusterGroupList;
import dev.icelabs.netbox.model.PaginatedClusterList;
import dev.icelabs.netbox.model.PaginatedClusterTypeList;
import dev.icelabs.netbox.model.PaginatedVMInterfaceList;
import dev.icelabs.netbox.model.PaginatedVirtualDiskList;
import dev.icelabs.netbox.model.PaginatedVirtualMachineWithConfigContextList;
import dev.icelabs.netbox.model.PatchedClusterGroupRequest;
import dev.icelabs.netbox.model.PatchedClusterTypeRequest;
import dev.icelabs.netbox.model.PatchedVirtualDiskRequest;
import dev.icelabs.netbox.model.PatchedWritableClusterRequest;
import dev.icelabs.netbox.model.PatchedWritableVMInterfaceRequest;
import dev.icelabs.netbox.model.PatchedWritableVirtualMachineWithConfigContextRequest;
import dev.icelabs.netbox.model.VMInterface;
import dev.icelabs.netbox.model.VMInterfaceRequest;
import dev.icelabs.netbox.model.VirtualDisk;
import dev.icelabs.netbox.model.VirtualDiskRequest;
import dev.icelabs.netbox.model.VirtualMachineWithConfigContext;
import dev.icelabs.netbox.model.VirtualMachineWithConfigContextRequest;
import dev.icelabs.netbox.model.VirtualizationClusterGroupsCreateRequest;
import dev.icelabs.netbox.model.VirtualizationClusterTypesCreateRequest;
import dev.icelabs.netbox.model.VirtualizationClustersCreateRequest;
import dev.icelabs.netbox.model.VirtualizationInterfacesCreateRequest;
import dev.icelabs.netbox.model.VirtualizationVirtualDisksCreateRequest;
import dev.icelabs.netbox.model.VirtualizationVirtualMachinesCreateRequest;
import dev.icelabs.netbox.model.WritableClusterRequest;
import dev.icelabs.netbox.model.WritableVMInterfaceRequest;
import dev.icelabs.netbox.model.WritableVirtualMachineWithConfigContextRequest;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface VirtualizationApi {
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/virtualization/cluster-groups/")
    Call<Void> virtualizationClusterGroupsBulkDestroy(
            @retrofit2.http.Body List<ClusterGroupRequest> clusterGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/cluster-groups/")
    Call<List<ClusterGroup>> virtualizationClusterGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<ClusterGroupRequest> clusterGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/cluster-groups/")
    Call<List<ClusterGroup>> virtualizationClusterGroupsBulkUpdate(
            @retrofit2.http.Body List<ClusterGroupRequest> clusterGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/virtualization/cluster-groups/")
    Call<ClusterGroup> virtualizationClusterGroupsCreate(
            @retrofit2.http.Body VirtualizationClusterGroupsCreateRequest virtualizationClusterGroupsCreateRequest);

    @DELETE("api/virtualization/cluster-groups/{id}/")
    Call<Void> virtualizationClusterGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/virtualization/cluster-groups/")
    Call<PaginatedClusterGroupList> virtualizationClusterGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/cluster-groups/{id}/")
    Call<ClusterGroup> virtualizationClusterGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedClusterGroupRequest patchedClusterGroupRequest);

    @GET("api/virtualization/cluster-groups/{id}/")
    Call<ClusterGroup> virtualizationClusterGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/cluster-groups/{id}/")
    Call<ClusterGroup> virtualizationClusterGroupsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ClusterGroupRequest clusterGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/virtualization/cluster-types/")
    Call<Void> virtualizationClusterTypesBulkDestroy(
            @retrofit2.http.Body List<ClusterTypeRequest> clusterTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/cluster-types/")
    Call<List<ClusterType>> virtualizationClusterTypesBulkPartialUpdate(
            @retrofit2.http.Body List<ClusterTypeRequest> clusterTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/cluster-types/")
    Call<List<ClusterType>> virtualizationClusterTypesBulkUpdate(
            @retrofit2.http.Body List<ClusterTypeRequest> clusterTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/virtualization/cluster-types/")
    Call<ClusterType> virtualizationClusterTypesCreate(
            @retrofit2.http.Body VirtualizationClusterTypesCreateRequest virtualizationClusterTypesCreateRequest);

    @DELETE("api/virtualization/cluster-types/{id}/")
    Call<Void> virtualizationClusterTypesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/virtualization/cluster-types/")
    Call<PaginatedClusterTypeList> virtualizationClusterTypesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/cluster-types/{id}/")
    Call<ClusterType> virtualizationClusterTypesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedClusterTypeRequest patchedClusterTypeRequest);

    @GET("api/virtualization/cluster-types/{id}/")
    Call<ClusterType> virtualizationClusterTypesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/cluster-types/{id}/")
    Call<ClusterType> virtualizationClusterTypesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ClusterTypeRequest clusterTypeRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/virtualization/clusters/")
    Call<Void> virtualizationClustersBulkDestroy(
            @retrofit2.http.Body List<ClusterRequest> clusterRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/clusters/")
    Call<List<Cluster>> virtualizationClustersBulkPartialUpdate(
            @retrofit2.http.Body List<ClusterRequest> clusterRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/clusters/")
    Call<List<Cluster>> virtualizationClustersBulkUpdate(
            @retrofit2.http.Body List<ClusterRequest> clusterRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/virtualization/clusters/")
    Call<Cluster> virtualizationClustersCreate(
            @retrofit2.http.Body VirtualizationClustersCreateRequest virtualizationClustersCreateRequest);

    @DELETE("api/virtualization/clusters/{id}/")
    Call<Void> virtualizationClustersDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/virtualization/clusters/")
    Call<PaginatedClusterList> virtualizationClustersList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/clusters/{id}/")
    Call<Cluster> virtualizationClustersPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableClusterRequest patchedWritableClusterRequest);

    @GET("api/virtualization/clusters/{id}/")
    Call<Cluster> virtualizationClustersRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/clusters/{id}/")
    Call<Cluster> virtualizationClustersUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableClusterRequest writableClusterRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/virtualization/interfaces/")
    Call<Void> virtualizationInterfacesBulkDestroy(
            @retrofit2.http.Body List<VMInterfaceRequest> vmInterfaceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/interfaces/")
    Call<List<VMInterface>> virtualizationInterfacesBulkPartialUpdate(
            @retrofit2.http.Body List<VMInterfaceRequest> vmInterfaceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/interfaces/")
    Call<List<VMInterface>> virtualizationInterfacesBulkUpdate(
            @retrofit2.http.Body List<VMInterfaceRequest> vmInterfaceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/virtualization/interfaces/")
    Call<VMInterface> virtualizationInterfacesCreate(
            @retrofit2.http.Body VirtualizationInterfacesCreateRequest virtualizationInterfacesCreateRequest);

    @DELETE("api/virtualization/interfaces/{id}/")
    Call<Void> virtualizationInterfacesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/virtualization/interfaces/")
    Call<PaginatedVMInterfaceList> virtualizationInterfacesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/interfaces/{id}/")
    Call<VMInterface> virtualizationInterfacesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableVMInterfaceRequest patchedWritableVMInterfaceRequest);

    @GET("api/virtualization/interfaces/{id}/")
    Call<VMInterface> virtualizationInterfacesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/interfaces/{id}/")
    Call<VMInterface> virtualizationInterfacesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableVMInterfaceRequest writableVMInterfaceRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/virtualization/virtual-disks/")
    Call<Void> virtualizationVirtualDisksBulkDestroy(
            @retrofit2.http.Body List<VirtualDiskRequest> virtualDiskRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/virtual-disks/")
    Call<List<VirtualDisk>> virtualizationVirtualDisksBulkPartialUpdate(
            @retrofit2.http.Body List<VirtualDiskRequest> virtualDiskRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/virtual-disks/")
    Call<List<VirtualDisk>> virtualizationVirtualDisksBulkUpdate(
            @retrofit2.http.Body List<VirtualDiskRequest> virtualDiskRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/virtualization/virtual-disks/")
    Call<VirtualDisk> virtualizationVirtualDisksCreate(
            @retrofit2.http.Body VirtualizationVirtualDisksCreateRequest virtualizationVirtualDisksCreateRequest);

    @DELETE("api/virtualization/virtual-disks/{id}/")
    Call<Void> virtualizationVirtualDisksDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/virtualization/virtual-disks/")
    Call<PaginatedVirtualDiskList> virtualizationVirtualDisksList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/virtual-disks/{id}/")
    Call<VirtualDisk> virtualizationVirtualDisksPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedVirtualDiskRequest patchedVirtualDiskRequest);

    @GET("api/virtualization/virtual-disks/{id}/")
    Call<VirtualDisk> virtualizationVirtualDisksRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/virtual-disks/{id}/")
    Call<VirtualDisk> virtualizationVirtualDisksUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body VirtualDiskRequest virtualDiskRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/virtualization/virtual-machines/")
    Call<Void> virtualizationVirtualMachinesBulkDestroy(
            @retrofit2.http.Body List<VirtualMachineWithConfigContextRequest> virtualMachineWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/virtual-machines/")
    Call<List<VirtualMachineWithConfigContext>> virtualizationVirtualMachinesBulkPartialUpdate(
            @retrofit2.http.Body List<VirtualMachineWithConfigContextRequest> virtualMachineWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/virtual-machines/")
    Call<List<VirtualMachineWithConfigContext>> virtualizationVirtualMachinesBulkUpdate(
            @retrofit2.http.Body List<VirtualMachineWithConfigContextRequest> virtualMachineWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/virtualization/virtual-machines/")
    Call<VirtualMachineWithConfigContext> virtualizationVirtualMachinesCreate(
            @retrofit2.http.Body VirtualizationVirtualMachinesCreateRequest virtualizationVirtualMachinesCreateRequest);

    @DELETE("api/virtualization/virtual-machines/{id}/")
    Call<Void> virtualizationVirtualMachinesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/virtualization/virtual-machines/")
    Call<PaginatedVirtualMachineWithConfigContextList> virtualizationVirtualMachinesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/virtualization/virtual-machines/{id}/")
    Call<VirtualMachineWithConfigContext> virtualizationVirtualMachinesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableVirtualMachineWithConfigContextRequest patchedWritableVirtualMachineWithConfigContextRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/virtualization/virtual-machines/{id}/render-config/")
    Call<VirtualMachineWithConfigContext> virtualizationVirtualMachinesRenderConfigCreate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableVirtualMachineWithConfigContextRequest writableVirtualMachineWithConfigContextRequest);

    @GET("api/virtualization/virtual-machines/{id}/")
    Call<VirtualMachineWithConfigContext> virtualizationVirtualMachinesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/virtualization/virtual-machines/{id}/")
    Call<VirtualMachineWithConfigContext> virtualizationVirtualMachinesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableVirtualMachineWithConfigContextRequest writableVirtualMachineWithConfigContextRequest);

}
