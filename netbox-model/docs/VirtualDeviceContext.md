

# VirtualDeviceContext

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**device** | [**BriefDevice**](BriefDevice.md) |  |  |
|**identifier** | **Integer** |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**primaryIp** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [readonly] |
|**primaryIp4** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [optional] |
|**primaryIp6** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [optional] |
|**status** | [**VirtualDeviceContextStatus**](VirtualDeviceContextStatus.md) |  |  |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**interfaceCount** | **Long** |  |  [readonly] |


## Implemented Interfaces

* Serializable


