

# BriefUser

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**username** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  |


## Implemented Interfaces

* Serializable


