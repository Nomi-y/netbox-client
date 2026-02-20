

# WritableJournalEntryRequest

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignedObjectType** | **String** |  |  |
|**assignedObjectId** | **Long** |  |  |
|**createdBy** | **Integer** |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | * &#x60;info&#x60; - Info * &#x60;success&#x60; - Success * &#x60;warning&#x60; - Warning * &#x60;danger&#x60; - Danger |  [optional] |
|**comments** | **String** |  |  |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| INFO | &quot;info&quot; |
| SUCCESS | &quot;success&quot; |
| WARNING | &quot;warning&quot; |
| DANGER | &quot;danger&quot; |


## Implemented Interfaces

* Serializable


