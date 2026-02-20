

# VRF

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**rd** | **String** | Unique route distinguisher (as defined in RFC 4364) |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**enforceUnique** | **Boolean** | Prevent duplicate prefixes/IP addresses within this VRF |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**importTargets** | [**List&lt;RouteTarget&gt;**](RouteTarget.md) |  |  [optional] |
|**exportTargets** | [**List&lt;RouteTarget&gt;**](RouteTarget.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**ipaddressCount** | **Long** |  |  [readonly] |
|**prefixCount** | **Long** |  |  [readonly] |


## Implemented Interfaces

* Serializable


