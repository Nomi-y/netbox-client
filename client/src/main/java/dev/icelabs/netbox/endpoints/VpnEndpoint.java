package dev.icelabs.netbox.endpoints;

import java.util.List;

import dev.icelabs.netbox.api.VpnApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class VpnEndpoint extends Endpoint<VpnApi> {

    public VpnEndpoint(VpnApi service) {
        super(service);
    }

    // ==================== TUNNELS ====================
    public final TunnelGroups tunnelGroups = new TunnelGroups();
    public final Tunnels tunnels = new Tunnels();
    public final TunnelTerminations tunnelTerminations = new TunnelTerminations();

    // ==================== IPSEC ====================
    public final IkePolicies ikePolicies = new IkePolicies();
    public final IkeProposals ikeProposals = new IkeProposals();
    public final IpsecPolicies ipsecPolicies = new IpsecPolicies();
    public final IpsecProposals ipsecProposals = new IpsecProposals();
    public final IpsecProfiles ipsecProfiles = new IpsecProfiles();

    // ==================== L2VPN ====================
    public final L2Vpns l2Vpns = new L2Vpns();
    public final L2VpnTerminations l2VpnTerminations = new L2VpnTerminations();

    // TUNNELS
    public TunnelGroups tunnelGroups() {
        return tunnelGroups;
    }

    public Tunnels tunnels() {
        return tunnels;
    }

    public TunnelTerminations tunnelTerminations() {
        return tunnelTerminations;
    }

    // IPSEC
    public IkePolicies ikePolicies() {
        return ikePolicies;
    }

    public IkeProposals ikeProposals() {
        return ikeProposals;
    }

    public IpsecPolicies ipsecPolicies() {
        return ipsecPolicies;
    }

    public IpsecProposals ipsecProposals() {
        return ipsecProposals;
    }

    public IpsecProfiles ipsecProfiles() {
        return ipsecProfiles;
    }

    // L2VPN
    public L2Vpns l2Vpns() {
        return l2Vpns;
    }

    public L2VpnTerminations l2VpnTerminations() {
        return l2VpnTerminations;
    }

    // ==================== TUNNEL GROUPS ====================
    public class TunnelGroups {
        public Call<Void> bulkDestroy(List<TunnelGroupRequest> request) {
            return service.vpnTunnelGroupsBulkDestroy(request);
        }

        public Call<List<TunnelGroup>> bulkPartialUpdate(List<TunnelGroupRequest> request) {
            return service.vpnTunnelGroupsBulkPartialUpdate(request);
        }

        public Call<List<TunnelGroup>> bulkUpdate(List<TunnelGroupRequest> request) {
            return service.vpnTunnelGroupsBulkUpdate(request);
        }

        public Call<TunnelGroup> create(VpnTunnelGroupsCreateRequest request) {
            return service.vpnTunnelGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnTunnelGroupsDestroy(id);
        }

        public Call<PaginatedTunnelGroupList> list() {
            return service.vpnTunnelGroupsList();
        }

        public Call<TunnelGroup> partialUpdate(Integer id, PatchedTunnelGroupRequest request) {
            return service.vpnTunnelGroupsPartialUpdate(id, request);
        }

        public Call<TunnelGroup> get(Integer id) {
            return service.vpnTunnelGroupsRetrieve(id);
        }

        public Call<TunnelGroup> update(Integer id, TunnelGroupRequest request) {
            return service.vpnTunnelGroupsUpdate(id, request);
        }
    }

    // ==================== TUNNELS ====================
    public class Tunnels {
        public Call<Void> bulkDestroy(List<TunnelRequest> request) {
            return service.vpnTunnelsBulkDestroy(request);
        }

        public Call<List<Tunnel>> bulkPartialUpdate(List<TunnelRequest> request) {
            return service.vpnTunnelsBulkPartialUpdate(request);
        }

        public Call<List<Tunnel>> bulkUpdate(List<TunnelRequest> request) {
            return service.vpnTunnelsBulkUpdate(request);
        }

        public Call<Tunnel> create(VpnTunnelsCreateRequest request) {
            return service.vpnTunnelsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnTunnelsDestroy(id);
        }

        public Call<PaginatedTunnelList> list() {
            return service.vpnTunnelsList();
        }

        public Call<Tunnel> partialUpdate(Integer id, PatchedWritableTunnelRequest request) {
            return service.vpnTunnelsPartialUpdate(id, request);
        }

        public Call<Tunnel> get(Integer id) {
            return service.vpnTunnelsRetrieve(id);
        }

        public Call<Tunnel> update(Integer id, WritableTunnelRequest request) {
            return service.vpnTunnelsUpdate(id, request);
        }
    }

    // ==================== TUNNEL TERMINATIONS ====================
    public class TunnelTerminations {
        public Call<Void> bulkDestroy(List<TunnelTerminationRequest> request) {
            return service.vpnTunnelTerminationsBulkDestroy(request);
        }

        public Call<List<TunnelTermination>> bulkPartialUpdate(List<TunnelTerminationRequest> request) {
            return service.vpnTunnelTerminationsBulkPartialUpdate(request);
        }

        public Call<List<TunnelTermination>> bulkUpdate(List<TunnelTerminationRequest> request) {
            return service.vpnTunnelTerminationsBulkUpdate(request);
        }

        public Call<TunnelTermination> create(VpnTunnelTerminationsCreateRequest request) {
            return service.vpnTunnelTerminationsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnTunnelTerminationsDestroy(id);
        }

        public Call<PaginatedTunnelTerminationList> list() {
            return service.vpnTunnelTerminationsList();
        }

        public Call<TunnelTermination> partialUpdate(Integer id, PatchedWritableTunnelTerminationRequest request) {
            return service.vpnTunnelTerminationsPartialUpdate(id, request);
        }

        public Call<TunnelTermination> get(Integer id) {
            return service.vpnTunnelTerminationsRetrieve(id);
        }

        public Call<TunnelTermination> update(Integer id, WritableTunnelTerminationRequest request) {
            return service.vpnTunnelTerminationsUpdate(id, request);
        }
    }

    // ==================== IKE POLICIES ====================
    public class IkePolicies {
        public Call<Void> bulkDestroy(List<IKEPolicyRequest> request) {
            return service.vpnIkePoliciesBulkDestroy(request);
        }

        public Call<List<IKEPolicy>> bulkPartialUpdate(List<IKEPolicyRequest> request) {
            return service.vpnIkePoliciesBulkPartialUpdate(request);
        }

        public Call<List<IKEPolicy>> bulkUpdate(List<IKEPolicyRequest> request) {
            return service.vpnIkePoliciesBulkUpdate(request);
        }

        public Call<IKEPolicy> create(VpnIkePoliciesCreateRequest request) {
            return service.vpnIkePoliciesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnIkePoliciesDestroy(id);
        }

        public Call<PaginatedIKEPolicyList> list() {
            return service.vpnIkePoliciesList();
        }

        public Call<IKEPolicy> partialUpdate(Integer id, PatchedWritableIKEPolicyRequest request) {
            return service.vpnIkePoliciesPartialUpdate(id, request);
        }

        public Call<IKEPolicy> get(Integer id) {
            return service.vpnIkePoliciesRetrieve(id);
        }

        public Call<IKEPolicy> update(Integer id, WritableIKEPolicyRequest request) {
            return service.vpnIkePoliciesUpdate(id, request);
        }
    }

    // ==================== IKE PROPOSALS ====================
    public class IkeProposals {
        public Call<Void> bulkDestroy(List<IKEProposalRequest> request) {
            return service.vpnIkeProposalsBulkDestroy(request);
        }

        public Call<List<IKEProposal>> bulkPartialUpdate(List<IKEProposalRequest> request) {
            return service.vpnIkeProposalsBulkPartialUpdate(request);
        }

        public Call<List<IKEProposal>> bulkUpdate(List<IKEProposalRequest> request) {
            return service.vpnIkeProposalsBulkUpdate(request);
        }

        public Call<IKEProposal> create(VpnIkeProposalsCreateRequest request) {
            return service.vpnIkeProposalsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnIkeProposalsDestroy(id);
        }

        public Call<PaginatedIKEProposalList> list() {
            return service.vpnIkeProposalsList();
        }

        public Call<IKEProposal> partialUpdate(Integer id, PatchedWritableIKEProposalRequest request) {
            return service.vpnIkeProposalsPartialUpdate(id, request);
        }

        public Call<IKEProposal> get(Integer id) {
            return service.vpnIkeProposalsRetrieve(id);
        }

        public Call<IKEProposal> update(Integer id, WritableIKEProposalRequest request) {
            return service.vpnIkeProposalsUpdate(id, request);
        }
    }

    // ==================== IPSEC POLICIES ====================
    public class IpsecPolicies {
        public Call<Void> bulkDestroy(List<IPSecPolicyRequest> request) {
            return service.vpnIpsecPoliciesBulkDestroy(request);
        }

        public Call<List<IPSecPolicy>> bulkPartialUpdate(List<IPSecPolicyRequest> request) {
            return service.vpnIpsecPoliciesBulkPartialUpdate(request);
        }

        public Call<List<IPSecPolicy>> bulkUpdate(List<IPSecPolicyRequest> request) {
            return service.vpnIpsecPoliciesBulkUpdate(request);
        }

        public Call<IPSecPolicy> create(VpnIpsecPoliciesCreateRequest request) {
            return service.vpnIpsecPoliciesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnIpsecPoliciesDestroy(id);
        }

        public Call<PaginatedIPSecPolicyList> list() {
            return service.vpnIpsecPoliciesList();
        }

        public Call<IPSecPolicy> partialUpdate(Integer id, PatchedWritableIPSecPolicyRequest request) {
            return service.vpnIpsecPoliciesPartialUpdate(id, request);
        }

        public Call<IPSecPolicy> get(Integer id) {
            return service.vpnIpsecPoliciesRetrieve(id);
        }

        public Call<IPSecPolicy> update(Integer id, WritableIPSecPolicyRequest request) {
            return service.vpnIpsecPoliciesUpdate(id, request);
        }
    }

    // ==================== IPSEC PROPOSALS ====================
    public class IpsecProposals {
        public Call<Void> bulkDestroy(List<IPSecProposalRequest> request) {
            return service.vpnIpsecProposalsBulkDestroy(request);
        }

        public Call<List<IPSecProposal>> bulkPartialUpdate(List<IPSecProposalRequest> request) {
            return service.vpnIpsecProposalsBulkPartialUpdate(request);
        }

        public Call<List<IPSecProposal>> bulkUpdate(List<IPSecProposalRequest> request) {
            return service.vpnIpsecProposalsBulkUpdate(request);
        }

        public Call<IPSecProposal> create(VpnIpsecProposalsCreateRequest request) {
            return service.vpnIpsecProposalsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnIpsecProposalsDestroy(id);
        }

        public Call<PaginatedIPSecProposalList> list() {
            return service.vpnIpsecProposalsList();
        }

        public Call<IPSecProposal> partialUpdate(Integer id, PatchedWritableIPSecProposalRequest request) {
            return service.vpnIpsecProposalsPartialUpdate(id, request);
        }

        public Call<IPSecProposal> get(Integer id) {
            return service.vpnIpsecProposalsRetrieve(id);
        }

        public Call<IPSecProposal> update(Integer id, WritableIPSecProposalRequest request) {
            return service.vpnIpsecProposalsUpdate(id, request);
        }
    }

    // ==================== IPSEC PROFILES ====================
    public class IpsecProfiles {
        public Call<Void> bulkDestroy(List<IPSecProfileRequest> request) {
            return service.vpnIpsecProfilesBulkDestroy(request);
        }

        public Call<List<IPSecProfile>> bulkPartialUpdate(List<IPSecProfileRequest> request) {
            return service.vpnIpsecProfilesBulkPartialUpdate(request);
        }

        public Call<List<IPSecProfile>> bulkUpdate(List<IPSecProfileRequest> request) {
            return service.vpnIpsecProfilesBulkUpdate(request);
        }

        public Call<IPSecProfile> create(VpnIpsecProfilesCreateRequest request) {
            return service.vpnIpsecProfilesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnIpsecProfilesDestroy(id);
        }

        public Call<PaginatedIPSecProfileList> list() {
            return service.vpnIpsecProfilesList();
        }

        public Call<IPSecProfile> partialUpdate(Integer id, PatchedWritableIPSecProfileRequest request) {
            return service.vpnIpsecProfilesPartialUpdate(id, request);
        }

        public Call<IPSecProfile> get(Integer id) {
            return service.vpnIpsecProfilesRetrieve(id);
        }

        public Call<IPSecProfile> update(Integer id, WritableIPSecProfileRequest request) {
            return service.vpnIpsecProfilesUpdate(id, request);
        }
    }

    // ==================== L2VPNS ====================
    public class L2Vpns {
        public Call<Void> bulkDestroy(List<L2VPNRequest> request) {
            return service.vpnL2vpnsBulkDestroy(request);
        }

        public Call<List<L2VPN>> bulkPartialUpdate(List<L2VPNRequest> request) {
            return service.vpnL2vpnsBulkPartialUpdate(request);
        }

        public Call<List<L2VPN>> bulkUpdate(List<L2VPNRequest> request) {
            return service.vpnL2vpnsBulkUpdate(request);
        }

        public Call<L2VPN> create(VpnL2vpnsCreateRequest request) {
            return service.vpnL2vpnsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnL2vpnsDestroy(id);
        }

        public Call<PaginatedL2VPNList> list() {
            return service.vpnL2vpnsList();
        }

        public Call<L2VPN> partialUpdate(Integer id, PatchedWritableL2VPNRequest request) {
            return service.vpnL2vpnsPartialUpdate(id, request);
        }

        public Call<L2VPN> get(Integer id) {
            return service.vpnL2vpnsRetrieve(id);
        }

        public Call<L2VPN> update(Integer id, WritableL2VPNRequest request) {
            return service.vpnL2vpnsUpdate(id, request);
        }
    }

    // ==================== L2VPN TERMINATIONS ====================
    public class L2VpnTerminations {
        public Call<Void> bulkDestroy(List<L2VPNTerminationRequest> request) {
            return service.vpnL2vpnTerminationsBulkDestroy(request);
        }

        public Call<List<L2VPNTermination>> bulkPartialUpdate(List<L2VPNTerminationRequest> request) {
            return service.vpnL2vpnTerminationsBulkPartialUpdate(request);
        }

        public Call<List<L2VPNTermination>> bulkUpdate(List<L2VPNTerminationRequest> request) {
            return service.vpnL2vpnTerminationsBulkUpdate(request);
        }

        public Call<L2VPNTermination> create(VpnL2vpnTerminationsCreateRequest request) {
            return service.vpnL2vpnTerminationsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.vpnL2vpnTerminationsDestroy(id);
        }

        public Call<PaginatedL2VPNTerminationList> list() {
            return service.vpnL2vpnTerminationsList();
        }

        public Call<L2VPNTermination> partialUpdate(Integer id, PatchedL2VPNTerminationRequest request) {
            return service.vpnL2vpnTerminationsPartialUpdate(id, request);
        }

        public Call<L2VPNTermination> get(Integer id) {
            return service.vpnL2vpnTerminationsRetrieve(id);
        }

        public Call<L2VPNTermination> update(Integer id, L2VPNTerminationRequest request) {
            return service.vpnL2vpnTerminationsUpdate(id, request);
        }
    }
}
