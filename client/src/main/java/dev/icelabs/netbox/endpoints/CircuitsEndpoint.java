package dev.icelabs.netbox.endpoints;

import java.util.List;

import dev.icelabs.netbox.api.CircuitsApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class CircuitsEndpoint extends Endpoint<CircuitsApi> {

    public CircuitsEndpoint(CircuitsApi service) {
        super(service);
    }

    public final Circuits circuits = new Circuits();
    public final CircuitGroups groups = new CircuitGroups();
    public final CircuitTerminations terminations = new CircuitTerminations();
    public final CircuitTypes types = new CircuitTypes();
    public final Providers providers = new Providers();
    public final ProviderAccounts providerAccounts = new ProviderAccounts();
    public final ProviderNetworks providerNetworks = new ProviderNetworks();
    public final VirtualCircuits virtualCircuits = new VirtualCircuits();
    public final VirtualCircuitTerminations virtualCircuitTerminations = new VirtualCircuitTerminations();
    public final VirtualCircuitTypes virtualCircuitTypes = new VirtualCircuitTypes();

    public Circuits circuits() {
        return circuits;
    }

    public CircuitGroups groups() {
        return groups;
    }

    public CircuitTerminations terminations() {
        return terminations;
    }

    public CircuitTypes types() {
        return types;
    }

    public Providers providers() {
        return providers;
    }

    public ProviderAccounts providerAccounts() {
        return providerAccounts;
    }

    public ProviderNetworks providerNetworks() {
        return providerNetworks;
    }

    public VirtualCircuits virtualCircuits() {
        return virtualCircuits;
    }

    public VirtualCircuitTerminations virtualCircuitTerminations() {
        return virtualCircuitTerminations;
    }

    public VirtualCircuitTypes virtualCircuitTypes() {
        return virtualCircuitTypes;
    }

    // ==================== CIRCUITS ====================
    public class Circuits {
        public Call<Void> bulkDestroy(List<CircuitRequest> request) {
            return service.circuitsCircuitsBulkDestroy(request);
        }

        public Call<List<Circuit>> bulkPartialUpdate(List<CircuitRequest> request) {
            return service.circuitsCircuitsBulkPartialUpdate(request);
        }

        public Call<List<Circuit>> bulkUpdate(List<CircuitRequest> request) {
            return service.circuitsCircuitsBulkUpdate(request);
        }

        public Call<Circuit> create(CircuitsCircuitsCreateRequest request) {
            return service.circuitsCircuitsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsCircuitsDestroy(id);
        }

        public Call<PaginatedCircuitList> list() {
            return service.circuitsCircuitsList();
        }

        public Call<Circuit> partialUpdate(Integer id, PatchedWritableCircuitRequest request) {
            return service.circuitsCircuitsPartialUpdate(id, request);
        }

        public Call<Circuit> get(Integer id) {
            return service.circuitsCircuitsRetrieve(id);
        }

        public Call<Circuit> update(Integer id, WritableCircuitRequest request) {
            return service.circuitsCircuitsUpdate(id, request);
        }
    }

    // ==================== CIRCUIT GROUPS ====================
    public class CircuitGroups {
        public final GroupAssignments assignments = new GroupAssignments();

        public Call<Void> bulkDestroy(List<CircuitGroupRequest> request) {
            return service.circuitsCircuitGroupsBulkDestroy(request);
        }

        public Call<List<CircuitGroup>> bulkPartialUpdate(List<CircuitGroupRequest> request) {
            return service.circuitsCircuitGroupsBulkPartialUpdate(request);
        }

        public Call<List<CircuitGroup>> bulkUpdate(List<CircuitGroupRequest> request) {
            return service.circuitsCircuitGroupsBulkUpdate(request);
        }

        public Call<CircuitGroup> create(CircuitsCircuitGroupsCreateRequest request) {
            return service.circuitsCircuitGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsCircuitGroupsDestroy(id);
        }

        public Call<PaginatedCircuitGroupList> list() {
            return service.circuitsCircuitGroupsList();
        }

        public Call<CircuitGroup> partialUpdate(Integer id, PatchedCircuitGroupRequest request) {
            return service.circuitsCircuitGroupsPartialUpdate(id, request);
        }

        public Call<CircuitGroup> get(Integer id) {
            return service.circuitsCircuitGroupsRetrieve(id);
        }

        public Call<CircuitGroup> update(Integer id, CircuitGroupRequest request) {
            return service.circuitsCircuitGroupsUpdate(id, request);
        }

        // ========== GROUP ASSIGNMENTS (nested under groups) ==========
        public class GroupAssignments {
            public Call<Void> bulkDestroy(List<CircuitGroupAssignmentRequest> request) {
                return service.circuitsCircuitGroupAssignmentsBulkDestroy(request);
            }

            public Call<List<CircuitGroupAssignment>> bulkPartialUpdate(List<CircuitGroupAssignmentRequest> request) {
                return service.circuitsCircuitGroupAssignmentsBulkPartialUpdate(request);
            }

            public Call<List<CircuitGroupAssignment>> bulkUpdate(List<CircuitGroupAssignmentRequest> request) {
                return service.circuitsCircuitGroupAssignmentsBulkUpdate(request);
            }

            public Call<CircuitGroupAssignment> create(CircuitsCircuitGroupAssignmentsCreateRequest request) {
                return service.circuitsCircuitGroupAssignmentsCreate(request);
            }

            public Call<Void> delete(Integer id) {
                return service.circuitsCircuitGroupAssignmentsDestroy(id);
            }

            public Call<PaginatedCircuitGroupAssignmentList> list() {
                return service.circuitsCircuitGroupAssignmentsList();
            }

            public Call<CircuitGroupAssignment> partialUpdate(Integer id,
                    PatchedWritableCircuitGroupAssignmentRequest request) {
                return service.circuitsCircuitGroupAssignmentsPartialUpdate(id, request);
            }

            public Call<CircuitGroupAssignment> get(Integer id) {
                return service.circuitsCircuitGroupAssignmentsRetrieve(id);
            }

            public Call<CircuitGroupAssignment> update(Integer id, WritableCircuitGroupAssignmentRequest request) {
                return service.circuitsCircuitGroupAssignmentsUpdate(id, request);
            }
        }
    }

    // ==================== CIRCUIT TERMINATIONS ====================
    public class CircuitTerminations {
        public Call<Void> bulkDestroy(List<CircuitTerminationRequest> request) {
            return service.circuitsCircuitTerminationsBulkDestroy(request);
        }

        public Call<List<CircuitTermination>> bulkPartialUpdate(List<CircuitTerminationRequest> request) {
            return service.circuitsCircuitTerminationsBulkPartialUpdate(request);
        }

        public Call<List<CircuitTermination>> bulkUpdate(List<CircuitTerminationRequest> request) {
            return service.circuitsCircuitTerminationsBulkUpdate(request);
        }

        public Call<CircuitTermination> create(CircuitsCircuitTerminationsCreateRequest request) {
            return service.circuitsCircuitTerminationsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsCircuitTerminationsDestroy(id);
        }

        public Call<PaginatedCircuitTerminationList> list() {
            return service.circuitsCircuitTerminationsList();
        }

        public Call<CircuitTermination> partialUpdate(Integer id, PatchedCircuitTerminationRequest request) {
            return service.circuitsCircuitTerminationsPartialUpdate(id, request);
        }

        public Call<CircuitTermination> paths(Integer id) {
            return service.circuitsCircuitTerminationsPathsRetrieve(id);
        }

        public Call<CircuitTermination> get(Integer id) {
            return service.circuitsCircuitTerminationsRetrieve(id);
        }

        public Call<CircuitTermination> update(Integer id, CircuitTerminationRequest request) {
            return service.circuitsCircuitTerminationsUpdate(id, request);
        }
    }

    // ==================== CIRCUIT TYPES ====================
    public class CircuitTypes {
        public Call<Void> bulkDestroy(List<CircuitTypeRequest> request) {
            return service.circuitsCircuitTypesBulkDestroy(request);
        }

        public Call<List<CircuitType>> bulkPartialUpdate(List<CircuitTypeRequest> request) {
            return service.circuitsCircuitTypesBulkPartialUpdate(request);
        }

        public Call<List<CircuitType>> bulkUpdate(List<CircuitTypeRequest> request) {
            return service.circuitsCircuitTypesBulkUpdate(request);
        }

        public Call<CircuitType> create(CircuitsCircuitTypesCreateRequest request) {
            return service.circuitsCircuitTypesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsCircuitTypesDestroy(id);
        }

        public Call<PaginatedCircuitTypeList> list() {
            return service.circuitsCircuitTypesList();
        }

        public Call<CircuitType> partialUpdate(Integer id, PatchedCircuitTypeRequest request) {
            return service.circuitsCircuitTypesPartialUpdate(id, request);
        }

        public Call<CircuitType> get(Integer id) {
            return service.circuitsCircuitTypesRetrieve(id);
        }

        public Call<CircuitType> update(Integer id, CircuitTypeRequest request) {
            return service.circuitsCircuitTypesUpdate(id, request);
        }
    }

    // ==================== PROVIDERS ====================
    public class Providers {
        public Call<Void> bulkDestroy(List<ProviderRequest> request) {
            return service.circuitsProvidersBulkDestroy(request);
        }

        public Call<List<Provider>> bulkPartialUpdate(List<ProviderRequest> request) {
            return service.circuitsProvidersBulkPartialUpdate(request);
        }

        public Call<List<Provider>> bulkUpdate(List<ProviderRequest> request) {
            return service.circuitsProvidersBulkUpdate(request);
        }

        public Call<Provider> create(CircuitsProvidersCreateRequest request) {
            return service.circuitsProvidersCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsProvidersDestroy(id);
        }

        public Call<PaginatedProviderList> list() {
            return service.circuitsProvidersList();
        }

        public Call<Provider> partialUpdate(Integer id, PatchedProviderRequest request) {
            return service.circuitsProvidersPartialUpdate(id, request);
        }

        public Call<Provider> get(Integer id) {
            return service.circuitsProvidersRetrieve(id);
        }

        public Call<Provider> update(Integer id, ProviderRequest request) {
            return service.circuitsProvidersUpdate(id, request);
        }
    }

    // ==================== PROVIDER ACCOUNTS ====================
    public class ProviderAccounts {
        public Call<Void> bulkDestroy(List<ProviderAccountRequest> request) {
            return service.circuitsProviderAccountsBulkDestroy(request);
        }

        public Call<List<ProviderAccount>> bulkPartialUpdate(List<ProviderAccountRequest> request) {
            return service.circuitsProviderAccountsBulkPartialUpdate(request);
        }

        public Call<List<ProviderAccount>> bulkUpdate(List<ProviderAccountRequest> request) {
            return service.circuitsProviderAccountsBulkUpdate(request);
        }

        public Call<ProviderAccount> create(CircuitsProviderAccountsCreateRequest request) {
            return service.circuitsProviderAccountsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsProviderAccountsDestroy(id);
        }

        public Call<PaginatedProviderAccountList> list() {
            return service.circuitsProviderAccountsList();
        }

        public Call<ProviderAccount> partialUpdate(Integer id, PatchedProviderAccountRequest request) {
            return service.circuitsProviderAccountsPartialUpdate(id, request);
        }

        public Call<ProviderAccount> get(Integer id) {
            return service.circuitsProviderAccountsRetrieve(id);
        }

        public Call<ProviderAccount> update(Integer id, ProviderAccountRequest request) {
            return service.circuitsProviderAccountsUpdate(id, request);
        }
    }

    // ==================== PROVIDER NETWORKS ====================
    public class ProviderNetworks {
        public Call<Void> bulkDestroy(List<ProviderNetworkRequest> request) {
            return service.circuitsProviderNetworksBulkDestroy(request);
        }

        public Call<List<ProviderNetwork>> bulkPartialUpdate(List<ProviderNetworkRequest> request) {
            return service.circuitsProviderNetworksBulkPartialUpdate(request);
        }

        public Call<List<ProviderNetwork>> bulkUpdate(List<ProviderNetworkRequest> request) {
            return service.circuitsProviderNetworksBulkUpdate(request);
        }

        public Call<ProviderNetwork> create(CircuitsProviderNetworksCreateRequest request) {
            return service.circuitsProviderNetworksCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsProviderNetworksDestroy(id);
        }

        public Call<PaginatedProviderNetworkList> list() {
            return service.circuitsProviderNetworksList();
        }

        public Call<ProviderNetwork> partialUpdate(Integer id, PatchedProviderNetworkRequest request) {
            return service.circuitsProviderNetworksPartialUpdate(id, request);
        }

        public Call<ProviderNetwork> get(Integer id) {
            return service.circuitsProviderNetworksRetrieve(id);
        }

        public Call<ProviderNetwork> update(Integer id, ProviderNetworkRequest request) {
            return service.circuitsProviderNetworksUpdate(id, request);
        }
    }

    // ==================== VIRTUAL CIRCUITS ====================
    public class VirtualCircuits {
        public Call<Void> bulkDestroy(List<VirtualCircuitRequest> request) {
            return service.circuitsVirtualCircuitsBulkDestroy(request);
        }

        public Call<List<VirtualCircuit>> bulkPartialUpdate(List<VirtualCircuitRequest> request) {
            return service.circuitsVirtualCircuitsBulkPartialUpdate(request);
        }

        public Call<List<VirtualCircuit>> bulkUpdate(List<VirtualCircuitRequest> request) {
            return service.circuitsVirtualCircuitsBulkUpdate(request);
        }

        public Call<VirtualCircuit> create(CircuitsVirtualCircuitsCreateRequest request) {
            return service.circuitsVirtualCircuitsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsVirtualCircuitsDestroy(id);
        }

        public Call<PaginatedVirtualCircuitList> list() {
            return service.circuitsVirtualCircuitsList();
        }

        public Call<VirtualCircuit> partialUpdate(Integer id, PatchedWritableVirtualCircuitRequest request) {
            return service.circuitsVirtualCircuitsPartialUpdate(id, request);
        }

        public Call<VirtualCircuit> get(Integer id) {
            return service.circuitsVirtualCircuitsRetrieve(id);
        }

        public Call<VirtualCircuit> update(Integer id, WritableVirtualCircuitRequest request) {
            return service.circuitsVirtualCircuitsUpdate(id, request);
        }
    }

    // ==================== VIRTUAL CIRCUIT TERMINATIONS ====================
    public class VirtualCircuitTerminations {
        public Call<Void> bulkDestroy(List<VirtualCircuitTerminationRequest> request) {
            return service.circuitsVirtualCircuitTerminationsBulkDestroy(request);
        }

        public Call<List<VirtualCircuitTermination>> bulkPartialUpdate(List<VirtualCircuitTerminationRequest> request) {
            return service.circuitsVirtualCircuitTerminationsBulkPartialUpdate(request);
        }

        public Call<List<VirtualCircuitTermination>> bulkUpdate(List<VirtualCircuitTerminationRequest> request) {
            return service.circuitsVirtualCircuitTerminationsBulkUpdate(request);
        }

        public Call<VirtualCircuitTermination> create(CircuitsVirtualCircuitTerminationsCreateRequest request) {
            return service.circuitsVirtualCircuitTerminationsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsVirtualCircuitTerminationsDestroy(id);
        }

        public Call<PaginatedVirtualCircuitTerminationList> list() {
            return service.circuitsVirtualCircuitTerminationsList();
        }

        public Call<VirtualCircuitTermination> partialUpdate(Integer id,
                PatchedWritableVirtualCircuitTerminationRequest request) {
            return service.circuitsVirtualCircuitTerminationsPartialUpdate(id, request);
        }

        public Call<VirtualCircuitTermination> paths(Integer id) {
            return service.circuitsVirtualCircuitTerminationsPathsRetrieve(id);
        }

        public Call<VirtualCircuitTermination> get(Integer id) {
            return service.circuitsVirtualCircuitTerminationsRetrieve(id);
        }

        public Call<VirtualCircuitTermination> update(Integer id, WritableVirtualCircuitTerminationRequest request) {
            return service.circuitsVirtualCircuitTerminationsUpdate(id, request);
        }
    }

    // ==================== VIRTUAL CIRCUIT TYPES ====================
    public class VirtualCircuitTypes {
        public Call<Void> bulkDestroy(List<VirtualCircuitTypeRequest> request) {
            return service.circuitsVirtualCircuitTypesBulkDestroy(request);
        }

        public Call<List<VirtualCircuitType>> bulkPartialUpdate(List<VirtualCircuitTypeRequest> request) {
            return service.circuitsVirtualCircuitTypesBulkPartialUpdate(request);
        }

        public Call<List<VirtualCircuitType>> bulkUpdate(List<VirtualCircuitTypeRequest> request) {
            return service.circuitsVirtualCircuitTypesBulkUpdate(request);
        }

        public Call<VirtualCircuitType> create(CircuitsVirtualCircuitTypesCreateRequest request) {
            return service.circuitsVirtualCircuitTypesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.circuitsVirtualCircuitTypesDestroy(id);
        }

        public Call<PaginatedVirtualCircuitTypeList> list() {
            return service.circuitsVirtualCircuitTypesList();
        }

        public Call<VirtualCircuitType> partialUpdate(Integer id, PatchedVirtualCircuitTypeRequest request) {
            return service.circuitsVirtualCircuitTypesPartialUpdate(id, request);
        }

        public Call<VirtualCircuitType> get(Integer id) {
            return service.circuitsVirtualCircuitTypesRetrieve(id);
        }

        public Call<VirtualCircuitType> update(Integer id, VirtualCircuitTypeRequest request) {
            return service.circuitsVirtualCircuitTypesUpdate(id, request);
        }
    }
}
