

# User

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**username** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**isActive** | **Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [optional] |
|**dateJoined** | **OffsetDateTime** |  |  [optional] |
|**lastLogin** | **OffsetDateTime** |  |  [optional] |
|**groups** | [**List&lt;Group&gt;**](Group.md) |  |  [optional] |
|**permissions** | [**List&lt;ObjectPermission&gt;**](ObjectPermission.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


