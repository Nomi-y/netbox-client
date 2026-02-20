

# Owner

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**group** | [**BriefOwnerGroup**](BriefOwnerGroup.md) |  |  |
|**description** | **String** |  |  [optional] |
|**userGroups** | [**List&lt;Group&gt;**](Group.md) |  |  [optional] |
|**users** | [**List&lt;User&gt;**](User.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


