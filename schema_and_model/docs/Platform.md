

# Platform

Base serializer class for models inheriting from NestedGroupModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**parent** | [**NestedPlatform**](NestedPlatform.md) |  |  [optional] |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**manufacturer** | [**BriefManufacturer**](BriefManufacturer.md) |  |  [optional] |
|**configTemplate** | [**BriefConfigTemplate**](BriefConfigTemplate.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**deviceCount** | **Integer** |  |  [readonly] |
|**virtualmachineCount** | **Integer** |  |  [readonly] |
|**depth** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


