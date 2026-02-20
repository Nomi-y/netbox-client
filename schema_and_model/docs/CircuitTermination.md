

# CircuitTermination

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**circuit** | [**BriefCircuit**](BriefCircuit.md) |  |  |
|**termSide** | [**TermSideEnum**](#TermSideEnum) | * &#x60;A&#x60; - A * &#x60;Z&#x60; - Z |  |
|**terminationType** | **String** |  |  [optional] |
|**terminationId** | **Integer** |  |  [optional] |
|**termination** | **Object** |  |  [readonly] |
|**portSpeed** | **Integer** | Physical circuit speed |  [optional] |
|**upstreamSpeed** | **Integer** | Upstream speed, if different from port speed |  [optional] |
|**xconnectId** | **String** | ID of the local cross-connect |  [optional] |
|**ppInfo** | **String** | Patch panel ID and port number(s) |  [optional] |
|**description** | **String** |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**cable** | [**BriefCable**](BriefCable.md) |  |  [readonly] |
|**cableEnd** | **String** |  |  [readonly] |
|**linkPeers** | **List&lt;Object&gt;** |  |  [readonly] |
|**linkPeersType** | **String** | Return the type of the peer link terminations, or None. |  [readonly] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**occupied** | **Boolean** |  |  [readonly] |



## Enum: TermSideEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| Z | &quot;Z&quot; |


## Implemented Interfaces

* Serializable


