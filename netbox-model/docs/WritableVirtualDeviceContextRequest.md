

# WritableVirtualDeviceContextRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**device** | [**BriefInterfaceRequestDevice**](BriefInterfaceRequestDevice.md) |  |  |
|**identifier** | **Integer** |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**primaryIp4** | [**DeviceWithConfigContextRequestPrimaryIp4**](DeviceWithConfigContextRequestPrimaryIp4.md) |  |  [optional] |
|**primaryIp6** | [**DeviceWithConfigContextRequestPrimaryIp4**](DeviceWithConfigContextRequestPrimaryIp4.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;active&#x60; - Active * &#x60;planned&#x60; - Planned * &#x60;offline&#x60; - Offline |  |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| PLANNED | &quot;planned&quot; |
| OFFLINE | &quot;offline&quot; |


## Implemented Interfaces

* Serializable


