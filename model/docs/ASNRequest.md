

# ASNRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asn** | **Long** | 16- or 32-bit autonomous system number |  |
|**rir** | [**ASNRequestRir**](ASNRequestRir.md) |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**sites** | **List&lt;Integer&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


