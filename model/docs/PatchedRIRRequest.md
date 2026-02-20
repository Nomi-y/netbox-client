

# PatchedRIRRequest

Base serializer class for models inheriting from OrganizationalModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**slug** | **String** |  |  [optional] |
|**isPrivate** | **Boolean** | IP space managed by this RIR is considered private |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


