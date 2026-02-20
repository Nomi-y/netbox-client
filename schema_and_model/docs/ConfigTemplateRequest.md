

# ConfigTemplateRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**environmentParams** | **Object** | Any &lt;a href&#x3D;\&quot;https://jinja.palletsprojects.com/en/stable/api/#jinja2.Environment\&quot;&gt;additional parameters&lt;/a&gt; to pass when constructing the Jinja environment |  [optional] |
|**templateCode** | **String** | Jinja template code. |  |
|**mimeType** | **String** | Defaults to &lt;code&gt;text/plain; charset&#x3D;utf-8&lt;/code&gt; |  [optional] |
|**fileName** | **String** | Filename to give to the rendered export file |  [optional] |
|**fileExtension** | **String** | Extension to append to the rendered filename |  [optional] |
|**asAttachment** | **Boolean** | Download file as attachment |  [optional] |
|**dataSource** | [**ConfigContextProfileRequestDataSource**](ConfigContextProfileRequestDataSource.md) |  |  [optional] |
|**autoSyncEnabled** | **Boolean** | Enable automatic synchronization of data when the data file is updated |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


