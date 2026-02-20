

# Service

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**parentObjectType** | **String** |  |  |
|**parentObjectId** | **Long** |  |  |
|**parent** | **Object** |  |  [readonly] |
|**name** | **String** |  |  |
|**protocol** | [**ServiceProtocol**](ServiceProtocol.md) |  |  [optional] |
|**ports** | **List&lt;Integer&gt;** |  |  |
|**ipaddresses** | [**List&lt;IPAddress&gt;**](IPAddress.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


