

# DataSourceRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;None&#x60; - --------- * &#x60;local&#x60; - Local * &#x60;git&#x60; - Git * &#x60;amazon-s3&#x60; - Amazon S3 |  |
|**sourceUrl** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**syncInterval** | [**SyncIntervalEnum**](#SyncIntervalEnum) | * &#x60;1&#x60; - Minutely * &#x60;60&#x60; - Hourly * &#x60;720&#x60; - 12 hours * &#x60;1440&#x60; - Daily * &#x60;10080&#x60; - Weekly * &#x60;43200&#x60; - 30 days |  [optional] |
|**parameters** | **Object** |  |  [optional] |
|**ignoreRules** | **String** | Patterns (one per line) matching files to ignore when syncing |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |
| GIT | &quot;git&quot; |
| AMAZON_S3 | &quot;amazon-s3&quot; |



## Enum: SyncIntervalEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_60 | 60 |
| NUMBER_720 | 720 |
| NUMBER_1440 | 1440 |
| NUMBER_10080 | 10080 |
| NUMBER_43200 | 43200 |


## Implemented Interfaces

* Serializable


