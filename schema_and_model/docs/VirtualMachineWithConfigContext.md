

# VirtualMachineWithConfigContext

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**status** | [**VirtualMachineWithConfigContextStatus**](VirtualMachineWithConfigContextStatus.md) |  |  [optional] |
|**startOnBoot** | [**VirtualMachineWithConfigContextStartOnBoot**](VirtualMachineWithConfigContextStartOnBoot.md) |  |  [optional] |
|**site** | [**BriefSite**](BriefSite.md) |  |  [optional] |
|**cluster** | [**BriefCluster**](BriefCluster.md) |  |  [optional] |
|**device** | [**BriefDevice**](BriefDevice.md) |  |  [optional] |
|**serial** | **String** |  |  [optional] |
|**role** | [**BriefDeviceRole**](BriefDeviceRole.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**platform** | [**BriefPlatform**](BriefPlatform.md) |  |  [optional] |
|**primaryIp** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [readonly] |
|**primaryIp4** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [optional] |
|**primaryIp6** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [optional] |
|**vcpus** | **Double** |  |  [optional] |
|**memory** | **Integer** |  |  [optional] |
|**disk** | **Integer** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**configTemplate** | [**BriefConfigTemplate**](BriefConfigTemplate.md) |  |  [optional] |
|**localContextData** | **Object** | Local config context data takes precedence over source contexts in the final rendered config context |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**configContext** | **Object** |  |  [readonly] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**interfaceCount** | **Integer** |  |  [readonly] |
|**virtualDiskCount** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


