

# PatchedImageAttachmentRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectType** | **String** |  |  [optional] |
|**objectId** | **Long** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**image** | **File** |  |  [optional] |
|**description** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


