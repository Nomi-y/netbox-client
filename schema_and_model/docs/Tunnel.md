

# Tunnel

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**status** | [**TunnelStatus**](TunnelStatus.md) |  |  |
|**group** | [**BriefTunnelGroup**](BriefTunnelGroup.md) |  |  [optional] |
|**encapsulation** | [**TunnelEncapsulation**](TunnelEncapsulation.md) |  |  |
|**ipsecProfile** | [**BriefIPSecProfile**](BriefIPSecProfile.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**tunnelId** | **Long** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**terminationsCount** | **Long** |  |  [readonly] |


## Implemented Interfaces

* Serializable


