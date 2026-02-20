

# TunnelTermination

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**tunnel** | [**BriefTunnel**](BriefTunnel.md) |  |  |
|**role** | [**TunnelTerminationRole**](TunnelTerminationRole.md) |  |  |
|**terminationType** | **String** |  |  |
|**terminationId** | **Long** |  |  [optional] |
|**termination** | **Object** |  |  [readonly] |
|**outsideIp** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


