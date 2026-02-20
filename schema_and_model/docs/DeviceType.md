

# DeviceType

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**manufacturer** | [**BriefManufacturer**](BriefManufacturer.md) |  |  |
|**defaultPlatform** | [**BriefPlatform**](BriefPlatform.md) |  |  [optional] |
|**model** | **String** |  |  |
|**slug** | **String** |  |  |
|**partNumber** | **String** | Discrete part number (optional) |  [optional] |
|**uHeight** | **Double** |  |  [optional] |
|**excludeFromUtilization** | **Boolean** | Devices of this type are excluded when calculating rack utilization. |  [optional] |
|**isFullDepth** | **Boolean** | Device consumes both front and rear rack faces. |  [optional] |
|**subdeviceRole** | [**DeviceTypeSubdeviceRole**](DeviceTypeSubdeviceRole.md) |  |  [optional] |
|**airflow** | [**DeviceTypeAirflow**](DeviceTypeAirflow.md) |  |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**weightUnit** | [**DeviceTypeWeightUnit**](DeviceTypeWeightUnit.md) |  |  [optional] |
|**frontImage** | **URI** |  |  [optional] |
|**rearImage** | **URI** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**deviceCount** | **Integer** |  |  [readonly] |
|**consolePortTemplateCount** | **Integer** |  |  [readonly] |
|**consoleServerPortTemplateCount** | **Integer** |  |  [readonly] |
|**powerPortTemplateCount** | **Integer** |  |  [readonly] |
|**powerOutletTemplateCount** | **Integer** |  |  [readonly] |
|**interfaceTemplateCount** | **Integer** |  |  [readonly] |
|**frontPortTemplateCount** | **Integer** |  |  [readonly] |
|**rearPortTemplateCount** | **Integer** |  |  [readonly] |
|**deviceBayTemplateCount** | **Integer** |  |  [readonly] |
|**moduleBayTemplateCount** | **Integer** |  |  [readonly] |
|**inventoryItemTemplateCount** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


