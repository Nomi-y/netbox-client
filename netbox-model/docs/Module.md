

# Module

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**device** | [**BriefDevice**](BriefDevice.md) |  |  |
|**moduleBay** | [**NestedModuleBay**](NestedModuleBay.md) |  |  |
|**moduleType** | [**BriefModuleType**](BriefModuleType.md) |  |  |
|**status** | [**InventoryItemStatus**](InventoryItemStatus.md) |  |  [optional] |
|**serial** | **String** |  |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this device |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


