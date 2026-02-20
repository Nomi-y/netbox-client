

# Circuit

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**cid** | **String** | Unique circuit ID |  |
|**provider** | [**BriefProvider**](BriefProvider.md) |  |  |
|**providerAccount** | [**BriefProviderAccount**](BriefProviderAccount.md) |  |  [optional] |
|**type** | [**BriefCircuitType**](BriefCircuitType.md) |  |  |
|**status** | [**CircuitStatus**](CircuitStatus.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**installDate** | **LocalDate** |  |  [optional] |
|**terminationDate** | **LocalDate** |  |  [optional] |
|**commitRate** | **Integer** | Committed rate |  [optional] |
|**description** | **String** |  |  [optional] |
|**distance** | **Double** |  |  [optional] |
|**distanceUnit** | [**CircuitDistanceUnit**](CircuitDistanceUnit.md) |  |  [optional] |
|**terminationA** | [**CircuitCircuitTermination**](CircuitCircuitTermination.md) |  |  [readonly] |
|**terminationZ** | [**CircuitCircuitTermination**](CircuitCircuitTermination.md) |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**assignments** | [**List&lt;BriefCircuitGroupAssignmentSerializer&gt;**](BriefCircuitGroupAssignmentSerializer.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


