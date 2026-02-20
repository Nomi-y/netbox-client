

# PatchedASNRangeRequest

Base serializer class for models inheriting from OrganizationalModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**slug** | **String** |  |  [optional] |
|**rir** | [**ASNRangeRequestRir**](ASNRangeRequestRir.md) |  |  [optional] |
|**start** | **Long** |  |  [optional] |
|**end** | **Long** |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


