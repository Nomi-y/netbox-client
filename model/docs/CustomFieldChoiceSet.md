

# CustomFieldChoiceSet

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**baseChoices** | [**CustomFieldChoiceSetBaseChoices**](CustomFieldChoiceSetBaseChoices.md) |  |  [optional] |
|**extraChoices** | **List&lt;List&lt;Object&gt;&gt;** |  |  |
|**orderAlphabetically** | **Boolean** | Choices are automatically ordered alphabetically |  [optional] |
|**choicesCount** | **Integer** |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


