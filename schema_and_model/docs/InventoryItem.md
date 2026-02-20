

# InventoryItem

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**device** | [**BriefDevice**](BriefDevice.md) |  |  |
|**parent** | **Integer** |  |  [optional] |
|**name** | **String** |  |  |
|**label** | **String** | Physical label |  [optional] |
|**status** | [**InventoryItemStatus**](InventoryItemStatus.md) |  |  [optional] |
|**role** | [**BriefInventoryItemRole**](BriefInventoryItemRole.md) |  |  [optional] |
|**manufacturer** | [**BriefManufacturer**](BriefManufacturer.md) |  |  [optional] |
|**partId** | **String** | Manufacturer-assigned part identifier |  [optional] |
|**serial** | **String** |  |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this item |  [optional] |
|**discovered** | **Boolean** | This item was automatically discovered |  [optional] |
|**description** | **String** |  |  [optional] |
|**componentType** | **String** |  |  [optional] |
|**componentId** | **Long** |  |  [optional] |
|**component** | **Object** |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**depth** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


