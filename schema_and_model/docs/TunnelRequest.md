

# TunnelRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;planned&#x60; - Planned * &#x60;active&#x60; - Active * &#x60;disabled&#x60; - Disabled |  |
|**group** | [**PatchedWritableTunnelRequestGroup**](PatchedWritableTunnelRequestGroup.md) |  |  [optional] |
|**encapsulation** | [**EncapsulationEnum**](#EncapsulationEnum) | * &#x60;ipsec-transport&#x60; - IPsec - Transport * &#x60;ipsec-tunnel&#x60; - IPsec - Tunnel * &#x60;ip-ip&#x60; - IP-in-IP * &#x60;gre&#x60; - GRE * &#x60;wireguard&#x60; - WireGuard * &#x60;openvpn&#x60; - OpenVPN * &#x60;l2tp&#x60; - L2TP * &#x60;pptp&#x60; - PPTP |  |
|**ipsecProfile** | [**PatchedWritableTunnelRequestIpsecProfile**](PatchedWritableTunnelRequestIpsecProfile.md) |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**tunnelId** | **Long** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;planned&quot; |
| ACTIVE | &quot;active&quot; |
| DISABLED | &quot;disabled&quot; |



## Enum: EncapsulationEnum

| Name | Value |
|---- | -----|
| IPSEC_TRANSPORT | &quot;ipsec-transport&quot; |
| IPSEC_TUNNEL | &quot;ipsec-tunnel&quot; |
| IP_IP | &quot;ip-ip&quot; |
| GRE | &quot;gre&quot; |
| WIREGUARD | &quot;wireguard&quot; |
| OPENVPN | &quot;openvpn&quot; |
| L2TP | &quot;l2tp&quot; |
| PPTP | &quot;pptp&quot; |


## Implemented Interfaces

* Serializable


