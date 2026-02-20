

# ConfigContext

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**weight** | **Integer** |  |  [optional] |
|**profile** | [**BriefConfigContextProfile**](BriefConfigContextProfile.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**regions** | [**List&lt;Region&gt;**](Region.md) |  |  [optional] |
|**siteGroups** | [**List&lt;SiteGroup&gt;**](SiteGroup.md) |  |  [optional] |
|**sites** | [**List&lt;Site&gt;**](Site.md) |  |  [optional] |
|**locations** | [**List&lt;Location&gt;**](Location.md) |  |  [optional] |
|**deviceTypes** | [**List&lt;DeviceType&gt;**](DeviceType.md) |  |  [optional] |
|**roles** | [**List&lt;DeviceRole&gt;**](DeviceRole.md) |  |  [optional] |
|**platforms** | [**List&lt;Platform&gt;**](Platform.md) |  |  [optional] |
|**clusterTypes** | [**List&lt;ClusterType&gt;**](ClusterType.md) |  |  [optional] |
|**clusterGroups** | [**List&lt;ClusterGroup&gt;**](ClusterGroup.md) |  |  [optional] |
|**clusters** | [**List&lt;Cluster&gt;**](Cluster.md) |  |  [optional] |
|**tenantGroups** | [**List&lt;TenantGroup&gt;**](TenantGroup.md) |  |  [optional] |
|**tenants** | [**List&lt;Tenant&gt;**](Tenant.md) |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**dataSource** | [**BriefDataSource**](BriefDataSource.md) |  |  [optional] |
|**dataPath** | **String** | Path to remote file (relative to data source root) |  [readonly] |
|**dataFile** | [**BriefDataFile**](BriefDataFile.md) |  |  [optional] |
|**dataSynced** | **OffsetDateTime** |  |  [readonly] |
|**data** | **Object** |  |  |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


