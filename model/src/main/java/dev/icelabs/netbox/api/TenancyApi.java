package dev.icelabs.netbox.api;

import java.util.List;

import dev.icelabs.netbox.model.Contact;
import dev.icelabs.netbox.model.ContactAssignment;
import dev.icelabs.netbox.model.ContactAssignmentRequest;
import dev.icelabs.netbox.model.ContactGroup;
import dev.icelabs.netbox.model.ContactGroupRequest;
import dev.icelabs.netbox.model.ContactRequest;
import dev.icelabs.netbox.model.ContactRole;
import dev.icelabs.netbox.model.ContactRoleRequest;
import dev.icelabs.netbox.model.PaginatedContactAssignmentList;
import dev.icelabs.netbox.model.PaginatedContactGroupList;
import dev.icelabs.netbox.model.PaginatedContactList;
import dev.icelabs.netbox.model.PaginatedContactRoleList;
import dev.icelabs.netbox.model.PaginatedTenantGroupList;
import dev.icelabs.netbox.model.PaginatedTenantList;
import dev.icelabs.netbox.model.PatchedContactRequest;
import dev.icelabs.netbox.model.PatchedContactRoleRequest;
import dev.icelabs.netbox.model.PatchedTenantRequest;
import dev.icelabs.netbox.model.PatchedWritableContactAssignmentRequest;
import dev.icelabs.netbox.model.PatchedWritableContactGroupRequest;
import dev.icelabs.netbox.model.PatchedWritableTenantGroupRequest;
import dev.icelabs.netbox.model.TenancyContactAssignmentsCreateRequest;
import dev.icelabs.netbox.model.TenancyContactGroupsCreateRequest;
import dev.icelabs.netbox.model.TenancyContactRolesCreateRequest;
import dev.icelabs.netbox.model.TenancyContactsCreateRequest;
import dev.icelabs.netbox.model.TenancyTenantGroupsCreateRequest;
import dev.icelabs.netbox.model.TenancyTenantsCreateRequest;
import dev.icelabs.netbox.model.Tenant;
import dev.icelabs.netbox.model.TenantGroup;
import dev.icelabs.netbox.model.TenantGroupRequest;
import dev.icelabs.netbox.model.TenantRequest;
import dev.icelabs.netbox.model.WritableContactAssignmentRequest;
import dev.icelabs.netbox.model.WritableContactGroupRequest;
import dev.icelabs.netbox.model.WritableTenantGroupRequest;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface TenancyApi {
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/tenancy/contact-assignments/")
    Call<Void> tenancyContactAssignmentsBulkDestroy(
            @retrofit2.http.Body List<ContactAssignmentRequest> contactAssignmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/contact-assignments/")
    Call<List<ContactAssignment>> tenancyContactAssignmentsBulkPartialUpdate(
            @retrofit2.http.Body List<ContactAssignmentRequest> contactAssignmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/contact-assignments/")
    Call<List<ContactAssignment>> tenancyContactAssignmentsBulkUpdate(
            @retrofit2.http.Body List<ContactAssignmentRequest> contactAssignmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/tenancy/contact-assignments/")
    Call<ContactAssignment> tenancyContactAssignmentsCreate(
            @retrofit2.http.Body TenancyContactAssignmentsCreateRequest tenancyContactAssignmentsCreateRequest);

    @DELETE("api/tenancy/contact-assignments/{id}/")
    Call<Void> tenancyContactAssignmentsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/tenancy/contact-assignments/")
    Call<PaginatedContactAssignmentList> tenancyContactAssignmentsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/contact-assignments/{id}/")
    Call<ContactAssignment> tenancyContactAssignmentsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableContactAssignmentRequest patchedWritableContactAssignmentRequest);

    @GET("api/tenancy/contact-assignments/{id}/")
    Call<ContactAssignment> tenancyContactAssignmentsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/contact-assignments/{id}/")
    Call<ContactAssignment> tenancyContactAssignmentsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableContactAssignmentRequest writableContactAssignmentRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/tenancy/contact-groups/")
    Call<Void> tenancyContactGroupsBulkDestroy(
            @retrofit2.http.Body List<ContactGroupRequest> contactGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/contact-groups/")
    Call<List<ContactGroup>> tenancyContactGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<ContactGroupRequest> contactGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/contact-groups/")
    Call<List<ContactGroup>> tenancyContactGroupsBulkUpdate(
            @retrofit2.http.Body List<ContactGroupRequest> contactGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/tenancy/contact-groups/")
    Call<ContactGroup> tenancyContactGroupsCreate(
            @retrofit2.http.Body TenancyContactGroupsCreateRequest tenancyContactGroupsCreateRequest);

    @DELETE("api/tenancy/contact-groups/{id}/")
    Call<Void> tenancyContactGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/tenancy/contact-groups/")
    Call<PaginatedContactGroupList> tenancyContactGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/contact-groups/{id}/")
    Call<ContactGroup> tenancyContactGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableContactGroupRequest patchedWritableContactGroupRequest);

    @GET("api/tenancy/contact-groups/{id}/")
    Call<ContactGroup> tenancyContactGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/contact-groups/{id}/")
    Call<ContactGroup> tenancyContactGroupsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableContactGroupRequest writableContactGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/tenancy/contact-roles/")
    Call<Void> tenancyContactRolesBulkDestroy(
            @retrofit2.http.Body List<ContactRoleRequest> contactRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/contact-roles/")
    Call<List<ContactRole>> tenancyContactRolesBulkPartialUpdate(
            @retrofit2.http.Body List<ContactRoleRequest> contactRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/contact-roles/")
    Call<List<ContactRole>> tenancyContactRolesBulkUpdate(
            @retrofit2.http.Body List<ContactRoleRequest> contactRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/tenancy/contact-roles/")
    Call<ContactRole> tenancyContactRolesCreate(
            @retrofit2.http.Body TenancyContactRolesCreateRequest tenancyContactRolesCreateRequest);

    @DELETE("api/tenancy/contact-roles/{id}/")
    Call<Void> tenancyContactRolesDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/tenancy/contact-roles/")
    Call<PaginatedContactRoleList> tenancyContactRolesList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/contact-roles/{id}/")
    Call<ContactRole> tenancyContactRolesPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedContactRoleRequest patchedContactRoleRequest);

    @GET("api/tenancy/contact-roles/{id}/")
    Call<ContactRole> tenancyContactRolesRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/contact-roles/{id}/")
    Call<ContactRole> tenancyContactRolesUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ContactRoleRequest contactRoleRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/tenancy/contacts/")
    Call<Void> tenancyContactsBulkDestroy(
            @retrofit2.http.Body List<ContactRequest> contactRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/contacts/")
    Call<List<Contact>> tenancyContactsBulkPartialUpdate(
            @retrofit2.http.Body List<ContactRequest> contactRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/contacts/")
    Call<List<Contact>> tenancyContactsBulkUpdate(
            @retrofit2.http.Body List<ContactRequest> contactRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/tenancy/contacts/")
    Call<Contact> tenancyContactsCreate(
            @retrofit2.http.Body TenancyContactsCreateRequest tenancyContactsCreateRequest);

    @DELETE("api/tenancy/contacts/{id}/")
    Call<Void> tenancyContactsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/tenancy/contacts/")
    Call<PaginatedContactList> tenancyContactsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/contacts/{id}/")
    Call<Contact> tenancyContactsPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedContactRequest patchedContactRequest);

    @GET("api/tenancy/contacts/{id}/")
    Call<Contact> tenancyContactsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/contacts/{id}/")
    Call<Contact> tenancyContactsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body ContactRequest contactRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/tenancy/tenant-groups/")
    Call<Void> tenancyTenantGroupsBulkDestroy(
            @retrofit2.http.Body List<TenantGroupRequest> tenantGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/tenant-groups/")
    Call<List<TenantGroup>> tenancyTenantGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<TenantGroupRequest> tenantGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/tenant-groups/")
    Call<List<TenantGroup>> tenancyTenantGroupsBulkUpdate(
            @retrofit2.http.Body List<TenantGroupRequest> tenantGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/tenancy/tenant-groups/")
    Call<TenantGroup> tenancyTenantGroupsCreate(
            @retrofit2.http.Body TenancyTenantGroupsCreateRequest tenancyTenantGroupsCreateRequest);

    @DELETE("api/tenancy/tenant-groups/{id}/")
    Call<Void> tenancyTenantGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/tenancy/tenant-groups/")
    Call<PaginatedTenantGroupList> tenancyTenantGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/tenant-groups/{id}/")
    Call<TenantGroup> tenancyTenantGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedWritableTenantGroupRequest patchedWritableTenantGroupRequest);

    @GET("api/tenancy/tenant-groups/{id}/")
    Call<TenantGroup> tenancyTenantGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/tenant-groups/{id}/")
    Call<TenantGroup> tenancyTenantGroupsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body WritableTenantGroupRequest writableTenantGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/tenancy/tenants/")
    Call<Void> tenancyTenantsBulkDestroy(
            @retrofit2.http.Body List<TenantRequest> tenantRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/tenants/")
    Call<List<Tenant>> tenancyTenantsBulkPartialUpdate(
            @retrofit2.http.Body List<TenantRequest> tenantRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/tenants/")
    Call<List<Tenant>> tenancyTenantsBulkUpdate(
            @retrofit2.http.Body List<TenantRequest> tenantRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/tenancy/tenants/")
    Call<Tenant> tenancyTenantsCreate(
            @retrofit2.http.Body TenancyTenantsCreateRequest tenancyTenantsCreateRequest);

    @DELETE("api/tenancy/tenants/{id}/")
    Call<Void> tenancyTenantsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/tenancy/tenants/")
    Call<PaginatedTenantList> tenancyTenantsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/tenancy/tenants/{id}/")
    Call<Tenant> tenancyTenantsPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedTenantRequest patchedTenantRequest);

    @GET("api/tenancy/tenants/{id}/")
    Call<Tenant> tenancyTenantsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/tenancy/tenants/{id}/")
    Call<Tenant> tenancyTenantsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body TenantRequest tenantRequest);

}
