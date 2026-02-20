package dev.icelabs.netbox.api;

import java.util.List;

import dev.icelabs.netbox.model.IKEPolicy;
import dev.icelabs.netbox.model.IKEPolicyRequest;
import dev.icelabs.netbox.model.IKEProposal;
import dev.icelabs.netbox.model.IKEProposalRequest;
import dev.icelabs.netbox.model.IPSecPolicy;
import dev.icelabs.netbox.model.IPSecPolicyRequest;
import dev.icelabs.netbox.model.IPSecProfile;
import dev.icelabs.netbox.model.IPSecProfileRequest;
import dev.icelabs.netbox.model.IPSecProposal;
import dev.icelabs.netbox.model.IPSecProposalRequest;
import dev.icelabs.netbox.model.L2VPN;
import dev.icelabs.netbox.model.L2VPNRequest;
import dev.icelabs.netbox.model.L2VPNTermination;
import dev.icelabs.netbox.model.L2VPNTerminationRequest;
import dev.icelabs.netbox.model.PaginatedIKEPolicyList;
import dev.icelabs.netbox.model.PaginatedIKEProposalList;
import dev.icelabs.netbox.model.PaginatedIPSecPolicyList;
import dev.icelabs.netbox.model.PaginatedIPSecProfileList;
import dev.icelabs.netbox.model.PaginatedIPSecProposalList;
import dev.icelabs.netbox.model.PaginatedL2VPNList;
import dev.icelabs.netbox.model.PaginatedL2VPNTerminationList;
import dev.icelabs.netbox.model.PaginatedTunnelGroupList;
import dev.icelabs.netbox.model.PaginatedTunnelList;
import dev.icelabs.netbox.model.PaginatedTunnelTerminationList;
import dev.icelabs.netbox.model.PatchedL2VPNTerminationRequest;
import dev.icelabs.netbox.model.PatchedTunnelGroupRequest;
import dev.icelabs.netbox.model.PatchedWritableIKEPolicyRequest;
import dev.icelabs.netbox.model.PatchedWritableIKEProposalRequest;
import dev.icelabs.netbox.model.PatchedWritableIPSecPolicyRequest;
import dev.icelabs.netbox.model.PatchedWritableIPSecProfileRequest;
import dev.icelabs.netbox.model.PatchedWritableIPSecProposalRequest;
import dev.icelabs.netbox.model.PatchedWritableL2VPNRequest;
import dev.icelabs.netbox.model.PatchedWritableTunnelRequest;
import dev.icelabs.netbox.model.PatchedWritableTunnelTerminationRequest;
import dev.icelabs.netbox.model.Tunnel;
import dev.icelabs.netbox.model.TunnelGroup;
import dev.icelabs.netbox.model.TunnelGroupRequest;
import dev.icelabs.netbox.model.TunnelRequest;
import dev.icelabs.netbox.model.TunnelTermination;
import dev.icelabs.netbox.model.TunnelTerminationRequest;
import dev.icelabs.netbox.model.VpnIkePoliciesCreateRequest;
import dev.icelabs.netbox.model.VpnIkeProposalsCreateRequest;
import dev.icelabs.netbox.model.VpnIpsecPoliciesCreateRequest;
import dev.icelabs.netbox.model.VpnIpsecProfilesCreateRequest;
import dev.icelabs.netbox.model.VpnIpsecProposalsCreateRequest;
import dev.icelabs.netbox.model.VpnL2vpnTerminationsCreateRequest;
import dev.icelabs.netbox.model.VpnL2vpnsCreateRequest;
import dev.icelabs.netbox.model.VpnTunnelGroupsCreateRequest;
import dev.icelabs.netbox.model.VpnTunnelTerminationsCreateRequest;
import dev.icelabs.netbox.model.VpnTunnelsCreateRequest;
import dev.icelabs.netbox.model.WritableIKEPolicyRequest;
import dev.icelabs.netbox.model.WritableIKEProposalRequest;
import dev.icelabs.netbox.model.WritableIPSecPolicyRequest;
import dev.icelabs.netbox.model.WritableIPSecProfileRequest;
import dev.icelabs.netbox.model.WritableIPSecProposalRequest;
import dev.icelabs.netbox.model.WritableL2VPNRequest;
import dev.icelabs.netbox.model.WritableTunnelRequest;
import dev.icelabs.netbox.model.WritableTunnelTerminationRequest;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface VpnApi {
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/ike-policies/")
    Call<Void> vpnIkePoliciesBulkDestroy(
            @retrofit2.http.Body List<IKEPolicyRequest> ikEPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ike-policies/")
    Call<List<IKEPolicy>> vpnIkePoliciesBulkPartialUpdate(
            @retrofit2.http.Body List<IKEPolicyRequest> ikEPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ike-policies/")
    Call<List<IKEPolicy>> vpnIkePoliciesBulkUpdate(
            @retrofit2.http.Body List<IKEPolicyRequest> ikEPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/ike-policies/")
    Call<IKEPolicy> vpnIkePoliciesCreate(
            @retrofit2.http.Body VpnIkePoliciesCreateRequest vpnIkePoliciesCreateRequest);

    @DELETE("api/vpn/ike-policies/{id}/")
    Call<Void> vpnIkePoliciesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/ike-policies/")
    Call<PaginatedIKEPolicyList> vpnIkePoliciesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ike-policies/{id}/")
    Call<IKEPolicy> vpnIkePoliciesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableIKEPolicyRequest patchedWritableIKEPolicyRequest);

    @GET("api/vpn/ike-policies/{id}/")
    Call<IKEPolicy> vpnIkePoliciesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ike-policies/{id}/")
    Call<IKEPolicy> vpnIkePoliciesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableIKEPolicyRequest writableIKEPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/ike-proposals/")
    Call<Void> vpnIkeProposalsBulkDestroy(
            @retrofit2.http.Body List<IKEProposalRequest> ikEProposalRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ike-proposals/")
    Call<List<IKEProposal>> vpnIkeProposalsBulkPartialUpdate(
            @retrofit2.http.Body List<IKEProposalRequest> ikEProposalRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ike-proposals/")
    Call<List<IKEProposal>> vpnIkeProposalsBulkUpdate(
            @retrofit2.http.Body List<IKEProposalRequest> ikEProposalRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/ike-proposals/")
    Call<IKEProposal> vpnIkeProposalsCreate(
            @retrofit2.http.Body VpnIkeProposalsCreateRequest vpnIkeProposalsCreateRequest);

    @DELETE("api/vpn/ike-proposals/{id}/")
    Call<Void> vpnIkeProposalsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/ike-proposals/")
    Call<PaginatedIKEProposalList> vpnIkeProposalsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ike-proposals/{id}/")
    Call<IKEProposal> vpnIkeProposalsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableIKEProposalRequest patchedWritableIKEProposalRequest);

    @GET("api/vpn/ike-proposals/{id}/")
    Call<IKEProposal> vpnIkeProposalsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ike-proposals/{id}/")
    Call<IKEProposal> vpnIkeProposalsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableIKEProposalRequest writableIKEProposalRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/ipsec-policies/")
    Call<Void> vpnIpsecPoliciesBulkDestroy(
            @retrofit2.http.Body List<IPSecPolicyRequest> ipSecPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ipsec-policies/")
    Call<List<IPSecPolicy>> vpnIpsecPoliciesBulkPartialUpdate(
            @retrofit2.http.Body List<IPSecPolicyRequest> ipSecPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ipsec-policies/")
    Call<List<IPSecPolicy>> vpnIpsecPoliciesBulkUpdate(
            @retrofit2.http.Body List<IPSecPolicyRequest> ipSecPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/ipsec-policies/")
    Call<IPSecPolicy> vpnIpsecPoliciesCreate(
            @retrofit2.http.Body VpnIpsecPoliciesCreateRequest vpnIpsecPoliciesCreateRequest);

    @DELETE("api/vpn/ipsec-policies/{id}/")
    Call<Void> vpnIpsecPoliciesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/ipsec-policies/")
    Call<PaginatedIPSecPolicyList> vpnIpsecPoliciesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ipsec-policies/{id}/")
    Call<IPSecPolicy> vpnIpsecPoliciesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableIPSecPolicyRequest patchedWritableIPSecPolicyRequest);

    @GET("api/vpn/ipsec-policies/{id}/")
    Call<IPSecPolicy> vpnIpsecPoliciesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ipsec-policies/{id}/")
    Call<IPSecPolicy> vpnIpsecPoliciesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableIPSecPolicyRequest writableIPSecPolicyRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/ipsec-profiles/")
    Call<Void> vpnIpsecProfilesBulkDestroy(
            @retrofit2.http.Body List<IPSecProfileRequest> ipSecProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ipsec-profiles/")
    Call<List<IPSecProfile>> vpnIpsecProfilesBulkPartialUpdate(
            @retrofit2.http.Body List<IPSecProfileRequest> ipSecProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ipsec-profiles/")
    Call<List<IPSecProfile>> vpnIpsecProfilesBulkUpdate(
            @retrofit2.http.Body List<IPSecProfileRequest> ipSecProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/ipsec-profiles/")
    Call<IPSecProfile> vpnIpsecProfilesCreate(
            @retrofit2.http.Body VpnIpsecProfilesCreateRequest vpnIpsecProfilesCreateRequest);

    @DELETE("api/vpn/ipsec-profiles/{id}/")
    Call<Void> vpnIpsecProfilesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/ipsec-profiles/")
    Call<PaginatedIPSecProfileList> vpnIpsecProfilesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ipsec-profiles/{id}/")
    Call<IPSecProfile> vpnIpsecProfilesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableIPSecProfileRequest patchedWritableIPSecProfileRequest);

    @GET("api/vpn/ipsec-profiles/{id}/")
    Call<IPSecProfile> vpnIpsecProfilesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ipsec-profiles/{id}/")
    Call<IPSecProfile> vpnIpsecProfilesUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableIPSecProfileRequest writableIPSecProfileRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/ipsec-proposals/")
    Call<Void> vpnIpsecProposalsBulkDestroy(
            @retrofit2.http.Body List<IPSecProposalRequest> ipSecProposalRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ipsec-proposals/")
    Call<List<IPSecProposal>> vpnIpsecProposalsBulkPartialUpdate(
            @retrofit2.http.Body List<IPSecProposalRequest> ipSecProposalRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ipsec-proposals/")
    Call<List<IPSecProposal>> vpnIpsecProposalsBulkUpdate(
            @retrofit2.http.Body List<IPSecProposalRequest> ipSecProposalRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/ipsec-proposals/")
    Call<IPSecProposal> vpnIpsecProposalsCreate(
            @retrofit2.http.Body VpnIpsecProposalsCreateRequest vpnIpsecProposalsCreateRequest);

    @DELETE("api/vpn/ipsec-proposals/{id}/")
    Call<Void> vpnIpsecProposalsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/ipsec-proposals/")
    Call<PaginatedIPSecProposalList> vpnIpsecProposalsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/ipsec-proposals/{id}/")
    Call<IPSecProposal> vpnIpsecProposalsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableIPSecProposalRequest patchedWritableIPSecProposalRequest);

    @GET("api/vpn/ipsec-proposals/{id}/")
    Call<IPSecProposal> vpnIpsecProposalsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/ipsec-proposals/{id}/")
    Call<IPSecProposal> vpnIpsecProposalsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableIPSecProposalRequest writableIPSecProposalRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/l2vpn-terminations/")
    Call<Void> vpnL2vpnTerminationsBulkDestroy(
            @retrofit2.http.Body List<L2VPNTerminationRequest> l2VPNTerminationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/l2vpn-terminations/")
    Call<List<L2VPNTermination>> vpnL2vpnTerminationsBulkPartialUpdate(
            @retrofit2.http.Body List<L2VPNTerminationRequest> l2VPNTerminationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/l2vpn-terminations/")
    Call<List<L2VPNTermination>> vpnL2vpnTerminationsBulkUpdate(
            @retrofit2.http.Body List<L2VPNTerminationRequest> l2VPNTerminationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/l2vpn-terminations/")
    Call<L2VPNTermination> vpnL2vpnTerminationsCreate(
            @retrofit2.http.Body VpnL2vpnTerminationsCreateRequest vpnL2vpnTerminationsCreateRequest);

    @DELETE("api/vpn/l2vpn-terminations/{id}/")
    Call<Void> vpnL2vpnTerminationsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/l2vpn-terminations/")
    Call<PaginatedL2VPNTerminationList> vpnL2vpnTerminationsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/l2vpn-terminations/{id}/")
    Call<L2VPNTermination> vpnL2vpnTerminationsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedL2VPNTerminationRequest patchedL2VPNTerminationRequest);

    @GET("api/vpn/l2vpn-terminations/{id}/")
    Call<L2VPNTermination> vpnL2vpnTerminationsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/l2vpn-terminations/{id}/")
    Call<L2VPNTermination> vpnL2vpnTerminationsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body L2VPNTerminationRequest l2VPNTerminationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/l2vpns/")
    Call<Void> vpnL2vpnsBulkDestroy(
            @retrofit2.http.Body List<L2VPNRequest> l2VPNRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/l2vpns/")
    Call<List<L2VPN>> vpnL2vpnsBulkPartialUpdate(
            @retrofit2.http.Body List<L2VPNRequest> l2VPNRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/l2vpns/")
    Call<List<L2VPN>> vpnL2vpnsBulkUpdate(
            @retrofit2.http.Body List<L2VPNRequest> l2VPNRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/l2vpns/")
    Call<L2VPN> vpnL2vpnsCreate(
            @retrofit2.http.Body VpnL2vpnsCreateRequest vpnL2vpnsCreateRequest);

    @DELETE("api/vpn/l2vpns/{id}/")
    Call<Void> vpnL2vpnsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/l2vpns/")
    Call<PaginatedL2VPNList> vpnL2vpnsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/l2vpns/{id}/")
    Call<L2VPN> vpnL2vpnsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableL2VPNRequest patchedWritableL2VPNRequest);

    @GET("api/vpn/l2vpns/{id}/")
    Call<L2VPN> vpnL2vpnsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/l2vpns/{id}/")
    Call<L2VPN> vpnL2vpnsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableL2VPNRequest writableL2VPNRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/tunnel-groups/")
    Call<Void> vpnTunnelGroupsBulkDestroy(
            @retrofit2.http.Body List<TunnelGroupRequest> tunnelGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/tunnel-groups/")
    Call<List<TunnelGroup>> vpnTunnelGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<TunnelGroupRequest> tunnelGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/tunnel-groups/")
    Call<List<TunnelGroup>> vpnTunnelGroupsBulkUpdate(
            @retrofit2.http.Body List<TunnelGroupRequest> tunnelGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/tunnel-groups/")
    Call<TunnelGroup> vpnTunnelGroupsCreate(
            @retrofit2.http.Body VpnTunnelGroupsCreateRequest vpnTunnelGroupsCreateRequest);

    @DELETE("api/vpn/tunnel-groups/{id}/")
    Call<Void> vpnTunnelGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/tunnel-groups/")
    Call<PaginatedTunnelGroupList> vpnTunnelGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/tunnel-groups/{id}/")
    Call<TunnelGroup> vpnTunnelGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedTunnelGroupRequest patchedTunnelGroupRequest);

    @GET("api/vpn/tunnel-groups/{id}/")
    Call<TunnelGroup> vpnTunnelGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/tunnel-groups/{id}/")
    Call<TunnelGroup> vpnTunnelGroupsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body TunnelGroupRequest tunnelGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/tunnel-terminations/")
    Call<Void> vpnTunnelTerminationsBulkDestroy(
            @retrofit2.http.Body List<TunnelTerminationRequest> tunnelTerminationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/tunnel-terminations/")
    Call<List<TunnelTermination>> vpnTunnelTerminationsBulkPartialUpdate(
            @retrofit2.http.Body List<TunnelTerminationRequest> tunnelTerminationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/tunnel-terminations/")
    Call<List<TunnelTermination>> vpnTunnelTerminationsBulkUpdate(
            @retrofit2.http.Body List<TunnelTerminationRequest> tunnelTerminationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/tunnel-terminations/")
    Call<TunnelTermination> vpnTunnelTerminationsCreate(
            @retrofit2.http.Body VpnTunnelTerminationsCreateRequest vpnTunnelTerminationsCreateRequest);

    @DELETE("api/vpn/tunnel-terminations/{id}/")
    Call<Void> vpnTunnelTerminationsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/tunnel-terminations/")
    Call<PaginatedTunnelTerminationList> vpnTunnelTerminationsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/tunnel-terminations/{id}/")
    Call<TunnelTermination> vpnTunnelTerminationsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableTunnelTerminationRequest patchedWritableTunnelTerminationRequest);

    @GET("api/vpn/tunnel-terminations/{id}/")
    Call<TunnelTermination> vpnTunnelTerminationsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/tunnel-terminations/{id}/")
    Call<TunnelTermination> vpnTunnelTerminationsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableTunnelTerminationRequest writableTunnelTerminationRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/vpn/tunnels/")
    Call<Void> vpnTunnelsBulkDestroy(
            @retrofit2.http.Body List<TunnelRequest> tunnelRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/tunnels/")
    Call<List<Tunnel>> vpnTunnelsBulkPartialUpdate(
            @retrofit2.http.Body List<TunnelRequest> tunnelRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/tunnels/")
    Call<List<Tunnel>> vpnTunnelsBulkUpdate(
            @retrofit2.http.Body List<TunnelRequest> tunnelRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/vpn/tunnels/")
    Call<Tunnel> vpnTunnelsCreate(
            @retrofit2.http.Body VpnTunnelsCreateRequest vpnTunnelsCreateRequest);

    @DELETE("api/vpn/tunnels/{id}/")
    Call<Void> vpnTunnelsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/vpn/tunnels/")
    Call<PaginatedTunnelList> vpnTunnelsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/vpn/tunnels/{id}/")
    Call<Tunnel> vpnTunnelsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableTunnelRequest patchedWritableTunnelRequest);

    @GET("api/vpn/tunnels/{id}/")
    Call<Tunnel> vpnTunnelsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/vpn/tunnels/{id}/")
    Call<Tunnel> vpnTunnelsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body WritableTunnelRequest writableTunnelRequest);

}
