

# ExtrasNotificationsCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | **String** |  |  |
|**objectId** | **Long** |  |  |
|**user** | [**BookmarkRequestUser**](BookmarkRequestUser.md) |  |  |
|**read** | **OffsetDateTime** |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | * &#x60;object_created&#x60; - Object created * &#x60;object_updated&#x60; - Object updated * &#x60;object_deleted&#x60; - Object deleted * &#x60;job_started&#x60; - Job started * &#x60;job_completed&#x60; - Job completed * &#x60;job_failed&#x60; - Job failed * &#x60;job_errored&#x60; - Job errored |  |



## Enum: EventTypeEnum

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


