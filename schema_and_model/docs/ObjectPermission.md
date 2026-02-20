

# ObjectPermission

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**objectTypes** | **List&lt;String&gt;** |  |  |
|**actions** | **List&lt;String&gt;** | The list of actions granted by this permission |  |
|**constraints** | **Object** | Queryset filter matching the applicable objects of the selected type(s) |  [optional] |
|**groups** | [**List&lt;NestedGroup&gt;**](NestedGroup.md) |  |  [optional] |
|**users** | [**List&lt;NestedUser&gt;**](NestedUser.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


