

# Script

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**module** | **Integer** |  |  [readonly] |
|**name** | **String** |  |  [readonly] |
|**description** | **String** |  |  [readonly] |
|**vars** | **Object** |  |  [readonly] |
|**result** | [**BriefJob**](BriefJob.md) |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**isExecutable** | **Boolean** |  |  [readonly] |


## Implemented Interfaces

* Serializable


