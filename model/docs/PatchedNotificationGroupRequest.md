

# PatchedNotificationGroupRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**groups** | **List&lt;Integer&gt;** |  |  [optional] |
|**users** | **List&lt;Integer&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


