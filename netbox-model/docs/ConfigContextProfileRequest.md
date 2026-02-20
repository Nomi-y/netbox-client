

# ConfigContextProfileRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**schema** | **Object** | A JSON schema specifying the structure of the context data for this profile |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**dataSource** | [**ConfigContextProfileRequestDataSource**](ConfigContextProfileRequestDataSource.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


