# CoreApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**coreBackgroundQueuesRetrieve**](CoreApi.md#coreBackgroundQueuesRetrieve) | **GET** api/core/background-queues/ |  |
| [**coreBackgroundQueuesRetrieveByName**](CoreApi.md#coreBackgroundQueuesRetrieveByName) | **GET** api/core/background-queues/{name}/ |  |
| [**coreBackgroundTasksDeleteCreate**](CoreApi.md#coreBackgroundTasksDeleteCreate) | **POST** api/core/background-tasks/{id}/delete/ |  |
| [**coreBackgroundTasksEnqueueCreate**](CoreApi.md#coreBackgroundTasksEnqueueCreate) | **POST** api/core/background-tasks/{id}/enqueue/ |  |
| [**coreBackgroundTasksRequeueCreate**](CoreApi.md#coreBackgroundTasksRequeueCreate) | **POST** api/core/background-tasks/{id}/requeue/ |  |
| [**coreBackgroundTasksRetrieve**](CoreApi.md#coreBackgroundTasksRetrieve) | **GET** api/core/background-tasks/ |  |
| [**coreBackgroundTasksRetrieveById**](CoreApi.md#coreBackgroundTasksRetrieveById) | **GET** api/core/background-tasks/{id}/ |  |
| [**coreBackgroundTasksStopCreate**](CoreApi.md#coreBackgroundTasksStopCreate) | **POST** api/core/background-tasks/{id}/stop/ |  |
| [**coreBackgroundWorkersRetrieve**](CoreApi.md#coreBackgroundWorkersRetrieve) | **GET** api/core/background-workers/ |  |
| [**coreBackgroundWorkersRetrieveByName**](CoreApi.md#coreBackgroundWorkersRetrieveByName) | **GET** api/core/background-workers/{name}/ |  |
| [**coreDataFilesList**](CoreApi.md#coreDataFilesList) | **GET** api/core/data-files/ |  |
| [**coreDataFilesRetrieve**](CoreApi.md#coreDataFilesRetrieve) | **GET** api/core/data-files/{id}/ |  |
| [**coreDataSourcesBulkDestroy**](CoreApi.md#coreDataSourcesBulkDestroy) | **DELETE** api/core/data-sources/ |  |
| [**coreDataSourcesBulkPartialUpdate**](CoreApi.md#coreDataSourcesBulkPartialUpdate) | **PATCH** api/core/data-sources/ |  |
| [**coreDataSourcesBulkUpdate**](CoreApi.md#coreDataSourcesBulkUpdate) | **PUT** api/core/data-sources/ |  |
| [**coreDataSourcesCreate**](CoreApi.md#coreDataSourcesCreate) | **POST** api/core/data-sources/ |  |
| [**coreDataSourcesDestroy**](CoreApi.md#coreDataSourcesDestroy) | **DELETE** api/core/data-sources/{id}/ |  |
| [**coreDataSourcesList**](CoreApi.md#coreDataSourcesList) | **GET** api/core/data-sources/ |  |
| [**coreDataSourcesPartialUpdate**](CoreApi.md#coreDataSourcesPartialUpdate) | **PATCH** api/core/data-sources/{id}/ |  |
| [**coreDataSourcesRetrieve**](CoreApi.md#coreDataSourcesRetrieve) | **GET** api/core/data-sources/{id}/ |  |
| [**coreDataSourcesSyncCreate**](CoreApi.md#coreDataSourcesSyncCreate) | **POST** api/core/data-sources/{id}/sync/ |  |
| [**coreDataSourcesUpdate**](CoreApi.md#coreDataSourcesUpdate) | **PUT** api/core/data-sources/{id}/ |  |
| [**coreJobsList**](CoreApi.md#coreJobsList) | **GET** api/core/jobs/ |  |
| [**coreJobsRetrieve**](CoreApi.md#coreJobsRetrieve) | **GET** api/core/jobs/{id}/ |  |
| [**coreObjectChangesList**](CoreApi.md#coreObjectChangesList) | **GET** api/core/object-changes/ |  |
| [**coreObjectChangesRetrieve**](CoreApi.md#coreObjectChangesRetrieve) | **GET** api/core/object-changes/{id}/ |  |
| [**coreObjectTypesList**](CoreApi.md#coreObjectTypesList) | **GET** api/core/object-types/ |  |
| [**coreObjectTypesRetrieve**](CoreApi.md#coreObjectTypesRetrieve) | **GET** api/core/object-types/{id}/ |  |



## coreBackgroundQueuesRetrieve

> Map&lt;String, Object&gt; coreBackgroundQueuesRetrieve()



Retrieve a list of RQ Queues. Note: Queue names are not URL safe, so not returning a detail view.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        try {
            Map<String, Object> result = apiInstance.coreBackgroundQueuesRetrieve();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundQueuesRetrieve");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundQueuesRetrieveByName

> Map&lt;String, Object&gt; coreBackgroundQueuesRetrieveByName(name)



Retrieve a list of RQ Queues. Note: Queue names are not URL safe, so not returning a detail view.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            Map<String, Object> result = apiInstance.coreBackgroundQueuesRetrieveByName(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundQueuesRetrieveByName");
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
| **name** | **String**|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundTasksDeleteCreate

> BackgroundTask coreBackgroundTasksDeleteCreate(id, backgroundTaskRequest)



Retrieve a list of RQ Tasks.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        String id = "id_example"; // String | 
        BackgroundTaskRequest backgroundTaskRequest = new BackgroundTaskRequest(); // BackgroundTaskRequest | 
        try {
            BackgroundTask result = apiInstance.coreBackgroundTasksDeleteCreate(id, backgroundTaskRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundTasksDeleteCreate");
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
| **id** | **String**|  | |
| **backgroundTaskRequest** | [**BackgroundTaskRequest**](BackgroundTaskRequest.md)|  | |

### Return type

[**BackgroundTask**](BackgroundTask.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundTasksEnqueueCreate

> BackgroundTask coreBackgroundTasksEnqueueCreate(id, backgroundTaskRequest)



Retrieve a list of RQ Tasks.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        String id = "id_example"; // String | 
        BackgroundTaskRequest backgroundTaskRequest = new BackgroundTaskRequest(); // BackgroundTaskRequest | 
        try {
            BackgroundTask result = apiInstance.coreBackgroundTasksEnqueueCreate(id, backgroundTaskRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundTasksEnqueueCreate");
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
| **id** | **String**|  | |
| **backgroundTaskRequest** | [**BackgroundTaskRequest**](BackgroundTaskRequest.md)|  | |

### Return type

[**BackgroundTask**](BackgroundTask.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundTasksRequeueCreate

> BackgroundTask coreBackgroundTasksRequeueCreate(id, backgroundTaskRequest)



Retrieve a list of RQ Tasks.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        String id = "id_example"; // String | 
        BackgroundTaskRequest backgroundTaskRequest = new BackgroundTaskRequest(); // BackgroundTaskRequest | 
        try {
            BackgroundTask result = apiInstance.coreBackgroundTasksRequeueCreate(id, backgroundTaskRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundTasksRequeueCreate");
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
| **id** | **String**|  | |
| **backgroundTaskRequest** | [**BackgroundTaskRequest**](BackgroundTaskRequest.md)|  | |

### Return type

[**BackgroundTask**](BackgroundTask.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundTasksRetrieve

> Map&lt;String, Object&gt; coreBackgroundTasksRetrieve()



Retrieve a list of RQ Tasks.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        try {
            Map<String, Object> result = apiInstance.coreBackgroundTasksRetrieve();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundTasksRetrieve");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundTasksRetrieveById

> Map&lt;String, Object&gt; coreBackgroundTasksRetrieveById(id)



Retrieve a list of RQ Tasks.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Map<String, Object> result = apiInstance.coreBackgroundTasksRetrieveById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundTasksRetrieveById");
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
| **id** | **String**|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundTasksStopCreate

> BackgroundTask coreBackgroundTasksStopCreate(id, backgroundTaskRequest)



Retrieve a list of RQ Tasks.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        String id = "id_example"; // String | 
        BackgroundTaskRequest backgroundTaskRequest = new BackgroundTaskRequest(); // BackgroundTaskRequest | 
        try {
            BackgroundTask result = apiInstance.coreBackgroundTasksStopCreate(id, backgroundTaskRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundTasksStopCreate");
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
| **id** | **String**|  | |
| **backgroundTaskRequest** | [**BackgroundTaskRequest**](BackgroundTaskRequest.md)|  | |

### Return type

[**BackgroundTask**](BackgroundTask.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundWorkersRetrieve

> Map&lt;String, Object&gt; coreBackgroundWorkersRetrieve()



Retrieve a list of RQ Workers.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        try {
            Map<String, Object> result = apiInstance.coreBackgroundWorkersRetrieve();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundWorkersRetrieve");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreBackgroundWorkersRetrieveByName

> Map&lt;String, Object&gt; coreBackgroundWorkersRetrieveByName(name)



Retrieve a list of RQ Workers.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            Map<String, Object> result = apiInstance.coreBackgroundWorkersRetrieveByName(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreBackgroundWorkersRetrieveByName");
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
| **name** | **String**|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataFilesList

> PaginatedDataFileList coreDataFilesList(created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, hash, hashEmpty, hashIc, hashIe, hashIew, hashIregex, hashIsw, hashN, hashNic, hashNie, hashNiew, hashNisw, hashRegex, id, idEmpty, idGt, idGte, idLt, idLte, idN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, modifiedByRequest, offset, ordering, path, pathEmpty, pathIc, pathIe, pathIew, pathIregex, pathIsw, pathN, pathNic, pathNie, pathNiew, pathNisw, pathRegex, q, size, sizeEmpty, sizeGt, sizeGte, sizeLt, sizeLte, sizeN, source, sourceN, sourceId, sourceIdN, updatedByRequest)



Get a list of data file objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        List<OffsetDateTime> created = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdEmpty = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdGt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdGte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdLt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdLte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> createdN = Arrays.asList(); // List<OffsetDateTime> | 
        UUID createdByRequest = UUID.randomUUID(); // UUID | 
        List<String> hash = Arrays.asList(); // List<String> | 
        Boolean hashEmpty = true; // Boolean | 
        List<String> hashIc = Arrays.asList(); // List<String> | 
        List<String> hashIe = Arrays.asList(); // List<String> | 
        List<String> hashIew = Arrays.asList(); // List<String> | 
        List<String> hashIregex = Arrays.asList(); // List<String> | 
        List<String> hashIsw = Arrays.asList(); // List<String> | 
        List<String> hashN = Arrays.asList(); // List<String> | 
        List<String> hashNic = Arrays.asList(); // List<String> | 
        List<String> hashNie = Arrays.asList(); // List<String> | 
        List<String> hashNiew = Arrays.asList(); // List<String> | 
        List<String> hashNisw = Arrays.asList(); // List<String> | 
        List<String> hashRegex = Arrays.asList(); // List<String> | 
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
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        List<String> path = Arrays.asList(); // List<String> | 
        Boolean pathEmpty = true; // Boolean | 
        List<String> pathIc = Arrays.asList(); // List<String> | 
        List<String> pathIe = Arrays.asList(); // List<String> | 
        List<String> pathIew = Arrays.asList(); // List<String> | 
        List<String> pathIregex = Arrays.asList(); // List<String> | 
        List<String> pathIsw = Arrays.asList(); // List<String> | 
        List<String> pathN = Arrays.asList(); // List<String> | 
        List<String> pathNic = Arrays.asList(); // List<String> | 
        List<String> pathNie = Arrays.asList(); // List<String> | 
        List<String> pathNiew = Arrays.asList(); // List<String> | 
        List<String> pathNisw = Arrays.asList(); // List<String> | 
        List<String> pathRegex = Arrays.asList(); // List<String> | 
        String q = "q_example"; // String | 
        List<Integer> size = Arrays.asList(); // List<Integer> | 
        Boolean sizeEmpty = true; // Boolean | 
        List<Integer> sizeGt = Arrays.asList(); // List<Integer> | 
        List<Integer> sizeGte = Arrays.asList(); // List<Integer> | 
        List<Integer> sizeLt = Arrays.asList(); // List<Integer> | 
        List<Integer> sizeLte = Arrays.asList(); // List<Integer> | 
        List<Integer> sizeN = Arrays.asList(); // List<Integer> | 
        List<String> source = Arrays.asList(); // List<String> | Data source (name)
        List<String> sourceN = Arrays.asList(); // List<String> | Data source (name)
        List<Integer> sourceId = Arrays.asList(); // List<Integer> | Data source (ID)
        List<Integer> sourceIdN = Arrays.asList(); // List<Integer> | Data source (ID)
        UUID updatedByRequest = UUID.randomUUID(); // UUID | 
        try {
            PaginatedDataFileList result = apiInstance.coreDataFilesList(created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, hash, hashEmpty, hashIc, hashIe, hashIew, hashIregex, hashIsw, hashN, hashNic, hashNie, hashNiew, hashNisw, hashRegex, id, idEmpty, idGt, idGte, idLt, idLte, idN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, modifiedByRequest, offset, ordering, path, pathEmpty, pathIc, pathIe, pathIew, pathIregex, pathIsw, pathN, pathNic, pathNie, pathNiew, pathNisw, pathRegex, q, size, sizeEmpty, sizeGt, sizeGte, sizeLt, sizeLte, sizeN, source, sourceN, sourceId, sourceIdN, updatedByRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataFilesList");
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
| **created** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdEmpty** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdGt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdGte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdLt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdLte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdN** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **createdByRequest** | **UUID**|  | [optional] |
| **hash** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashEmpty** | **Boolean**|  | [optional] |
| **hashIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **hashRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
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
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **path** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathEmpty** | **Boolean**|  | [optional] |
| **pathIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pathRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **q** | **String**|  | [optional] |
| **size** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **sizeEmpty** | **Boolean**|  | [optional] |
| **sizeGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **sizeGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **sizeLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **sizeLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **sizeN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **source** | [**List&lt;String&gt;**](String.md)| Data source (name) | [optional] |
| **sourceN** | [**List&lt;String&gt;**](String.md)| Data source (name) | [optional] |
| **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| Data source (ID) | [optional] |
| **sourceIdN** | [**List&lt;Integer&gt;**](Integer.md)| Data source (ID) | [optional] |
| **updatedByRequest** | **UUID**|  | [optional] |

### Return type

[**PaginatedDataFileList**](PaginatedDataFileList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataFilesRetrieve

> DataFile coreDataFilesRetrieve(id)



Get a data file object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this data file.
        try {
            DataFile result = apiInstance.coreDataFilesRetrieve(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataFilesRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this data file. | |

### Return type

[**DataFile**](DataFile.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataSourcesBulkDestroy

> coreDataSourcesBulkDestroy(dataSourceRequest)



Delete a list of data source objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        List<DataSourceRequest> dataSourceRequest = Arrays.asList(); // List<DataSourceRequest> | 
        try {
            apiInstance.coreDataSourcesBulkDestroy(dataSourceRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesBulkDestroy");
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
| **dataSourceRequest** | [**List&lt;DataSourceRequest&gt;**](DataSourceRequest.md)|  | |

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


## coreDataSourcesBulkPartialUpdate

> List&lt;DataSource&gt; coreDataSourcesBulkPartialUpdate(dataSourceRequest)



Patch a list of data source objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        List<DataSourceRequest> dataSourceRequest = Arrays.asList(); // List<DataSourceRequest> | 
        try {
            List<DataSource> result = apiInstance.coreDataSourcesBulkPartialUpdate(dataSourceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesBulkPartialUpdate");
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
| **dataSourceRequest** | [**List&lt;DataSourceRequest&gt;**](DataSourceRequest.md)|  | |

### Return type

[**List&lt;DataSource&gt;**](DataSource.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataSourcesBulkUpdate

> List&lt;DataSource&gt; coreDataSourcesBulkUpdate(dataSourceRequest)



Put a list of data source objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        List<DataSourceRequest> dataSourceRequest = Arrays.asList(); // List<DataSourceRequest> | 
        try {
            List<DataSource> result = apiInstance.coreDataSourcesBulkUpdate(dataSourceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesBulkUpdate");
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
| **dataSourceRequest** | [**List&lt;DataSourceRequest&gt;**](DataSourceRequest.md)|  | |

### Return type

[**List&lt;DataSource&gt;**](DataSource.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataSourcesCreate

> DataSource coreDataSourcesCreate(coreDataSourcesCreateRequest)



Post a list of data source objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        CoreDataSourcesCreateRequest coreDataSourcesCreateRequest = new CoreDataSourcesCreateRequest(); // CoreDataSourcesCreateRequest | 
        try {
            DataSource result = apiInstance.coreDataSourcesCreate(coreDataSourcesCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesCreate");
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
| **coreDataSourcesCreateRequest** | [**CoreDataSourcesCreateRequest**](CoreDataSourcesCreateRequest.md)|  | |

### Return type

[**DataSource**](DataSource.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## coreDataSourcesDestroy

> coreDataSourcesDestroy(id)



Delete a data source object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this data source.
        try {
            apiInstance.coreDataSourcesDestroy(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesDestroy");
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
| **id** | **Integer**| A unique integer value identifying this data source. | |

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


## coreDataSourcesList

> PaginatedDataSourceList coreDataSourcesList(created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, description, descriptionEmpty, descriptionIc, descriptionIe, descriptionIew, descriptionIregex, descriptionIsw, descriptionN, descriptionNic, descriptionNie, descriptionNiew, descriptionNisw, descriptionRegex, enabled, id, idEmpty, idGt, idGte, idLt, idLte, idN, lastSynced, lastSyncedEmpty, lastSyncedGt, lastSyncedGte, lastSyncedLt, lastSyncedLte, lastSyncedN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, modifiedByRequest, name, nameEmpty, nameIc, nameIe, nameIew, nameIregex, nameIsw, nameN, nameNic, nameNie, nameNiew, nameNisw, nameRegex, offset, ordering, owner, ownerN, ownerGroup, ownerGroupN, ownerGroupId, ownerGroupIdN, ownerId, ownerIdN, q, sourceUrl, sourceUrlEmpty, sourceUrlIc, sourceUrlIe, sourceUrlIew, sourceUrlIregex, sourceUrlIsw, sourceUrlN, sourceUrlNic, sourceUrlNie, sourceUrlNiew, sourceUrlNisw, sourceUrlRegex, status, statusEmpty, statusIc, statusIe, statusIew, statusIregex, statusIsw, statusN, statusNic, statusNie, statusNiew, statusNisw, statusRegex, syncInterval, syncIntervalIc, syncIntervalIe, syncIntervalIew, syncIntervalIregex, syncIntervalIsw, syncIntervalN, syncIntervalNic, syncIntervalNie, syncIntervalNiew, syncIntervalNisw, syncIntervalRegex, tag, tagN, tagId, tagIdN, type, typeEmpty, typeIc, typeIe, typeIew, typeIregex, typeIsw, typeN, typeNic, typeNie, typeNiew, typeNisw, typeRegex, updatedByRequest)



Get a list of data source objects.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
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
        Boolean enabled = true; // Boolean | 
        List<Integer> id = Arrays.asList(); // List<Integer> | 
        Boolean idEmpty = true; // Boolean | 
        List<Integer> idGt = Arrays.asList(); // List<Integer> | 
        List<Integer> idGte = Arrays.asList(); // List<Integer> | 
        List<Integer> idLt = Arrays.asList(); // List<Integer> | 
        List<Integer> idLte = Arrays.asList(); // List<Integer> | 
        List<Integer> idN = Arrays.asList(); // List<Integer> | 
        List<OffsetDateTime> lastSynced = Arrays.asList(); // List<OffsetDateTime> | 
        Boolean lastSyncedEmpty = true; // Boolean | 
        List<OffsetDateTime> lastSyncedGt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastSyncedGte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastSyncedLt = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastSyncedLte = Arrays.asList(); // List<OffsetDateTime> | 
        List<OffsetDateTime> lastSyncedN = Arrays.asList(); // List<OffsetDateTime> | 
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
        String q = "q_example"; // String | Search
        List<String> sourceUrl = Arrays.asList(); // List<String> | 
        Boolean sourceUrlEmpty = true; // Boolean | 
        List<String> sourceUrlIc = Arrays.asList(); // List<String> | 
        List<String> sourceUrlIe = Arrays.asList(); // List<String> | 
        List<String> sourceUrlIew = Arrays.asList(); // List<String> | 
        List<String> sourceUrlIregex = Arrays.asList(); // List<String> | 
        List<String> sourceUrlIsw = Arrays.asList(); // List<String> | 
        List<String> sourceUrlN = Arrays.asList(); // List<String> | 
        List<String> sourceUrlNic = Arrays.asList(); // List<String> | 
        List<String> sourceUrlNie = Arrays.asList(); // List<String> | 
        List<String> sourceUrlNiew = Arrays.asList(); // List<String> | 
        List<String> sourceUrlNisw = Arrays.asList(); // List<String> | 
        List<String> sourceUrlRegex = Arrays.asList(); // List<String> | 
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
        List<Integer> syncInterval = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalIc = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalIe = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalIew = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalIregex = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalIsw = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalN = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalNic = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalNie = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalNiew = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalNisw = Arrays.asList(); // List<Integer> | 
        List<Integer> syncIntervalRegex = Arrays.asList(); // List<Integer> | 
        List<String> tag = Arrays.asList(); // List<String> | 
        List<String> tagN = Arrays.asList(); // List<String> | 
        List<String> tagId = Arrays.asList(); // List<String> | 
        List<String> tagIdN = Arrays.asList(); // List<String> | 
        List<String> type = Arrays.asList(); // List<String> | 
        Boolean typeEmpty = true; // Boolean | 
        List<String> typeIc = Arrays.asList(); // List<String> | 
        List<String> typeIe = Arrays.asList(); // List<String> | 
        List<String> typeIew = Arrays.asList(); // List<String> | 
        List<String> typeIregex = Arrays.asList(); // List<String> | 
        List<String> typeIsw = Arrays.asList(); // List<String> | 
        List<String> typeN = Arrays.asList(); // List<String> | 
        List<String> typeNic = Arrays.asList(); // List<String> | 
        List<String> typeNie = Arrays.asList(); // List<String> | 
        List<String> typeNiew = Arrays.asList(); // List<String> | 
        List<String> typeNisw = Arrays.asList(); // List<String> | 
        List<String> typeRegex = Arrays.asList(); // List<String> | 
        UUID updatedByRequest = UUID.randomUUID(); // UUID | 
        try {
            PaginatedDataSourceList result = apiInstance.coreDataSourcesList(created, createdEmpty, createdGt, createdGte, createdLt, createdLte, createdN, createdByRequest, description, descriptionEmpty, descriptionIc, descriptionIe, descriptionIew, descriptionIregex, descriptionIsw, descriptionN, descriptionNic, descriptionNie, descriptionNiew, descriptionNisw, descriptionRegex, enabled, id, idEmpty, idGt, idGte, idLt, idLte, idN, lastSynced, lastSyncedEmpty, lastSyncedGt, lastSyncedGte, lastSyncedLt, lastSyncedLte, lastSyncedN, lastUpdated, lastUpdatedEmpty, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, lastUpdatedN, limit, modifiedByRequest, name, nameEmpty, nameIc, nameIe, nameIew, nameIregex, nameIsw, nameN, nameNic, nameNie, nameNiew, nameNisw, nameRegex, offset, ordering, owner, ownerN, ownerGroup, ownerGroupN, ownerGroupId, ownerGroupIdN, ownerId, ownerIdN, q, sourceUrl, sourceUrlEmpty, sourceUrlIc, sourceUrlIe, sourceUrlIew, sourceUrlIregex, sourceUrlIsw, sourceUrlN, sourceUrlNic, sourceUrlNie, sourceUrlNiew, sourceUrlNisw, sourceUrlRegex, status, statusEmpty, statusIc, statusIe, statusIew, statusIregex, statusIsw, statusN, statusNic, statusNie, statusNiew, statusNisw, statusRegex, syncInterval, syncIntervalIc, syncIntervalIe, syncIntervalIew, syncIntervalIregex, syncIntervalIsw, syncIntervalN, syncIntervalNic, syncIntervalNie, syncIntervalNiew, syncIntervalNisw, syncIntervalRegex, tag, tagN, tagId, tagIdN, type, typeEmpty, typeIc, typeIe, typeIew, typeIregex, typeIsw, typeN, typeNic, typeNie, typeNiew, typeNisw, typeRegex, updatedByRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesList");
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
| **enabled** | **Boolean**|  | [optional] |
| **id** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idEmpty** | **Boolean**|  | [optional] |
| **idGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **lastSynced** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastSyncedEmpty** | **Boolean**|  | [optional] |
| **lastSyncedGt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastSyncedGte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastSyncedLt** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastSyncedLte** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **lastSyncedN** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
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
| **q** | **String**| Search | [optional] |
| **sourceUrl** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlEmpty** | **Boolean**|  | [optional] |
| **sourceUrlIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sourceUrlRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
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
| **syncInterval** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalIc** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalIe** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalIew** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalIregex** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalIsw** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalNic** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalNie** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalNiew** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalNisw** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **syncIntervalRegex** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **tagIdN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **type** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeEmpty** | **Boolean**|  | [optional] |
| **typeIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **typeRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **updatedByRequest** | **UUID**|  | [optional] |

### Return type

[**PaginatedDataSourceList**](PaginatedDataSourceList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataSourcesPartialUpdate

> DataSource coreDataSourcesPartialUpdate(id, patchedWritableDataSourceRequest)



Patch a data source object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this data source.
        PatchedWritableDataSourceRequest patchedWritableDataSourceRequest = new PatchedWritableDataSourceRequest(); // PatchedWritableDataSourceRequest | 
        try {
            DataSource result = apiInstance.coreDataSourcesPartialUpdate(id, patchedWritableDataSourceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this data source. | |
| **patchedWritableDataSourceRequest** | [**PatchedWritableDataSourceRequest**](PatchedWritableDataSourceRequest.md)|  | [optional] |

### Return type

[**DataSource**](DataSource.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataSourcesRetrieve

> DataSource coreDataSourcesRetrieve(id)



Get a data source object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this data source.
        try {
            DataSource result = apiInstance.coreDataSourcesRetrieve(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this data source. | |

### Return type

[**DataSource**](DataSource.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataSourcesSyncCreate

> DataSource coreDataSourcesSyncCreate(id, writableDataSourceRequest)



Enqueue a job to synchronize the DataSource.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this data source.
        WritableDataSourceRequest writableDataSourceRequest = new WritableDataSourceRequest(); // WritableDataSourceRequest | 
        try {
            DataSource result = apiInstance.coreDataSourcesSyncCreate(id, writableDataSourceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesSyncCreate");
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
| **id** | **Integer**| A unique integer value identifying this data source. | |
| **writableDataSourceRequest** | [**WritableDataSourceRequest**](WritableDataSourceRequest.md)|  | |

### Return type

[**DataSource**](DataSource.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreDataSourcesUpdate

> DataSource coreDataSourcesUpdate(id, writableDataSourceRequest)



Put a data source object.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this data source.
        WritableDataSourceRequest writableDataSourceRequest = new WritableDataSourceRequest(); // WritableDataSourceRequest | 
        try {
            DataSource result = apiInstance.coreDataSourcesUpdate(id, writableDataSourceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreDataSourcesUpdate");
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
| **id** | **Integer**| A unique integer value identifying this data source. | |
| **writableDataSourceRequest** | [**WritableDataSourceRequest**](WritableDataSourceRequest.md)|  | |

### Return type

[**DataSource**](DataSource.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreJobsList

> PaginatedJobList coreJobsList(completed, completedAfter, completedBefore, created, createdAfter, createdBefore, id, idEmpty, idGt, idGte, idLt, idLte, idN, interval, intervalEmpty, intervalGt, intervalGte, intervalLt, intervalLte, intervalN, jobId, limit, name, nameEmpty, nameIc, nameIe, nameIew, nameIregex, nameIsw, nameN, nameNic, nameNie, nameNiew, nameNisw, nameRegex, objectId, objectIdEmpty, objectIdGt, objectIdGte, objectIdLt, objectIdLte, objectIdN, objectType, objectTypeN, objectTypeId, objectTypeIdN, offset, ordering, q, queueName, queueNameEmpty, queueNameIc, queueNameIe, queueNameIew, queueNameIregex, queueNameIsw, queueNameN, queueNameNic, queueNameNie, queueNameNiew, queueNameNisw, queueNameRegex, scheduled, scheduledAfter, scheduledBefore, started, startedAfter, startedBefore, status, statusEmpty, statusIc, statusIe, statusIew, statusIregex, statusIsw, statusN, statusNic, statusNie, statusNiew, statusNisw, statusRegex, user, userN)



Retrieve a list of job results

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        OffsetDateTime completed = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime completedAfter = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime completedBefore = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | 
        List<Integer> id = Arrays.asList(); // List<Integer> | 
        Boolean idEmpty = true; // Boolean | 
        List<Integer> idGt = Arrays.asList(); // List<Integer> | 
        List<Integer> idGte = Arrays.asList(); // List<Integer> | 
        List<Integer> idLt = Arrays.asList(); // List<Integer> | 
        List<Integer> idLte = Arrays.asList(); // List<Integer> | 
        List<Integer> idN = Arrays.asList(); // List<Integer> | 
        List<Integer> interval = Arrays.asList(); // List<Integer> | 
        Boolean intervalEmpty = true; // Boolean | 
        List<Integer> intervalGt = Arrays.asList(); // List<Integer> | 
        List<Integer> intervalGte = Arrays.asList(); // List<Integer> | 
        List<Integer> intervalLt = Arrays.asList(); // List<Integer> | 
        List<Integer> intervalLte = Arrays.asList(); // List<Integer> | 
        List<Integer> intervalN = Arrays.asList(); // List<Integer> | 
        UUID jobId = UUID.randomUUID(); // UUID | 
        Integer limit = 56; // Integer | Number of results to return per page.
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
        List<Integer> objectId = Arrays.asList(); // List<Integer> | 
        Boolean objectIdEmpty = true; // Boolean | 
        List<Integer> objectIdGt = Arrays.asList(); // List<Integer> | 
        List<Integer> objectIdGte = Arrays.asList(); // List<Integer> | 
        List<Integer> objectIdLt = Arrays.asList(); // List<Integer> | 
        List<Integer> objectIdLte = Arrays.asList(); // List<Integer> | 
        List<Integer> objectIdN = Arrays.asList(); // List<Integer> | 
        String objectType = "objectType_example"; // String | 
        String objectTypeN = "objectTypeN_example"; // String | 
        List<Integer> objectTypeId = Arrays.asList(); // List<Integer> | 
        List<Integer> objectTypeIdN = Arrays.asList(); // List<Integer> | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String q = "q_example"; // String | Search
        String queueName = "queueName_example"; // String | 
        Boolean queueNameEmpty = true; // Boolean | 
        String queueNameIc = "queueNameIc_example"; // String | 
        String queueNameIe = "queueNameIe_example"; // String | 
        String queueNameIew = "queueNameIew_example"; // String | 
        String queueNameIregex = "queueNameIregex_example"; // String | 
        String queueNameIsw = "queueNameIsw_example"; // String | 
        String queueNameN = "queueNameN_example"; // String | 
        String queueNameNic = "queueNameNic_example"; // String | 
        String queueNameNie = "queueNameNie_example"; // String | 
        String queueNameNiew = "queueNameNiew_example"; // String | 
        String queueNameNisw = "queueNameNisw_example"; // String | 
        String queueNameRegex = "queueNameRegex_example"; // String | 
        OffsetDateTime scheduled = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime scheduledAfter = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime scheduledBefore = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime started = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime startedAfter = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime startedBefore = OffsetDateTime.now(); // OffsetDateTime | 
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
        Integer user = 56; // Integer | 
        Integer userN = 56; // Integer | 
        try {
            PaginatedJobList result = apiInstance.coreJobsList(completed, completedAfter, completedBefore, created, createdAfter, createdBefore, id, idEmpty, idGt, idGte, idLt, idLte, idN, interval, intervalEmpty, intervalGt, intervalGte, intervalLt, intervalLte, intervalN, jobId, limit, name, nameEmpty, nameIc, nameIe, nameIew, nameIregex, nameIsw, nameN, nameNic, nameNie, nameNiew, nameNisw, nameRegex, objectId, objectIdEmpty, objectIdGt, objectIdGte, objectIdLt, objectIdLte, objectIdN, objectType, objectTypeN, objectTypeId, objectTypeIdN, offset, ordering, q, queueName, queueNameEmpty, queueNameIc, queueNameIe, queueNameIew, queueNameIregex, queueNameIsw, queueNameN, queueNameNic, queueNameNie, queueNameNiew, queueNameNisw, queueNameRegex, scheduled, scheduledAfter, scheduledBefore, started, startedAfter, startedBefore, status, statusEmpty, statusIc, statusIe, statusIew, statusIregex, statusIsw, statusN, statusNic, statusNie, statusNiew, statusNisw, statusRegex, user, userN);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreJobsList");
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
| **completed** | **OffsetDateTime**|  | [optional] |
| **completedAfter** | **OffsetDateTime**|  | [optional] |
| **completedBefore** | **OffsetDateTime**|  | [optional] |
| **created** | **OffsetDateTime**|  | [optional] |
| **createdAfter** | **OffsetDateTime**|  | [optional] |
| **createdBefore** | **OffsetDateTime**|  | [optional] |
| **id** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idEmpty** | **Boolean**|  | [optional] |
| **idGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **interval** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **intervalEmpty** | **Boolean**|  | [optional] |
| **intervalGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **intervalGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **intervalLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **intervalLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **intervalN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **jobId** | **UUID**|  | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
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
| **objectId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **objectIdEmpty** | **Boolean**|  | [optional] |
| **objectIdGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **objectIdGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **objectIdLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **objectIdLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **objectIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **objectType** | **String**|  | [optional] |
| **objectTypeN** | **String**|  | [optional] |
| **objectTypeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **objectTypeIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **q** | **String**| Search | [optional] |
| **queueName** | **String**|  | [optional] |
| **queueNameEmpty** | **Boolean**|  | [optional] |
| **queueNameIc** | **String**|  | [optional] |
| **queueNameIe** | **String**|  | [optional] |
| **queueNameIew** | **String**|  | [optional] |
| **queueNameIregex** | **String**|  | [optional] |
| **queueNameIsw** | **String**|  | [optional] |
| **queueNameN** | **String**|  | [optional] |
| **queueNameNic** | **String**|  | [optional] |
| **queueNameNie** | **String**|  | [optional] |
| **queueNameNiew** | **String**|  | [optional] |
| **queueNameNisw** | **String**|  | [optional] |
| **queueNameRegex** | **String**|  | [optional] |
| **scheduled** | **OffsetDateTime**|  | [optional] |
| **scheduledAfter** | **OffsetDateTime**|  | [optional] |
| **scheduledBefore** | **OffsetDateTime**|  | [optional] |
| **started** | **OffsetDateTime**|  | [optional] |
| **startedAfter** | **OffsetDateTime**|  | [optional] |
| **startedBefore** | **OffsetDateTime**|  | [optional] |
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
| **user** | **Integer**|  | [optional] |
| **userN** | **Integer**|  | [optional] |

### Return type

[**PaginatedJobList**](PaginatedJobList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreJobsRetrieve

> Job coreJobsRetrieve(id)



Retrieve a list of job results

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this job.
        try {
            Job result = apiInstance.coreJobsRetrieve(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreJobsRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this job. | |

### Return type

[**Job**](Job.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreObjectChangesList

> PaginatedObjectChangeList coreObjectChangesList(action, actionEmpty, actionIc, actionIe, actionIew, actionIregex, actionIsw, actionN, actionNic, actionNie, actionNiew, actionNisw, actionRegex, changedObjectId, changedObjectIdEmpty, changedObjectIdGt, changedObjectIdGte, changedObjectIdLt, changedObjectIdLte, changedObjectIdN, changedObjectType, changedObjectTypeN, changedObjectTypeId, changedObjectTypeIdN, id, idEmpty, idGt, idGte, idLt, idLte, idN, limit, objectRepr, objectReprEmpty, objectReprIc, objectReprIe, objectReprIew, objectReprIregex, objectReprIsw, objectReprN, objectReprNic, objectReprNie, objectReprNiew, objectReprNisw, objectReprRegex, offset, ordering, q, relatedObjectId, relatedObjectIdEmpty, relatedObjectIdGt, relatedObjectIdGte, relatedObjectIdLt, relatedObjectIdLte, relatedObjectIdN, relatedObjectType, relatedObjectTypeN, requestId, timeAfter, timeBefore, user, userN, userId, userIdN, userName, userNameEmpty, userNameIc, userNameIe, userNameIew, userNameIregex, userNameIsw, userNameN, userNameNic, userNameNie, userNameNiew, userNameNisw, userNameRegex)



Retrieve a list of recent changes.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        String action = "create"; // String | * `create` - Created * `update` - Updated * `delete` - Deleted
        Boolean actionEmpty = true; // Boolean | 
        List<String> actionIc = Arrays.asList(); // List<String> | 
        List<String> actionIe = Arrays.asList(); // List<String> | 
        List<String> actionIew = Arrays.asList(); // List<String> | 
        List<String> actionIregex = Arrays.asList(); // List<String> | 
        List<String> actionIsw = Arrays.asList(); // List<String> | 
        String actionN = "create"; // String | * `create` - Created * `update` - Updated * `delete` - Deleted
        List<String> actionNic = Arrays.asList(); // List<String> | 
        List<String> actionNie = Arrays.asList(); // List<String> | 
        List<String> actionNiew = Arrays.asList(); // List<String> | 
        List<String> actionNisw = Arrays.asList(); // List<String> | 
        List<String> actionRegex = Arrays.asList(); // List<String> | 
        List<Integer> changedObjectId = Arrays.asList(); // List<Integer> | 
        Boolean changedObjectIdEmpty = true; // Boolean | 
        List<Integer> changedObjectIdGt = Arrays.asList(); // List<Integer> | 
        List<Integer> changedObjectIdGte = Arrays.asList(); // List<Integer> | 
        List<Integer> changedObjectIdLt = Arrays.asList(); // List<Integer> | 
        List<Integer> changedObjectIdLte = Arrays.asList(); // List<Integer> | 
        List<Integer> changedObjectIdN = Arrays.asList(); // List<Integer> | 
        String changedObjectType = "changedObjectType_example"; // String | 
        String changedObjectTypeN = "changedObjectTypeN_example"; // String | 
        List<Integer> changedObjectTypeId = Arrays.asList(); // List<Integer> | 
        List<Integer> changedObjectTypeIdN = Arrays.asList(); // List<Integer> | 
        List<Integer> id = Arrays.asList(); // List<Integer> | 
        Boolean idEmpty = true; // Boolean | 
        List<Integer> idGt = Arrays.asList(); // List<Integer> | 
        List<Integer> idGte = Arrays.asList(); // List<Integer> | 
        List<Integer> idLt = Arrays.asList(); // List<Integer> | 
        List<Integer> idLte = Arrays.asList(); // List<Integer> | 
        List<Integer> idN = Arrays.asList(); // List<Integer> | 
        Integer limit = 56; // Integer | Number of results to return per page.
        List<String> objectRepr = Arrays.asList(); // List<String> | 
        Boolean objectReprEmpty = true; // Boolean | 
        List<String> objectReprIc = Arrays.asList(); // List<String> | 
        List<String> objectReprIe = Arrays.asList(); // List<String> | 
        List<String> objectReprIew = Arrays.asList(); // List<String> | 
        List<String> objectReprIregex = Arrays.asList(); // List<String> | 
        List<String> objectReprIsw = Arrays.asList(); // List<String> | 
        List<String> objectReprN = Arrays.asList(); // List<String> | 
        List<String> objectReprNic = Arrays.asList(); // List<String> | 
        List<String> objectReprNie = Arrays.asList(); // List<String> | 
        List<String> objectReprNiew = Arrays.asList(); // List<String> | 
        List<String> objectReprNisw = Arrays.asList(); // List<String> | 
        List<String> objectReprRegex = Arrays.asList(); // List<String> | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        String q = "q_example"; // String | Search
        List<Integer> relatedObjectId = Arrays.asList(); // List<Integer> | 
        Boolean relatedObjectIdEmpty = true; // Boolean | 
        List<Integer> relatedObjectIdGt = Arrays.asList(); // List<Integer> | 
        List<Integer> relatedObjectIdGte = Arrays.asList(); // List<Integer> | 
        List<Integer> relatedObjectIdLt = Arrays.asList(); // List<Integer> | 
        List<Integer> relatedObjectIdLte = Arrays.asList(); // List<Integer> | 
        List<Integer> relatedObjectIdN = Arrays.asList(); // List<Integer> | 
        String relatedObjectType = "relatedObjectType_example"; // String | 
        String relatedObjectTypeN = "relatedObjectTypeN_example"; // String | 
        UUID requestId = UUID.randomUUID(); // UUID | 
        OffsetDateTime timeAfter = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime timeBefore = OffsetDateTime.now(); // OffsetDateTime | 
        List<String> user = Arrays.asList(); // List<String> | User name
        List<String> userN = Arrays.asList(); // List<String> | User name
        List<Integer> userId = Arrays.asList(); // List<Integer> | User (ID)
        List<Integer> userIdN = Arrays.asList(); // List<Integer> | User (ID)
        List<String> userName = Arrays.asList(); // List<String> | 
        Boolean userNameEmpty = true; // Boolean | 
        List<String> userNameIc = Arrays.asList(); // List<String> | 
        List<String> userNameIe = Arrays.asList(); // List<String> | 
        List<String> userNameIew = Arrays.asList(); // List<String> | 
        List<String> userNameIregex = Arrays.asList(); // List<String> | 
        List<String> userNameIsw = Arrays.asList(); // List<String> | 
        List<String> userNameN = Arrays.asList(); // List<String> | 
        List<String> userNameNic = Arrays.asList(); // List<String> | 
        List<String> userNameNie = Arrays.asList(); // List<String> | 
        List<String> userNameNiew = Arrays.asList(); // List<String> | 
        List<String> userNameNisw = Arrays.asList(); // List<String> | 
        List<String> userNameRegex = Arrays.asList(); // List<String> | 
        try {
            PaginatedObjectChangeList result = apiInstance.coreObjectChangesList(action, actionEmpty, actionIc, actionIe, actionIew, actionIregex, actionIsw, actionN, actionNic, actionNie, actionNiew, actionNisw, actionRegex, changedObjectId, changedObjectIdEmpty, changedObjectIdGt, changedObjectIdGte, changedObjectIdLt, changedObjectIdLte, changedObjectIdN, changedObjectType, changedObjectTypeN, changedObjectTypeId, changedObjectTypeIdN, id, idEmpty, idGt, idGte, idLt, idLte, idN, limit, objectRepr, objectReprEmpty, objectReprIc, objectReprIe, objectReprIew, objectReprIregex, objectReprIsw, objectReprN, objectReprNic, objectReprNie, objectReprNiew, objectReprNisw, objectReprRegex, offset, ordering, q, relatedObjectId, relatedObjectIdEmpty, relatedObjectIdGt, relatedObjectIdGte, relatedObjectIdLt, relatedObjectIdLte, relatedObjectIdN, relatedObjectType, relatedObjectTypeN, requestId, timeAfter, timeBefore, user, userN, userId, userIdN, userName, userNameEmpty, userNameIc, userNameIe, userNameIew, userNameIregex, userNameIsw, userNameN, userNameNic, userNameNie, userNameNiew, userNameNisw, userNameRegex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreObjectChangesList");
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
| **action** | **String**| * &#x60;create&#x60; - Created * &#x60;update&#x60; - Updated * &#x60;delete&#x60; - Deleted | [optional] [enum: create, delete, null, update] |
| **actionEmpty** | **Boolean**|  | [optional] |
| **actionIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionN** | **String**| * &#x60;create&#x60; - Created * &#x60;update&#x60; - Updated * &#x60;delete&#x60; - Deleted | [optional] [enum: create, delete, null, update] |
| **actionNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **actionRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **changedObjectId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **changedObjectIdEmpty** | **Boolean**|  | [optional] |
| **changedObjectIdGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **changedObjectIdGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **changedObjectIdLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **changedObjectIdLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **changedObjectIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **changedObjectType** | **String**|  | [optional] |
| **changedObjectTypeN** | **String**|  | [optional] |
| **changedObjectTypeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **changedObjectTypeIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **id** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idEmpty** | **Boolean**|  | [optional] |
| **idGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **objectRepr** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprEmpty** | **Boolean**|  | [optional] |
| **objectReprIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectReprRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **q** | **String**| Search | [optional] |
| **relatedObjectId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **relatedObjectIdEmpty** | **Boolean**|  | [optional] |
| **relatedObjectIdGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **relatedObjectIdGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **relatedObjectIdLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **relatedObjectIdLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **relatedObjectIdN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **relatedObjectType** | **String**|  | [optional] |
| **relatedObjectTypeN** | **String**|  | [optional] |
| **requestId** | **UUID**|  | [optional] |
| **timeAfter** | **OffsetDateTime**|  | [optional] |
| **timeBefore** | **OffsetDateTime**|  | [optional] |
| **user** | [**List&lt;String&gt;**](String.md)| User name | [optional] |
| **userN** | [**List&lt;String&gt;**](String.md)| User name | [optional] |
| **userId** | [**List&lt;Integer&gt;**](Integer.md)| User (ID) | [optional] |
| **userIdN** | [**List&lt;Integer&gt;**](Integer.md)| User (ID) | [optional] |
| **userName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameEmpty** | **Boolean**|  | [optional] |
| **userNameIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **userNameRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**PaginatedObjectChangeList**](PaginatedObjectChangeList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreObjectChangesRetrieve

> ObjectChange coreObjectChangesRetrieve(id)



Retrieve a list of recent changes.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this object change.
        try {
            ObjectChange result = apiInstance.coreObjectChangesRetrieve(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreObjectChangesRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this object change. | |

### Return type

[**ObjectChange**](ObjectChange.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreObjectTypesList

> PaginatedObjectTypeList coreObjectTypesList(appLabel, appLabelEmpty, appLabelIc, appLabelIe, appLabelIew, appLabelIregex, appLabelIsw, appLabelN, appLabelNic, appLabelNie, appLabelNiew, appLabelNisw, appLabelRegex, features, id, idEmpty, idGt, idGte, idLt, idLte, idN, limit, model, modelEmpty, modelIc, modelIe, modelIew, modelIregex, modelIsw, modelN, modelNic, modelNie, modelNiew, modelNisw, modelRegex, offset, ordering, _public, q)



Read-only list of ObjectTypes.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        List<String> appLabel = Arrays.asList(); // List<String> | 
        Boolean appLabelEmpty = true; // Boolean | 
        List<String> appLabelIc = Arrays.asList(); // List<String> | 
        List<String> appLabelIe = Arrays.asList(); // List<String> | 
        List<String> appLabelIew = Arrays.asList(); // List<String> | 
        List<String> appLabelIregex = Arrays.asList(); // List<String> | 
        List<String> appLabelIsw = Arrays.asList(); // List<String> | 
        List<String> appLabelN = Arrays.asList(); // List<String> | 
        List<String> appLabelNic = Arrays.asList(); // List<String> | 
        List<String> appLabelNie = Arrays.asList(); // List<String> | 
        List<String> appLabelNiew = Arrays.asList(); // List<String> | 
        List<String> appLabelNisw = Arrays.asList(); // List<String> | 
        List<String> appLabelRegex = Arrays.asList(); // List<String> | 
        String features = "features_example"; // String | 
        List<Integer> id = Arrays.asList(); // List<Integer> | 
        Boolean idEmpty = true; // Boolean | 
        List<Integer> idGt = Arrays.asList(); // List<Integer> | 
        List<Integer> idGte = Arrays.asList(); // List<Integer> | 
        List<Integer> idLt = Arrays.asList(); // List<Integer> | 
        List<Integer> idLte = Arrays.asList(); // List<Integer> | 
        List<Integer> idN = Arrays.asList(); // List<Integer> | 
        Integer limit = 56; // Integer | Number of results to return per page.
        List<String> model = Arrays.asList(); // List<String> | 
        Boolean modelEmpty = true; // Boolean | 
        List<String> modelIc = Arrays.asList(); // List<String> | 
        List<String> modelIe = Arrays.asList(); // List<String> | 
        List<String> modelIew = Arrays.asList(); // List<String> | 
        List<String> modelIregex = Arrays.asList(); // List<String> | 
        List<String> modelIsw = Arrays.asList(); // List<String> | 
        List<String> modelN = Arrays.asList(); // List<String> | 
        List<String> modelNic = Arrays.asList(); // List<String> | 
        List<String> modelNie = Arrays.asList(); // List<String> | 
        List<String> modelNiew = Arrays.asList(); // List<String> | 
        List<String> modelNisw = Arrays.asList(); // List<String> | 
        List<String> modelRegex = Arrays.asList(); // List<String> | 
        Integer offset = 56; // Integer | The initial index from which to return the results.
        String ordering = "ordering_example"; // String | Which field to use when ordering the results.
        Boolean _public = true; // Boolean | 
        String q = "q_example"; // String | Search
        try {
            PaginatedObjectTypeList result = apiInstance.coreObjectTypesList(appLabel, appLabelEmpty, appLabelIc, appLabelIe, appLabelIew, appLabelIregex, appLabelIsw, appLabelN, appLabelNic, appLabelNie, appLabelNiew, appLabelNisw, appLabelRegex, features, id, idEmpty, idGt, idGte, idLt, idLte, idN, limit, model, modelEmpty, modelIc, modelIe, modelIew, modelIregex, modelIsw, modelN, modelNic, modelNie, modelNiew, modelNisw, modelRegex, offset, ordering, _public, q);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreObjectTypesList");
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
| **appLabel** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelEmpty** | **Boolean**|  | [optional] |
| **appLabelIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **appLabelRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **features** | **String**|  | [optional] |
| **id** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idEmpty** | **Boolean**|  | [optional] |
| **idGt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idGte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLt** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idLte** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **idN** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **model** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelEmpty** | **Boolean**|  | [optional] |
| **modelIc** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelIe** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelIew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelIregex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelIsw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelN** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelNic** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelNie** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelNiew** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelNisw** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **modelRegex** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **_public** | **Boolean**|  | [optional] |
| **q** | **String**| Search | [optional] |

### Return type

[**PaginatedObjectTypeList**](PaginatedObjectTypeList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## coreObjectTypesRetrieve

> ObjectType coreObjectTypesRetrieve(id)



Read-only list of ObjectTypes.

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.CoreApi;

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

        CoreApi apiInstance = new CoreApi(defaultClient);
        Integer id = 56; // Integer | A unique integer value identifying this object type.
        try {
            ObjectType result = apiInstance.coreObjectTypesRetrieve(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoreApi#coreObjectTypesRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this object type. | |

### Return type

[**ObjectType**](ObjectType.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

