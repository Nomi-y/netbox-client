

# EventRule

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
|**enabled** | **Boolean** |  |  [optional] |
|**eventTypes** | [**List&lt;EventTypesEnum&gt;**](#List&lt;EventTypesEnum&gt;) | The types of event which will trigger this rule. |  |
|**conditions** | **Object** | A set of conditions which determine whether the event will be generated. |  [optional] |
|**actionType** | [**EventRuleActionType**](EventRuleActionType.md) |  |  |
|**actionObjectType** | **String** |  |  |
|**actionObjectId** | **Long** |  |  [optional] |
|**actionObject** | **Object** |  |  [readonly] |
|**description** | **String** |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |



## Enum: List&lt;EventTypesEnum&gt;

| Name | Value |
|---- | -----|
| OBJECT_CREATED | &quot;object_created&quot; |
| OBJECT_UPDATED | &quot;object_updated&quot; |
| OBJECT_DELETED | &quot;object_deleted&quot; |
| JOB_STARTED | &quot;job_started&quot; |
| JOB_COMPLETED | &quot;job_completed&quot; |
| JOB_FAILED | &quot;job_failed&quot; |
| JOB_ERRORED | &quot;job_errored&quot; |


## Implemented Interfaces

* Serializable


