

# WritableSiteRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Full name of the site |  |
|**slug** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;planned&#x60; - Planned * &#x60;staging&#x60; - Staging * &#x60;active&#x60; - Active * &#x60;decommissioning&#x60; - Decommissioning * &#x60;retired&#x60; - Retired |  [optional] |
|**region** | [**PatchedWritableSiteRequestRegion**](PatchedWritableSiteRequestRegion.md) |  |  [optional] |
|**group** | [**PatchedWritableSiteRequestGroup**](PatchedWritableSiteRequestGroup.md) |  |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**facility** | **String** | Local facility ID or description |  [optional] |
|**timeZone** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**physicalAddress** | **String** | Physical location of the building |  [optional] |
|**shippingAddress** | **String** | If different from the physical address |  [optional] |
|**latitude** | **Double** | GPS coordinate in decimal format (xx.yyyyyy) |  [optional] |
|**longitude** | **Double** | GPS coordinate in decimal format (xx.yyyyyy) |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**asns** | **List&lt;Integer&gt;** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



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


