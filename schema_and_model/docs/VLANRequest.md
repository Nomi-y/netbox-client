

# VLANRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**site** | [**PatchedWritableVLANRequestSite**](PatchedWritableVLANRequestSite.md) |  |  [optional] |
|**group** | [**PatchedWritableVLANRequestGroup**](PatchedWritableVLANRequestGroup.md) |  |  [optional] |
|**vid** | **Integer** | Numeric VLAN ID (1-4094) |  |
|**name** | **String** |  |  |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;active&#x60; - Active * &#x60;reserved&#x60; - Reserved * &#x60;deprecated&#x60; - Deprecated |  [optional] |
|**role** | [**IPRangeRequestRole**](IPRangeRequestRole.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**qinqRole** | [**QinqRoleEnum**](#QinqRoleEnum) | * &#x60;svlan&#x60; - Service * &#x60;cvlan&#x60; - Customer |  [optional] |
|**qinqSvlan** | [**NestedVLANRequest**](NestedVLANRequest.md) |  |  [optional] |
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



## Enum: QinqRoleEnum

| Name | Value |
|---- | -----|
| SVLAN | &quot;svlan&quot; |
| CVLAN | &quot;cvlan&quot; |


## Implemented Interfaces

* Serializable


