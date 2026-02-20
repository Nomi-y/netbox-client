

# PatchedObjectPermissionRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**objectTypes** | **List&lt;String&gt;** |  |  [optional] |
|**actions** | **List&lt;String&gt;** | The list of actions granted by this permission |  [optional] |
|**constraints** | **Object** | Queryset filter matching the applicable objects of the selected type(s) |  [optional] |
|**groups** | **List&lt;Integer&gt;** |  |  [optional] |
|**users** | **List&lt;Integer&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


