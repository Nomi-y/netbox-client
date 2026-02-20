

# DeviceBayTemplateRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceType** | [**DeviceBayTemplateRequestDeviceType**](DeviceBayTemplateRequestDeviceType.md) |  |  |
|**name** | **String** | {module} is accepted as a substitution for the module bay position when attached to a module type. |  |
|**label** | **String** | Physical label |  [optional] |
|**description** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


