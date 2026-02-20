

# L2VPN

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**identifier** | **Long** |  |  [optional] |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**type** | [**BriefL2VPNType**](BriefL2VPNType.md) |  |  [optional] |
|**status** | [**L2VPNStatus**](L2VPNStatus.md) |  |  [optional] |
|**importTargets** | [**List&lt;RouteTarget&gt;**](RouteTarget.md) |  |  [optional] |
|**exportTargets** | [**List&lt;RouteTarget&gt;**](RouteTarget.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


