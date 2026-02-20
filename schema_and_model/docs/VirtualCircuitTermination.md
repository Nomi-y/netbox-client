

# VirtualCircuitTermination

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**virtualCircuit** | [**BriefVirtualCircuit**](BriefVirtualCircuit.md) |  |  |
|**role** | [**TunnelTerminationRole**](TunnelTerminationRole.md) |  |  [optional] |
|**_interface** | [**BriefInterface**](BriefInterface.md) |  |  |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


