package dev.icelabs.netbox.api;

import java.util.List;
import java.util.Map;

import dev.icelabs.netbox.model.Group;
import dev.icelabs.netbox.model.GroupRequest;
import dev.icelabs.netbox.model.ObjectPermission;
import dev.icelabs.netbox.model.ObjectPermissionRequest;
import dev.icelabs.netbox.model.Owner;
import dev.icelabs.netbox.model.OwnerGroup;
import dev.icelabs.netbox.model.OwnerGroupRequest;
import dev.icelabs.netbox.model.OwnerRequest;
import dev.icelabs.netbox.model.PaginatedGroupList;
import dev.icelabs.netbox.model.PaginatedObjectPermissionList;
import dev.icelabs.netbox.model.PaginatedOwnerGroupList;
import dev.icelabs.netbox.model.PaginatedOwnerList;
import dev.icelabs.netbox.model.PaginatedTokenList;
import dev.icelabs.netbox.model.PaginatedUserList;
import dev.icelabs.netbox.model.PatchedGroupRequest;
import dev.icelabs.netbox.model.PatchedObjectPermissionRequest;
import dev.icelabs.netbox.model.PatchedOwnerGroupRequest;
import dev.icelabs.netbox.model.PatchedOwnerRequest;
import dev.icelabs.netbox.model.PatchedTokenRequest;
import dev.icelabs.netbox.model.PatchedUserRequest;
import dev.icelabs.netbox.model.Token;
import dev.icelabs.netbox.model.TokenProvision;
import dev.icelabs.netbox.model.TokenProvisionRequest;
import dev.icelabs.netbox.model.TokenRequest;
import dev.icelabs.netbox.model.User;
import dev.icelabs.netbox.model.UserRequest;
import dev.icelabs.netbox.model.UsersGroupsCreateRequest;
import dev.icelabs.netbox.model.UsersOwnerGroupsCreateRequest;
import dev.icelabs.netbox.model.UsersOwnersCreateRequest;
import dev.icelabs.netbox.model.UsersPermissionsCreateRequest;
import dev.icelabs.netbox.model.UsersTokensCreateRequest;
import dev.icelabs.netbox.model.UsersUsersCreateRequest;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface UsersApi {
    @GET("api/users/config/")
    Call<Map<String, Object>> usersConfigRetrieve();

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/users/groups/")
    Call<Void> usersGroupsBulkDestroy(
            @retrofit2.http.Body List<GroupRequest> groupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/groups/")
    Call<List<Group>> usersGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<GroupRequest> groupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/groups/")
    Call<List<Group>> usersGroupsBulkUpdate(
            @retrofit2.http.Body List<GroupRequest> groupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/users/groups/")
    Call<Group> usersGroupsCreate(
            @retrofit2.http.Body UsersGroupsCreateRequest usersGroupsCreateRequest);

    @DELETE("api/users/groups/{id}/")
    Call<Void> usersGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/users/groups/")
    Call<PaginatedGroupList> usersGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/groups/{id}/")
    Call<Group> usersGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedGroupRequest patchedGroupRequest);

    @GET("api/users/groups/{id}/")
    Call<Group> usersGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/groups/{id}/")
    Call<Group> usersGroupsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body GroupRequest groupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/users/owner-groups/")
    Call<Void> usersOwnerGroupsBulkDestroy(
            @retrofit2.http.Body List<OwnerGroupRequest> ownerGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/owner-groups/")
    Call<List<OwnerGroup>> usersOwnerGroupsBulkPartialUpdate(
            @retrofit2.http.Body List<OwnerGroupRequest> ownerGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/owner-groups/")
    Call<List<OwnerGroup>> usersOwnerGroupsBulkUpdate(
            @retrofit2.http.Body List<OwnerGroupRequest> ownerGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/users/owner-groups/")
    Call<OwnerGroup> usersOwnerGroupsCreate(
            @retrofit2.http.Body UsersOwnerGroupsCreateRequest usersOwnerGroupsCreateRequest);

    @DELETE("api/users/owner-groups/{id}/")
    Call<Void> usersOwnerGroupsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/users/owner-groups/")
    Call<PaginatedOwnerGroupList> usersOwnerGroupsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/owner-groups/{id}/")
    Call<OwnerGroup> usersOwnerGroupsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedOwnerGroupRequest patchedOwnerGroupRequest);

    @GET("api/users/owner-groups/{id}/")
    Call<OwnerGroup> usersOwnerGroupsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/owner-groups/{id}/")
    Call<OwnerGroup> usersOwnerGroupsUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body OwnerGroupRequest ownerGroupRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/users/owners/")
    Call<Void> usersOwnersBulkDestroy(
            @retrofit2.http.Body List<OwnerRequest> ownerRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/owners/")
    Call<List<Owner>> usersOwnersBulkPartialUpdate(
            @retrofit2.http.Body List<OwnerRequest> ownerRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/owners/")
    Call<List<Owner>> usersOwnersBulkUpdate(
            @retrofit2.http.Body List<OwnerRequest> ownerRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/users/owners/")
    Call<Owner> usersOwnersCreate(
            @retrofit2.http.Body UsersOwnersCreateRequest usersOwnersCreateRequest);

    @DELETE("api/users/owners/{id}/")
    Call<Void> usersOwnersDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/users/owners/")
    Call<PaginatedOwnerList> usersOwnersList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/owners/{id}/")
    Call<Owner> usersOwnersPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedOwnerRequest patchedOwnerRequest);

    @GET("api/users/owners/{id}/")
    Call<Owner> usersOwnersRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/owners/{id}/")
    Call<Owner> usersOwnersUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body OwnerRequest ownerRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/users/permissions/")
    Call<Void> usersPermissionsBulkDestroy(
            @retrofit2.http.Body List<ObjectPermissionRequest> objectPermissionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/permissions/")
    Call<List<ObjectPermission>> usersPermissionsBulkPartialUpdate(
            @retrofit2.http.Body List<ObjectPermissionRequest> objectPermissionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/permissions/")
    Call<List<ObjectPermission>> usersPermissionsBulkUpdate(
            @retrofit2.http.Body List<ObjectPermissionRequest> objectPermissionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/users/permissions/")
    Call<ObjectPermission> usersPermissionsCreate(
            @retrofit2.http.Body UsersPermissionsCreateRequest usersPermissionsCreateRequest);

    @DELETE("api/users/permissions/{id}/")
    Call<Void> usersPermissionsDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/users/permissions/")
    Call<PaginatedObjectPermissionList> usersPermissionsList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/permissions/{id}/")
    Call<ObjectPermission> usersPermissionsPartialUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body PatchedObjectPermissionRequest patchedObjectPermissionRequest);

    @GET("api/users/permissions/{id}/")
    Call<ObjectPermission> usersPermissionsRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/permissions/{id}/")
    Call<ObjectPermission> usersPermissionsUpdate(
            @retrofit2.http.Path("id") Integer id,
            @retrofit2.http.Body ObjectPermissionRequest objectPermissionRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/users/tokens/")
    Call<Void> usersTokensBulkDestroy(
            @retrofit2.http.Body List<TokenRequest> tokenRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/tokens/")
    Call<List<Token>> usersTokensBulkPartialUpdate(
            @retrofit2.http.Body List<TokenRequest> tokenRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/tokens/")
    Call<List<Token>> usersTokensBulkUpdate(
            @retrofit2.http.Body List<TokenRequest> tokenRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/users/tokens/")
    Call<Token> usersTokensCreate(
            @retrofit2.http.Body UsersTokensCreateRequest usersTokensCreateRequest);

    @DELETE("api/users/tokens/{id}/")
    Call<Void> usersTokensDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/users/tokens/")
    Call<PaginatedTokenList> usersTokensList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/tokens/{id}/")
    Call<Token> usersTokensPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedTokenRequest patchedTokenRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/users/tokens/provision/")
    Call<TokenProvision> usersTokensProvisionCreate(
            @retrofit2.http.Body TokenProvisionRequest tokenProvisionRequest);

    @GET("api/users/tokens/{id}/")
    Call<Token> usersTokensRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/tokens/{id}/")
    Call<Token> usersTokensUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body TokenRequest tokenRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("api/users/users/")
    Call<Void> usersUsersBulkDestroy(
            @retrofit2.http.Body List<UserRequest> userRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/users/")
    Call<List<User>> usersUsersBulkPartialUpdate(
            @retrofit2.http.Body List<UserRequest> userRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/users/")
    Call<List<User>> usersUsersBulkUpdate(
            @retrofit2.http.Body List<UserRequest> userRequest);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("api/users/users/")
    Call<User> usersUsersCreate(
            @retrofit2.http.Body UsersUsersCreateRequest usersUsersCreateRequest);

    @DELETE("api/users/users/{id}/")
    Call<Void> usersUsersDestroy(
            @retrofit2.http.Path("id") Integer id);

    @GET("api/users/users/")
    Call<PaginatedUserList> usersUsersList();

    @Headers({
            "Content-Type:application/json"
    })
    @PATCH("api/users/users/{id}/")
    Call<User> usersUsersPartialUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PatchedUserRequest patchedUserRequest);

    @GET("api/users/users/{id}/")
    Call<User> usersUsersRetrieve(
            @retrofit2.http.Path("id") Integer id);

    @Headers({
            "Content-Type:application/json"
    })
    @PUT("api/users/users/{id}/")
    Call<User> usersUsersUpdate(
            @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body UserRequest userRequest);

}
