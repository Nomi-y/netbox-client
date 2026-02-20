

# InventoryItemTemplate

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**deviceType** | [**BriefDeviceType**](BriefDeviceType.md) |  |  |
|**parent** | **Integer** |  |  [optional] |
|**name** | **String** | {module} is accepted as a substitution for the module bay position when attached to a module type. |  |
|**label** | **String** | Physical label |  [optional] |
|**role** | [**BriefInventoryItemRole**](BriefInventoryItemRole.md) |  |  [optional] |
|**manufacturer** | [**BriefManufacturer**](BriefManufacturer.md) |  |  [optional] |
|**partId** | **String** | Manufacturer-assigned part identifier |  [optional] |
|**description** | **String** |  |  [optional] |
|**componentType** | **String** |  |  [optional] |
|**componentId** | **Long** |  |  [optional] |
|**component** | **Object** |  |  [readonly] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**depth** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


