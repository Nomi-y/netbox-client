

# CircuitsCircuitTerminationsCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**circuit** | [**CircuitTerminationRequestCircuit**](CircuitTerminationRequestCircuit.md) |  |  |
|**termSide** | [**TermSideEnum**](#TermSideEnum) | * &#x60;A&#x60; - A * &#x60;Z&#x60; - Z |  |
|**terminationType** | **String** |  |  [optional] |
|**terminationId** | **Integer** |  |  [optional] |
|**portSpeed** | **Integer** | Physical circuit speed |  [optional] |
|**upstreamSpeed** | **Integer** | Upstream speed, if different from port speed |  [optional] |
|**xconnectId** | **String** | ID of the local cross-connect |  [optional] |
|**ppInfo** | **String** | Patch panel ID and port number(s) |  [optional] |
|**description** | **String** |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: TermSideEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| Z | &quot;Z&quot; |


## Implemented Interfaces

* Serializable


