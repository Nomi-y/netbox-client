

# WirelessLANRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ssid** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**group** | [**PatchedWritableWirelessLANRequestGroup**](PatchedWritableWirelessLANRequestGroup.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;active&#x60; - Active * &#x60;reserved&#x60; - Reserved * &#x60;disabled&#x60; - Disabled * &#x60;deprecated&#x60; - Deprecated |  [optional] |
|**vlan** | [**InterfaceRequestUntaggedVlan**](InterfaceRequestUntaggedVlan.md) |  |  [optional] |
|**scopeType** | **String** |  |  [optional] |
|**scopeId** | **Integer** |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | * &#x60;open&#x60; - Open * &#x60;wep&#x60; - WEP * &#x60;wpa-personal&#x60; - WPA Personal (PSK) * &#x60;wpa-enterprise&#x60; - WPA Enterprise |  [optional] |
|**authCipher** | [**AuthCipherEnum**](#AuthCipherEnum) | * &#x60;auto&#x60; - Auto * &#x60;tkip&#x60; - TKIP * &#x60;aes&#x60; - AES |  [optional] |
|**authPsk** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| RESERVED | &quot;reserved&quot; |
| DISABLED | &quot;disabled&quot; |
| DEPRECATED | &quot;deprecated&quot; |
| EMPTY | &quot;&quot; |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| WEP | &quot;wep&quot; |
| WPA_PERSONAL | &quot;wpa-personal&quot; |
| WPA_ENTERPRISE | &quot;wpa-enterprise&quot; |
| EMPTY | &quot;&quot; |



## Enum: AuthCipherEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| TKIP | &quot;tkip&quot; |
| AES | &quot;aes&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


