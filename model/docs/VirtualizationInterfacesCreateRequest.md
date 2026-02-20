

# VirtualizationInterfacesCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**virtualMachine** | [**PatchedVirtualDiskRequestVirtualMachine**](PatchedVirtualDiskRequestVirtualMachine.md) |  |  |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**parent** | **Integer** |  |  [optional] |
|**bridge** | **Integer** |  |  [optional] |
|**mtu** | **Integer** |  |  [optional] |
|**primaryMacAddress** | [**InterfaceRequestPrimaryMacAddress**](InterfaceRequestPrimaryMacAddress.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | IEEE 802.1Q tagging strategy  * &#x60;access&#x60; - Access * &#x60;tagged&#x60; - Tagged * &#x60;tagged-all&#x60; - Tagged (All) * &#x60;q-in-q&#x60; - Q-in-Q (802.1ad) |  [optional] |
|**untaggedVlan** | [**InterfaceRequestUntaggedVlan**](InterfaceRequestUntaggedVlan.md) |  |  [optional] |
|**taggedVlans** | **List&lt;Integer&gt;** |  |  [optional] |
|**qinqSvlan** | [**InterfaceRequestUntaggedVlan**](InterfaceRequestUntaggedVlan.md) |  |  [optional] |
|**vlanTranslationPolicy** | [**InterfaceRequestVlanTranslationPolicy**](InterfaceRequestVlanTranslationPolicy.md) |  |  [optional] |
|**vrf** | [**IPAddressRequestVrf**](IPAddressRequestVrf.md) |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| ACCESS | &quot;access&quot; |
| TAGGED | &quot;tagged&quot; |
| TAGGED_ALL | &quot;tagged-all&quot; |
| Q_IN_Q | &quot;q-in-q&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


