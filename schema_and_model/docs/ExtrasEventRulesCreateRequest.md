

# ExtrasEventRulesCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectTypes** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**eventTypes** | [**List&lt;EventTypesEnum&gt;**](#List&lt;EventTypesEnum&gt;) | The types of event which will trigger this rule. |  |
|**conditions** | **Object** | A set of conditions which determine whether the event will be generated. |  [optional] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | * &#x60;webhook&#x60; - Webhook * &#x60;script&#x60; - Script * &#x60;notification&#x60; - Notification |  [optional] |
|**actionObjectType** | **String** |  |  |
|**actionObjectId** | **Long** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |



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



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;webhook&quot; |
| SCRIPT | &quot;script&quot; |
| NOTIFICATION | &quot;notification&quot; |


## Implemented Interfaces

* Serializable


