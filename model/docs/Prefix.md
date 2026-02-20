

# Prefix

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**family** | [**AggregateFamily**](AggregateFamily.md) |  |  |
|**prefix** | **String** |  |  |
|**vrf** | [**BriefVRF**](BriefVRF.md) |  |  [optional] |
|**scopeType** | **String** |  |  [optional] |
|**scopeId** | **Integer** |  |  [optional] |
|**scope** | **Object** |  |  [readonly] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**vlan** | [**BriefVLAN**](BriefVLAN.md) |  |  [optional] |
|**status** | [**PrefixStatus**](PrefixStatus.md) |  |  [optional] |
|**role** | [**BriefRole**](BriefRole.md) |  |  [optional] |
|**isPool** | **Boolean** | All IP addresses within this prefix are considered usable |  [optional] |
|**markUtilized** | **Boolean** | Treat as fully utilized |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**children** | **Integer** |  |  [readonly] |
|**depth** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


