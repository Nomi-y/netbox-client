

# DeviceRole

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
|**color** | **String** |  |  [optional] |
|**vmRole** | **Boolean** | Virtual machines may be assigned to this role |  [optional] |
|**configTemplate** | [**BriefConfigTemplate**](BriefConfigTemplate.md) |  |  [optional] |
|**parent** | [**NestedDeviceRole**](NestedDeviceRole.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**deviceCount** | **Integer** |  |  [readonly] |
|**virtualmachineCount** | **Integer** |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**depth** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


