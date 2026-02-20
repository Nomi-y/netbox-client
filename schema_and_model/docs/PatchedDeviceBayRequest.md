

# PatchedDeviceBayRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**device** | [**BriefInterfaceRequestDevice**](BriefInterfaceRequestDevice.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**label** | **String** | Physical label |  [optional] |
|**description** | **String** |  |  [optional] |
|**installedDevice** | [**DeviceBayRequestInstalledDevice**](DeviceBayRequestInstalledDevice.md) |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


