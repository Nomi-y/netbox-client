

# TunnelEncapsulation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | [**ValueEnum**](#ValueEnum) | * &#x60;ipsec-transport&#x60; - IPsec - Transport * &#x60;ipsec-tunnel&#x60; - IPsec - Tunnel * &#x60;ip-ip&#x60; - IP-in-IP * &#x60;gre&#x60; - GRE * &#x60;wireguard&#x60; - WireGuard * &#x60;openvpn&#x60; - OpenVPN * &#x60;l2tp&#x60; - L2TP * &#x60;pptp&#x60; - PPTP |  [optional] |
|**label** | [**LabelEnum**](#LabelEnum) |  |  [optional] |



## Enum: ValueEnum

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



## Enum: LabelEnum

| Name | Value |
|---- | -----|
| I_PSEC_TRANSPORT | &quot;IPsec - Transport&quot; |
| I_PSEC_TUNNEL | &quot;IPsec - Tunnel&quot; |
| IP_IN_IP | &quot;IP-in-IP&quot; |
| GRE | &quot;GRE&quot; |
| WIRE_GUARD | &quot;WireGuard&quot; |
| OPEN_VPN | &quot;OpenVPN&quot; |
| L2_TP | &quot;L2TP&quot; |
| PPTP | &quot;PPTP&quot; |


## Implemented Interfaces

* Serializable


