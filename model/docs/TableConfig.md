

# TableConfig

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**objectType** | **String** |  |  |
|**table** | **String** |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**user** | **Integer** |  |  [optional] |
|**weight** | **Integer** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**shared** | **Boolean** |  |  [optional] |
|**columns** | **List&lt;String&gt;** |  |  |
|**ordering** | **List&lt;String&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


