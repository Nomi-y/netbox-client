

# RackUnit

A rack unit is an abstraction formed by the set (rack, position, face); it does not exist as a row in the database.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Double** |  |  [readonly] |
|**name** | **String** |  |  [readonly] |
|**face** | [**RackUnitFace**](RackUnitFace.md) |  |  |
|**device** | [**BriefDevice**](BriefDevice.md) |  |  [readonly] |
|**occupied** | **Boolean** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |


## Implemented Interfaces

* Serializable


