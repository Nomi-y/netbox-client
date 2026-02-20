

# PatchedWritableConsolePortRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**device** | [**BriefInterfaceRequestDevice**](BriefInterfaceRequestDevice.md) |  |  [optional] |
|**module** | [**ConsolePortRequestModule**](ConsolePortRequestModule.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Physical port type  * &#x60;de-9&#x60; - DE-9 * &#x60;db-25&#x60; - DB-25 * &#x60;rj-11&#x60; - RJ-11 * &#x60;rj-12&#x60; - RJ-12 * &#x60;rj-45&#x60; - RJ-45 * &#x60;mini-din-8&#x60; - Mini-DIN 8 * &#x60;usb-a&#x60; - USB Type A * &#x60;usb-b&#x60; - USB Type B * &#x60;usb-c&#x60; - USB Type C * &#x60;usb-mini-a&#x60; - USB Mini A * &#x60;usb-mini-b&#x60; - USB Mini B * &#x60;usb-micro-a&#x60; - USB Micro A * &#x60;usb-micro-b&#x60; - USB Micro B * &#x60;usb-micro-ab&#x60; - USB Micro AB * &#x60;other&#x60; - Other |  [optional] |
|**speed** | [**SpeedEnum**](#SpeedEnum) | Port speed in bits per second  * &#x60;1200&#x60; - 1200 bps * &#x60;2400&#x60; - 2400 bps * &#x60;4800&#x60; - 4800 bps * &#x60;9600&#x60; - 9600 bps * &#x60;19200&#x60; - 19.2 kbps * &#x60;38400&#x60; - 38.4 kbps * &#x60;57600&#x60; - 57.6 kbps * &#x60;115200&#x60; - 115.2 kbps |  [optional] |
|**description** | **String** |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DE_9 | &quot;de-9&quot; |
| DB_25 | &quot;db-25&quot; |
| RJ_11 | &quot;rj-11&quot; |
| RJ_12 | &quot;rj-12&quot; |
| RJ_45 | &quot;rj-45&quot; |
| MINI_DIN_8 | &quot;mini-din-8&quot; |
| USB_A | &quot;usb-a&quot; |
| USB_B | &quot;usb-b&quot; |
| USB_C | &quot;usb-c&quot; |
| USB_MINI_A | &quot;usb-mini-a&quot; |
| USB_MINI_B | &quot;usb-mini-b&quot; |
| USB_MICRO_A | &quot;usb-micro-a&quot; |
| USB_MICRO_B | &quot;usb-micro-b&quot; |
| USB_MICRO_AB | &quot;usb-micro-ab&quot; |
| OTHER | &quot;other&quot; |
| EMPTY | &quot;&quot; |



## Enum: SpeedEnum

| Name | Value |
|---- | -----|
| NUMBER_1200 | 1200 |
| NUMBER_2400 | 2400 |
| NUMBER_4800 | 4800 |
| NUMBER_9600 | 9600 |
| NUMBER_19200 | 19200 |
| NUMBER_38400 | 38400 |
| NUMBER_57600 | 57600 |
| NUMBER_115200 | 115200 |


## Implemented Interfaces

* Serializable


