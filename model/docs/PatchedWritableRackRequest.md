

# PatchedWritableRackRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**facilityId** | **String** |  |  [optional] |
|**site** | [**DeviceWithConfigContextRequestSite**](DeviceWithConfigContextRequestSite.md) |  |  [optional] |
|**location** | [**DeviceWithConfigContextRequestLocation**](DeviceWithConfigContextRequestLocation.md) |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;reserved&#x60; - Reserved * &#x60;available&#x60; - Available * &#x60;planned&#x60; - Planned * &#x60;active&#x60; - Active * &#x60;deprecated&#x60; - Deprecated |  [optional] |
|**role** | [**PatchedWritableRackRequestRole**](PatchedWritableRackRequestRole.md) |  |  [optional] |
|**serial** | **String** |  |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this rack |  [optional] |
|**rackType** | [**PatchedWritableRackRequestRackType**](PatchedWritableRackRequestRackType.md) |  |  [optional] |
|**formFactor** | [**FormFactorEnum**](#FormFactorEnum) | * &#x60;2-post-frame&#x60; - 2-post frame * &#x60;4-post-frame&#x60; - 4-post frame * &#x60;4-post-cabinet&#x60; - 4-post cabinet * &#x60;wall-frame&#x60; - Wall-mounted frame * &#x60;wall-frame-vertical&#x60; - Wall-mounted frame (vertical) * &#x60;wall-cabinet&#x60; - Wall-mounted cabinet * &#x60;wall-cabinet-vertical&#x60; - Wall-mounted cabinet (vertical) |  [optional] |
|**width** | [**WidthEnum**](#WidthEnum) | Rail-to-rail width  * &#x60;10&#x60; - 10 inches * &#x60;19&#x60; - 19 inches * &#x60;21&#x60; - 21 inches * &#x60;23&#x60; - 23 inches |  [optional] |
|**uHeight** | **Integer** | Height in rack units |  [optional] |
|**startingUnit** | **Integer** | Starting unit for rack |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**maxWeight** | **Integer** | Maximum load capacity for the rack |  [optional] |
|**weightUnit** | [**WeightUnitEnum**](#WeightUnitEnum) | * &#x60;kg&#x60; - Kilograms * &#x60;g&#x60; - Grams * &#x60;lb&#x60; - Pounds * &#x60;oz&#x60; - Ounces |  [optional] |
|**descUnits** | **Boolean** | Units are numbered top-to-bottom |  [optional] |
|**outerWidth** | **Integer** | Outer dimension of rack (width) |  [optional] |
|**outerHeight** | **Integer** | Outer dimension of rack (height) |  [optional] |
|**outerDepth** | **Integer** | Outer dimension of rack (depth) |  [optional] |
|**outerUnit** | [**OuterUnitEnum**](#OuterUnitEnum) | * &#x60;mm&#x60; - Millimeters * &#x60;in&#x60; - Inches |  [optional] |
|**mountingDepth** | **Integer** | Maximum depth of a mounted device, in millimeters. For four-post racks, this is the distance between the front and rear rails. |  [optional] |
|**airflow** | [**AirflowEnum**](#AirflowEnum) | * &#x60;front-to-rear&#x60; - Front to rear * &#x60;rear-to-front&#x60; - Rear to front |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RESERVED | &quot;reserved&quot; |
| AVAILABLE | &quot;available&quot; |
| PLANNED | &quot;planned&quot; |
| ACTIVE | &quot;active&quot; |
| DEPRECATED | &quot;deprecated&quot; |



## Enum: FormFactorEnum

| Name | Value |
|---- | -----|
| _2_POST_FRAME | &quot;2-post-frame&quot; |
| _4_POST_FRAME | &quot;4-post-frame&quot; |
| _4_POST_CABINET | &quot;4-post-cabinet&quot; |
| WALL_FRAME | &quot;wall-frame&quot; |
| WALL_FRAME_VERTICAL | &quot;wall-frame-vertical&quot; |
| WALL_CABINET | &quot;wall-cabinet&quot; |
| WALL_CABINET_VERTICAL | &quot;wall-cabinet-vertical&quot; |
| EMPTY | &quot;&quot; |



## Enum: WidthEnum

| Name | Value |
|---- | -----|
| NUMBER_10 | 10 |
| NUMBER_19 | 19 |
| NUMBER_21 | 21 |
| NUMBER_23 | 23 |



## Enum: WeightUnitEnum

| Name | Value |
|---- | -----|
| KG | &quot;kg&quot; |
| G | &quot;g&quot; |
| LB | &quot;lb&quot; |
| OZ | &quot;oz&quot; |
| EMPTY | &quot;&quot; |



## Enum: OuterUnitEnum

| Name | Value |
|---- | -----|
| MM | &quot;mm&quot; |
| IN | &quot;in&quot; |
| EMPTY | &quot;&quot; |



## Enum: AirflowEnum

| Name | Value |
|---- | -----|
| FRONT_TO_REAR | &quot;front-to-rear&quot; |
| REAR_TO_FRONT | &quot;rear-to-front&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


