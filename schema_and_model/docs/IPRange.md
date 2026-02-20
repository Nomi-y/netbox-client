

# IPRange

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**family** | [**AggregateFamily**](AggregateFamily.md) |  |  |
|**startAddress** | **String** |  |  |
|**endAddress** | **String** |  |  |
|**size** | **Integer** |  |  [readonly] |
|**vrf** | [**BriefVRF**](BriefVRF.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**status** | [**IPRangeStatus**](IPRangeStatus.md) |  |  [optional] |
|**role** | [**BriefRole**](BriefRole.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**markPopulated** | **Boolean** | Prevent the creation of IP addresses within this range |  [optional] |
|**markUtilized** | **Boolean** | Report space as fully utilized |  [optional] |


## Implemented Interfaces

* Serializable


