package dev.icelabs.netbox.endpoints;

import java.util.List;

import dev.icelabs.netbox.api.IpamApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class IpamEndpoint extends Endpoint<IpamApi> {

    public IpamEndpoint(IpamApi service) {
        super(service);
    }

    // ==================== IP SPACE ====================
    public final Vrfs vrfs = new Vrfs();
    public final Aggregates aggregates = new Aggregates();
    public final Prefixes prefixes = new Prefixes();
    public final IpRanges ipRanges = new IpRanges();
    public final IpAddresses ipAddresses = new IpAddresses();

    // ==================== VLANS ====================
    public final VlanGroups vlanGroups = new VlanGroups();
    public final Vlans vlans = new Vlans();
    public final VlanTranslationPolicies vlanTranslationPolicies = new VlanTranslationPolicies();
    public final VlanTranslationRules vlanTranslationRules = new VlanTranslationRules();

    // ==================== ASN ====================
    public final Rirs rirs = new Rirs();
    public final Asns asns = new Asns();
    public final AsnRanges asnRanges = new AsnRanges();

    // ==================== FHRP ====================
    public final FhrpGroups fhrpGroups = new FhrpGroups();
    public final FhrpGroupAssignments fhrpGroupAssignments = new FhrpGroupAssignments();

    // ==================== SERVICES ====================
    public final Services services = new Services();
    public final ServiceTemplates serviceTemplates = new ServiceTemplates();

    // ==================== ROUTING ====================
    public final Roles roles = new Roles();
    public final RouteTargets routeTargets = new RouteTargets();

    // IP SPACE
    public Vrfs vrfs() {
        return vrfs;
    }

    public Aggregates aggregates() {
        return aggregates;
    }

    public Prefixes prefixes() {
        return prefixes;
    }

    public IpRanges ipRanges() {
        return ipRanges;
    }

    public IpAddresses ipAddresses() {
        return ipAddresses;
    }

    // VLANS
    public VlanGroups vlanGroups() {
        return vlanGroups;
    }

    public Vlans vlans() {
        return vlans;
    }

    public VlanTranslationPolicies vlanTranslationPolicies() {
        return vlanTranslationPolicies;
    }

    public VlanTranslationRules vlanTranslationRules() {
        return vlanTranslationRules;
    }

    // ASN
    public Rirs rirs() {
        return rirs;
    }

    public Asns asns() {
        return asns;
    }

    public AsnRanges asnRanges() {
        return asnRanges;
    }

    // FHRP
    public FhrpGroups fhrpGroups() {
        return fhrpGroups;
    }

    public FhrpGroupAssignments fhrpGroupAssignments() {
        return fhrpGroupAssignments;
    }

    // SERVICES
    public Services services() {
        return services;
    }

    public ServiceTemplates serviceTemplates() {
        return serviceTemplates;
    }

    // ROUTING
    public Roles roles() {
        return roles;
    }

    public RouteTargets routeTargets() {
        return routeTargets;
    }

    // ==================== VRFS ====================
    public class Vrfs {
        public Call<Void> bulkDestroy(List<VRFRequest> request) {
            return service.ipamVrfsBulkDestroy(request);
        }

        public Call<List<VRF>> bulkPartialUpdate(List<VRFRequest> request) {
            return service.ipamVrfsBulkPartialUpdate(request);
        }

        public Call<List<VRF>> bulkUpdate(List<VRFRequest> request) {
            return service.ipamVrfsBulkUpdate(request);
        }

        public Call<VRF> create(IpamVrfsCreateRequest request) {
            return service.ipamVrfsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamVrfsDestroy(id);
        }

        public Call<PaginatedVRFList> list() {
            return service.ipamVrfsList();
        }

        public Call<VRF> partialUpdate(Integer id, PatchedVRFRequest request) {
            return service.ipamVrfsPartialUpdate(id, request);
        }

        public Call<VRF> get(Integer id) {
            return service.ipamVrfsRetrieve(id);
        }

        public Call<VRF> update(Integer id, VRFRequest request) {
            return service.ipamVrfsUpdate(id, request);
        }
    }

    // ==================== AGGREGATES ====================
    public class Aggregates {
        public Call<Void> bulkDestroy(List<AggregateRequest> request) {
            return service.ipamAggregatesBulkDestroy(request);
        }

        public Call<List<Aggregate>> bulkPartialUpdate(List<AggregateRequest> request) {
            return service.ipamAggregatesBulkPartialUpdate(request);
        }

        public Call<List<Aggregate>> bulkUpdate(List<AggregateRequest> request) {
            return service.ipamAggregatesBulkUpdate(request);
        }

        public Call<Aggregate> create(IpamAggregatesCreateRequest request) {
            return service.ipamAggregatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamAggregatesDestroy(id);
        }

        public Call<PaginatedAggregateList> list() {
            return service.ipamAggregatesList();
        }

        public Call<Aggregate> partialUpdate(Integer id, PatchedWritableAggregateRequest request) {
            return service.ipamAggregatesPartialUpdate(id, request);
        }

        public Call<Aggregate> get(Integer id) {
            return service.ipamAggregatesRetrieve(id);
        }

        public Call<Aggregate> update(Integer id, WritableAggregateRequest request) {
            return service.ipamAggregatesUpdate(id, request);
        }
    }

    // ==================== PREFIXES ====================
    public class Prefixes {
        public Call<List<IPAddress>> availableIpsCreate(Integer id, List<AvailableIPRequestRequest> request) {
            return service.ipamPrefixesAvailableIpsCreate(id, request);
        }

        public Call<List<AvailableIP>> availableIpsList(Integer id) {
            return service.ipamPrefixesAvailableIpsList(id);
        }

        public Call<List<Prefix>> availablePrefixesCreate(Integer id, List<PrefixRequest> request) {
            return service.ipamPrefixesAvailablePrefixesCreate(id, request);
        }

        public Call<List<AvailablePrefix>> availablePrefixesList(Integer id) {
            return service.ipamPrefixesAvailablePrefixesList(id);
        }

        public Call<Void> bulkDestroy(List<PrefixRequest> request) {
            return service.ipamPrefixesBulkDestroy(request);
        }

        public Call<List<Prefix>> bulkPartialUpdate(List<PrefixRequest> request) {
            return service.ipamPrefixesBulkPartialUpdate(request);
        }

        public Call<List<Prefix>> bulkUpdate(List<PrefixRequest> request) {
            return service.ipamPrefixesBulkUpdate(request);
        }

        public Call<Prefix> create(IpamPrefixesCreateRequest request) {
            return service.ipamPrefixesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamPrefixesDestroy(id);
        }

        public Call<PaginatedPrefixList> list() {
            return service.ipamPrefixesList();
        }

        public Call<Prefix> partialUpdate(Integer id, PatchedWritablePrefixRequest request) {
            return service.ipamPrefixesPartialUpdate(id, request);
        }

        public Call<Prefix> get(Integer id) {
            return service.ipamPrefixesRetrieve(id);
        }

        public Call<Prefix> update(Integer id, WritablePrefixRequest request) {
            return service.ipamPrefixesUpdate(id, request);
        }
    }

    // ==================== IP RANGES ====================
    public class IpRanges {
        public Call<List<IPAddress>> availableIpsCreate(Integer id, List<AvailableIPRequestRequest> request) {
            return service.ipamIpRangesAvailableIpsCreate(id, request);
        }

        public Call<List<AvailableIP>> availableIpsList(Integer id) {
            return service.ipamIpRangesAvailableIpsList(id);
        }

        public Call<Void> bulkDestroy(List<IPRangeRequest> request) {
            return service.ipamIpRangesBulkDestroy(request);
        }

        public Call<List<IPRange>> bulkPartialUpdate(List<IPRangeRequest> request) {
            return service.ipamIpRangesBulkPartialUpdate(request);
        }

        public Call<List<IPRange>> bulkUpdate(List<IPRangeRequest> request) {
            return service.ipamIpRangesBulkUpdate(request);
        }

        public Call<IPRange> create(IpamIpRangesCreateRequest request) {
            return service.ipamIpRangesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamIpRangesDestroy(id);
        }

        public Call<PaginatedIPRangeList> list() {
            return service.ipamIpRangesList();
        }

        public Call<IPRange> partialUpdate(Integer id, PatchedWritableIPRangeRequest request) {
            return service.ipamIpRangesPartialUpdate(id, request);
        }

        public Call<IPRange> get(Integer id) {
            return service.ipamIpRangesRetrieve(id);
        }

        public Call<IPRange> update(Integer id, WritableIPRangeRequest request) {
            return service.ipamIpRangesUpdate(id, request);
        }
    }

    // ==================== IP ADDRESSES ====================
    public class IpAddresses {
        public Call<Void> bulkDestroy(List<IPAddressRequest> request) {
            return service.ipamIpAddressesBulkDestroy(request);
        }

        public Call<List<IPAddress>> bulkPartialUpdate(List<IPAddressRequest> request) {
            return service.ipamIpAddressesBulkPartialUpdate(request);
        }

        public Call<List<IPAddress>> bulkUpdate(List<IPAddressRequest> request) {
            return service.ipamIpAddressesBulkUpdate(request);
        }

        public Call<IPAddress> create(IpamIpAddressesCreateRequest request) {
            return service.ipamIpAddressesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamIpAddressesDestroy(id);
        }

        public Call<PaginatedIPAddressList> list() {
            return service.ipamIpAddressesList();
        }

        public Call<IPAddress> partialUpdate(Integer id, PatchedWritableIPAddressRequest request) {
            return service.ipamIpAddressesPartialUpdate(id, request);
        }

        public Call<IPAddress> get(Integer id) {
            return service.ipamIpAddressesRetrieve(id);
        }

        public Call<IPAddress> update(Integer id, WritableIPAddressRequest request) {
            return service.ipamIpAddressesUpdate(id, request);
        }
    }

    // ==================== VLAN GROUPS ====================
    public class VlanGroups {
        public Call<List<VLAN>> availableVlansCreate(Integer id, List<VLANRequest> request) {
            return service.ipamVlanGroupsAvailableVlansCreate(id, request);
        }

        public Call<List<AvailableVLAN>> availableVlansList(Integer id) {
            return service.ipamVlanGroupsAvailableVlansList(id);
        }

        public Call<Void> bulkDestroy(List<VLANGroupRequest> request) {
            return service.ipamVlanGroupsBulkDestroy(request);
        }

        public Call<List<VLANGroup>> bulkPartialUpdate(List<VLANGroupRequest> request) {
            return service.ipamVlanGroupsBulkPartialUpdate(request);
        }

        public Call<List<VLANGroup>> bulkUpdate(List<VLANGroupRequest> request) {
            return service.ipamVlanGroupsBulkUpdate(request);
        }

        public Call<VLANGroup> create(IpamVlanGroupsCreateRequest request) {
            return service.ipamVlanGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamVlanGroupsDestroy(id);
        }

        public Call<PaginatedVLANGroupList> list() {
            return service.ipamVlanGroupsList();
        }

        public Call<VLANGroup> partialUpdate(Integer id, PatchedVLANGroupRequest request) {
            return service.ipamVlanGroupsPartialUpdate(id, request);
        }

        public Call<VLANGroup> get(Integer id) {
            return service.ipamVlanGroupsRetrieve(id);
        }

        public Call<VLANGroup> update(Integer id, VLANGroupRequest request) {
            return service.ipamVlanGroupsUpdate(id, request);
        }
    }

    // ==================== VLANS ====================
    public class Vlans {
        public Call<Void> bulkDestroy(List<VLANRequest> request) {
            return service.ipamVlansBulkDestroy(request);
        }

        public Call<List<VLAN>> bulkPartialUpdate(List<VLANRequest> request) {
            return service.ipamVlansBulkPartialUpdate(request);
        }

        public Call<List<VLAN>> bulkUpdate(List<VLANRequest> request) {
            return service.ipamVlansBulkUpdate(request);
        }

        public Call<VLAN> create(IpamVlansCreateRequest request) {
            return service.ipamVlansCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamVlansDestroy(id);
        }

        public Call<PaginatedVLANList> list() {
            return service.ipamVlansList();
        }

        public Call<VLAN> partialUpdate(Integer id, PatchedWritableVLANRequest request) {
            return service.ipamVlansPartialUpdate(id, request);
        }

        public Call<VLAN> get(Integer id) {
            return service.ipamVlansRetrieve(id);
        }

        public Call<VLAN> update(Integer id, WritableVLANRequest request) {
            return service.ipamVlansUpdate(id, request);
        }
    }

    // ==================== VLAN TRANSLATION POLICIES ====================
    public class VlanTranslationPolicies {
        public Call<Void> bulkDestroy(List<VLANTranslationPolicyRequest> request) {
            return service.ipamVlanTranslationPoliciesBulkDestroy(request);
        }

        public Call<List<VLANTranslationPolicy>> bulkPartialUpdate(List<VLANTranslationPolicyRequest> request) {
            return service.ipamVlanTranslationPoliciesBulkPartialUpdate(request);
        }

        public Call<List<VLANTranslationPolicy>> bulkUpdate(List<VLANTranslationPolicyRequest> request) {
            return service.ipamVlanTranslationPoliciesBulkUpdate(request);
        }

        public Call<VLANTranslationPolicy> create(IpamVlanTranslationPoliciesCreateRequest request) {
            return service.ipamVlanTranslationPoliciesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamVlanTranslationPoliciesDestroy(id);
        }

        public Call<PaginatedVLANTranslationPolicyList> list() {
            return service.ipamVlanTranslationPoliciesList();
        }

        public Call<VLANTranslationPolicy> partialUpdate(Integer id, PatchedVLANTranslationPolicyRequest request) {
            return service.ipamVlanTranslationPoliciesPartialUpdate(id, request);
        }

        public Call<VLANTranslationPolicy> get(Integer id) {
            return service.ipamVlanTranslationPoliciesRetrieve(id);
        }

        public Call<VLANTranslationPolicy> update(Integer id, VLANTranslationPolicyRequest request) {
            return service.ipamVlanTranslationPoliciesUpdate(id, request);
        }
    }

    // ==================== VLAN TRANSLATION RULES ====================
    public class VlanTranslationRules {
        public Call<Void> bulkDestroy(List<VLANTranslationRuleRequest> request) {
            return service.ipamVlanTranslationRulesBulkDestroy(request);
        }

        public Call<List<VLANTranslationRule>> bulkPartialUpdate(List<VLANTranslationRuleRequest> request) {
            return service.ipamVlanTranslationRulesBulkPartialUpdate(request);
        }

        public Call<List<VLANTranslationRule>> bulkUpdate(List<VLANTranslationRuleRequest> request) {
            return service.ipamVlanTranslationRulesBulkUpdate(request);
        }

        public Call<VLANTranslationRule> create(IpamVlanTranslationRulesCreateRequest request) {
            return service.ipamVlanTranslationRulesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamVlanTranslationRulesDestroy(id);
        }

        public Call<PaginatedVLANTranslationRuleList> list() {
            return service.ipamVlanTranslationRulesList();
        }

        public Call<VLANTranslationRule> partialUpdate(Integer id, PatchedVLANTranslationRuleRequest request) {
            return service.ipamVlanTranslationRulesPartialUpdate(id, request);
        }

        public Call<VLANTranslationRule> get(Integer id) {
            return service.ipamVlanTranslationRulesRetrieve(id);
        }

        public Call<VLANTranslationRule> update(Integer id, VLANTranslationRuleRequest request) {
            return service.ipamVlanTranslationRulesUpdate(id, request);
        }
    }

    // ==================== RIRS ====================
    public class Rirs {
        public Call<Void> bulkDestroy(List<RIRRequest> request) {
            return service.ipamRirsBulkDestroy(request);
        }

        public Call<List<RIR>> bulkPartialUpdate(List<RIRRequest> request) {
            return service.ipamRirsBulkPartialUpdate(request);
        }

        public Call<List<RIR>> bulkUpdate(List<RIRRequest> request) {
            return service.ipamRirsBulkUpdate(request);
        }

        public Call<RIR> create(IpamRirsCreateRequest request) {
            return service.ipamRirsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamRirsDestroy(id);
        }

        public Call<PaginatedRIRList> list() {
            return service.ipamRirsList();
        }

        public Call<RIR> partialUpdate(Integer id, PatchedRIRRequest request) {
            return service.ipamRirsPartialUpdate(id, request);
        }

        public Call<RIR> get(Integer id) {
            return service.ipamRirsRetrieve(id);
        }

        public Call<RIR> update(Integer id, RIRRequest request) {
            return service.ipamRirsUpdate(id, request);
        }
    }

    // ==================== ASNS ====================
    public class Asns {
        public Call<Void> bulkDestroy(List<ASNRequest> request) {
            return service.ipamAsnsBulkDestroy(request);
        }

        public Call<List<ASN>> bulkPartialUpdate(List<ASNRequest> request) {
            return service.ipamAsnsBulkPartialUpdate(request);
        }

        public Call<List<ASN>> bulkUpdate(List<ASNRequest> request) {
            return service.ipamAsnsBulkUpdate(request);
        }

        public Call<ASN> create(IpamAsnsCreateRequest request) {
            return service.ipamAsnsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamAsnsDestroy(id);
        }

        public Call<PaginatedASNList> list() {
            return service.ipamAsnsList();
        }

        public Call<ASN> partialUpdate(Integer id, PatchedASNRequest request) {
            return service.ipamAsnsPartialUpdate(id, request);
        }

        public Call<ASN> get(Integer id) {
            return service.ipamAsnsRetrieve(id);
        }

        public Call<ASN> update(Integer id, ASNRequest request) {
            return service.ipamAsnsUpdate(id, request);
        }
    }

    // ==================== ASN RANGES ====================
    public class AsnRanges {
        public Call<List<ASN>> availableAsnsCreate(Integer id, List<ASNRequest> request) {
            return service.ipamAsnRangesAvailableAsnsCreate(id, request);
        }

        public Call<List<AvailableASN>> availableAsnsList(Integer id) {
            return service.ipamAsnRangesAvailableAsnsList(id);
        }

        public Call<Void> bulkDestroy(List<ASNRangeRequest> request) {
            return service.ipamAsnRangesBulkDestroy(request);
        }

        public Call<List<ASNRange>> bulkPartialUpdate(List<ASNRangeRequest> request) {
            return service.ipamAsnRangesBulkPartialUpdate(request);
        }

        public Call<List<ASNRange>> bulkUpdate(List<ASNRangeRequest> request) {
            return service.ipamAsnRangesBulkUpdate(request);
        }

        public Call<ASNRange> create(IpamAsnRangesCreateRequest request) {
            return service.ipamAsnRangesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamAsnRangesDestroy(id);
        }

        public Call<PaginatedASNRangeList> list() {
            return service.ipamAsnRangesList();
        }

        public Call<ASNRange> partialUpdate(Integer id, PatchedASNRangeRequest request) {
            return service.ipamAsnRangesPartialUpdate(id, request);
        }

        public Call<ASNRange> get(Integer id) {
            return service.ipamAsnRangesRetrieve(id);
        }

        public Call<ASNRange> update(Integer id, ASNRangeRequest request) {
            return service.ipamAsnRangesUpdate(id, request);
        }
    }

    // ==================== FHRP GROUPS ====================
    public class FhrpGroups {
        public Call<Void> bulkDestroy(List<FHRPGroupRequest> request) {
            return service.ipamFhrpGroupsBulkDestroy(request);
        }

        public Call<List<FHRPGroup>> bulkPartialUpdate(List<FHRPGroupRequest> request) {
            return service.ipamFhrpGroupsBulkPartialUpdate(request);
        }

        public Call<List<FHRPGroup>> bulkUpdate(List<FHRPGroupRequest> request) {
            return service.ipamFhrpGroupsBulkUpdate(request);
        }

        public Call<FHRPGroup> create(IpamFhrpGroupsCreateRequest request) {
            return service.ipamFhrpGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamFhrpGroupsDestroy(id);
        }

        public Call<PaginatedFHRPGroupList> list() {
            return service.ipamFhrpGroupsList();
        }

        public Call<FHRPGroup> partialUpdate(Integer id, PatchedFHRPGroupRequest request) {
            return service.ipamFhrpGroupsPartialUpdate(id, request);
        }

        public Call<FHRPGroup> get(Integer id) {
            return service.ipamFhrpGroupsRetrieve(id);
        }

        public Call<FHRPGroup> update(Integer id, FHRPGroupRequest request) {
            return service.ipamFhrpGroupsUpdate(id, request);
        }
    }

    // ==================== FHRP GROUP ASSIGNMENTS ====================
    public class FhrpGroupAssignments {
        public Call<Void> bulkDestroy(List<FHRPGroupAssignmentRequest> request) {
            return service.ipamFhrpGroupAssignmentsBulkDestroy(request);
        }

        public Call<List<FHRPGroupAssignment>> bulkPartialUpdate(List<FHRPGroupAssignmentRequest> request) {
            return service.ipamFhrpGroupAssignmentsBulkPartialUpdate(request);
        }

        public Call<List<FHRPGroupAssignment>> bulkUpdate(List<FHRPGroupAssignmentRequest> request) {
            return service.ipamFhrpGroupAssignmentsBulkUpdate(request);
        }

        public Call<FHRPGroupAssignment> create(IpamFhrpGroupAssignmentsCreateRequest request) {
            return service.ipamFhrpGroupAssignmentsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamFhrpGroupAssignmentsDestroy(id);
        }

        public Call<PaginatedFHRPGroupAssignmentList> list() {
            return service.ipamFhrpGroupAssignmentsList();
        }

        public Call<FHRPGroupAssignment> partialUpdate(Integer id, PatchedFHRPGroupAssignmentRequest request) {
            return service.ipamFhrpGroupAssignmentsPartialUpdate(id, request);
        }

        public Call<FHRPGroupAssignment> get(Integer id) {
            return service.ipamFhrpGroupAssignmentsRetrieve(id);
        }

        public Call<FHRPGroupAssignment> update(Integer id, FHRPGroupAssignmentRequest request) {
            return service.ipamFhrpGroupAssignmentsUpdate(id, request);
        }
    }

    // ==================== SERVICES ====================
    public class Services {
        public Call<Void> bulkDestroy(List<ServiceRequest> request) {
            return service.ipamServicesBulkDestroy(request);
        }

        public Call<List<Service>> bulkPartialUpdate(List<ServiceRequest> request) {
            return service.ipamServicesBulkPartialUpdate(request);
        }

        public Call<List<Service>> bulkUpdate(List<ServiceRequest> request) {
            return service.ipamServicesBulkUpdate(request);
        }

        public Call<Service> create(IpamServicesCreateRequest request) {
            return service.ipamServicesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamServicesDestroy(id);
        }

        public Call<PaginatedServiceList> list() {
            return service.ipamServicesList();
        }

        public Call<Service> partialUpdate(Integer id, PatchedWritableServiceRequest request) {
            return service.ipamServicesPartialUpdate(id, request);
        }

        public Call<Service> get(Integer id) {
            return service.ipamServicesRetrieve(id);
        }

        public Call<Service> update(Integer id, WritableServiceRequest request) {
            return service.ipamServicesUpdate(id, request);
        }
    }

    // ==================== SERVICE TEMPLATES ====================
    public class ServiceTemplates {
        public Call<Void> bulkDestroy(List<ServiceTemplateRequest> request) {
            return service.ipamServiceTemplatesBulkDestroy(request);
        }

        public Call<List<ServiceTemplate>> bulkPartialUpdate(List<ServiceTemplateRequest> request) {
            return service.ipamServiceTemplatesBulkPartialUpdate(request);
        }

        public Call<List<ServiceTemplate>> bulkUpdate(List<ServiceTemplateRequest> request) {
            return service.ipamServiceTemplatesBulkUpdate(request);
        }

        public Call<ServiceTemplate> create(IpamServiceTemplatesCreateRequest request) {
            return service.ipamServiceTemplatesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamServiceTemplatesDestroy(id);
        }

        public Call<PaginatedServiceTemplateList> list() {
            return service.ipamServiceTemplatesList();
        }

        public Call<ServiceTemplate> partialUpdate(Integer id, PatchedWritableServiceTemplateRequest request) {
            return service.ipamServiceTemplatesPartialUpdate(id, request);
        }

        public Call<ServiceTemplate> get(Integer id) {
            return service.ipamServiceTemplatesRetrieve(id);
        }

        public Call<ServiceTemplate> update(Integer id, WritableServiceTemplateRequest request) {
            return service.ipamServiceTemplatesUpdate(id, request);
        }
    }

    // ==================== ROLES ====================
    public class Roles {
        public Call<Void> bulkDestroy(List<RoleRequest> request) {
            return service.ipamRolesBulkDestroy(request);
        }

        public Call<List<Role>> bulkPartialUpdate(List<RoleRequest> request) {
            return service.ipamRolesBulkPartialUpdate(request);
        }

        public Call<List<Role>> bulkUpdate(List<RoleRequest> request) {
            return service.ipamRolesBulkUpdate(request);
        }

        public Call<Role> create(IpamRolesCreateRequest request) {
            return service.ipamRolesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamRolesDestroy(id);
        }

        public Call<PaginatedRoleList> list() {
            return service.ipamRolesList();
        }

        public Call<Role> partialUpdate(Integer id, PatchedRoleRequest request) {
            return service.ipamRolesPartialUpdate(id, request);
        }

        public Call<Role> get(Integer id) {
            return service.ipamRolesRetrieve(id);
        }

        public Call<Role> update(Integer id, RoleRequest request) {
            return service.ipamRolesUpdate(id, request);
        }
    }

    // ==================== ROUTE TARGETS ====================
    public class RouteTargets {
        public Call<Void> bulkDestroy(List<RouteTargetRequest> request) {
            return service.ipamRouteTargetsBulkDestroy(request);
        }

        public Call<List<RouteTarget>> bulkPartialUpdate(List<RouteTargetRequest> request) {
            return service.ipamRouteTargetsBulkPartialUpdate(request);
        }

        public Call<List<RouteTarget>> bulkUpdate(List<RouteTargetRequest> request) {
            return service.ipamRouteTargetsBulkUpdate(request);
        }

        public Call<RouteTarget> create(IpamRouteTargetsCreateRequest request) {
            return service.ipamRouteTargetsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.ipamRouteTargetsDestroy(id);
        }

        public Call<PaginatedRouteTargetList> list() {
            return service.ipamRouteTargetsList();
        }

        public Call<RouteTarget> partialUpdate(Integer id, PatchedRouteTargetRequest request) {
            return service.ipamRouteTargetsPartialUpdate(id, request);
        }

        public Call<RouteTarget> get(Integer id) {
            return service.ipamRouteTargetsRetrieve(id);
        }

        public Call<RouteTarget> update(Integer id, RouteTargetRequest request) {
            return service.ipamRouteTargetsUpdate(id, request);
        }
    }
}
