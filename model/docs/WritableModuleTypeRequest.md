

# WritableModuleTypeRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profile** | [**BriefModuleTypeRequestProfile**](BriefModuleTypeRequestProfile.md) |  |  [optional] |
|**manufacturer** | [**BriefDeviceTypeRequestManufacturer**](BriefDeviceTypeRequestManufacturer.md) |  |  |
|**model** | **String** |  |  |
|**partNumber** | **String** | Discrete part number (optional) |  [optional] |
|**airflow** | [**AirflowEnum**](#AirflowEnum) | * &#x60;front-to-rear&#x60; - Front to rear * &#x60;rear-to-front&#x60; - Rear to front * &#x60;left-to-right&#x60; - Left to right * &#x60;right-to-left&#x60; - Right to left * &#x60;side-to-rear&#x60; - Side to rear * &#x60;passive&#x60; - Passive |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) | * &#x60;kg&#x60; - Kilograms * &#x60;g&#x60; - Grams * &#x60;lb&#x60; - Pounds * &#x60;oz&#x60; - Ounces |  [optional] |
|**description** | **String** |  |  [optional] |
|**attributes** | **Object** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: AirflowEnum

| Name | Value |
|---- | -----|
| FRONT_TO_REAR | &quot;front-to-rear&quot; |
| REAR_TO_FRONT | &quot;rear-to-front&quot; |
| LEFT_TO_RIGHT | &quot;left-to-right&quot; |
| RIGHT_TO_LEFT | &quot;right-to-left&quot; |
| SIDE_TO_REAR | &quot;side-to-rear&quot; |
| PASSIVE | &quot;passive&quot; |
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


