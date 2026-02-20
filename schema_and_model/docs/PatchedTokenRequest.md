

# PatchedTokenRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | [**VersionEnum**](#VersionEnum) | * &#x60;1&#x60; - v1 * &#x60;2&#x60; - v2 |  [optional] |
|**user** | [**BookmarkRequestUser**](BookmarkRequestUser.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**lastUsed** | **OffsetDateTime** |  |  [optional] |
|**enabled** | **Boolean** | Disable to temporarily revoke this token without deleting it. |  [optional] |
|**writeEnabled** | **Boolean** | Permit create/update/delete operations using this token |  [optional] |
|**pepperId** | **Integer** | ID of the cryptographic pepper used to hash the token (v2 only) |  [optional] |
|**token** | **String** |  |  [optional] |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |


## Implemented Interfaces

* Serializable


