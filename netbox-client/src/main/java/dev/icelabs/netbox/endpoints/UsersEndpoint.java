package dev.icelabs.netbox.endpoints;

import java.util.List;
import java.util.Map;

import dev.icelabs.netbox.api.UsersApi;
import dev.icelabs.netbox.model.*;

import retrofit2.Call;

public class UsersEndpoint extends Endpoint<UsersApi> {

    public UsersEndpoint(UsersApi service) {
        super(service);
    }

    // ==================== CONFIG ====================
    public final Config config = new Config();

    // ==================== USERS & GROUPS ====================
    public final Users users = new Users();
    public final Groups groups = new Groups();

    // ==================== OWNERS ====================
    public final Owners owners = new Owners();
    public final OwnerGroups ownerGroups = new OwnerGroups();

    // ==================== PERMISSIONS ====================
    public final Permissions permissions = new Permissions();

    // ==================== TOKENS ====================
    public final Tokens tokens = new Tokens();

    // CONFIG
    public Config config() {
        return config;
    }

    // USERS & GROUPS
    public Users users() {
        return users;
    }

    public Groups groups() {
        return groups;
    }

    // OWNERS
    public Owners owners() {
        return owners;
    }

    public OwnerGroups ownerGroups() {
        return ownerGroups;
    }

    // PERMISSIONS
    public Permissions permissions() {
        return permissions;
    }

    // TOKENS
    public Tokens tokens() {
        return tokens;
    }

    // ==================== CONFIG ====================
    public class Config {
        public Call<Map<String, Object>> get() {
            return service.usersConfigRetrieve();
        }
    }

    // ==================== USERS ====================
    public class Users {
        public Call<Void> bulkDestroy(List<UserRequest> request) {
            return service.usersUsersBulkDestroy(request);
        }

        public Call<List<User>> bulkPartialUpdate(List<UserRequest> request) {
            return service.usersUsersBulkPartialUpdate(request);
        }

        public Call<List<User>> bulkUpdate(List<UserRequest> request) {
            return service.usersUsersBulkUpdate(request);
        }

        public Call<User> create(UsersUsersCreateRequest request) {
            return service.usersUsersCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.usersUsersDestroy(id);
        }

        public Call<PaginatedUserList> list() {
            return service.usersUsersList();
        }

        public Call<User> partialUpdate(Integer id, PatchedUserRequest request) {
            return service.usersUsersPartialUpdate(id, request);
        }

        public Call<User> get(Integer id) {
            return service.usersUsersRetrieve(id);
        }

        public Call<User> update(Integer id, UserRequest request) {
            return service.usersUsersUpdate(id, request);
        }
    }

    // ==================== GROUPS ====================
    public class Groups {
        public Call<Void> bulkDestroy(List<GroupRequest> request) {
            return service.usersGroupsBulkDestroy(request);
        }

        public Call<List<Group>> bulkPartialUpdate(List<GroupRequest> request) {
            return service.usersGroupsBulkPartialUpdate(request);
        }

        public Call<List<Group>> bulkUpdate(List<GroupRequest> request) {
            return service.usersGroupsBulkUpdate(request);
        }

        public Call<Group> create(UsersGroupsCreateRequest request) {
            return service.usersGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.usersGroupsDestroy(id);
        }

        public Call<PaginatedGroupList> list() {
            return service.usersGroupsList();
        }

        public Call<Group> partialUpdate(Integer id, PatchedGroupRequest request) {
            return service.usersGroupsPartialUpdate(id, request);
        }

        public Call<Group> get(Integer id) {
            return service.usersGroupsRetrieve(id);
        }

        public Call<Group> update(Integer id, GroupRequest request) {
            return service.usersGroupsUpdate(id, request);
        }
    }

    // ==================== OWNERS ====================
    public class Owners {
        public Call<Void> bulkDestroy(List<OwnerRequest> request) {
            return service.usersOwnersBulkDestroy(request);
        }

        public Call<List<Owner>> bulkPartialUpdate(List<OwnerRequest> request) {
            return service.usersOwnersBulkPartialUpdate(request);
        }

        public Call<List<Owner>> bulkUpdate(List<OwnerRequest> request) {
            return service.usersOwnersBulkUpdate(request);
        }

        public Call<Owner> create(UsersOwnersCreateRequest request) {
            return service.usersOwnersCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.usersOwnersDestroy(id);
        }

