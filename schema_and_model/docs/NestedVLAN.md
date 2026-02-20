

# NestedVLAN

Represents an object related through a ForeignKey field. On write, it accepts a primary key (PK) value or a dictionary of attributes which can be used to uniquely identify the related object. This class should be subclassed to return a full representation of the related object on read.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**vid** | **Integer** | Numeric VLAN ID (1-4094) |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


