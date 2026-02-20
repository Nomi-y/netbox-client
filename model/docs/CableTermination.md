

# CableTermination

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**cable** | **Integer** |  |  [readonly] |
|**cableEnd** | [**CableEndEnum**](#CableEndEnum) | * &#x60;A&#x60; - A * &#x60;B&#x60; - B |  [readonly] |
|**terminationType** | **String** |  |  [readonly] |
|**terminationId** | **Integer** |  |  [readonly] |
|**termination** | **Object** |  |  [readonly] |
|**connector** | **Integer** |  |  [readonly] |
|**positions** | **List&lt;Integer&gt;** |  |  [readonly] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |



## Enum: CableEndEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |


## Implemented Interfaces

* Serializable


