

# WirelessLAN

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**ssid** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**group** | [**BriefWirelessLANGroup**](BriefWirelessLANGroup.md) |  |  [optional] |
|**status** | [**WirelessLANStatus**](WirelessLANStatus.md) |  |  [optional] |
|**vlan** | [**BriefVLAN**](BriefVLAN.md) |  |  [optional] |
|**scopeType** | **String** |  |  [optional] |
|**scopeId** | **Integer** |  |  [optional] |
|**scope** | **Object** |  |  [readonly] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**authType** | [**WirelessLANAuthType**](WirelessLANAuthType.md) |  |  [optional] |
|**authCipher** | [**WirelessLANAuthCipher**](WirelessLANAuthCipher.md) |  |  [optional] |
|**authPsk** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


