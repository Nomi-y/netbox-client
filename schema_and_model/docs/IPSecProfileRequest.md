

# IPSecProfileRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | * &#x60;esp&#x60; - ESP * &#x60;ah&#x60; - AH |  |
|**ikePolicy** | [**IPSecProfileRequestIkePolicy**](IPSecProfileRequestIkePolicy.md) |  |  |
|**ipsecPolicy** | [**IPSecProfileRequestIpsecPolicy**](IPSecProfileRequestIpsecPolicy.md) |  |  |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| ESP | &quot;esp&quot; |
| AH | &quot;ah&quot; |


## Implemented Interfaces

* Serializable


