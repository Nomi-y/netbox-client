

# WritablePowerFeedRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**powerPanel** | [**PatchedWritablePowerFeedRequestPowerPanel**](PatchedWritablePowerFeedRequestPowerPanel.md) |  |  |
|**rack** | [**DeviceWithConfigContextRequestRack**](DeviceWithConfigContextRequestRack.md) |  |  [optional] |
|**name** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;offline&#x60; - Offline * &#x60;active&#x60; - Active * &#x60;planned&#x60; - Planned * &#x60;failed&#x60; - Failed |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;primary&#x60; - Primary * &#x60;redundant&#x60; - Redundant |  [optional] |
|**supply** | [**SupplyEnum**](#SupplyEnum) | * &#x60;ac&#x60; - AC * &#x60;dc&#x60; - DC |  [optional] |
|**phase** | [**PhaseEnum**](#PhaseEnum) | * &#x60;single-phase&#x60; - Single phase * &#x60;three-phase&#x60; - Three-phase |  [optional] |
|**voltage** | **Integer** |  |  [optional] |
|**amperage** | **Integer** |  |  [optional] |
|**maxUtilization** | **Integer** | Maximum permissible draw (percentage) |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**description** | **String** |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OFFLINE | &quot;offline&quot; |
| ACTIVE | &quot;active&quot; |
| PLANNED | &quot;planned&quot; |
| FAILED | &quot;failed&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| REDUNDANT | &quot;redundant&quot; |



## Enum: SupplyEnum

| Name | Value |
|---- | -----|
| AC | &quot;ac&quot; |
| DC | &quot;dc&quot; |



## Enum: PhaseEnum

| Name | Value |
|---- | -----|
| SINGLE_PHASE | &quot;single-phase&quot; |
| THREE_PHASE | &quot;three-phase&quot; |


## Implemented Interfaces

* Serializable


