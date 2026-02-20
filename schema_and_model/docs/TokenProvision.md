

# TokenProvision

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**version** | [**VersionEnum**](#VersionEnum) | * &#x60;1&#x60; - v1 * &#x60;2&#x60; - v2 |  [optional] |
|**user** | [**BriefUser**](BriefUser.md) |  |  [readonly] |
|**key** | **String** |  |  [readonly] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**lastUsed** | **OffsetDateTime** |  |  [readonly] |
|**enabled** | **Boolean** | Disable to temporarily revoke this token without deleting it. |  [optional] |
|**writeEnabled** | **Boolean** | Permit create/update/delete operations using this token |  [optional] |
|**description** | **String** |  |  [optional] |
|**token** | **String** |  |  [optional] |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |


## Implemented Interfaces

* Serializable


