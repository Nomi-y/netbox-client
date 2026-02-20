

# RackReservationRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rack** | [**PatchedWritableRackReservationRequestRack**](PatchedWritableRackReservationRequestRack.md) |  |  |
|**units** | **List&lt;Integer&gt;** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;pending&#x60; - Pending * &#x60;active&#x60; - Active * &#x60;stale&#x60; - Stale |  [optional] |
|**user** | [**BookmarkRequestUser**](BookmarkRequestUser.md) |  |  |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**description** | **String** |  |  |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ACTIVE | &quot;active&quot; |
| STALE | &quot;stale&quot; |


## Implemented Interfaces

* Serializable


