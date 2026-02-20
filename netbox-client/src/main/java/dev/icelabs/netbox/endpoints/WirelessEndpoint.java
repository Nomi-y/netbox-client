package dev.icelabs.netbox.endpoints;

import java.util.List;

import dev.icelabs.netbox.api.WirelessApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class WirelessEndpoint extends Endpoint<WirelessApi> {

    public WirelessEndpoint(WirelessApi service) {
        super(service);
    }

    // ==================== WIRELESS ====================
    public final WirelessLanGroups wirelessLanGroups = new WirelessLanGroups();
    public final WirelessLans wirelessLans = new WirelessLans();
    public final WirelessLinks wirelessLinks = new WirelessLinks();

    // WIRELESS
    public WirelessLanGroups wirelessLanGroups() {
        return wirelessLanGroups;
    }

    public WirelessLans wirelessLans() {
        return wirelessLans;
    }

    public WirelessLinks wirelessLinks() {
        return wirelessLinks;
    }

    // ==================== WIRELESS LAN GROUPS ====================
    public class WirelessLanGroups {
        public Call<Void> bulkDestroy(List<WirelessLANGroupRequest> request) {
            return service.wirelessWirelessLanGroupsBulkDestroy(request);
        }

        public Call<List<WirelessLANGroup>> bulkPartialUpdate(List<WirelessLANGroupRequest> request) {
            return service.wirelessWirelessLanGroupsBulkPartialUpdate(request);
        }

        public Call<List<WirelessLANGroup>> bulkUpdate(List<WirelessLANGroupRequest> request) {
            return service.wirelessWirelessLanGroupsBulkUpdate(request);
        }

        public Call<WirelessLANGroup> create(WirelessWirelessLanGroupsCreateRequest request) {
            return service.wirelessWirelessLanGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.wirelessWirelessLanGroupsDestroy(id);
        }

        public Call<PaginatedWirelessLANGroupList> list() {
            return service.wirelessWirelessLanGroupsList();
        }

        public Call<WirelessLANGroup> partialUpdate(Integer id, PatchedWritableWirelessLANGroupRequest request) {
            return service.wirelessWirelessLanGroupsPartialUpdate(id, request);
        }

        public Call<WirelessLANGroup> get(Integer id) {
            return service.wirelessWirelessLanGroupsRetrieve(id);
        }

        public Call<WirelessLANGroup> update(Integer id, WritableWirelessLANGroupRequest request) {
            return service.wirelessWirelessLanGroupsUpdate(id, request);
        }
    }

    // ==================== WIRELESS LANS ====================
    public class WirelessLans {
        public Call<Void> bulkDestroy(List<WirelessLANRequest> request) {
            return service.wirelessWirelessLansBulkDestroy(request);
        }

        public Call<List<WirelessLAN>> bulkPartialUpdate(List<WirelessLANRequest> request) {
            return service.wirelessWirelessLansBulkPartialUpdate(request);
        }

        public Call<List<WirelessLAN>> bulkUpdate(List<WirelessLANRequest> request) {
            return service.wirelessWirelessLansBulkUpdate(request);
        }

        public Call<WirelessLAN> create(WirelessWirelessLansCreateRequest request) {
            return service.wirelessWirelessLansCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.wirelessWirelessLansDestroy(id);
        }

        public Call<PaginatedWirelessLANList> list() {
            return service.wirelessWirelessLansList();
        }

        public Call<WirelessLAN> partialUpdate(Integer id, PatchedWritableWirelessLANRequest request) {
            return service.wirelessWirelessLansPartialUpdate(id, request);
        }

        public Call<WirelessLAN> get(Integer id) {
            return service.wirelessWirelessLansRetrieve(id);
        }

        public Call<WirelessLAN> update(Integer id, WritableWirelessLANRequest request) {
            return service.wirelessWirelessLansUpdate(id, request);
        }
    }

    // ==================== WIRELESS LINKS ====================
    public class WirelessLinks {
        public Call<Void> bulkDestroy(List<WirelessLinkRequest> request) {
            return service.wirelessWirelessLinksBulkDestroy(request);
        }

        public Call<List<WirelessLink>> bulkPartialUpdate(List<WirelessLinkRequest> request) {
            return service.wirelessWirelessLinksBulkPartialUpdate(request);
        }

        public Call<List<WirelessLink>> bulkUpdate(List<WirelessLinkRequest> request) {
            return service.wirelessWirelessLinksBulkUpdate(request);
        }

        public Call<WirelessLink> create(WirelessWirelessLinksCreateRequest request) {
            return service.wirelessWirelessLinksCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.wirelessWirelessLinksDestroy(id);
        }

        public Call<PaginatedWirelessLinkList> list() {
            return service.wirelessWirelessLinksList();
        }

        public Call<WirelessLink> partialUpdate(Integer id, PatchedWritableWirelessLinkRequest request) {
            return service.wirelessWirelessLinksPartialUpdate(id, request);
        }

        public Call<WirelessLink> get(Integer id) {
            return service.wirelessWirelessLinksRetrieve(id);
        }

        public Call<WirelessLink> update(Integer id, WritableWirelessLinkRequest request) {
            return service.wirelessWirelessLinksUpdate(id, request);
        }
    }
}
