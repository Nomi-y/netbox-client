

# SavedFilterRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectTypes** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**user** | **Integer** |  |  [optional] |
|**weight** | **Integer** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**shared** | **Boolean** |  |  [optional] |
|**parameters** | **Object** |  |  |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


