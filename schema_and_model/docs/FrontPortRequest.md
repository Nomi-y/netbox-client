

# FrontPortRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**device** | [**BriefInterfaceRequestDevice**](BriefInterfaceRequestDevice.md) |  |  |
|**module** | [**ConsolePortRequestModule**](ConsolePortRequestModule.md) |  |  [optional] |
|**name** | **String** |  |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;8p8c&#x60; - 8P8C * &#x60;8p6c&#x60; - 8P6C * &#x60;8p4c&#x60; - 8P4C * &#x60;8p2c&#x60; - 8P2C * &#x60;6p6c&#x60; - 6P6C * &#x60;6p4c&#x60; - 6P4C * &#x60;6p2c&#x60; - 6P2C * &#x60;4p4c&#x60; - 4P4C * &#x60;4p2c&#x60; - 4P2C * &#x60;gg45&#x60; - GG45 * &#x60;tera-4p&#x60; - TERA 4P * &#x60;tera-2p&#x60; - TERA 2P * &#x60;tera-1p&#x60; - TERA 1P * &#x60;110-punch&#x60; - 110 Punch * &#x60;bnc&#x60; - BNC * &#x60;f&#x60; - F Connector * &#x60;n&#x60; - N Connector * &#x60;mrj21&#x60; - MRJ21 * &#x60;fc&#x60; - FC * &#x60;fc-pc&#x60; - FC/PC * &#x60;fc-upc&#x60; - FC/UPC * &#x60;fc-apc&#x60; - FC/APC * &#x60;lc&#x60; - LC * &#x60;lc-pc&#x60; - LC/PC * &#x60;lc-upc&#x60; - LC/UPC * &#x60;lc-apc&#x60; - LC/APC * &#x60;lsh&#x60; - LSH * &#x60;lsh-pc&#x60; - LSH/PC * &#x60;lsh-upc&#x60; - LSH/UPC * &#x60;lsh-apc&#x60; - LSH/APC * &#x60;lx5&#x60; - LX.5 * &#x60;lx5-pc&#x60; - LX.5/PC * &#x60;lx5-upc&#x60; - LX.5/UPC * &#x60;lx5-apc&#x60; - LX.5/APC * &#x60;mpo&#x60; - MPO * &#x60;mtrj&#x60; - MTRJ * &#x60;sc&#x60; - SC * &#x60;sc-pc&#x60; - SC/PC * &#x60;sc-upc&#x60; - SC/UPC * &#x60;sc-apc&#x60; - SC/APC * &#x60;st&#x60; - ST * &#x60;cs&#x60; - CS * &#x60;sn&#x60; - SN * &#x60;sma-905&#x60; - SMA 905 * &#x60;sma-906&#x60; - SMA 906 * &#x60;urm-p2&#x60; - URM-P2 * &#x60;urm-p4&#x60; - URM-P4 * &#x60;urm-p8&#x60; - URM-P8 * &#x60;splice&#x60; - Splice * &#x60;usb-a&#x60; - USB Type A * &#x60;usb-b&#x60; - USB Type B * &#x60;usb-c&#x60; - USB Type C * &#x60;usb-mini-a&#x60; - USB Mini A * &#x60;usb-mini-b&#x60; - USB Mini B * &#x60;usb-micro-a&#x60; - USB Micro A * &#x60;usb-micro-b&#x60; - USB Micro B * &#x60;usb-micro-ab&#x60; - USB Micro AB * &#x60;other&#x60; - Other |  |
|**color** | **String** |  |  [optional] |
|**positions** | **Integer** |  |  [optional] |
|**rearPorts** | [**List&lt;FrontPortMappingRequest&gt;**](FrontPortMappingRequest.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _8P8C | &quot;8p8c&quot; |
| _8P6C | &quot;8p6c&quot; |
| _8P4C | &quot;8p4c&quot; |
| _8P2C | &quot;8p2c&quot; |
| _6P6C | &quot;6p6c&quot; |
| _6P4C | &quot;6p4c&quot; |
| _6P2C | &quot;6p2c&quot; |
| _4P4C | &quot;4p4c&quot; |
| _4P2C | &quot;4p2c&quot; |
| GG45 | &quot;gg45&quot; |
| TERA_4P | &quot;tera-4p&quot; |
| TERA_2P | &quot;tera-2p&quot; |
| TERA_1P | &quot;tera-1p&quot; |
| _110_PUNCH | &quot;110-punch&quot; |
| BNC | &quot;bnc&quot; |
| F | &quot;f&quot; |
| N | &quot;n&quot; |
| MRJ21 | &quot;mrj21&quot; |
| FC | &quot;fc&quot; |
| FC_PC | &quot;fc-pc&quot; |
| FC_UPC | &quot;fc-upc&quot; |
| FC_APC | &quot;fc-apc&quot; |
| LC | &quot;lc&quot; |
| LC_PC | &quot;lc-pc&quot; |
| LC_UPC | &quot;lc-upc&quot; |
| LC_APC | &quot;lc-apc&quot; |
| LSH | &quot;lsh&quot; |
| LSH_PC | &quot;lsh-pc&quot; |
| LSH_UPC | &quot;lsh-upc&quot; |
| LSH_APC | &quot;lsh-apc&quot; |
| LX5 | &quot;lx5&quot; |
| LX5_PC | &quot;lx5-pc&quot; |
| LX5_UPC | &quot;lx5-upc&quot; |
| LX5_APC | &quot;lx5-apc&quot; |
| MPO | &quot;mpo&quot; |
| MTRJ | &quot;mtrj&quot; |
| SC | &quot;sc&quot; |
| SC_PC | &quot;sc-pc&quot; |
| SC_UPC | &quot;sc-upc&quot; |
| SC_APC | &quot;sc-apc&quot; |
| ST | &quot;st&quot; |
| CS | &quot;cs&quot; |
| SN | &quot;sn&quot; |
| SMA_905 | &quot;sma-905&quot; |
| SMA_906 | &quot;sma-906&quot; |
| URM_P2 | &quot;urm-p2&quot; |
| URM_P4 | &quot;urm-p4&quot; |
| URM_P8 | &quot;urm-p8&quot; |
| SPLICE | &quot;splice&quot; |
| USB_A | &quot;usb-a&quot; |
| USB_B | &quot;usb-b&quot; |
| USB_C | &quot;usb-c&quot; |
| USB_MINI_A | &quot;usb-mini-a&quot; |
| USB_MINI_B | &quot;usb-mini-b&quot; |
| USB_MICRO_A | &quot;usb-micro-a&quot; |
| USB_MICRO_B | &quot;usb-micro-b&quot; |
| USB_MICRO_AB | &quot;usb-micro-ab&quot; |
| OTHER | &quot;other&quot; |


## Implemented Interfaces

* Serializable


