

# ExportTemplate

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**objectTypes** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**environmentParams** | **Object** | Any &lt;a href&#x3D;\&quot;https://jinja.palletsprojects.com/en/stable/api/#jinja2.Environment\&quot;&gt;additional parameters&lt;/a&gt; to pass when constructing the Jinja environment |  [optional] |
|**templateCode** | **String** | Jinja template code. |  |
|**mimeType** | **String** | Defaults to &lt;code&gt;text/plain; charset&#x3D;utf-8&lt;/code&gt; |  [optional] |
|**fileName** | **String** | Filename to give to the rendered export file |  [optional] |
|**fileExtension** | **String** | Extension to append to the rendered filename |  [optional] |
|**asAttachment** | **Boolean** | Download file as attachment |  [optional] |
|**dataSource** | [**BriefDataSource**](BriefDataSource.md) |  |  [optional] |
|**dataPath** | **String** | Path to remote file (relative to data source root) |  [readonly] |
|**dataFile** | [**BriefDataFile**](BriefDataFile.md) |  |  [readonly] |
|**dataSynced** | **OffsetDateTime** |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


