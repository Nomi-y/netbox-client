

# RackReservation

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**rack** | [**BriefRack**](BriefRack.md) |  |  |
|**units** | **List&lt;Integer&gt;** |  |  |
|**status** | [**RackReservationStatus**](RackReservationStatus.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**user** | [**BriefUser**](BriefUser.md) |  |  |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**description** | **String** |  |  |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


