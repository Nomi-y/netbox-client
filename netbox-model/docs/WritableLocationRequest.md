

# WritableLocationRequest

Base serializer class for models inheriting from NestedGroupModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**site** | [**DeviceWithConfigContextRequestSite**](DeviceWithConfigContextRequestSite.md) |  |  |
|**parent** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;planned&#x60; - Planned * &#x60;staging&#x60; - Staging * &#x60;active&#x60; - Active * &#x60;decommissioning&#x60; - Decommissioning * &#x60;retired&#x60; - Retired |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**facility** | **String** | Local facility ID or description |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;planned&quot; |
| STAGING | &quot;staging&quot; |
| ACTIVE | &quot;active&quot; |
| DECOMMISSIONING | &quot;decommissioning&quot; |
| RETIRED | &quot;retired&quot; |


## Implemented Interfaces

* Serializable


