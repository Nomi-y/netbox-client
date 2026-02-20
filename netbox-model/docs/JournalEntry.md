

# JournalEntry

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**assignedObjectType** | **String** |  |  |
|**assignedObjectId** | **Long** |  |  |
|**assignedObject** | **Object** |  |  [readonly] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**createdBy** | **Integer** |  |  [optional] |
|**kind** | [**JournalEntryKind**](JournalEntryKind.md) |  |  [optional] |
|**comments** | **String** |  |  |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


