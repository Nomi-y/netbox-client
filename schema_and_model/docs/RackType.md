

# RackType

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**manufacturer** | [**BriefManufacturer**](BriefManufacturer.md) |  |  |
|**model** | **String** |  |  |
|**slug** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**formFactor** | [**RackFormFactor**](RackFormFactor.md) |  |  [optional] |
|**width** | [**RackWidth**](RackWidth.md) |  |  [optional] |
|**uHeight** | **Integer** | Height in rack units |  [optional] |
|**startingUnit** | **Integer** | Starting unit for rack |  [optional] |
|**descUnits** | **Boolean** | Units are numbered top-to-bottom |  [optional] |
|**outerWidth** | **Integer** | Outer dimension of rack (width) |  [optional] |
|**outerHeight** | **Integer** | Outer dimension of rack (height) |  [optional] |
|**outerDepth** | **Integer** | Outer dimension of rack (depth) |  [optional] |
|**outerUnit** | [**RackOuterUnit**](RackOuterUnit.md) |  |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**maxWeight** | **Integer** | Maximum load capacity for the rack |  [optional] |
|**weightUnit** | [**DeviceTypeWeightUnit**](DeviceTypeWeightUnit.md) |  |  [optional] |
|**mountingDepth** | **Integer** | Maximum depth of a mounted device, in millimeters. For four-post racks, this is the distance between the front and rear rails. |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**rackCount** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


