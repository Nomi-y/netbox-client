

# Cluster

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**type** | [**BriefClusterType**](BriefClusterType.md) |  |  |
|**group** | [**BriefClusterGroup**](BriefClusterGroup.md) |  |  [optional] |
|**status** | [**ClusterStatus**](ClusterStatus.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**scopeType** | **String** |  |  [optional] |
|**scopeId** | **Integer** |  |  [optional] |
|**scope** | **Object** |  |  [readonly] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**deviceCount** | **Long** |  |  [readonly] |
|**virtualmachineCount** | **Long** |  |  [readonly] |
|**allocatedVcpus** | **Double** |  |  [readonly] |
|**allocatedMemory** | **Integer** |  |  [readonly] |
|**allocatedDisk** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


