

# VLAN

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**site** | [**BriefSite**](BriefSite.md) |  |  [optional] |
|**group** | [**BriefVLANGroup**](BriefVLANGroup.md) |  |  [optional] |
|**vid** | **Integer** | Numeric VLAN ID (1-4094) |  |
|**name** | **String** |  |  |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**status** | [**IPRangeStatus**](IPRangeStatus.md) |  |  [optional] |
|**role** | [**BriefRole**](BriefRole.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**qinqRole** | [**VLANQinqRole**](VLANQinqRole.md) |  |  [optional] |
|**qinqSvlan** | [**NestedVLAN**](NestedVLAN.md) |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**l2vpnTermination** | [**BriefL2VPNTermination**](BriefL2VPNTermination.md) |  |  [readonly] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**prefixCount** | **Long** |  |  [readonly] |


## Implemented Interfaces

* Serializable


