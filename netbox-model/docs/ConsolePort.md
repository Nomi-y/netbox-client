

# ConsolePort

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**device** | [**BriefDevice**](BriefDevice.md) |  |  |
|**module** | [**BriefModule**](BriefModule.md) |  |  [optional] |
|**name** | **String** |  |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**ConsolePortType**](ConsolePortType.md) |  |  [optional] |
|**speed** | [**ConsolePortSpeed**](ConsolePortSpeed.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**cable** | [**BriefCable**](BriefCable.md) |  |  [readonly] |
|**cableEnd** | **String** |  |  [readonly] |
|**linkPeers** | **List&lt;Object&gt;** |  |  [readonly] |
|**linkPeersType** | **String** | Return the type of the peer link terminations, or None. |  [readonly] |
|**connectedEndpoints** | **List&lt;Object&gt;** |  |  [readonly] |
|**connectedEndpointsType** | **String** |  |  [readonly] |
|**connectedEndpointsReachable** | **Boolean** |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**occupied** | **Boolean** |  |  [readonly] |


## Implemented Interfaces

* Serializable


