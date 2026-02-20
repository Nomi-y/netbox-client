

# BriefFHRPGroupRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | * &#x60;vrrp2&#x60; - VRRPv2 * &#x60;vrrp3&#x60; - VRRPv3 * &#x60;carp&#x60; - CARP * &#x60;clusterxl&#x60; - ClusterXL * &#x60;hsrp&#x60; - HSRP * &#x60;glbp&#x60; - GLBP * &#x60;other&#x60; - Other |  |
|**groupId** | **Integer** |  |  |
|**description** | **String** |  |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| VRRP2 | &quot;vrrp2&quot; |
| VRRP3 | &quot;vrrp3&quot; |
| CARP | &quot;carp&quot; |
| CLUSTERXL | &quot;clusterxl&quot; |
| HSRP | &quot;hsrp&quot; |
| GLBP | &quot;glbp&quot; |
| OTHER | &quot;other&quot; |


## Implemented Interfaces

* Serializable


