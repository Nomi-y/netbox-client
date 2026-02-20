

# UsersPermissionsCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**objectTypes** | **List&lt;String&gt;** |  |  |
|**actions** | **List&lt;String&gt;** | The list of actions granted by this permission |  |
|**constraints** | **Object** | Queryset filter matching the applicable objects of the selected type(s) |  [optional] |
|**groups** | **List&lt;Integer&gt;** |  |  [optional] |
|**users** | **List&lt;Integer&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


