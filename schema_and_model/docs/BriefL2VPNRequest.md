

# BriefL2VPNRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **Long** |  |  [optional] |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;vpws&#x60; - VPWS * &#x60;vpls&#x60; - VPLS * &#x60;vxlan&#x60; - VXLAN * &#x60;vxlan-evpn&#x60; - VXLAN-EVPN * &#x60;mpls-evpn&#x60; - MPLS EVPN * &#x60;pbb-evpn&#x60; - PBB EVPN * &#x60;evpn-vpws&#x60; - EVPN VPWS * &#x60;epl&#x60; - EPL * &#x60;evpl&#x60; - EVPL * &#x60;ep-lan&#x60; - Ethernet Private LAN * &#x60;evp-lan&#x60; - Ethernet Virtual Private LAN * &#x60;ep-tree&#x60; - Ethernet Private Tree * &#x60;evp-tree&#x60; - Ethernet Virtual Private Tree * &#x60;spb&#x60; - SPB |  [optional] |
|**description** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VPWS | &quot;vpws&quot; |
| VPLS | &quot;vpls&quot; |
| VXLAN | &quot;vxlan&quot; |
| VXLAN_EVPN | &quot;vxlan-evpn&quot; |
| MPLS_EVPN | &quot;mpls-evpn&quot; |
| PBB_EVPN | &quot;pbb-evpn&quot; |
| EVPN_VPWS | &quot;evpn-vpws&quot; |
| EPL | &quot;epl&quot; |
| EVPL | &quot;evpl&quot; |
| EP_LAN | &quot;ep-lan&quot; |
| EVP_LAN | &quot;evp-lan&quot; |
| EP_TREE | &quot;ep-tree&quot; |
| EVP_TREE | &quot;evp-tree&quot; |
| SPB | &quot;spb&quot; |


## Implemented Interfaces

* Serializable


