

# WritablePlatformRequest

Base serializer class for models inheriting from NestedGroupModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parent** | **Integer** |  |  [optional] |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**manufacturer** | [**InventoryItemRequestManufacturer**](InventoryItemRequestManufacturer.md) |  |  [optional] |
|**configTemplate** | [**DeviceRoleRequestConfigTemplate**](DeviceRoleRequestConfigTemplate.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


