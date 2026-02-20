

# FrontPortTemplate

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**deviceType** | [**BriefDeviceType**](BriefDeviceType.md) |  |  [optional] |
|**moduleType** | [**BriefModuleType**](BriefModuleType.md) |  |  [optional] |
|**name** | **String** | {module} is accepted as a substitution for the module bay position when attached to a module type. |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**FrontPortType**](FrontPortType.md) |  |  |
|**color** | **String** |  |  [optional] |
|**positions** | **Integer** |  |  [optional] |
|**rearPorts** | [**List&lt;FrontPortTemplateMapping&gt;**](FrontPortTemplateMapping.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


