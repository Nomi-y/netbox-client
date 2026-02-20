

# PowerFeed

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**powerPanel** | [**BriefPowerPanel**](BriefPowerPanel.md) |  |  |
|**rack** | [**BriefRack**](BriefRack.md) |  |  [optional] |
|**name** | **String** |  |  |
|**status** | [**PowerFeedStatus**](PowerFeedStatus.md) |  |  [optional] |
|**type** | [**PowerFeedType**](PowerFeedType.md) |  |  [optional] |
|**supply** | [**PowerFeedSupply**](PowerFeedSupply.md) |  |  [optional] |
|**phase** | [**PowerFeedPhase**](PowerFeedPhase.md) |  |  [optional] |
|**voltage** | **Integer** |  |  [optional] |
|**amperage** | **Integer** |  |  [optional] |
|**maxUtilization** | **Integer** | Maximum permissible draw (percentage) |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**cable** | [**BriefCable**](BriefCable.md) |  |  [readonly] |
|**cableEnd** | **String** |  |  [readonly] |
|**linkPeers** | **List&lt;Object&gt;** |  |  [readonly] |
|**linkPeersType** | **String** | Return the type of the peer link terminations, or None. |  [readonly] |
|**connectedEndpoints** | **List&lt;Object&gt;** |  |  [readonly] |
|**connectedEndpointsType** | **String** |  |  [readonly] |
|**connectedEndpointsReachable** | **Boolean** |  |  [readonly] |
|**description** | **String** |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**occupied** | **Boolean** |  |  [readonly] |


## Implemented Interfaces

* Serializable


