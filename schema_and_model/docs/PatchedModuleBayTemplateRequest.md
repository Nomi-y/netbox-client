

# PatchedModuleBayTemplateRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceType** | [**ConsolePortTemplateRequestDeviceType**](ConsolePortTemplateRequestDeviceType.md) |  |  [optional] |
|**moduleType** | [**ConsolePortTemplateRequestModuleType**](ConsolePortTemplateRequestModuleType.md) |  |  [optional] |
|**name** | **String** | {module} is accepted as a substitution for the module bay position when attached to a module type. |  [optional] |
|**label** | **String** | Physical label |  [optional] |
|**position** | **String** | Identifier to reference when renaming installed components |  [optional] |
|**description** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


