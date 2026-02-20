package dev.icelabs.netbox.endpoints;

import java.util.List;

import dev.icelabs.netbox.api.VirtualizationApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class VirtEndpoint extends Endpoint<VirtualizationApi> {

    public VirtEndpoint(VirtualizationApi service) {
        super(service);
    }

    // ==================== CLUSTERS ====================
    public final ClusterTypes clusterTypes = new ClusterTypes();
    public final ClusterGroups clusterGroups = new ClusterGroups();
    public final Clusters clusters = new Clusters();

    // ==================== VIRTUAL MACHINES ====================
    public final VirtualMachines virtualMachines = new VirtualMachines();
    public final Interfaces interfaces = new Interfaces();
    public final VirtualDisks virtualDisks = new VirtualDisks();

    // CLUSTERS
    public ClusterTypes clusterTypes() {
        return clusterTypes;
    }

    public ClusterGroups clusterGroups() {
        return clusterGroups;
    }

    public Clusters clusters() {
        return clusters;
    }

    // VIRTUAL MACHINES
    public VirtualMachines virtualMachines() {
        return virtualMachines;
    }

    public Interfaces interfaces() {
        return interfaces;
    }

    public VirtualDisks virtualDisks() {
        return virtualDisks;
    }

    // ==================== CLUSTER TYPES ====================
    public class ClusterTypes {
        public Call<Void> bulkDestroy(List<ClusterTypeRequest> request) {
            return service.virtualizationClusterTypesBulkDestroy(request);
        }

        public Call<List<ClusterType>> bulkPartialUpdate(List<ClusterTypeRequest> request) {
            return service.virtualizationClusterTypesBulkPartialUpdate(request);
        }

        public Call<List<ClusterType>> bulkUpdate(List<ClusterTypeRequest> request) {
            return service.virtualizationClusterTypesBulkUpdate(request);
        }

        public Call<ClusterType> create(VirtualizationClusterTypesCreateRequest request) {
            return service.virtualizationClusterTypesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.virtualizationClusterTypesDestroy(id);
        }

        public Call<PaginatedClusterTypeList> list() {
            return service.virtualizationClusterTypesList();
        }

        public Call<ClusterType> partialUpdate(Integer id, PatchedClusterTypeRequest request) {
            return service.virtualizationClusterTypesPartialUpdate(id, request);
        }

        public Call<ClusterType> get(Integer id) {
            return service.virtualizationClusterTypesRetrieve(id);
        }

        public Call<ClusterType> update(Integer id, ClusterTypeRequest request) {
            return service.virtualizationClusterTypesUpdate(id, request);
        }
    }

    // ==================== CLUSTER GROUPS ====================
    public class ClusterGroups {
        public Call<Void> bulkDestroy(List<ClusterGroupRequest> request) {
            return service.virtualizationClusterGroupsBulkDestroy(request);
        }

        public Call<List<ClusterGroup>> bulkPartialUpdate(List<ClusterGroupRequest> request) {
            return service.virtualizationClusterGroupsBulkPartialUpdate(request);
        }

        public Call<List<ClusterGroup>> bulkUpdate(List<ClusterGroupRequest> request) {
            return service.virtualizationClusterGroupsBulkUpdate(request);
        }

        public Call<ClusterGroup> create(VirtualizationClusterGroupsCreateRequest request) {
            return service.virtualizationClusterGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.virtualizationClusterGroupsDestroy(id);
        }

        public Call<PaginatedClusterGroupList> list() {
            return service.virtualizationClusterGroupsList();
        }

        public Call<ClusterGroup> partialUpdate(Integer id, PatchedClusterGroupRequest request) {
            return service.virtualizationClusterGroupsPartialUpdate(id, request);
        }

        public Call<ClusterGroup> get(Integer id) {
            return service.virtualizationClusterGroupsRetrieve(id);
        }

        public Call<ClusterGroup> update(Integer id, ClusterGroupRequest request) {
            return service.virtualizationClusterGroupsUpdate(id, request);
        }
    }

    // ==================== CLUSTERS ====================
    public class Clusters {
        public Call<Void> bulkDestroy(List<ClusterRequest> request) {
            return service.virtualizationClustersBulkDestroy(request);
        }

        public Call<List<Cluster>> bulkPartialUpdate(List<ClusterRequest> request) {
            return service.virtualizationClustersBulkPartialUpdate(request);
        }

        public Call<List<Cluster>> bulkUpdate(List<ClusterRequest> request) {
            return service.virtualizationClustersBulkUpdate(request);
        }

        public Call<Cluster> create(VirtualizationClustersCreateRequest request) {
            return service.virtualizationClustersCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.virtualizationClustersDestroy(id);
        }

        public Call<PaginatedClusterList> list() {
            return service.virtualizationClustersList();
        }

        public Call<Cluster> partialUpdate(Integer id, PatchedWritableClusterRequest request) {
            return service.virtualizationClustersPartialUpdate(id, request);
        }

        public Call<Cluster> get(Integer id) {
            return service.virtualizationClustersRetrieve(id);
        }

        public Call<Cluster> update(Integer id, WritableClusterRequest request) {
            return service.virtualizationClustersUpdate(id, request);
        }
    }

    // ==================== VIRTUAL MACHINES ====================
    public class VirtualMachines {
        public Call<Void> bulkDestroy(List<VirtualMachineWithConfigContextRequest> request) {
            return service.virtualizationVirtualMachinesBulkDestroy(request);
        }

        public Call<List<VirtualMachineWithConfigContext>> bulkPartialUpdate(
                List<VirtualMachineWithConfigContextRequest> request) {
            return service.virtualizationVirtualMachinesBulkPartialUpdate(request);
        }

        public Call<List<VirtualMachineWithConfigContext>> bulkUpdate(
                List<VirtualMachineWithConfigContextRequest> request) {
            return service.virtualizationVirtualMachinesBulkUpdate(request);
        }

        public Call<VirtualMachineWithConfigContext> create(VirtualizationVirtualMachinesCreateRequest request) {
            return service.virtualizationVirtualMachinesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.virtualizationVirtualMachinesDestroy(id);
        }

        public Call<PaginatedVirtualMachineWithConfigContextList> list() {
            return service.virtualizationVirtualMachinesList();
        }

        public Call<VirtualMachineWithConfigContext> partialUpdate(Integer id,
                PatchedWritableVirtualMachineWithConfigContextRequest request) {
            return service.virtualizationVirtualMachinesPartialUpdate(id, request);
        }

        public Call<VirtualMachineWithConfigContext> renderConfig(Integer id,
                WritableVirtualMachineWithConfigContextRequest request) {
            return service.virtualizationVirtualMachinesRenderConfigCreate(id, request);
        }

        public Call<VirtualMachineWithConfigContext> get(Integer id) {
            return service.virtualizationVirtualMachinesRetrieve(id);
        }

        public Call<VirtualMachineWithConfigContext> update(Integer id,
                WritableVirtualMachineWithConfigContextRequest request) {
            return service.virtualizationVirtualMachinesUpdate(id, request);
        }
    }

    // ==================== INTERFACES ====================
    public class Interfaces {
        public Call<Void> bulkDestroy(List<VMInterfaceRequest> request) {
            return service.virtualizationInterfacesBulkDestroy(request);
        }

        public Call<List<VMInterface>> bulkPartialUpdate(List<VMInterfaceRequest> request) {
            return service.virtualizationInterfacesBulkPartialUpdate(request);
        }

        public Call<List<VMInterface>> bulkUpdate(List<VMInterfaceRequest> request) {
            return service.virtualizationInterfacesBulkUpdate(request);
        }

        public Call<VMInterface> create(VirtualizationInterfacesCreateRequest request) {
            return service.virtualizationInterfacesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.virtualizationInterfacesDestroy(id);
        }

        public Call<PaginatedVMInterfaceList> list() {
            return service.virtualizationInterfacesList();
        }

        public Call<VMInterface> partialUpdate(Integer id, PatchedWritableVMInterfaceRequest request) {
            return service.virtualizationInterfacesPartialUpdate(id, request);
        }

        public Call<VMInterface> get(Integer id) {
            return service.virtualizationInterfacesRetrieve(id);
        }

        public Call<VMInterface> update(Integer id, WritableVMInterfaceRequest request) {
            return service.virtualizationInterfacesUpdate(id, request);
        }
    }

    // ==================== VIRTUAL DISKS ====================
    public class VirtualDisks {
        public Call<Void> bulkDestroy(List<VirtualDiskRequest> request) {
            return service.virtualizationVirtualDisksBulkDestroy(request);
        }

        public Call<List<VirtualDisk>> bulkPartialUpdate(List<VirtualDiskRequest> request) {
            return service.virtualizationVirtualDisksBulkPartialUpdate(request);
        }

        public Call<List<VirtualDisk>> bulkUpdate(List<VirtualDiskRequest> request) {
            return service.virtualizationVirtualDisksBulkUpdate(request);
        }

        public Call<VirtualDisk> create(VirtualizationVirtualDisksCreateRequest request) {
            return service.virtualizationVirtualDisksCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.virtualizationVirtualDisksDestroy(id);
        }

        public Call<PaginatedVirtualDiskList> list() {
            return service.virtualizationVirtualDisksList();
        }

        public Call<VirtualDisk> partialUpdate(Integer id, PatchedVirtualDiskRequest request) {
            return service.virtualizationVirtualDisksPartialUpdate(id, request);
        }

        public Call<VirtualDisk> get(Integer id) {
            return service.virtualizationVirtualDisksRetrieve(id);
        }

        public Call<VirtualDisk> update(Integer id, VirtualDiskRequest request) {
            return service.virtualizationVirtualDisksUpdate(id, request);
        }
    }
}
