

# DeviceRoleRequest

Base serializer class for models inheriting from NestedGroupModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**color** | **String** |  |  [optional] |
|**vmRole** | **Boolean** | Virtual machines may be assigned to this role |  [optional] |
|**configTemplate** | [**DeviceRoleRequestConfigTemplate**](DeviceRoleRequestConfigTemplate.md) |  |  [optional] |
|**parent** | [**NestedDeviceRoleRequest**](NestedDeviceRoleRequest.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


