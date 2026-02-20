

# PatchedWritableCustomFieldChoiceSetRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**baseChoices** | [**BaseChoicesEnum**](#BaseChoicesEnum) | Base set of predefined choices (optional)  * &#x60;IATA&#x60; - IATA (Airport codes) * &#x60;ISO_3166&#x60; - ISO 3166 (Country codes) * &#x60;UN_LOCODE&#x60; - UN/LOCODE (Location codes) |  [optional] |
|**extraChoices** | **List&lt;List&lt;Object&gt;&gt;** |  |  [optional] |
|**orderAlphabetically** | **Boolean** | Choices are automatically ordered alphabetically |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |



## Enum: BaseChoicesEnum

| Name | Value |
|---- | -----|
| IATA | &quot;IATA&quot; |
| ISO_3166 | &quot;ISO_3166&quot; |
| UN_LOCODE | &quot;UN_LOCODE&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


