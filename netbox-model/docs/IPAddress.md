

# IPAddress

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**family** | [**AggregateFamily**](AggregateFamily.md) |  |  |
|**address** | **String** |  |  |
|**vrf** | [**BriefVRF**](BriefVRF.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**status** | [**IPAddressStatus**](IPAddressStatus.md) |  |  [optional] |
|**role** | [**IPAddressRole**](IPAddressRole.md) |  |  [optional] |
|**assignedObjectType** | **String** |  |  [optional] |
|**assignedObjectId** | **Long** |  |  [optional] |
|**assignedObject** | **Object** |  |  [readonly] |
|**natInside** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional] |
|**natOutside** | [**List&lt;NestedIPAddress&gt;**](NestedIPAddress.md) |  |  [readonly] |
|**dnsName** | **String** | Hostname or FQDN (not case-sensitive) |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


