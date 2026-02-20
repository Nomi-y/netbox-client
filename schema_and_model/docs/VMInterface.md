

# VMInterface

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**virtualMachine** | [**BriefVirtualMachine**](BriefVirtualMachine.md) |  |  |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**parent** | [**NestedVMInterface**](NestedVMInterface.md) |  |  [optional] |
|**bridge** | [**NestedVMInterface**](NestedVMInterface.md) |  |  [optional] |
|**mtu** | **Integer** |  |  [optional] |
|**macAddress** | **String** |  |  [readonly] |
|**primaryMacAddress** | [**BriefMACAddress**](BriefMACAddress.md) |  |  [optional] |
|**macAddresses** | [**List&lt;BriefMACAddress&gt;**](BriefMACAddress.md) |  |  [readonly] |
|**description** | **String** |  |  [optional] |
|**mode** | [**InterfaceMode**](InterfaceMode.md) |  |  [optional] |
|**untaggedVlan** | [**BriefVLAN**](BriefVLAN.md) |  |  [optional] |
|**taggedVlans** | [**List&lt;VLAN&gt;**](VLAN.md) |  |  [optional] |
|**qinqSvlan** | [**BriefVLAN**](BriefVLAN.md) |  |  [optional] |
|**vlanTranslationPolicy** | [**BriefVLANTranslationPolicy**](BriefVLANTranslationPolicy.md) |  |  [optional] |
|**vrf** | [**BriefVRF**](BriefVRF.md) |  |  [optional] |
|**l2vpnTermination** | [**BriefL2VPNTermination**](BriefL2VPNTermination.md) |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**countIpaddresses** | **Integer** |  |  [readonly] |
|**countFhrpGroups** | **Integer** |  |  [readonly] |


## Implemented Interfaces

* Serializable


