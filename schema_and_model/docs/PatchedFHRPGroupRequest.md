

# PatchedFHRPGroupRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | * &#x60;vrrp2&#x60; - VRRPv2 * &#x60;vrrp3&#x60; - VRRPv3 * &#x60;carp&#x60; - CARP * &#x60;clusterxl&#x60; - ClusterXL * &#x60;hsrp&#x60; - HSRP * &#x60;glbp&#x60; - GLBP * &#x60;other&#x60; - Other |  [optional] |
|**groupId** | **Integer** |  |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) | * &#x60;plaintext&#x60; - Plaintext * &#x60;md5&#x60; - MD5 |  [optional] |
|**authKey** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



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



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| PLAINTEXT | &quot;plaintext&quot; |
| MD5 | &quot;md5&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


