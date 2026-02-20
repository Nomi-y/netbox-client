

# ConfigContextProfile

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**schema** | **Object** | A JSON schema specifying the structure of the context data for this profile |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**dataSource** | [**BriefDataSource**](BriefDataSource.md) |  |  [optional] |
|**dataPath** | **String** | Path to remote file (relative to data source root) |  [readonly] |
|**dataFile** | [**BriefDataFile**](BriefDataFile.md) |  |  [optional] |
|**dataSynced** | **OffsetDateTime** |  |  [readonly] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


