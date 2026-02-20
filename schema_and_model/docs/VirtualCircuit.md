

# VirtualCircuit

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**cid** | **String** | Unique circuit ID |  |
|**providerNetwork** | [**BriefProviderNetwork**](BriefProviderNetwork.md) |  |  |
|**providerAccount** | [**BriefProviderAccount**](BriefProviderAccount.md) |  |  [optional] |
|**type** | [**BriefVirtualCircuitType**](BriefVirtualCircuitType.md) |  |  |
|**status** | [**CircuitStatus**](CircuitStatus.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


