

# SavedFilter

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**objectTypes** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**user** | **Integer** |  |  [optional] |
|**weight** | **Integer** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**shared** | **Boolean** |  |  [optional] |
|**parameters** | **Object** |  |  |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


