

# ModuleType

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**profile** | [**BriefModuleTypeProfile**](BriefModuleTypeProfile.md) |  |  [optional] |
|**manufacturer** | [**BriefManufacturer**](BriefManufacturer.md) |  |  |
|**model** | **String** |  |  |
|**partNumber** | **String** | Discrete part number (optional) |  [optional] |
|**airflow** | [**ModuleTypeAirflow**](ModuleTypeAirflow.md) |  |  [optional] |
|**weight** | **Double** |  |  [optional] |
|**weightUnit** | [**DeviceTypeWeightUnit**](DeviceTypeWeightUnit.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**attributes** | **Object** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**moduleCount** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


