

# PatchedWritableIPAddressRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** |  |  [optional] |
|**vrf** | [**IPAddressRequestVrf**](IPAddressRequestVrf.md) |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The operational status of this IP  * &#x60;active&#x60; - Active * &#x60;reserved&#x60; - Reserved * &#x60;deprecated&#x60; - Deprecated * &#x60;dhcp&#x60; - DHCP * &#x60;slaac&#x60; - SLAAC |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The functional role of this IP  * &#x60;loopback&#x60; - Loopback * &#x60;secondary&#x60; - Secondary * &#x60;anycast&#x60; - Anycast * &#x60;vip&#x60; - VIP * &#x60;vrrp&#x60; - VRRP * &#x60;hsrp&#x60; - HSRP * &#x60;glbp&#x60; - GLBP * &#x60;carp&#x60; - CARP |  [optional] |
|**assignedObjectType** | **String** |  |  [optional] |
|**assignedObjectId** | **Long** |  |  [optional] |
|**natInside** | **Integer** | The IP for which this address is the \&quot;outside\&quot; IP |  [optional] |
|**dnsName** | **String** | Hostname or FQDN (not case-sensitive) |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| RESERVED | &quot;reserved&quot; |
| DEPRECATED | &quot;deprecated&quot; |
| DHCP | &quot;dhcp&quot; |
| SLAAC | &quot;slaac&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| LOOPBACK | &quot;loopback&quot; |
| SECONDARY | &quot;secondary&quot; |
| ANYCAST | &quot;anycast&quot; |
| VIP | &quot;vip&quot; |
| VRRP | &quot;vrrp&quot; |
| HSRP | &quot;hsrp&quot; |
| GLBP | &quot;glbp&quot; |
| CARP | &quot;carp&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


