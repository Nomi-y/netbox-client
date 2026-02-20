

# Site

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** | Full name of the site |  |
|**slug** | **String** |  |  |
|**status** | [**LocationStatus**](LocationStatus.md) |  |  [optional] |
|**region** | [**BriefRegion**](BriefRegion.md) |  |  [optional] |
|**group** | [**BriefSiteGroup**](BriefSiteGroup.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**facility** | **String** | Local facility ID or description |  [optional] |
|**timeZone** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**physicalAddress** | **String** | Physical location of the building |  [optional] |
|**shippingAddress** | **String** | If different from the physical address |  [optional] |
|**latitude** | **Double** | GPS coordinate in decimal format (xx.yyyyyy) |  [optional] |
|**longitude** | **Double** | GPS coordinate in decimal format (xx.yyyyyy) |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**asns** | [**List&lt;ASN&gt;**](ASN.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**circuitCount** | **Long** |  |  [readonly] |
|**deviceCount** | **Long** |  |  [readonly] |
|**prefixCount** | **Long** |  |  [readonly] |
|**rackCount** | **Long** |  |  [readonly] |
|**virtualmachineCount** | **Long** |  |  [readonly] |
|**vlanCount** | **Long** |  |  [readonly] |


## Implemented Interfaces

* Serializable


