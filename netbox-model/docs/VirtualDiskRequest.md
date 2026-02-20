

# VirtualDiskRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**virtualMachine** | [**PatchedVirtualDiskRequestVirtualMachine**](PatchedVirtualDiskRequestVirtualMachine.md) |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**size** | **Integer** |  |  |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


