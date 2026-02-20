

# PatchedWritableIPRangeRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startAddress** | **String** |  |  [optional] |
|**endAddress** | **String** |  |  [optional] |
|**vrf** | [**IPAddressRequestVrf**](IPAddressRequestVrf.md) |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Operational status of this range  * &#x60;active&#x60; - Active * &#x60;reserved&#x60; - Reserved * &#x60;deprecated&#x60; - Deprecated |  [optional] |
|**role** | [**IPRangeRequestRole**](IPRangeRequestRole.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**markPopulated** | **Boolean** | Prevent the creation of IP addresses within this range |  [optional] |
|**markUtilized** | **Boolean** | Report space as fully utilized |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| RESERVED | &quot;reserved&quot; |
| DEPRECATED | &quot;deprecated&quot; |


## Implemented Interfaces

* Serializable


