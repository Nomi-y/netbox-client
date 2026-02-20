

# PatchedModuleBayRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**device** | [**BriefInterfaceRequestDevice**](BriefInterfaceRequestDevice.md) |  |  [optional] |
|**module** | [**ConsolePortRequestModule**](ConsolePortRequestModule.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**installedModule** | [**ConsolePortRequestModule**](ConsolePortRequestModule.md) |  |  [optional] |
|**label** | **String** | Physical label |  [optional] |
|**position** | **String** | Identifier to reference when renaming installed components |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


