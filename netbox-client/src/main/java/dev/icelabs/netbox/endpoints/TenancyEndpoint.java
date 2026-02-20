package dev.icelabs.netbox.endpoints;

import java.util.List;

import dev.icelabs.netbox.api.TenancyApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class TenancyEndpoint extends Endpoint<TenancyApi> {

    public TenancyEndpoint(TenancyApi service) {
        super(service);
    }

    // ==================== TENANTS ====================
    public final TenantGroups tenantGroups = new TenantGroups();
    public final Tenants tenants = new Tenants();

    // ==================== CONTACTS ====================
    public final ContactGroups contactGroups = new ContactGroups();
    public final ContactRoles contactRoles = new ContactRoles();
    public final Contacts contacts = new Contacts();
    public final ContactAssignments contactAssignments = new ContactAssignments();

    // TENANTS
    public TenantGroups tenantGroups() {
        return tenantGroups;
    }

    public Tenants tenants() {
        return tenants;
    }

    // CONTACTS
    public ContactGroups contactGroups() {
        return contactGroups;
    }

    public ContactRoles contactRoles() {
        return contactRoles;
    }

    public Contacts contacts() {
        return contacts;
    }

    public ContactAssignments contactAssignments() {
        return contactAssignments;
    }

    // ==================== TENANT GROUPS ====================
    public class TenantGroups {
        public Call<Void> bulkDestroy(List<TenantGroupRequest> request) {
            return service.tenancyTenantGroupsBulkDestroy(request);
        }

        public Call<List<TenantGroup>> bulkPartialUpdate(List<TenantGroupRequest> request) {
            return service.tenancyTenantGroupsBulkPartialUpdate(request);
        }

        public Call<List<TenantGroup>> bulkUpdate(List<TenantGroupRequest> request) {
            return service.tenancyTenantGroupsBulkUpdate(request);
        }

        public Call<TenantGroup> create(TenancyTenantGroupsCreateRequest request) {
            return service.tenancyTenantGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.tenancyTenantGroupsDestroy(id);
        }

        public Call<PaginatedTenantGroupList> list() {
            return service.tenancyTenantGroupsList();
        }

        public Call<TenantGroup> partialUpdate(Integer id, PatchedWritableTenantGroupRequest request) {
            return service.tenancyTenantGroupsPartialUpdate(id, request);
        }

        public Call<TenantGroup> get(Integer id) {
            return service.tenancyTenantGroupsRetrieve(id);
        }

        public Call<TenantGroup> update(Integer id, WritableTenantGroupRequest request) {
            return service.tenancyTenantGroupsUpdate(id, request);
        }
    }

    // ==================== TENANTS ====================
    public class Tenants {
        public Call<Void> bulkDestroy(List<TenantRequest> request) {
            return service.tenancyTenantsBulkDestroy(request);
        }

        public Call<List<Tenant>> bulkPartialUpdate(List<TenantRequest> request) {
            return service.tenancyTenantsBulkPartialUpdate(request);
        }

        public Call<List<Tenant>> bulkUpdate(List<TenantRequest> request) {
            return service.tenancyTenantsBulkUpdate(request);
        }

        public Call<Tenant> create(TenancyTenantsCreateRequest request) {
            return service.tenancyTenantsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.tenancyTenantsDestroy(id);
        }

        public Call<PaginatedTenantList> list() {
            return service.tenancyTenantsList();
        }

        public Call<Tenant> partialUpdate(Integer id, PatchedTenantRequest request) {
            return service.tenancyTenantsPartialUpdate(id, request);
        }

        public Call<Tenant> get(Integer id) {
            return service.tenancyTenantsRetrieve(id);
        }

        public Call<Tenant> update(Integer id, TenantRequest request) {
            return service.tenancyTenantsUpdate(id, request);
        }
    }

    // ==================== CONTACT GROUPS ====================
    public class ContactGroups {
        public Call<Void> bulkDestroy(List<ContactGroupRequest> request) {
            return service.tenancyContactGroupsBulkDestroy(request);
        }

        public Call<List<ContactGroup>> bulkPartialUpdate(List<ContactGroupRequest> request) {
            return service.tenancyContactGroupsBulkPartialUpdate(request);
        }

        public Call<List<ContactGroup>> bulkUpdate(List<ContactGroupRequest> request) {
            return service.tenancyContactGroupsBulkUpdate(request);
        }

        public Call<ContactGroup> create(TenancyContactGroupsCreateRequest request) {
            return service.tenancyContactGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.tenancyContactGroupsDestroy(id);
        }

        public Call<PaginatedContactGroupList> list() {
            return service.tenancyContactGroupsList();
        }

        public Call<ContactGroup> partialUpdate(Integer id, PatchedWritableContactGroupRequest request) {
            return service.tenancyContactGroupsPartialUpdate(id, request);
        }

        public Call<ContactGroup> get(Integer id) {
            return service.tenancyContactGroupsRetrieve(id);
        }

        public Call<ContactGroup> update(Integer id, WritableContactGroupRequest request) {
            return service.tenancyContactGroupsUpdate(id, request);
        }
    }

    // ==================== CONTACT ROLES ====================
    public class ContactRoles {
        public Call<Void> bulkDestroy(List<ContactRoleRequest> request) {
            return service.tenancyContactRolesBulkDestroy(request);
        }

        public Call<List<ContactRole>> bulkPartialUpdate(List<ContactRoleRequest> request) {
            return service.tenancyContactRolesBulkPartialUpdate(request);
        }

        public Call<List<ContactRole>> bulkUpdate(List<ContactRoleRequest> request) {
            return service.tenancyContactRolesBulkUpdate(request);
        }

        public Call<ContactRole> create(TenancyContactRolesCreateRequest request) {
            return service.tenancyContactRolesCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.tenancyContactRolesDestroy(id);
        }

        public Call<PaginatedContactRoleList> list() {
            return service.tenancyContactRolesList();
        }

        public Call<ContactRole> partialUpdate(Integer id, PatchedContactRoleRequest request) {
            return service.tenancyContactRolesPartialUpdate(id, request);
        }

        public Call<ContactRole> get(Integer id) {
            return service.tenancyContactRolesRetrieve(id);
        }

        public Call<ContactRole> update(Integer id, ContactRoleRequest request) {
            return service.tenancyContactRolesUpdate(id, request);
        }
    }

    // ==================== CONTACTS ====================
    public class Contacts {
        public Call<Void> bulkDestroy(List<ContactRequest> request) {
            return service.tenancyContactsBulkDestroy(request);
        }

        public Call<List<Contact>> bulkPartialUpdate(List<ContactRequest> request) {
            return service.tenancyContactsBulkPartialUpdate(request);
        }

        public Call<List<Contact>> bulkUpdate(List<ContactRequest> request) {
            return service.tenancyContactsBulkUpdate(request);
        }

        public Call<Contact> create(TenancyContactsCreateRequest request) {
            return service.tenancyContactsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.tenancyContactsDestroy(id);
        }

        public Call<PaginatedContactList> list() {
            return service.tenancyContactsList();
        }

        public Call<Contact> partialUpdate(Integer id, PatchedContactRequest request) {
            return service.tenancyContactsPartialUpdate(id, request);
        }

        public Call<Contact> get(Integer id) {
            return service.tenancyContactsRetrieve(id);
        }

        public Call<Contact> update(Integer id, ContactRequest request) {
            return service.tenancyContactsUpdate(id, request);
        }
    }

    // ==================== CONTACT ASSIGNMENTS ====================
    public class ContactAssignments {
        public Call<Void> bulkDestroy(List<ContactAssignmentRequest> request) {
            return service.tenancyContactAssignmentsBulkDestroy(request);
        }

        public Call<List<ContactAssignment>> bulkPartialUpdate(List<ContactAssignmentRequest> request) {
            return service.tenancyContactAssignmentsBulkPartialUpdate(request);
        }

        public Call<List<ContactAssignment>> bulkUpdate(List<ContactAssignmentRequest> request) {
            return service.tenancyContactAssignmentsBulkUpdate(request);
        }

        public Call<ContactAssignment> create(TenancyContactAssignmentsCreateRequest request) {
            return service.tenancyContactAssignmentsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.tenancyContactAssignmentsDestroy(id);
        }

        public Call<PaginatedContactAssignmentList> list() {
            return service.tenancyContactAssignmentsList();
        }

        public Call<ContactAssignment> partialUpdate(Integer id, PatchedWritableContactAssignmentRequest request) {
            return service.tenancyContactAssignmentsPartialUpdate(id, request);
        }

        public Call<ContactAssignment> get(Integer id) {
            return service.tenancyContactAssignmentsRetrieve(id);
        }

        public Call<ContactAssignment> update(Integer id, WritableContactAssignmentRequest request) {
            return service.tenancyContactAssignmentsUpdate(id, request);
        }
    }
}
