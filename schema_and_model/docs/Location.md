

# Location

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
|**site** | [**BriefSite**](BriefSite.md) |  |  |
|**parent** | [**NestedLocation**](NestedLocation.md) |  |  [optional] |
|**status** | [**LocationStatus**](LocationStatus.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**facility** | **String** | Local facility ID or description |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**rackCount** | **Integer** |  |  [readonly] |
|**deviceCount** | **Integer** |  |  [readonly] |
|**prefixCount** | **Long** |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**depth** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


