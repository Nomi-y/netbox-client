

# ContactGroup

Base serializer class for models inheriting from NestedGroupModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**parent** | [**NestedContactGroup**](NestedContactGroup.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**contactCount** | **Integer** |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**depth** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


