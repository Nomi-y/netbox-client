

# IpamPrefixesCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prefix** | **String** |  |  |
|**vrf** | [**IPAddressRequestVrf**](IPAddressRequestVrf.md) |  |  [optional] |
|**scopeType** | **String** |  |  [optional] |
|**scopeId** | **Integer** |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**vlan** | [**InterfaceRequestUntaggedVlan**](InterfaceRequestUntaggedVlan.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Operational status of this prefix  * &#x60;container&#x60; - Container * &#x60;active&#x60; - Active * &#x60;reserved&#x60; - Reserved * &#x60;deprecated&#x60; - Deprecated |  [optional] |
|**role** | [**IPRangeRequestRole**](IPRangeRequestRole.md) |  |  [optional] |
|**isPool** | **Boolean** | All IP addresses within this prefix are considered usable |  [optional] |
|**markUtilized** | **Boolean** | Treat as fully utilized |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONTAINER | &quot;container&quot; |
| ACTIVE | &quot;active&quot; |
| RESERVED | &quot;reserved&quot; |
| DEPRECATED | &quot;deprecated&quot; |


## Implemented Interfaces

* Serializable


