

# IKEPolicyRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**version** | [**VersionEnum**](#VersionEnum) | * &#x60;1&#x60; - IKEv1 * &#x60;2&#x60; - IKEv2 |  |
|**mode** | [**ModeEnum**](#ModeEnum) | * &#x60;aggressive&#x60; - Aggressive * &#x60;main&#x60; - Main |  [optional] |
|**proposals** | **List&lt;Integer&gt;** |  |  [optional] |
|**presharedKey** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| AGGRESSIVE | &quot;aggressive&quot; |
| MAIN | &quot;main&quot; |


## Implemented Interfaces

* Serializable


