

# ContactAssignmentRequest

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | **String** |  |  |
|**objectId** | **Long** |  |  |
|**contact** | [**ContactAssignmentRequestContact**](ContactAssignmentRequestContact.md) |  |  |
|**role** | [**ContactAssignmentRequestRole**](ContactAssignmentRequestRole.md) |  |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) | * &#x60;primary&#x60; - Primary * &#x60;secondary&#x60; - Secondary * &#x60;tertiary&#x60; - Tertiary * &#x60;inactive&#x60; - Inactive |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| SECONDARY | &quot;secondary&quot; |
| TERTIARY | &quot;tertiary&quot; |
| INACTIVE | &quot;inactive&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


