

# PatchedWritableCircuitRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cid** | **String** | Unique circuit ID |  [optional] |
|**provider** | [**BriefCircuitRequestProvider**](BriefCircuitRequestProvider.md) |  |  [optional] |
|**providerAccount** | [**CircuitRequestProviderAccount**](CircuitRequestProviderAccount.md) |  |  [optional] |
|**type** | [**CircuitRequestType**](CircuitRequestType.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;planned&#x60; - Planned * &#x60;provisioning&#x60; - Provisioning * &#x60;active&#x60; - Active * &#x60;offline&#x60; - Offline * &#x60;deprovisioning&#x60; - Deprovisioning * &#x60;decommissioned&#x60; - Decommissioned |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**installDate** | **LocalDate** |  |  [optional] |
|**terminationDate** | **LocalDate** |  |  [optional] |
|**commitRate** | **Integer** | Committed rate |  [optional] |
|**description** | **String** |  |  [optional] |
|**distance** | **Double** |  |  [optional] |
|**distanceUnit** | [**DistanceUnitEnum**](#DistanceUnitEnum) | * &#x60;km&#x60; - Kilometers * &#x60;m&#x60; - Meters * &#x60;mi&#x60; - Miles * &#x60;ft&#x60; - Feet |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**assignments** | [**List&lt;BriefCircuitGroupAssignmentSerializerRequest&gt;**](BriefCircuitGroupAssignmentSerializerRequest.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;planned&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| ACTIVE | &quot;active&quot; |
| OFFLINE | &quot;offline&quot; |
| DEPROVISIONING | &quot;deprovisioning&quot; |
| DECOMMISSIONED | &quot;decommissioned&quot; |



## Enum: DistanceUnitEnum

| Name | Value |
|---- | -----|
| KM | &quot;km&quot; |
| M | &quot;m&quot; |
| MI | &quot;mi&quot; |
| FT | &quot;ft&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


