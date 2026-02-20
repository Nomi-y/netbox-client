

# BackgroundTask


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**url** | **URI** |  |  [readonly] |
|**description** | **String** |  |  |
|**origin** | **String** |  |  |
|**funcName** | **String** |  |  |
|**args** | **List&lt;Object&gt;** |  |  [readonly] |
|**kwargs** | **Map&lt;String, Object&gt;** |  |  [readonly] |
|**result** | **String** |  |  |
|**timeout** | **Integer** |  |  |
|**resultTtl** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**enqueuedAt** | **OffsetDateTime** |  |  |
|**startedAt** | **OffsetDateTime** |  |  |
|**endedAt** | **OffsetDateTime** |  |  |
|**workerName** | **String** |  |  |
|**position** | **Integer** |  |  [readonly] |
|**status** | **String** |  |  [readonly] |
|**meta** | **Map&lt;String, Object&gt;** |  |  |
|**lastHeartbeat** | **String** |  |  |
|**isFinished** | **Boolean** |  |  |
|**isQueued** | **Boolean** |  |  |
|**isFailed** | **Boolean** |  |  |
|**isStarted** | **Boolean** |  |  |
|**isDeferred** | **Boolean** |  |  |
|**isCanceled** | **Boolean** |  |  |
|**isScheduled** | **Boolean** |  |  |
|**isStopped** | **Boolean** |  |  |


## Implemented Interfaces

* Serializable


