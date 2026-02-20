

# WritableVirtualMachineWithConfigContextRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;offline&#x60; - Offline * &#x60;active&#x60; - Active * &#x60;planned&#x60; - Planned * &#x60;staged&#x60; - Staged * &#x60;failed&#x60; - Failed * &#x60;decommissioning&#x60; - Decommissioning * &#x60;paused&#x60; - Paused |  [optional] |
|**startOnBoot** | [**StartOnBootEnum**](#StartOnBootEnum) | * &#x60;on&#x60; - On * &#x60;off&#x60; - Off * &#x60;laststate&#x60; - Last State |  [optional] |
|**site** | [**PatchedWritableVLANRequestSite**](PatchedWritableVLANRequestSite.md) |  |  [optional] |
|**cluster** | [**DeviceWithConfigContextRequestCluster**](DeviceWithConfigContextRequestCluster.md) |  |  [optional] |
|**device** | [**DeviceBayRequestInstalledDevice**](DeviceBayRequestInstalledDevice.md) |  |  [optional] |
|**serial** | **String** |  |  [optional] |
|**role** | [**PatchedWritableVirtualMachineWithConfigContextRequestRole**](PatchedWritableVirtualMachineWithConfigContextRequestRole.md) |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**platform** | [**DeviceTypeRequestDefaultPlatform**](DeviceTypeRequestDefaultPlatform.md) |  |  [optional] |
|**primaryIp4** | [**DeviceWithConfigContextRequestPrimaryIp4**](DeviceWithConfigContextRequestPrimaryIp4.md) |  |  [optional] |
|**primaryIp6** | [**DeviceWithConfigContextRequestPrimaryIp4**](DeviceWithConfigContextRequestPrimaryIp4.md) |  |  [optional] |
|**vcpus** | **Double** |  |  [optional] |
|**memory** | **Integer** |  |  [optional] |
|**disk** | **Integer** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**configTemplate** | [**DeviceRoleRequestConfigTemplate**](DeviceRoleRequestConfigTemplate.md) |  |  [optional] |
|**localContextData** | **Object** | Local config context data takes precedence over source contexts in the final rendered config context |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OFFLINE | &quot;offline&quot; |
| ACTIVE | &quot;active&quot; |
| PLANNED | &quot;planned&quot; |
| STAGED | &quot;staged&quot; |
| FAILED | &quot;failed&quot; |
| DECOMMISSIONING | &quot;decommissioning&quot; |
| PAUSED | &quot;paused&quot; |



## Enum: StartOnBootEnum

| Name | Value |
|---- | -----|
| ON | &quot;on&quot; |
| OFF | &quot;off&quot; |
| LASTSTATE | &quot;laststate&quot; |


## Implemented Interfaces

* Serializable


