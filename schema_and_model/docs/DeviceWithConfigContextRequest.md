

# DeviceWithConfigContextRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**deviceType** | [**DeviceBayTemplateRequestDeviceType**](DeviceBayTemplateRequestDeviceType.md) |  |  |
|**role** | [**DeviceWithConfigContextRequestRole**](DeviceWithConfigContextRequestRole.md) |  |  |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**platform** | [**DeviceTypeRequestDefaultPlatform**](DeviceTypeRequestDefaultPlatform.md) |  |  [optional] |
|**serial** | **String** | Chassis serial number, assigned by the manufacturer |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this device |  [optional] |
|**site** | [**DeviceWithConfigContextRequestSite**](DeviceWithConfigContextRequestSite.md) |  |  |
|**location** | [**DeviceWithConfigContextRequestLocation**](DeviceWithConfigContextRequestLocation.md) |  |  [optional] |
|**rack** | [**DeviceWithConfigContextRequestRack**](DeviceWithConfigContextRequestRack.md) |  |  [optional] |
|**position** | **Double** |  |  [optional] |
|**face** | [**FaceEnum**](#FaceEnum) | * &#x60;front&#x60; - Front * &#x60;rear&#x60; - Rear |  [optional] |
|**latitude** | **Double** | GPS coordinate in decimal format (xx.yyyyyy) |  [optional] |
|**longitude** | **Double** | GPS coordinate in decimal format (xx.yyyyyy) |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;offline&#x60; - Offline * &#x60;active&#x60; - Active * &#x60;planned&#x60; - Planned * &#x60;staged&#x60; - Staged * &#x60;failed&#x60; - Failed * &#x60;inventory&#x60; - Inventory * &#x60;decommissioning&#x60; - Decommissioning |  [optional] |
|**airflow** | [**AirflowEnum**](#AirflowEnum) | * &#x60;front-to-rear&#x60; - Front to rear * &#x60;rear-to-front&#x60; - Rear to front * &#x60;left-to-right&#x60; - Left to right * &#x60;right-to-left&#x60; - Right to left * &#x60;side-to-rear&#x60; - Side to rear * &#x60;rear-to-side&#x60; - Rear to side * &#x60;bottom-to-top&#x60; - Bottom to top * &#x60;top-to-bottom&#x60; - Top to bottom * &#x60;passive&#x60; - Passive * &#x60;mixed&#x60; - Mixed |  [optional] |
|**primaryIp4** | [**DeviceWithConfigContextRequestPrimaryIp4**](DeviceWithConfigContextRequestPrimaryIp4.md) |  |  [optional] |
|**primaryIp6** | [**DeviceWithConfigContextRequestPrimaryIp4**](DeviceWithConfigContextRequestPrimaryIp4.md) |  |  [optional] |
|**oobIp** | [**DeviceWithConfigContextRequestPrimaryIp4**](DeviceWithConfigContextRequestPrimaryIp4.md) |  |  [optional] |
|**cluster** | [**DeviceWithConfigContextRequestCluster**](DeviceWithConfigContextRequestCluster.md) |  |  [optional] |
|**virtualChassis** | [**DeviceWithConfigContextRequestVirtualChassis**](DeviceWithConfigContextRequestVirtualChassis.md) |  |  [optional] |
|**vcPosition** | **Integer** |  |  [optional] |
|**vcPriority** | **Integer** | Virtual chassis master election priority |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**configTemplate** | [**DeviceRoleRequestConfigTemplate**](DeviceRoleRequestConfigTemplate.md) |  |  [optional] |
|**localContextData** | **Object** | Local config context data takes precedence over source contexts in the final rendered config context |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: FaceEnum

| Name | Value |
|---- | -----|
| FRONT | &quot;front&quot; |
| REAR | &quot;rear&quot; |
| EMPTY | &quot;&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OFFLINE | &quot;offline&quot; |
| ACTIVE | &quot;active&quot; |
| PLANNED | &quot;planned&quot; |
| STAGED | &quot;staged&quot; |
| FAILED | &quot;failed&quot; |
| INVENTORY | &quot;inventory&quot; |
| DECOMMISSIONING | &quot;decommissioning&quot; |



## Enum: AirflowEnum

| Name | Value |
|---- | -----|
| FRONT_TO_REAR | &quot;front-to-rear&quot; |
| REAR_TO_FRONT | &quot;rear-to-front&quot; |
| LEFT_TO_RIGHT | &quot;left-to-right&quot; |
| RIGHT_TO_LEFT | &quot;right-to-left&quot; |
| SIDE_TO_REAR | &quot;side-to-rear&quot; |
| REAR_TO_SIDE | &quot;rear-to-side&quot; |
| BOTTOM_TO_TOP | &quot;bottom-to-top&quot; |
| TOP_TO_BOTTOM | &quot;top-to-bottom&quot; |
| PASSIVE | &quot;passive&quot; |
| MIXED | &quot;mixed&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