        public Call<PaginatedOwnerList> list() {
            return service.usersOwnersList();
        }

        public Call<Owner> partialUpdate(Integer id, PatchedOwnerRequest request) {
            return service.usersOwnersPartialUpdate(id, request);
        }

        public Call<Owner> get(Integer id) {
            return service.usersOwnersRetrieve(id);
        }

        public Call<Owner> update(Integer id, OwnerRequest request) {
            return service.usersOwnersUpdate(id, request);
        }
    }

    // ==================== OWNER GROUPS ====================
    public class OwnerGroups {
        public Call<Void> bulkDestroy(List<OwnerGroupRequest> request) {
            return service.usersOwnerGroupsBulkDestroy(request);
        }

        public Call<List<OwnerGroup>> bulkPartialUpdate(List<OwnerGroupRequest> request) {
            return service.usersOwnerGroupsBulkPartialUpdate(request);
        }

        public Call<List<OwnerGroup>> bulkUpdate(List<OwnerGroupRequest> request) {
            return service.usersOwnerGroupsBulkUpdate(request);
        }

        public Call<OwnerGroup> create(UsersOwnerGroupsCreateRequest request) {
            return service.usersOwnerGroupsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.usersOwnerGroupsDestroy(id);
        }

        public Call<PaginatedOwnerGroupList> list() {
            return service.usersOwnerGroupsList();
        }

        public Call<OwnerGroup> partialUpdate(Integer id, PatchedOwnerGroupRequest request) {
            return service.usersOwnerGroupsPartialUpdate(id, request);
        }

        public Call<OwnerGroup> get(Integer id) {
            return service.usersOwnerGroupsRetrieve(id);
        }

        public Call<OwnerGroup> update(Integer id, OwnerGroupRequest request) {
            return service.usersOwnerGroupsUpdate(id, request);
        }
    }

    // ==================== PERMISSIONS ====================
    public class Permissions {
        public Call<Void> bulkDestroy(List<ObjectPermissionRequest> request) {
            return service.usersPermissionsBulkDestroy(request);
        }

        public Call<List<ObjectPermission>> bulkPartialUpdate(List<ObjectPermissionRequest> request) {
            return service.usersPermissionsBulkPartialUpdate(request);
        }

        public Call<List<ObjectPermission>> bulkUpdate(List<ObjectPermissionRequest> request) {
            return service.usersPermissionsBulkUpdate(request);
        }

        public Call<ObjectPermission> create(UsersPermissionsCreateRequest request) {
            return service.usersPermissionsCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.usersPermissionsDestroy(id);
        }

        public Call<PaginatedObjectPermissionList> list() {
            return service.usersPermissionsList();
        }

        public Call<ObjectPermission> partialUpdate(Integer id, PatchedObjectPermissionRequest request) {
            return service.usersPermissionsPartialUpdate(id, request);
        }

        public Call<ObjectPermission> get(Integer id) {
            return service.usersPermissionsRetrieve(id);
        }

        public Call<ObjectPermission> update(Integer id, ObjectPermissionRequest request) {
            return service.usersPermissionsUpdate(id, request);
        }
    }

    // ==================== TOKENS ====================
    public class Tokens {
        public Call<Void> bulkDestroy(List<TokenRequest> request) {
            return service.usersTokensBulkDestroy(request);
        }

        public Call<List<Token>> bulkPartialUpdate(List<TokenRequest> request) {
            return service.usersTokensBulkPartialUpdate(request);
        }

        public Call<List<Token>> bulkUpdate(List<TokenRequest> request) {
            return service.usersTokensBulkUpdate(request);
        }

        public Call<Token> create(UsersTokensCreateRequest request) {
            return service.usersTokensCreate(request);
        }

        public Call<Void> delete(Integer id) {
            return service.usersTokensDestroy(id);
        }

        public Call<PaginatedTokenList> list() {
            return service.usersTokensList();
        }

        public Call<Token> partialUpdate(Integer id, PatchedTokenRequest request) {
            return service.usersTokensPartialUpdate(id, request);
        }

        public Call<TokenProvision> provision(TokenProvisionRequest request) {
            return service.usersTokensProvisionCreate(request);
        }

        public Call<Token> get(Integer id) {
            return service.usersTokensRetrieve(id);
        }

        public Call<Token> update(Integer id, TokenRequest request) {
            return service.usersTokensUpdate(id, request);
        }
    }
}
