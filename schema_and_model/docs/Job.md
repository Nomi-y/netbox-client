

# Job


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**objectType** | **String** |  |  [readonly] |
|**objectId** | **Long** |  |  [optional] |
|**_object** | **Object** |  |  [readonly] |
|**name** | **String** |  |  |
|**status** | [**BriefJobStatus**](BriefJobStatus.md) |  |  |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**scheduled** | **OffsetDateTime** |  |  [optional] |
|**interval** | **Integer** | Recurrence interval (in minutes) |  [optional] |
|**started** | **OffsetDateTime** |  |  [optional] |
|**completed** | **OffsetDateTime** |  |  [optional] |
|**user** | [**BriefUser**](BriefUser.md) |  |  [readonly] |
|**data** | **Object** |  |  [optional] |
|**error** | **String** |  |  [readonly] |
|**jobId** | **UUID** |  |  |
|**queueName** | **String** | Name of the queue in which this job was enqueued |  [optional] |
|**logEntries** | **List&lt;Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


