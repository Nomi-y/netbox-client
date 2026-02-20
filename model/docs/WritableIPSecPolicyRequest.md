

# WritableIPSecPolicyRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**proposals** | **List&lt;Integer&gt;** |  |  [optional] |
|**pfsGroup** | [**PfsGroupEnum**](#PfsGroupEnum) | Diffie-Hellman group for Perfect Forward Secrecy  * &#x60;1&#x60; - Group 1 * &#x60;2&#x60; - Group 2 * &#x60;5&#x60; - Group 5 * &#x60;14&#x60; - Group 14 * &#x60;15&#x60; - Group 15 * &#x60;16&#x60; - Group 16 * &#x60;17&#x60; - Group 17 * &#x60;18&#x60; - Group 18 * &#x60;19&#x60; - Group 19 * &#x60;20&#x60; - Group 20 * &#x60;21&#x60; - Group 21 * &#x60;22&#x60; - Group 22 * &#x60;23&#x60; - Group 23 * &#x60;24&#x60; - Group 24 * &#x60;25&#x60; - Group 25 * &#x60;26&#x60; - Group 26 * &#x60;27&#x60; - Group 27 * &#x60;28&#x60; - Group 28 * &#x60;29&#x60; - Group 29 * &#x60;30&#x60; - Group 30 * &#x60;31&#x60; - Group 31 * &#x60;32&#x60; - Group 32 * &#x60;33&#x60; - Group 33 * &#x60;34&#x60; - Group 34 |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: PfsGroupEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_5 | 5 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |
| NUMBER_16 | 16 |
| NUMBER_17 | 17 |
| NUMBER_18 | 18 |
| NUMBER_19 | 19 |
| NUMBER_20 | 20 |
| NUMBER_21 | 21 |
| NUMBER_22 | 22 |
| NUMBER_23 | 23 |
| NUMBER_24 | 24 |
| NUMBER_25 | 25 |
| NUMBER_26 | 26 |
| NUMBER_27 | 27 |
| NUMBER_28 | 28 |
| NUMBER_29 | 29 |
| NUMBER_30 | 30 |
| NUMBER_31 | 31 |
| NUMBER_32 | 32 |
| NUMBER_33 | 33 |
| NUMBER_34 | 34 |


## Implemented Interfaces

* Serializable


