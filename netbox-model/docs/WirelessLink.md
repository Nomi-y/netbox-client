

# WirelessLink

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**interfaceA** | [**BriefInterface**](BriefInterface.md) |  |  |
|**interfaceB** | [**BriefInterface**](BriefInterface.md) |  |  |
|**ssid** | **String** |  |  [optional] |
|**status** | [**CableStatus**](CableStatus.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**authType** | [**WirelessLANAuthType**](WirelessLANAuthType.md) |  |  [optional] |
|**authCipher** | [**WirelessLANAuthCipher**](WirelessLANAuthCipher.md) |  |  [optional] |
|**authPsk** | **String** |  |  [optional] |
|**distance** | **Double** |  |  [optional] |
|**distanceUnit** | [**CircuitDistanceUnit**](CircuitDistanceUnit.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


