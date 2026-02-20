

# PatchedWritableVirtualCircuitRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cid** | **String** | Unique circuit ID |  [optional] |
|**providerNetwork** | [**BriefVirtualCircuitRequestProviderNetwork**](BriefVirtualCircuitRequestProviderNetwork.md) |  |  [optional] |
|**providerAccount** | [**CircuitRequestProviderAccount**](CircuitRequestProviderAccount.md) |  |  [optional] |
|**type** | [**PatchedWritableVirtualCircuitRequestType**](PatchedWritableVirtualCircuitRequestType.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;planned&#x60; - Planned * &#x60;provisioning&#x60; - Provisioning * &#x60;active&#x60; - Active * &#x60;offline&#x60; - Offline * &#x60;deprovisioning&#x60; - Deprovisioning * &#x60;decommissioned&#x60; - Decommissioned |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;planned&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| ACTIVE | &quot;active&quot; |
| OFFLINE | &quot;offline&quot; |
| DEPROVISIONING | &quot;deprovisioning&quot; |
| DECOMMISSIONED | &quot;decommissioned&quot; |


## Implemented Interfaces

* Serializable


