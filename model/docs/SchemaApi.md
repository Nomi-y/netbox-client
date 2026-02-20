# SchemaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**schemaRetrieve**](SchemaApi.md#schemaRetrieve) | **GET** api/schema/ |  |



## schemaRetrieve

> Map&lt;String, Object&gt; schemaRetrieve(format, lang)



OpenApi3 schema for this API. Format can be selected via content negotiation.  - YAML: application/vnd.oai.openapi - JSON: application/vnd.oai.openapi+json

### Example

```java
// Import classes:
import dev.icelabs.netbox.ApiClient;
import dev.icelabs.netbox.ApiException;
import dev.icelabs.netbox.Configuration;
import dev.icelabs.netbox.auth.*;
import dev.icelabs.netbox.models.*;
import dev.icelabs.netbox.api.SchemaApi;

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

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String format = "json"; // String | 
        String lang = "cs"; // String | 
        try {
            Map<String, Object> result = apiInstance.schemaRetrieve(format, lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemaRetrieve");
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
| **format** | **String**|  | [optional] [enum: json, yaml] |
| **lang** | **String**|  | [optional] [enum: cs, da, de, en, es, fr, it, ja, lv, nl, pl, pt, ru, tr, uk, zh] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.oai.openapi, application/yaml, application/vnd.oai.openapi+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

