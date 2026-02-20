

# PatchedWritableVirtualCircuitTerminationRequest

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**virtualCircuit** | [**PatchedWritableVirtualCircuitTerminationRequestVirtualCircuit**](PatchedWritableVirtualCircuitTerminationRequestVirtualCircuit.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | * &#x60;peer&#x60; - Peer * &#x60;hub&#x60; - Hub * &#x60;spoke&#x60; - Spoke |  [optional] |
|**_interface** | [**PatchedWritableVirtualCircuitTerminationRequestInterface**](PatchedWritableVirtualCircuitTerminationRequestInterface.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| PEER | &quot;peer&quot; |
| HUB | &quot;hub&quot; |
| SPOKE | &quot;spoke&quot; |


## Implemented Interfaces

* Serializable


