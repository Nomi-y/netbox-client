

# NotificationGroup

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**groups** | [**List&lt;Group&gt;**](Group.md) |  |  [optional] |
|**users** | [**List&lt;User&gt;**](User.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


