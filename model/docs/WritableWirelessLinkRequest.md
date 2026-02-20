

# WritableWirelessLinkRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interfaceA** | [**PatchedWritableVirtualCircuitTerminationRequestInterface**](PatchedWritableVirtualCircuitTerminationRequestInterface.md) |  |  |
|**interfaceB** | [**PatchedWritableVirtualCircuitTerminationRequestInterface**](PatchedWritableVirtualCircuitTerminationRequestInterface.md) |  |  |
|**ssid** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;connected&#x60; - Connected * &#x60;planned&#x60; - Planned * &#x60;decommissioning&#x60; - Decommissioning |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | * &#x60;open&#x60; - Open * &#x60;wep&#x60; - WEP * &#x60;wpa-personal&#x60; - WPA Personal (PSK) * &#x60;wpa-enterprise&#x60; - WPA Enterprise |  [optional] |
|**authCipher** | [**AuthCipherEnum**](#AuthCipherEnum) | * &#x60;auto&#x60; - Auto * &#x60;tkip&#x60; - TKIP * &#x60;aes&#x60; - AES |  [optional] |
|**authPsk** | **String** |  |  [optional] |
|**distance** | **Double** |  |  [optional] |
|**distanceUnit** | [**DistanceUnitEnum**](#DistanceUnitEnum) | * &#x60;km&#x60; - Kilometers * &#x60;m&#x60; - Meters * &#x60;mi&#x60; - Miles * &#x60;ft&#x60; - Feet |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| PLANNED | &quot;planned&quot; |
| DECOMMISSIONING | &quot;decommissioning&quot; |



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



## Enum: DistanceUnitEnum

| Name | Value |
|---- | -----|
| KM | &quot;km&quot; |
| M | &quot;m&quot; |
| MI | &quot;mi&quot; |
| FT | &quot;ft&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


