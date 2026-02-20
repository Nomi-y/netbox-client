

# ModelInterface

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**device** | [**BriefDevice**](BriefDevice.md) |  |  |
|**vdcs** | [**List&lt;VirtualDeviceContext&gt;**](VirtualDeviceContext.md) |  |  [optional] |
|**module** | [**BriefModule**](BriefModule.md) |  |  [optional] |
|**name** | **String** |  |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**InterfaceType**](InterfaceType.md) |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**parent** | [**NestedInterface**](NestedInterface.md) |  |  [optional] |
|**bridge** | [**NestedInterface**](NestedInterface.md) |  |  [optional] |
|**bridgeInterfaces** | [**List&lt;NestedInterface&gt;**](NestedInterface.md) |  |  [readonly] |
|**lag** | [**NestedInterface**](NestedInterface.md) |  |  [optional] |
|**mtu** | **Integer** |  |  [optional] |
|**macAddress** | **String** |  |  [readonly] |
|**primaryMacAddress** | [**BriefMACAddress**](BriefMACAddress.md) |  |  [optional] |
|**macAddresses** | [**List&lt;BriefMACAddress&gt;**](BriefMACAddress.md) |  |  [readonly] |
|**speed** | **Integer** |  |  [optional] |
|**duplex** | [**InterfaceDuplex**](InterfaceDuplex.md) |  |  [optional] |
|**wwn** | **String** |  |  [optional] |
|**mgmtOnly** | **Boolean** | This interface is used only for out-of-band management |  [optional] |
|**description** | **String** |  |  [optional] |
|**mode** | [**InterfaceMode**](InterfaceMode.md) |  |  [optional] |
|**rfRole** | [**InterfaceRfRole**](InterfaceRfRole.md) |  |  [optional] |
|**rfChannel** | [**InterfaceRfChannel**](InterfaceRfChannel.md) |  |  [optional] |
|**poeMode** | [**InterfacePoeMode**](InterfacePoeMode.md) |  |  [optional] |
|**poeType** | [**InterfacePoeType**](InterfacePoeType.md) |  |  [optional] |
|**rfChannelFrequency** | **Double** | Populated by selected channel (if set) |  [optional] |
|**rfChannelWidth** | **Double** | Populated by selected channel (if set) |  [optional] |
|**txPower** | **Integer** |  |  [optional] |
|**untaggedVlan** | [**BriefVLAN**](BriefVLAN.md) |  |  [optional] |
|**taggedVlans** | [**List&lt;VLAN&gt;**](VLAN.md) |  |  [optional] |
|**qinqSvlan** | [**BriefVLAN**](BriefVLAN.md) |  |  [optional] |
|**vlanTranslationPolicy** | [**BriefVLANTranslationPolicy**](BriefVLANTranslationPolicy.md) |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**cable** | [**BriefCable**](BriefCable.md) |  |  [readonly] |
|**cableEnd** | **String** |  |  [readonly] |
|**wirelessLink** | [**NestedWirelessLink**](NestedWirelessLink.md) |  |  [readonly] |
|**linkPeers** | **List&lt;Object&gt;** |  |  [readonly] |
|**linkPeersType** | **String** | Return the type of the peer link terminations, or None. |  [readonly] |
|**wirelessLans** | [**List&lt;WirelessLAN&gt;**](WirelessLAN.md) |  |  [optional] |
|**vrf** | [**BriefVRF**](BriefVRF.md) |  |  [optional] |
|**l2vpnTermination** | [**BriefL2VPNTermination**](BriefL2VPNTermination.md) |  |  [readonly] |
|**connectedEndpoints** | **List&lt;Object&gt;** |  |  [readonly] |
|**connectedEndpointsType** | **String** |  |  [readonly] |
|**connectedEndpointsReachable** | **Boolean** |  |  [readonly] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |
|**countIpaddresses** | **Integer** |  |  [readonly] |
|**countFhrpGroups** | **Integer** |  |  [readonly] |
|**occupied** | **Boolean** |  |  [readonly] |


## Implemented Interfaces

* Serializable


