

# PowerPanelRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**site** | [**DeviceWithConfigContextRequestSite**](DeviceWithConfigContextRequestSite.md) |  |  |
|**location** | [**DeviceWithConfigContextRequestLocation**](DeviceWithConfigContextRequestLocation.md) |  |  [optional] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


