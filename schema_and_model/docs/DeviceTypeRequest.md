

# DeviceTypeRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**manufacturer** | [**BriefDeviceTypeRequestManufacturer**](BriefDeviceTypeRequestManufacturer.md) |  |  |
|**defaultPlatform** | [**DeviceTypeRequestDefaultPlatform**](DeviceTypeRequestDefaultPlatform.md) |  |  [optional] |
|**model** | **String** |  |  |
|**slug** | **String** |  |  |
|**partNumber** | **String** | Discrete part number (optional) |  [optional] |
|**uHeight** | **Double** |  |  [optional] |
|**excludeFromUtilization** | **Boolean** | Devices of this type are excluded when calculating rack utilization. |  [optional] |
|**isFullDepth** | **Boolean** | Device consumes both front and rear rack faces. |  [optional] |
|**subdeviceRole** | [**SubdeviceRoleEnum**](#SubdeviceRoleEnum) | * &#x60;parent&#x60; - Parent * &#x60;child&#x60; - Child |  [optional] |
|**airflow** | [**AirflowEnum**](#AirflowEnum) | * &#x60;front-to-rear&#x60; - Front to rear * &#x60;rear-to-front&#x60; - Rear to front * &#x60;left-to-right&#x60; - Left to right * &#x60;right-to-left&#x60; - Right to left * &#x60;side-to-rear&#x60; - Side to rear * &#x60;rear-to-side&#x60; - Rear to side * &#x60;bottom-to-top&#x60; - Bottom to top * &#x60;top-to-bottom&#x60; - Top to bottom * &#x60;passive&#x60; - Passive * &#x60;mixed&#x60; - Mixed |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) | * &#x60;kg&#x60; - Kilograms * &#x60;g&#x60; - Grams * &#x60;lb&#x60; - Pounds * &#x60;oz&#x60; - Ounces |  [optional] |
|**frontImage** | **File** |  |  [optional] |
|**rearImage** | **File** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: SubdeviceRoleEnum

| Name | Value |
|---- | -----|
| PARENT | &quot;parent&quot; |
| CHILD | &quot;child&quot; |
| EMPTY | &quot;&quot; |



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



## Enum: WeightUnitEnum

| Name | Value |
|---- | -----|
| KG | &quot;kg&quot; |
| G | &quot;g&quot; |
| LB | &quot;lb&quot; |
| OZ | &quot;oz&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


