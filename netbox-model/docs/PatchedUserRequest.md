

# PatchedUserRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  [optional] |
|**password** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**isActive** | **Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [optional] |
|**dateJoined** | **OffsetDateTime** |  |  [optional] |
|**lastLogin** | **OffsetDateTime** |  |  [optional] |
|**groups** | **List&lt;Integer&gt;** |  |  [optional] |
|**permissions** | **List&lt;Integer&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


