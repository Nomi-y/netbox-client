

# ContactAssignment

Adds support for custom fields and tags.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**objectType** | **String** |  |  |
|**objectId** | **Long** |  |  |
|**_object** | **Object** |  |  [readonly] |
|**contact** | [**BriefContact**](BriefContact.md) |  |  |
|**role** | [**BriefContactRole**](BriefContactRole.md) |  |  [optional] |
|**priority** | [**BriefCircuitGroupAssignmentSerializerPriority**](BriefCircuitGroupAssignmentSerializerPriority.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


