# WirelessApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**wirelessWirelessLanGroupsBulkDestroy**](WirelessApi.md#wirelessWirelessLanGroupsBulkDestroy) | **DELETE** api/wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsBulkPartialUpdate**](WirelessApi.md#wirelessWirelessLanGroupsBulkPartialUpdate) | **PATCH** api/wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsBulkUpdate**](WirelessApi.md#wirelessWirelessLanGroupsBulkUpdate) | **PUT** api/wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsCreate**](WirelessApi.md#wirelessWirelessLanGroupsCreate) | **POST** api/wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsDestroy**](WirelessApi.md#wirelessWirelessLanGroupsDestroy) | **DELETE** api/wireless/wireless-lan-groups/{id}/ |  |
| [**wirelessWirelessLanGroupsList**](WirelessApi.md#wirelessWirelessLanGroupsList) | **GET** api/wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsPartialUpdate**](WirelessApi.md#wirelessWirelessLanGroupsPartialUpdate) | **PATCH** api/wireless/wireless-lan-groups/{id}/ |  |
| [**wirelessWirelessLanGroupsRetrieve**](WirelessApi.md#wirelessWirelessLanGroupsRetrieve) | **GET** api/wireless/wireless-lan-groups/{id}/ |  |
| [**wirelessWirelessLanGroupsUpdate**](WirelessApi.md#wirelessWirelessLanGroupsUpdate) | **PUT** api/wireless/wireless-lan-groups/{id}/ |  |
| [**wirelessWirelessLansBulkDestroy**](WirelessApi.md#wirelessWirelessLansBulkDestroy) | **DELETE** api/wireless/wireless-lans/ |  |
| [**wirelessWirelessLansBulkPartialUpdate**](WirelessApi.md#wirelessWirelessLansBulkPartialUpdate) | **PATCH** api/wireless/wireless-lans/ |  |
| [**wirelessWirelessLansBulkUpdate**](WirelessApi.md#wirelessWirelessLansBulkUpdate) | **PUT** api/wireless/wireless-lans/ |  |
| [**wirelessWirelessLansCreate**](WirelessApi.md#wirelessWirelessLansCreate) | **POST** api/wireless/wireless-lans/ |  |
| [**wirelessWirelessLansDestroy**](WirelessApi.md#wirelessWirelessLansDestroy) | **DELETE** api/wireless/wireless-lans/{id}/ |  |
| [**wirelessWirelessLansList**](WirelessApi.md#wirelessWirelessLansList) | **GET** api/wireless/wireless-lans/ |  |
| [**wirelessWirelessLansPartialUpdate**](WirelessApi.md#wirelessWirelessLansPartialUpdate) | **PATCH** api/wireless/wireless-lans/{id}/ |  |
| [**wirelessWirelessLansRetrieve**](WirelessApi.md#wirelessWirelessLansRetrieve) | **GET** api/wireless/wireless-lans/{id}/ |  |
| [**wirelessWirelessLansUpdate**](WirelessApi.md#wirelessWirelessLansUpdate) | **PUT** api/wireless/wireless-lans/{id}/ |  |
| [**wirelessWirelessLinksBulkDestroy**](WirelessApi.md#wirelessWirelessLinksBulkDestroy) | **DELETE** api/wireless/wireless-links/ |  |
| [**wirelessWirelessLinksBulkPartialUpdate**](WirelessApi.md#wirelessWirelessLinksBulkPartialUpdate) | **PATCH** api/wireless/wireless-links/ |  |
| [**wirelessWirelessLinksBulkUpdate**](WirelessApi.md#wirelessWirelessLinksBulkUpdate) | **PUT** api/wireless/wireless-links/ |  |
| [**wirelessWirelessLinksCreate**](WirelessApi.md#wirelessWirelessLinksCreate) | **POST** api/wireless/wireless-links/ |  |
| [**wirelessWirelessLinksDestroy**](WirelessApi.md#wirelessWirelessLinksDestroy) | **DELETE** api/wireless/wireless-links/{id}/ |  |
| [**wirelessWirelessLinksList**](WirelessApi.md#wirelessWirelessLinksList) | **GET** api/wireless/wireless-links/ |  |
| [**wirelessWirelessLinksPartialUpdate**](WirelessApi.md#wirelessWirelessLinksPartialUpdate) | **PATCH** api/wireless/wireless-links/{id}/ |  |
| [**wirelessWirelessLinksRetrieve**](WirelessApi.md#wirelessWirelessLinksRetrieve) | **GET** api/wireless/wireless-links/{id}/ |  |
| [**wirelessWirelessLinksUpdate**](WirelessApi.md#wirelessWirelessLinksUpdate) | **PUT** api/wireless/wireless-links/{id}/ |  |



## wirelessWirelessLanGroupsBulkDestroy

> wirelessWirelessLanGroupsBulkDestroy(wirelessLANGroupRequest)



Delete a list of wireless LAN group objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLANGroupRequest> wirelessLANGroupRequest = Arrays.asList(); // List<WirelessLANGroupRequest> | 
        try {
            apiInstance.wirelessWirelessLanGroupsBulkDestroy(wirelessLANGroupRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsBulkDestroy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLANGroupRequest** | [**List&lt;WirelessLANGroupRequest&gt;**](WirelessLANGroupRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |


## wirelessWirelessLanGroupsBulkPartialUpdate

> List&lt;WirelessLANGroup&gt; wirelessWirelessLanGroupsBulkPartialUpdate(wirelessLANGroupRequest)



Patch a list of wireless LAN group objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLANGroupRequest> wirelessLANGroupRequest = Arrays.asList(); // List<WirelessLANGroupRequest> | 
        try {
            List<WirelessLANGroup> result = apiInstance.wirelessWirelessLanGroupsBulkPartialUpdate(wirelessLANGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsBulkPartialUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLANGroupRequest** | [**List&lt;WirelessLANGroupRequest&gt;**](WirelessLANGroupRequest.md)|  | |

### Return type

[**List&lt;WirelessLANGroup&gt;**](WirelessLANGroup.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLanGroupsBulkUpdate

> List&lt;WirelessLANGroup&gt; wirelessWirelessLanGroupsBulkUpdate(wirelessLANGroupRequest)



Put a list of wireless LAN group objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLANGroupRequest> wirelessLANGroupRequest = Arrays.asList(); // List<WirelessLANGroupRequest> | 
        try {
            List<WirelessLANGroup> result = apiInstance.wirelessWirelessLanGroupsBulkUpdate(wirelessLANGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsBulkUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLANGroupRequest** | [**List&lt;WirelessLANGroupRequest&gt;**](WirelessLANGroupRequest.md)|  | |

### Return type

[**List&lt;WirelessLANGroup&gt;**](WirelessLANGroup.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLanGroupsCreate

> WirelessLANGroup wirelessWirelessLanGroupsCreate(wirelessWirelessLanGroupsCreateRequest)



Post a list of wireless LAN group objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        WirelessWirelessLanGroupsCreateRequest wirelessWirelessLanGroupsCreateRequest = new WirelessWirelessLanGroupsCreateRequest(); // WirelessWirelessLanGroupsCreateRequest | 
        try {
            WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsCreate(wirelessWirelessLanGroupsCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessWirelessLanGroupsCreateRequest** | [**WirelessWirelessLanGroupsCreateRequest**](WirelessWirelessLanGroupsCreateRequest.md)|  | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## wirelessWirelessLanGroupsDestroy

> wirelessWirelessLanGroupsDestroy(id)



Delete a wireless LAN group object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless LAN group.
        try {
            apiInstance.wirelessWirelessLanGroupsDestroy(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsDestroy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless LAN group. | |

### Return type

null (empty response body)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |


## wirelessWirelessLanGroupsList

> PaginatedWirelessLANGroupList wirelessWirelessLanGroupsList(ancestor, ancestorN, ancestorId, ancestorIdN, created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, description, descriptionEmpty, descriptionIc, descriptionIe, descriptionIew, descriptionIregex, descriptionIsw, descriptionN, descriptionNic, descriptionNie, descriptionNiew, descriptionNisw, descriptionRegex, id, idEmpty, idGt, idGte, idLt, idLte, idN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, modifiedByRequest, name, nameEmpty, nameIc, nameIe, nameIew, nameIregex, nameIsw, nameN, nameNic, nameNie, nameNiew, nameNisw, nameRegex, offset, ordering, owner, ownerN, ownerGroup, ownerGroupN, ownerGroupId, ownerGroupIdN, ownerId, ownerIdN, parent, parentN, parentId, parentIdN, q, slug, slugEmpty, slugIc, slugIe, slugIew, slugIregex, slugIsw, slugN, slugNic, slugNie, slugNiew, slugNisw, slugRegex, tag, tagN, tagId, tagIdN, updatedByRequest)



Get a list of wireless LAN group objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<String> ancestor = Arrays.asList(); // List<String> | 
        List<String> ancestorN = Arrays.asList(); // List<String> | 
        List<String> ancestorId = Arrays.asList(); // List<String> | 
        List<String> ancestorIdN = Arrays.asList(); // List<String> | 
        List<OffsetDateTime> created = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdEmpty = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdGt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdGte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdLt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdLte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdN = Arrays.asList(); // List<OffsetDateTime> | 
        UUID createdByRequest = UUID.randomUUID(); // UUID | 
        List<String> description = Arrays.asList(); // List<String> | 
        Boolean descriptionEmpty = true; // Boolean | 
        List<String> descriptionIc = Arrays.asList(); // List<String> | 
        List<String> descriptionIe = Arrays.asList(); // List<String> | 
        List<String> descriptionIew = Arrays.asList(); // List<String> | 
        List<String> descriptionIregex = Arrays.asList(); // List<String> | 
        List<String> descriptionIsw = Arrays.asList(); // List<String> | 
        List<String> descriptionN = Arrays.asList(); // List<String> | 
        List<String> descriptionNic = Arrays.asList(); // List<String> | 
        List<String> descriptionNie = Arrays.asList(); // List<String> | 
        List<String> descriptionNiew = Arrays.asList(); // List<String> | 
        List<String> descriptionNisw = Arrays.asList(); // List<String> | 
        List<String> descriptionRegex = Arrays.asList(); // List<String> | 
        List<Integer> id = Arrays.asList(); // List<Integer> | 
        Boolean idEmpty = true; // Boolean | 
        List<Integer> idGt = Arrays.asList(); // List<Integer> | 
        List<Integer> idGte = Arrays.asList(); // List<Integer> | 
        List<Integer> idLt = Arrays.asList(); // List<Integer> | 
        List<Integer> idLte = Arrays.asList(); // List<Integer> | 
        List<Integer> idN = Arrays.asList(); // List<Integer> | 
        List<OffsetDateTime> lastUpdated = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedEmpty = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedGt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedGte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedLt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedLte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedN = Arrays.asList(); // List<OffsetDateTime> | 
        Integer limit = 56; // Integer | Number of results to return per page.
        UUID modifiedByRequest = UUID.randomUUID(); // UUID | 
        List<String> name = Arrays.asList(); // List<String> | 
        Boolean nameEmpty = true; // Boolean | 
        List<String> nameIc = Arrays.asList(); // List<String> | 
        List<String> nameIe = Arrays.asList(); // List<String> | 
        List<String> nameIew = Arrays.asList(); // List<String> | 
        List<String> nameIregex = Arrays.asList(); // List<String> | 
        List<String> nameIsw = Arrays.asList(); // List<String> | 
        List<String> nameN = Arrays.asList(); // List<String> | 
        List<String> nameNic = Arrays.asList(); // List<String> | 
        List<String> nameNie = Arrays.asList(); // List<String> | 
        List<String> nameNiew = Arrays.asList(); // List<String> | 
        List<String> nameNisw = Arrays.asList(); // List<String> | 
        List<String> nameRegex = Arrays.asList(); // List<String> | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        List<String> owner = Arrays.asList(); // List<String> | Owner (name)
        List<String> ownerN = Arrays.asList(); // List<String> | Owner (name)
        List<String> ownerGroup = Arrays.asList(); // List<String> | Owner Group (name)
        List<String> ownerGroupN = Arrays.asList(); // List<String> | Owner Group (name)
        List<Integer> ownerGroupId = Arrays.asList(); // List<Integer> | Owner Group (ID)
        List<Integer> ownerGroupIdN = Arrays.asList(); // List<Integer> | Owner Group (ID)
        List<Integer> ownerId = Arrays.asList(); // List<Integer> | Owner (ID)
        List<Integer> ownerIdN = Arrays.asList(); // List<Integer> | Owner (ID)
        List<String> parent = Arrays.asList(); // List<String> | 
        List<String> parentN = Arrays.asList(); // List<String> | 
        List<Integer> parentId = Arrays.asList(); // List<Integer> | 
        List<Integer> parentIdN = Arrays.asList(); // List<Integer> | 
        String q = "q_example"; // String | Search
        List<String> slug = Arrays.asList(); // List<String> | 
        Boolean slugEmpty = true; // Boolean | 
        List<String> slugIc = Arrays.asList(); // List<String> | 
        List<String> slugIe = Arrays.asList(); // List<String> | 
        List<String> slugIew = Arrays.asList(); // List<String> | 
        List<String> slugIregex = Arrays.asList(); // List<String> | 
        List<String> slugIsw = Arrays.asList(); // List<String> | 
        List<String> slugN = Arrays.asList(); // List<String> | 
        List<String> slugNic = Arrays.asList(); // List<String> | 
        List<String> slugNie = Arrays.asList(); // List<String> | 
        List<String> slugNiew = Arrays.asList(); // List<String> | 
        List<String> slugNisw = Arrays.asList(); // List<String> | 
        List<String> slugRegex = Arrays.asList(); // List<String> | 
        List<String> tag = Arrays.asList(); // List<String> | 
        List<String> tagN = Arrays.asList(); // List<String> | 
        List<String> tagId = Arrays.asList(); // List<String> | 
        List<String> tagIdN = Arrays.asList(); // List<String> | 
        UUID updatedByRequest = UUID.randomUUID(); // UUID | 
        try {
            PaginatedWirelessLANGroupList result = apiInstance.wirelessWirelessLanGroupsList(ancestor, ancestorN, ancestorId, ancestorIdN, created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, description, descriptionEmpty, descriptionIc, descriptionIe, descriptionIew, descriptionIregex, descriptionIsw, descriptionN, descriptionNic, descriptionNie, descriptionNiew, descriptionNisw, descriptionRegex, id, idEmpty, idGt, idGte, idLt, idLte, idN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, modifiedByRequest, name, nameEmpty, nameIc, nameIe, nameIew, nameIregex, nameIsw, nameN, nameNic, nameNie, nameNiew, nameNisw, nameRegex, offset, ordering, owner, ownerN, ownerGroup, ownerGroupN, ownerGroupId, ownerGroupIdN, ownerId, ownerIdN, parent, parentN, parentId, parentIdN, q, slug, slugEmpty, slugIc, slugIe, slugIew, slugIregex, slugIsw, slugN, slugNic, slugNie, slugNiew, slugNisw, slugRegex, tag, tagN, tagId, tagIdN, updatedByRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ancestor** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ancestorN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ancestorId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ancestorIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **created** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdEmpty** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdGt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdGte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdLt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdLte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdN** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdByRequest** | **UUID**|  | [optional] |
| **description** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionEmpty** | **Boolean**|  | [optional] |
| **descriptionIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **id** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idEmpty** | **Boolean**|  | [optional] |
| **idGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **lastUpdated** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedEmpty** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedGt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedGte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedLt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedLte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedN** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **modifiedByRequest** | **UUID**|  | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameEmpty** | **Boolean**|  | [optional] |
| **nameIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **owner** | [**List&lt;String&gt;**](String.md)| Owner (name) | [optional] |
| **ownerN** | [**List&lt;String&gt;**](String.md)| Owner (name) | [optional] |
| **ownerGroup** | [**List&lt;String&gt;**](String.md)| Owner Group (name) | [optional] |
| **ownerGroupN** | [**List&lt;String&gt;**](String.md)| Owner Group (name) | [optional] |
| **ownerGroupId** | [**List&lt;Integer&gt;**](Integer.md)| Owner Group (ID) | [optional] |
| **ownerGroupIdN** | [**List&lt;Integer&gt;**](Integer.md)| Owner Group (ID) | [optional] |
| **ownerId** | [**List&lt;Integer&gt;**](Integer.md)| Owner (ID) | [optional] |
| **ownerIdN** | [**List&lt;Integer&gt;**](Integer.md)| Owner (ID) | [optional] |
| **parent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **parentN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **parentId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **parentIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **q** | **String**| Search | [optional] |
| **slug** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugEmpty** | **Boolean**|  | [optional] |
| **slugIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slugRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **updatedByRequest** | **UUID**|  | [optional] |

### Return type

[**PaginatedWirelessLANGroupList**](PaginatedWirelessLANGroupList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLanGroupsPartialUpdate

> WirelessLANGroup wirelessWirelessLanGroupsPartialUpdate(id, patchedWritableWirelessLANGroupRequest)



Patch a wireless LAN group object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless LAN group.
        PatchedWritableWirelessLANGroupRequest patchedWritableWirelessLANGroupRequest = new PatchedWritableWirelessLANGroupRequest(); // PatchedWritableWirelessLANGroupRequest | 
        try {
            WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsPartialUpdate(id, patchedWritableWirelessLANGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsPartialUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless LAN group. | |
| **patchedWritableWirelessLANGroupRequest** | [**PatchedWritableWirelessLANGroupRequest**](PatchedWritableWirelessLANGroupRequest.md)|  | [optional] |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLanGroupsRetrieve

> WirelessLANGroup wirelessWirelessLanGroupsRetrieve(id)



Get a wireless LAN group object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless LAN group.
        try {
            WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsRetrieve(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsRetrieve");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless LAN group. | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLanGroupsUpdate

> WirelessLANGroup wirelessWirelessLanGroupsUpdate(id, writableWirelessLANGroupRequest)



Put a wireless LAN group object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless LAN group.
        WritableWirelessLANGroupRequest writableWirelessLANGroupRequest = new WritableWirelessLANGroupRequest(); // WritableWirelessLANGroupRequest | 
        try {
            WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsUpdate(id, writableWirelessLANGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless LAN group. | |
| **writableWirelessLANGroupRequest** | [**WritableWirelessLANGroupRequest**](WritableWirelessLANGroupRequest.md)|  | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLansBulkDestroy

> wirelessWirelessLansBulkDestroy(wirelessLANRequest)



Delete a list of wireless LAN objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLANRequest> wirelessLANRequest = Arrays.asList(); // List<WirelessLANRequest> | 
        try {
            apiInstance.wirelessWirelessLansBulkDestroy(wirelessLANRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansBulkDestroy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLANRequest** | [**List&lt;WirelessLANRequest&gt;**](WirelessLANRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |


## wirelessWirelessLansBulkPartialUpdate

> List&lt;WirelessLAN&gt; wirelessWirelessLansBulkPartialUpdate(wirelessLANRequest)



Patch a list of wireless LAN objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLANRequest> wirelessLANRequest = Arrays.asList(); // List<WirelessLANRequest> | 
        try {
            List<WirelessLAN> result = apiInstance.wirelessWirelessLansBulkPartialUpdate(wirelessLANRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansBulkPartialUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLANRequest** | [**List&lt;WirelessLANRequest&gt;**](WirelessLANRequest.md)|  | |

### Return type

[**List&lt;WirelessLAN&gt;**](WirelessLAN.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLansBulkUpdate

> List&lt;WirelessLAN&gt; wirelessWirelessLansBulkUpdate(wirelessLANRequest)



Put a list of wireless LAN objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLANRequest> wirelessLANRequest = Arrays.asList(); // List<WirelessLANRequest> | 
        try {
            List<WirelessLAN> result = apiInstance.wirelessWirelessLansBulkUpdate(wirelessLANRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansBulkUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLANRequest** | [**List&lt;WirelessLANRequest&gt;**](WirelessLANRequest.md)|  | |

### Return type

[**List&lt;WirelessLAN&gt;**](WirelessLAN.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLansCreate

> WirelessLAN wirelessWirelessLansCreate(wirelessWirelessLansCreateRequest)



Post a list of wireless LAN objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        WirelessWirelessLansCreateRequest wirelessWirelessLansCreateRequest = new WirelessWirelessLansCreateRequest(); // WirelessWirelessLansCreateRequest | 
        try {
            WirelessLAN result = apiInstance.wirelessWirelessLansCreate(wirelessWirelessLansCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessWirelessLansCreateRequest** | [**WirelessWirelessLansCreateRequest**](WirelessWirelessLansCreateRequest.md)|  | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## wirelessWirelessLansDestroy

> wirelessWirelessLansDestroy(id)



Delete a wireless LAN object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless LAN.
        try {
            apiInstance.wirelessWirelessLansDestroy(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansDestroy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless LAN. | |

### Return type

null (empty response body)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |


## wirelessWirelessLansList

> PaginatedWirelessLANList wirelessWirelessLansList(authCipher, authCipherEmpty, authCipherIc, authCipherIe, authCipherIew, authCipherIregex, authCipherIsw, authCipherN, authCipherNic, authCipherNie, authCipherNiew, authCipherNisw, authCipherRegex, authPsk, authPskEmpty, authPskIc, authPskIe, authPskIew, authPskIregex, authPskIsw, authPskN, authPskNic, authPskNie, authPskNiew, authPskNisw, authPskRegex, authType, authTypeEmpty, authTypeIc, authTypeIe, authTypeIew, authTypeIregex, authTypeIsw, authTypeN, authTypeNic, authTypeNie, authTypeNiew, authTypeNisw, authTypeRegex, created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, description, descriptionEmpty, descriptionIc, descriptionIe, descriptionIew, descriptionIregex, descriptionIsw, descriptionN, descriptionNic, descriptionNie, descriptionNiew, descriptionNisw, descriptionRegex, group, groupN, groupId, groupIdN, id, idEmpty, idGt, idGte, idLt, idLte, idN, interfaceId, interfaceIdN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, location, locationN, locationId, locationIdN, modifiedByRequest, offset, ordering, owner, ownerN, ownerGroup, ownerGroupN, ownerGroupId, ownerGroupIdN, ownerId, ownerIdN, q, region, regionN, regionId, regionIdN, scopeId, scopeIdEmpty, scopeIdGt, scopeIdGte, scopeIdLt, scopeIdLte, scopeIdN, scopeType, scopeTypeN, site, siteN, siteGroup, siteGroupN, siteGroupId, siteGroupIdN, siteId, siteIdN, ssid, ssidEmpty, ssidIc, ssidIe, ssidIew, ssidIregex, ssidIsw, ssidN, ssidNic, ssidNie, ssidNiew, ssidNisw, ssidRegex, status, statusEmpty, statusIc, statusIe, statusIew, statusIregex, statusIsw, statusN, statusNic, statusNie, statusNiew, statusNisw, statusRegex, tag, tagN, tagId, tagIdN, tenant, tenantN, tenantGroup, tenantGroupN, tenantGroupId, tenantGroupIdN, tenantId, tenantIdN, updatedByRequest, vlanId, vlanIdN)



Get a list of wireless LAN objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<String> authCipher = Arrays.asList(); // List<String> | 
        Boolean authCipherEmpty = true; // Boolean | 
        List<String> authCipherIc = Arrays.asList(); // List<String> | 
        List<String> authCipherIe = Arrays.asList(); // List<String> | 
        List<String> authCipherIew = Arrays.asList(); // List<String> | 
        List<String> authCipherIregex = Arrays.asList(); // List<String> | 
        List<String> authCipherIsw = Arrays.asList(); // List<String> | 
        List<String> authCipherN = Arrays.asList(); // List<String> | 
        List<String> authCipherNic = Arrays.asList(); // List<String> | 
        List<String> authCipherNie = Arrays.asList(); // List<String> | 
        List<String> authCipherNiew = Arrays.asList(); // List<String> | 
        List<String> authCipherNisw = Arrays.asList(); // List<String> | 
        List<String> authCipherRegex = Arrays.asList(); // List<String> | 
        List<String> authPsk = Arrays.asList(); // List<String> | 
        Boolean authPskEmpty = true; // Boolean | 
        List<String> authPskIc = Arrays.asList(); // List<String> | 
        List<String> authPskIe = Arrays.asList(); // List<String> | 
        List<String> authPskIew = Arrays.asList(); // List<String> | 
        List<String> authPskIregex = Arrays.asList(); // List<String> | 
        List<String> authPskIsw = Arrays.asList(); // List<String> | 
        List<String> authPskN = Arrays.asList(); // List<String> | 
        List<String> authPskNic = Arrays.asList(); // List<String> | 
        List<String> authPskNie = Arrays.asList(); // List<String> | 
        List<String> authPskNiew = Arrays.asList(); // List<String> | 
        List<String> authPskNisw = Arrays.asList(); // List<String> | 
        List<String> authPskRegex = Arrays.asList(); // List<String> | 
        List<String> authType = Arrays.asList(); // List<String> | 
        Boolean authTypeEmpty = true; // Boolean | 
        List<String> authTypeIc = Arrays.asList(); // List<String> | 
        List<String> authTypeIe = Arrays.asList(); // List<String> | 
        List<String> authTypeIew = Arrays.asList(); // List<String> | 
        List<String> authTypeIregex = Arrays.asList(); // List<String> | 
        List<String> authTypeIsw = Arrays.asList(); // List<String> | 
        List<String> authTypeN = Arrays.asList(); // List<String> | 
        List<String> authTypeNic = Arrays.asList(); // List<String> | 
        List<String> authTypeNie = Arrays.asList(); // List<String> | 
        List<String> authTypeNiew = Arrays.asList(); // List<String> | 
        List<String> authTypeNisw = Arrays.asList(); // List<String> | 
        List<String> authTypeRegex = Arrays.asList(); // List<String> | 
        List<OffsetDateTime> created = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdEmpty = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdGt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdGte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdLt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdLte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdN = Arrays.asList(); // List<OffsetDateTime> | 
        UUID createdByRequest = UUID.randomUUID(); // UUID | 
        List<String> description = Arrays.asList(); // List<String> | 
        Boolean descriptionEmpty = true; // Boolean | 
        List<String> descriptionIc = Arrays.asList(); // List<String> | 
        List<String> descriptionIe = Arrays.asList(); // List<String> | 
        List<String> descriptionIew = Arrays.asList(); // List<String> | 
        List<String> descriptionIregex = Arrays.asList(); // List<String> | 
        List<String> descriptionIsw = Arrays.asList(); // List<String> | 
        List<String> descriptionN = Arrays.asList(); // List<String> | 
        List<String> descriptionNic = Arrays.asList(); // List<String> | 
        List<String> descriptionNie = Arrays.asList(); // List<String> | 
        List<String> descriptionNiew = Arrays.asList(); // List<String> | 
        List<String> descriptionNisw = Arrays.asList(); // List<String> | 
        List<String> descriptionRegex = Arrays.asList(); // List<String> | 
        List<String> group = Arrays.asList(); // List<String> | 
        List<String> groupN = Arrays.asList(); // List<String> | 
        List<String> groupId = Arrays.asList(); // List<String> | 
        List<String> groupIdN = Arrays.asList(); // List<String> | 
        List<Integer> id = Arrays.asList(); // List<Integer> | 
        Boolean idEmpty = true; // Boolean | 
        List<Integer> idGt = Arrays.asList(); // List<Integer> | 
        List<Integer> idGte = Arrays.asList(); // List<Integer> | 
        List<Integer> idLt = Arrays.asList(); // List<Integer> | 
        List<Integer> idLte = Arrays.asList(); // List<Integer> | 
        List<Integer> idN = Arrays.asList(); // List<Integer> | 
        List<Integer> interfaceId = Arrays.asList(); // List<Integer> | 
        List<Integer> interfaceIdN = Arrays.asList(); // List<Integer> | 
        List<OffsetDateTime> lastUpdated = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedEmpty = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedGt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedGte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedLt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedLte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedN = Arrays.asList(); // List<OffsetDateTime> | 
        Integer limit = 56; // Integer | Number of results to return per page.
        List<String> location = Arrays.asList(); // List<String> | 
        List<String> locationN = Arrays.asList(); // List<String> | 
        List<String> locationId = Arrays.asList(); // List<String> | 
        List<String> locationIdN = Arrays.asList(); // List<String> | 
        UUID modifiedByRequest = UUID.randomUUID(); // UUID | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        List<String> owner = Arrays.asList(); // List<String> | Owner (name)
        List<String> ownerN = Arrays.asList(); // List<String> | Owner (name)
        List<String> ownerGroup = Arrays.asList(); // List<String> | Owner Group (name)
        List<String> ownerGroupN = Arrays.asList(); // List<String> | Owner Group (name)
        List<Integer> ownerGroupId = Arrays.asList(); // List<Integer> | Owner Group (ID)
        List<Integer> ownerGroupIdN = Arrays.asList(); // List<Integer> | Owner Group (ID)
        List<Integer> ownerId = Arrays.asList(); // List<Integer> | Owner (ID)
        List<Integer> ownerIdN = Arrays.asList(); // List<Integer> | Owner (ID)
        String q = "q_example"; // String | Search
        List<String> region = Arrays.asList(); // List<String> | 
        List<String> regionN = Arrays.asList(); // List<String> | 
        List<String> regionId = Arrays.asList(); // List<String> | 
        List<String> regionIdN = Arrays.asList(); // List<String> | 
        List<Integer> scopeId = Arrays.asList(); // List<Integer> | 
        Boolean scopeIdEmpty = true; // Boolean | 
        List<Integer> scopeIdGt = Arrays.asList(); // List<Integer> | 
        List<Integer> scopeIdGte = Arrays.asList(); // List<Integer> | 
        List<Integer> scopeIdLt = Arrays.asList(); // List<Integer> | 
        List<Integer> scopeIdLte = Arrays.asList(); // List<Integer> | 
        List<Integer> scopeIdN = Arrays.asList(); // List<Integer> | 
        String scopeType = "scopeType_example"; // String | 
        String scopeTypeN = "scopeTypeN_example"; // String | 
        List<String> site = Arrays.asList(); // List<String> | Site (slug)
        List<String> siteN = Arrays.asList(); // List<String> | Site (slug)
        List<String> siteGroup = Arrays.asList(); // List<String> | 
        List<String> siteGroupN = Arrays.asList(); // List<String> | 
        List<String> siteGroupId = Arrays.asList(); // List<String> | 
        List<String> siteGroupIdN = Arrays.asList(); // List<String> | 
        List<Integer> siteId = Arrays.asList(); // List<Integer> | Site (ID)
        List<Integer> siteIdN = Arrays.asList(); // List<Integer> | Site (ID)
        List<String> ssid = Arrays.asList(); // List<String> | 
        Boolean ssidEmpty = true; // Boolean | 
        List<String> ssidIc = Arrays.asList(); // List<String> | 
        List<String> ssidIe = Arrays.asList(); // List<String> | 
        List<String> ssidIew = Arrays.asList(); // List<String> | 
        List<String> ssidIregex = Arrays.asList(); // List<String> | 
        List<String> ssidIsw = Arrays.asList(); // List<String> | 
        List<String> ssidN = Arrays.asList(); // List<String> | 
        List<String> ssidNic = Arrays.asList(); // List<String> | 
        List<String> ssidNie = Arrays.asList(); // List<String> | 
        List<String> ssidNiew = Arrays.asList(); // List<String> | 
        List<String> ssidNisw = Arrays.asList(); // List<String> | 
        List<String> ssidRegex = Arrays.asList(); // List<String> | 
        List<String> status = Arrays.asList(); // List<String> | 
        Boolean statusEmpty = true; // Boolean | 
        List<String> statusIc = Arrays.asList(); // List<String> | 
        List<String> statusIe = Arrays.asList(); // List<String> | 
        List<String> statusIew = Arrays.asList(); // List<String> | 
        List<String> statusIregex = Arrays.asList(); // List<String> | 
        List<String> statusIsw = Arrays.asList(); // List<String> | 
        List<String> statusN = Arrays.asList(); // List<String> | 
        List<String> statusNic = Arrays.asList(); // List<String> | 
        List<String> statusNie = Arrays.asList(); // List<String> | 
        List<String> statusNiew = Arrays.asList(); // List<String> | 
        List<String> statusNisw = Arrays.asList(); // List<String> | 
        List<String> statusRegex = Arrays.asList(); // List<String> | 
        List<String> tag = Arrays.asList(); // List<String> | 
        List<String> tagN = Arrays.asList(); // List<String> | 
        List<String> tagId = Arrays.asList(); // List<String> | 
        List<String> tagIdN = Arrays.asList(); // List<String> | 
        List<String> tenant = Arrays.asList(); // List<String> | Tenant (slug)
        List<String> tenantN = Arrays.asList(); // List<String> | Tenant (slug)
        List<String> tenantGroup = Arrays.asList(); // List<String> | 
        List<String> tenantGroupN = Arrays.asList(); // List<String> | 
        List<String> tenantGroupId = Arrays.asList(); // List<String> | 
        List<String> tenantGroupIdN = Arrays.asList(); // List<String> | 
        List<Integer> tenantId = Arrays.asList(); // List<Integer> | Tenant (ID)
        List<Integer> tenantIdN = Arrays.asList(); // List<Integer> | Tenant (ID)
        UUID updatedByRequest = UUID.randomUUID(); // UUID | 
        List<Integer> vlanId = Arrays.asList(); // List<Integer> | 
        List<Integer> vlanIdN = Arrays.asList(); // List<Integer> | 
        try {
            PaginatedWirelessLANList result = apiInstance.wirelessWirelessLansList(authCipher, authCipherEmpty, authCipherIc, authCipherIe, authCipherIew, authCipherIregex, authCipherIsw, authCipherN, authCipherNic, authCipherNie, authCipherNiew, authCipherNisw, authCipherRegex, authPsk, authPskEmpty, authPskIc, authPskIe, authPskIew, authPskIregex, authPskIsw, authPskN, authPskNic, authPskNie, authPskNiew, authPskNisw, authPskRegex, authType, authTypeEmpty, authTypeIc, authTypeIe, authTypeIew, authTypeIregex, authTypeIsw, authTypeN, authTypeNic, authTypeNie, authTypeNiew, authTypeNisw, authTypeRegex, created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, description, descriptionEmpty, descriptionIc, descriptionIe, descriptionIew, descriptionIregex, descriptionIsw, descriptionN, descriptionNic, descriptionNie, descriptionNiew, descriptionNisw, descriptionRegex, group, groupN, groupId, groupIdN, id, idEmpty, idGt, idGte, idLt, idLte, idN, interfaceId, interfaceIdN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, location, locationN, locationId, locationIdN, modifiedByRequest, offset, ordering, owner, ownerN, ownerGroup, ownerGroupN, ownerGroupId, ownerGroupIdN, ownerId, ownerIdN, q, region, regionN, regionId, regionIdN, scopeId, scopeIdEmpty, scopeIdGt, scopeIdGte, scopeIdLt, scopeIdLte, scopeIdN, scopeType, scopeTypeN, site, siteN, siteGroup, siteGroupN, siteGroupId, siteGroupIdN, siteId, siteIdN, ssid, ssidEmpty, ssidIc, ssidIe, ssidIew, ssidIregex, ssidIsw, ssidN, ssidNic, ssidNie, ssidNiew, ssidNisw, ssidRegex, status, statusEmpty, statusIc, statusIe, statusIew, statusIregex, statusIsw, statusN, statusNic, statusNie, statusNiew, statusNisw, statusRegex, tag, tagN, tagId, tagIdN, tenant, tenantN, tenantGroup, tenantGroupN, tenantGroupId, tenantGroupIdN, tenantId, tenantIdN, updatedByRequest, vlanId, vlanIdN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authCipher** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherEmpty** | **Boolean**|  | [optional] |
| **authCipherIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPsk** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskEmpty** | **Boolean**|  | [optional] |
| **authPskIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authType** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeEmpty** | **Boolean**|  | [optional] |
| **authTypeIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **created** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdEmpty** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdGt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdGte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdLt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdLte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdN** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdByRequest** | **UUID**|  | [optional] |
| **description** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionEmpty** | **Boolean**|  | [optional] |
| **descriptionIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **group** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **groupN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **groupId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **groupIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **id** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idEmpty** | **Boolean**|  | [optional] |
| **idGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **interfaceId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **interfaceIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **lastUpdated** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedEmpty** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedGt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedGte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedLt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedLte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedN** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **locationN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **locationId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **locationIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modifiedByRequest** | **UUID**|  | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **owner** | [**List&lt;String&gt;**](String.md)| Owner (name) | [optional] |
| **ownerN** | [**List&lt;String&gt;**](String.md)| Owner (name) | [optional] |
| **ownerGroup** | [**List&lt;String&gt;**](String.md)| Owner Group (name) | [optional] |
| **ownerGroupN** | [**List&lt;String&gt;**](String.md)| Owner Group (name) | [optional] |
| **ownerGroupId** | [**List&lt;Integer&gt;**](Integer.md)| Owner Group (ID) | [optional] |
| **ownerGroupIdN** | [**List&lt;Integer&gt;**](Integer.md)| Owner Group (ID) | [optional] |
| **ownerId** | [**List&lt;Integer&gt;**](Integer.md)| Owner (ID) | [optional] |
| **ownerIdN** | [**List&lt;Integer&gt;**](Integer.md)| Owner (ID) | [optional] |
| **q** | **String**| Search | [optional] |
| **region** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **regionN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **regionId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **regionIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **scopeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **scopeIdEmpty** | **Boolean**|  | [optional] |
| **scopeIdGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **scopeIdGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **scopeIdLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **scopeIdLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **scopeIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **scopeType** | **String**|  | [optional] |
| **scopeTypeN** | **String**|  | [optional] |
| **site** | [**List&lt;String&gt;**](String.md)| Site (slug) | [optional] |
| **siteN** | [**List&lt;String&gt;**](String.md)| Site (slug) | [optional] |
| **siteGroup** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **siteGroupN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **siteGroupId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **siteGroupIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **siteId** | [**List&lt;Integer&gt;**](Integer.md)| Site (ID) | [optional] |
| **siteIdN** | [**List&lt;Integer&gt;**](Integer.md)| Site (ID) | [optional] |
| **ssid** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidEmpty** | **Boolean**|  | [optional] |
| **ssidIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusEmpty** | **Boolean**|  | [optional] |
| **statusIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenant** | [**List&lt;String&gt;**](String.md)| Tenant (slug) | [optional] |
| **tenantN** | [**List&lt;String&gt;**](String.md)| Tenant (slug) | [optional] |
| **tenantGroup** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenantGroupN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenantGroupId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenantGroupIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenantId** | [**List&lt;Integer&gt;**](Integer.md)| Tenant (ID) | [optional] |
| **tenantIdN** | [**List&lt;Integer&gt;**](Integer.md)| Tenant (ID) | [optional] |
| **updatedByRequest** | **UUID**|  | [optional] |
| **vlanId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **vlanIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |

### Return type

[**PaginatedWirelessLANList**](PaginatedWirelessLANList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLansPartialUpdate

> WirelessLAN wirelessWirelessLansPartialUpdate(id, patchedWritableWirelessLANRequest)



Patch a wireless LAN object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless LAN.
        PatchedWritableWirelessLANRequest patchedWritableWirelessLANRequest = new PatchedWritableWirelessLANRequest(); // PatchedWritableWirelessLANRequest | 
        try {
            WirelessLAN result = apiInstance.wirelessWirelessLansPartialUpdate(id, patchedWritableWirelessLANRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansPartialUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless LAN. | |
| **patchedWritableWirelessLANRequest** | [**PatchedWritableWirelessLANRequest**](PatchedWritableWirelessLANRequest.md)|  | [optional] |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLansRetrieve

> WirelessLAN wirelessWirelessLansRetrieve(id)



Get a wireless LAN object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless LAN.
        try {
            WirelessLAN result = apiInstance.wirelessWirelessLansRetrieve(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansRetrieve");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless LAN. | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLansUpdate

> WirelessLAN wirelessWirelessLansUpdate(id, writableWirelessLANRequest)



Put a wireless LAN object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless LAN.
        WritableWirelessLANRequest writableWirelessLANRequest = new WritableWirelessLANRequest(); // WritableWirelessLANRequest | 
        try {
            WirelessLAN result = apiInstance.wirelessWirelessLansUpdate(id, writableWirelessLANRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLansUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless LAN. | |
| **writableWirelessLANRequest** | [**WritableWirelessLANRequest**](WritableWirelessLANRequest.md)|  | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLinksBulkDestroy

> wirelessWirelessLinksBulkDestroy(wirelessLinkRequest)



Delete a list of wireless link objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLinkRequest> wirelessLinkRequest = Arrays.asList(); // List<WirelessLinkRequest> | 
        try {
            apiInstance.wirelessWirelessLinksBulkDestroy(wirelessLinkRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksBulkDestroy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLinkRequest** | [**List&lt;WirelessLinkRequest&gt;**](WirelessLinkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |


## wirelessWirelessLinksBulkPartialUpdate

> List&lt;WirelessLink&gt; wirelessWirelessLinksBulkPartialUpdate(wirelessLinkRequest)



Patch a list of wireless link objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLinkRequest> wirelessLinkRequest = Arrays.asList(); // List<WirelessLinkRequest> | 
        try {
            List<WirelessLink> result = apiInstance.wirelessWirelessLinksBulkPartialUpdate(wirelessLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksBulkPartialUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLinkRequest** | [**List&lt;WirelessLinkRequest&gt;**](WirelessLinkRequest.md)|  | |

### Return type

[**List&lt;WirelessLink&gt;**](WirelessLink.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLinksBulkUpdate

> List&lt;WirelessLink&gt; wirelessWirelessLinksBulkUpdate(wirelessLinkRequest)



Put a list of wireless link objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<WirelessLinkRequest> wirelessLinkRequest = Arrays.asList(); // List<WirelessLinkRequest> | 
        try {
            List<WirelessLink> result = apiInstance.wirelessWirelessLinksBulkUpdate(wirelessLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksBulkUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessLinkRequest** | [**List&lt;WirelessLinkRequest&gt;**](WirelessLinkRequest.md)|  | |

### Return type

[**List&lt;WirelessLink&gt;**](WirelessLink.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLinksCreate

> WirelessLink wirelessWirelessLinksCreate(wirelessWirelessLinksCreateRequest)



Post a list of wireless link objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        WirelessWirelessLinksCreateRequest wirelessWirelessLinksCreateRequest = new WirelessWirelessLinksCreateRequest(); // WirelessWirelessLinksCreateRequest | 
        try {
            WirelessLink result = apiInstance.wirelessWirelessLinksCreate(wirelessWirelessLinksCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wirelessWirelessLinksCreateRequest** | [**WirelessWirelessLinksCreateRequest**](WirelessWirelessLinksCreateRequest.md)|  | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## wirelessWirelessLinksDestroy

> wirelessWirelessLinksDestroy(id)



Delete a wireless link object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless link.
        try {
            apiInstance.wirelessWirelessLinksDestroy(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksDestroy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless link. | |

### Return type

null (empty response body)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |


## wirelessWirelessLinksList

> PaginatedWirelessLinkList wirelessWirelessLinksList(authCipher, authCipherEmpty, authCipherIc, authCipherIe, authCipherIew, authCipherIregex, authCipherIsw, authCipherN, authCipherNic, authCipherNie, authCipherNiew, authCipherNisw, authCipherRegex, authPsk, authPskEmpty, authPskIc, authPskIe, authPskIew, authPskIregex, authPskIsw, authPskN, authPskNic, authPskNie, authPskNiew, authPskNisw, authPskRegex, authType, authTypeEmpty, authTypeIc, authTypeIe, authTypeIew, authTypeIregex, authTypeIsw, authTypeN, authTypeNic, authTypeNie, authTypeNiew, authTypeNisw, authTypeRegex, created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, description, descriptionEmpty, descriptionIc, descriptionIe, descriptionIew, descriptionIregex, descriptionIsw, descriptionN, descriptionNic, descriptionNie, descriptionNiew, descriptionNisw, descriptionRegex, distance, distanceEmpty, distanceGt, distanceGte, distanceLt, distanceLte, distanceN, distanceUnit, distanceUnitEmpty, distanceUnitIc, distanceUnitIe, distanceUnitIew, distanceUnitIregex, distanceUnitIsw, distanceUnitN, distanceUnitNic, distanceUnitNie, distanceUnitNiew, distanceUnitNisw, distanceUnitRegex, id, idEmpty, idGt, idGte, idLt, idLte, idN, interfaceAId, interfaceAIdN, interfaceBId, interfaceBIdN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, modifiedByRequest, offset, ordering, owner, ownerN, ownerGroup, ownerGroupN, ownerGroupId, ownerGroupIdN, ownerId, ownerIdN, q, ssid, ssidEmpty, ssidIc, ssidIe, ssidIew, ssidIregex, ssidIsw, ssidN, ssidNic, ssidNie, ssidNiew, ssidNisw, ssidRegex, status, statusEmpty, statusIc, statusIe, statusIew, statusIregex, statusIsw, statusN, statusNic, statusNie, statusNiew, statusNisw, statusRegex, tag, tagN, tagId, tagIdN, tenant, tenantN, tenantGroup, tenantGroupN, tenantGroupId, tenantGroupIdN, tenantId, tenantIdN, updatedByRequest)



Get a list of wireless link objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        List<String> authCipher = Arrays.asList(); // List<String> | 
        Boolean authCipherEmpty = true; // Boolean | 
        List<String> authCipherIc = Arrays.asList(); // List<String> | 
        List<String> authCipherIe = Arrays.asList(); // List<String> | 
        List<String> authCipherIew = Arrays.asList(); // List<String> | 
        List<String> authCipherIregex = Arrays.asList(); // List<String> | 
        List<String> authCipherIsw = Arrays.asList(); // List<String> | 
        List<String> authCipherN = Arrays.asList(); // List<String> | 
        List<String> authCipherNic = Arrays.asList(); // List<String> | 
        List<String> authCipherNie = Arrays.asList(); // List<String> | 
        List<String> authCipherNiew = Arrays.asList(); // List<String> | 
        List<String> authCipherNisw = Arrays.asList(); // List<String> | 
        List<String> authCipherRegex = Arrays.asList(); // List<String> | 
        List<String> authPsk = Arrays.asList(); // List<String> | 
        Boolean authPskEmpty = true; // Boolean | 
        List<String> authPskIc = Arrays.asList(); // List<String> | 
        List<String> authPskIe = Arrays.asList(); // List<String> | 
        List<String> authPskIew = Arrays.asList(); // List<String> | 
        List<String> authPskIregex = Arrays.asList(); // List<String> | 
        List<String> authPskIsw = Arrays.asList(); // List<String> | 
        List<String> authPskN = Arrays.asList(); // List<String> | 
        List<String> authPskNic = Arrays.asList(); // List<String> | 
        List<String> authPskNie = Arrays.asList(); // List<String> | 
        List<String> authPskNiew = Arrays.asList(); // List<String> | 
        List<String> authPskNisw = Arrays.asList(); // List<String> | 
        List<String> authPskRegex = Arrays.asList(); // List<String> | 
        List<String> authType = Arrays.asList(); // List<String> | 
        Boolean authTypeEmpty = true; // Boolean | 
        List<String> authTypeIc = Arrays.asList(); // List<String> | 
        List<String> authTypeIe = Arrays.asList(); // List<String> | 
        List<String> authTypeIew = Arrays.asList(); // List<String> | 
        List<String> authTypeIregex = Arrays.asList(); // List<String> | 
        List<String> authTypeIsw = Arrays.asList(); // List<String> | 
        List<String> authTypeN = Arrays.asList(); // List<String> | 
        List<String> authTypeNic = Arrays.asList(); // List<String> | 
        List<String> authTypeNie = Arrays.asList(); // List<String> | 
        List<String> authTypeNiew = Arrays.asList(); // List<String> | 
        List<String> authTypeNisw = Arrays.asList(); // List<String> | 
        List<String> authTypeRegex = Arrays.asList(); // List<String> | 
        List<OffsetDateTime> created = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdEmpty = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdGt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdGte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdLt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdLte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdN = Arrays.asList(); // List<OffsetDateTime> | 
        UUID createdByRequest = UUID.randomUUID(); // UUID | 
        List<String> description = Arrays.asList(); // List<String> | 
        Boolean descriptionEmpty = true; // Boolean | 
        List<String> descriptionIc = Arrays.asList(); // List<String> | 
        List<String> descriptionIe = Arrays.asList(); // List<String> | 
        List<String> descriptionIew = Arrays.asList(); // List<String> | 
        List<String> descriptionIregex = Arrays.asList(); // List<String> | 
        List<String> descriptionIsw = Arrays.asList(); // List<String> | 
        List<String> descriptionN = Arrays.asList(); // List<String> | 
        List<String> descriptionNic = Arrays.asList(); // List<String> | 
        List<String> descriptionNie = Arrays.asList(); // List<String> | 
        List<String> descriptionNiew = Arrays.asList(); // List<String> | 
        List<String> descriptionNisw = Arrays.asList(); // List<String> | 
        List<String> descriptionRegex = Arrays.asList(); // List<String> | 
        List<Double> distance = Arrays.asList(); // List<Double> | 
        Boolean distanceEmpty = true; // Boolean | 
        List<Double> distanceGt = Arrays.asList(); // List<Double> | 
        List<Double> distanceGte = Arrays.asList(); // List<Double> | 
        List<Double> distanceLt = Arrays.asList(); // List<Double> | 
        List<Double> distanceLte = Arrays.asList(); // List<Double> | 
        List<Double> distanceN = Arrays.asList(); // List<Double> | 
        String distanceUnit = "ft"; // String | * `km` - Kilometers * `m` - Meters * `mi` - Miles * `ft` - Feet
        Boolean distanceUnitEmpty = true; // Boolean | 
        List<String> distanceUnitIc = Arrays.asList(); // List<String> | 
        List<String> distanceUnitIe = Arrays.asList(); // List<String> | 
        List<String> distanceUnitIew = Arrays.asList(); // List<String> | 
        List<String> distanceUnitIregex = Arrays.asList(); // List<String> | 
        List<String> distanceUnitIsw = Arrays.asList(); // List<String> | 
        String distanceUnitN = "ft"; // String | * `km` - Kilometers * `m` - Meters * `mi` - Miles * `ft` - Feet
        List<String> distanceUnitNic = Arrays.asList(); // List<String> | 
        List<String> distanceUnitNie = Arrays.asList(); // List<String> | 
        List<String> distanceUnitNiew = Arrays.asList(); // List<String> | 
        List<String> distanceUnitNisw = Arrays.asList(); // List<String> | 
        List<String> distanceUnitRegex = Arrays.asList(); // List<String> | 
        List<Integer> id = Arrays.asList(); // List<Integer> | 
        Boolean idEmpty = true; // Boolean | 
        List<Integer> idGt = Arrays.asList(); // List<Integer> | 
        List<Integer> idGte = Arrays.asList(); // List<Integer> | 
        List<Integer> idLt = Arrays.asList(); // List<Integer> | 
        List<Integer> idLte = Arrays.asList(); // List<Integer> | 
        List<Integer> idN = Arrays.asList(); // List<Integer> | 
        List<Integer> interfaceAId = Arrays.asList(); // List<Integer> | 
        List<Integer> interfaceAIdN = Arrays.asList(); // List<Integer> | 
        List<Integer> interfaceBId = Arrays.asList(); // List<Integer> | 
        List<Integer> interfaceBIdN = Arrays.asList(); // List<Integer> | 
        List<OffsetDateTime> lastUpdated = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedEmpty = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedGt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedGte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedLt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedLte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastUpdatedN = Arrays.asList(); // List<OffsetDateTime> | 
        Integer limit = 56; // Integer | Number of results to return per page.
        UUID modifiedByRequest = UUID.randomUUID(); // UUID | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        List<String> owner = Arrays.asList(); // List<String> | Owner (name)
        List<String> ownerN = Arrays.asList(); // List<String> | Owner (name)
        List<String> ownerGroup = Arrays.asList(); // List<String> | Owner Group (name)
        List<String> ownerGroupN = Arrays.asList(); // List<String> | Owner Group (name)
        List<Integer> ownerGroupId = Arrays.asList(); // List<Integer> | Owner Group (ID)
        List<Integer> ownerGroupIdN = Arrays.asList(); // List<Integer> | Owner Group (ID)
        List<Integer> ownerId = Arrays.asList(); // List<Integer> | Owner (ID)
        List<Integer> ownerIdN = Arrays.asList(); // List<Integer> | Owner (ID)
        String q = "q_example"; // String | Search
        List<String> ssid = Arrays.asList(); // List<String> | 
        Boolean ssidEmpty = true; // Boolean | 
        List<String> ssidIc = Arrays.asList(); // List<String> | 
        List<String> ssidIe = Arrays.asList(); // List<String> | 
        List<String> ssidIew = Arrays.asList(); // List<String> | 
        List<String> ssidIregex = Arrays.asList(); // List<String> | 
        List<String> ssidIsw = Arrays.asList(); // List<String> | 
        List<String> ssidN = Arrays.asList(); // List<String> | 
        List<String> ssidNic = Arrays.asList(); // List<String> | 
        List<String> ssidNie = Arrays.asList(); // List<String> | 
        List<String> ssidNiew = Arrays.asList(); // List<String> | 
        List<String> ssidNisw = Arrays.asList(); // List<String> | 
        List<String> ssidRegex = Arrays.asList(); // List<String> | 
        List<String> status = Arrays.asList(); // List<String> | 
        Boolean statusEmpty = true; // Boolean | 
        List<String> statusIc = Arrays.asList(); // List<String> | 
        List<String> statusIe = Arrays.asList(); // List<String> | 
        List<String> statusIew = Arrays.asList(); // List<String> | 
        List<String> statusIregex = Arrays.asList(); // List<String> | 
        List<String> statusIsw = Arrays.asList(); // List<String> | 
        List<String> statusN = Arrays.asList(); // List<String> | 
        List<String> statusNic = Arrays.asList(); // List<String> | 
        List<String> statusNie = Arrays.asList(); // List<String> | 
        List<String> statusNiew = Arrays.asList(); // List<String> | 
        List<String> statusNisw = Arrays.asList(); // List<String> | 
        List<String> statusRegex = Arrays.asList(); // List<String> | 
        List<String> tag = Arrays.asList(); // List<String> | 
        List<String> tagN = Arrays.asList(); // List<String> | 
        List<String> tagId = Arrays.asList(); // List<String> | 
        List<String> tagIdN = Arrays.asList(); // List<String> | 
        List<String> tenant = Arrays.asList(); // List<String> | Tenant (slug)
        List<String> tenantN = Arrays.asList(); // List<String> | Tenant (slug)
        List<String> tenantGroup = Arrays.asList(); // List<String> | 
        List<String> tenantGroupN = Arrays.asList(); // List<String> | 
        List<String> tenantGroupId = Arrays.asList(); // List<String> | 
        List<String> tenantGroupIdN = Arrays.asList(); // List<String> | 
        List<Integer> tenantId = Arrays.asList(); // List<Integer> | Tenant (ID)
        List<Integer> tenantIdN = Arrays.asList(); // List<Integer> | Tenant (ID)
        UUID updatedByRequest = UUID.randomUUID(); // UUID | 
        try {
            PaginatedWirelessLinkList result = apiInstance.wirelessWirelessLinksList(authCipher, authCipherEmpty, authCipherIc, authCipherIe, authCipherIew, authCipherIregex, authCipherIsw, authCipherN, authCipherNic, authCipherNie, authCipherNiew, authCipherNisw, authCipherRegex, authPsk, authPskEmpty, authPskIc, authPskIe, authPskIew, authPskIregex, authPskIsw, authPskN, authPskNic, authPskNie, authPskNiew, authPskNisw, authPskRegex, authType, authTypeEmpty, authTypeIc, authTypeIe, authTypeIew, authTypeIregex, authTypeIsw, authTypeN, authTypeNic, authTypeNie, authTypeNiew, authTypeNisw, authTypeRegex, created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, description, descriptionEmpty, descriptionIc, descriptionIe, descriptionIew, descriptionIregex, descriptionIsw, descriptionN, descriptionNic, descriptionNie, descriptionNiew, descriptionNisw, descriptionRegex, distance, distanceEmpty, distanceGt, distanceGte, distanceLt, distanceLte, distanceN, distanceUnit, distanceUnitEmpty, distanceUnitIc, distanceUnitIe, distanceUnitIew, distanceUnitIregex, distanceUnitIsw, distanceUnitN, distanceUnitNic, distanceUnitNie, distanceUnitNiew, distanceUnitNisw, distanceUnitRegex, id, idEmpty, idGt, idGte, idLt, idLte, idN, interfaceAId, interfaceAIdN, interfaceBId, interfaceBIdN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, modifiedByRequest, offset, ordering, owner, ownerN, ownerGroup, ownerGroupN, ownerGroupId, ownerGroupIdN, ownerId, ownerIdN, q, ssid, ssidEmpty, ssidIc, ssidIe, ssidIew, ssidIregex, ssidIsw, ssidN, ssidNic, ssidNie, ssidNiew, ssidNisw, ssidRegex, status, statusEmpty, statusIc, statusIe, statusIew, statusIregex, statusIsw, statusN, statusNic, statusNie, statusNiew, statusNisw, statusRegex, tag, tagN, tagId, tagIdN, tenant, tenantN, tenantGroup, tenantGroupN, tenantGroupId, tenantGroupIdN, tenantId, tenantIdN, updatedByRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authCipher** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherEmpty** | **Boolean**|  | [optional] |
| **authCipherIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authCipherRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPsk** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskEmpty** | **Boolean**|  | [optional] |
| **authPskIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authPskRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authType** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeEmpty** | **Boolean**|  | [optional] |
| **authTypeIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **authTypeRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **created** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdEmpty** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdGt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdGte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdLt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdLte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdN** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdByRequest** | **UUID**|  | [optional] |
| **description** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionEmpty** | **Boolean**|  | [optional] |
| **descriptionIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **descriptionRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distance** | [**List&lt;Double&gt;**](Double.md)|  | [optional] |
| **distanceEmpty** | **Boolean**|  | [optional] |
| **distanceGt** | [**List&lt;Double&gt;**](Double.md)|  | [optional] |
| **distanceGte** | [**List&lt;Double&gt;**](Double.md)|  | [optional] |
| **distanceLt** | [**List&lt;Double&gt;**](Double.md)|  | [optional] |
| **distanceLte** | [**List&lt;Double&gt;**](Double.md)|  | [optional] |
| **distanceN** | [**List&lt;Double&gt;**](Double.md)|  | [optional] |
| **distanceUnit** | **String**| * &#x60;km&#x60; - Kilometers * &#x60;m&#x60; - Meters * &#x60;mi&#x60; - Miles * &#x60;ft&#x60; - Feet | [optional] [enum: ft, km, m, mi, null] |
| **distanceUnitEmpty** | **Boolean**|  | [optional] |
| **distanceUnitIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitN** | **String**| * &#x60;km&#x60; - Kilometers * &#x60;m&#x60; - Meters * &#x60;mi&#x60; - Miles * &#x60;ft&#x60; - Feet | [optional] [enum: ft, km, m, mi, null] |
| **distanceUnitNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **distanceUnitRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **id** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idEmpty** | **Boolean**|  | [optional] |
| **idGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **interfaceAId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **interfaceAIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **interfaceBId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **interfaceBIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **lastUpdated** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedEmpty** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedGt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedGte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedLt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedLte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastUpdatedN** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **modifiedByRequest** | **UUID**|  | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **owner** | [**List&lt;String&gt;**](String.md)| Owner (name) | [optional] |
| **ownerN** | [**List&lt;String&gt;**](String.md)| Owner (name) | [optional] |
| **ownerGroup** | [**List&lt;String&gt;**](String.md)| Owner Group (name) | [optional] |
| **ownerGroupN** | [**List&lt;String&gt;**](String.md)| Owner Group (name) | [optional] |
| **ownerGroupId** | [**List&lt;Integer&gt;**](Integer.md)| Owner Group (ID) | [optional] |
| **ownerGroupIdN** | [**List&lt;Integer&gt;**](Integer.md)| Owner Group (ID) | [optional] |
| **ownerId** | [**List&lt;Integer&gt;**](Integer.md)| Owner (ID) | [optional] |
| **ownerIdN** | [**List&lt;Integer&gt;**](Integer.md)| Owner (ID) | [optional] |
| **q** | **String**| Search | [optional] |
| **ssid** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidEmpty** | **Boolean**|  | [optional] |
| **ssidIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **ssidRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusEmpty** | **Boolean**|  | [optional] |
| **statusIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **statusRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenant** | [**List&lt;String&gt;**](String.md)| Tenant (slug) | [optional] |
| **tenantN** | [**List&lt;String&gt;**](String.md)| Tenant (slug) | [optional] |
| **tenantGroup** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenantGroupN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenantGroupId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenantGroupIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tenantId** | [**List&lt;Integer&gt;**](Integer.md)| Tenant (ID) | [optional] |
| **tenantIdN** | [**List&lt;Integer&gt;**](Integer.md)| Tenant (ID) | [optional] |
| **updatedByRequest** | **UUID**|  | [optional] |

### Return type

[**PaginatedWirelessLinkList**](PaginatedWirelessLinkList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLinksPartialUpdate

> WirelessLink wirelessWirelessLinksPartialUpdate(id, patchedWritableWirelessLinkRequest)



Patch a wireless link object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless link.
        PatchedWritableWirelessLinkRequest patchedWritableWirelessLinkRequest = new PatchedWritableWirelessLinkRequest(); // PatchedWritableWirelessLinkRequest | 
        try {
            WirelessLink result = apiInstance.wirelessWirelessLinksPartialUpdate(id, patchedWritableWirelessLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksPartialUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless link. | |
| **patchedWritableWirelessLinkRequest** | [**PatchedWritableWirelessLinkRequest**](PatchedWritableWirelessLinkRequest.md)|  | [optional] |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLinksRetrieve

> WirelessLink wirelessWirelessLinksRetrieve(id)



Get a wireless link object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless link.
        try {
            WirelessLink result = apiInstance.wirelessWirelessLinksRetrieve(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksRetrieve");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless link. | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## wirelessWirelessLinksUpdate

> WirelessLink wirelessWirelessLinksUpdate(id, writableWirelessLinkRequest)



Put a wireless link object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.WirelessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        WirelessApi apiInstance = new WirelessApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this wireless link.
        WritableWirelessLinkRequest writableWirelessLinkRequest = new WritableWirelessLinkRequest(); // WritableWirelessLinkRequest | 
        try {
            WirelessLink result = apiInstance.wirelessWirelessLinksUpdate(id, writableWirelessLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this wireless link. | |
| **writableWirelessLinkRequest** | [**WritableWirelessLinkRequest**](WritableWirelessLinkRequest.md)|  | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

