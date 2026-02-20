

# Device

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  [optional] |
|**deviceType** | [**BriefDeviceType**](BriefDeviceType.md) |  |  |
|**role** | [**BriefDeviceRole**](BriefDeviceRole.md) |  |  |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**platform** | [**BriefPlatform**](BriefPlatform.md) |  |  [optional] |
|**serial** | **String** | Chassis serial number, assigned by the manufacturer |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this device |  [optional] |
|**site** | [**BriefSite**](BriefSite.md) |  |  |
|**location** | [**BriefLocation**](BriefLocation.md) |  |  [optional] |
|**rack** | [**BriefRack**](BriefRack.md) |  |  [optional] |
|**position** | **Double** |  |  [optional] |
|**face** | [**DeviceFace**](DeviceFace.md) |  |  [optional] |
|**latitude** | **Double** | GPS coordinate in decimal format (xx.yyyyyy) |  [optional] |
|**longitude** | **Double** | GPS coordinate in decimal format (xx.yyyyyy) |  [optional] |
|**parentDevice** | [**NestedDevice**](NestedDevice.md) |  |  [readonly] |
|**status** | [**DeviceStatus**](DeviceStatus.md) |  |  [optional] |
|**airflow** | [**DeviceAirflow**](DeviceAirflow.md) |  |  [optional] |
|**primaryIp** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [readonly] |
|**primaryIp4** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [optional] |
|**primaryIp6** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [optional] |
|**oobIp** | [**BriefIPAddress**](BriefIPAddress.md) |  |  [optional] |
|**cluster** | [**BriefCluster**](BriefCluster.md) |  |  [optional] |
|**virtualChassis** | [**BriefVirtualChassis**](BriefVirtualChassis.md) |  |  [optional] |
|**vcPosition** | **Integer** |  |  [optional] |
|**vcPriority** | **Integer** | Virtual chassis master election priority |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**configTemplate** | [**BriefConfigTemplate**](BriefConfigTemplate.md) |  |  [optional] |
|**localContextData** | **Object** | Local config context data takes precedence over source contexts in the final rendered config context |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**consolePortCount** | **Integer** |  |  [readonly] |
|**consoleServerPortCount** | **Integer** |  |  [readonly] |
|**powerPortCount** | **Integer** |  |  [readonly] |
|**powerOutletCount** | **Integer** |  |  [readonly] |
|**interfaceCount** | **Integer** |  |  [readonly] |
|**frontPortCount** | **Integer** |  |  [readonly] |
|**rearPortCount** | **Integer** |  |  [readonly] |
|**deviceBayCount** | **Integer** |  |  [readonly] |
|**moduleBayCount** | **Integer** |  |  [readonly] |
|**inventoryItemCount** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


