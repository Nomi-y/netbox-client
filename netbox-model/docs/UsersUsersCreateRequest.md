

# UsersUsersCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  |
|**password** | **String** |  |  |
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


