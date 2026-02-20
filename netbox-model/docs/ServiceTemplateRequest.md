

# ServiceTemplateRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | * &#x60;tcp&#x60; - TCP * &#x60;udp&#x60; - UDP * &#x60;sctp&#x60; - SCTP |  [optional] |
|**ports** | **List&lt;Integer&gt;** |  |  |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| TCP | &quot;tcp&quot; |
| UDP | &quot;udp&quot; |
| SCTP | &quot;sctp&quot; |


## Implemented Interfaces

* Serializable


