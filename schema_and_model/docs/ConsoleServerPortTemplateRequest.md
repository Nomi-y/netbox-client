

# ConsoleServerPortTemplateRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceType** | [**ConsolePortTemplateRequestDeviceType**](ConsolePortTemplateRequestDeviceType.md) |  |  [optional] |
|**moduleType** | [**ConsolePortTemplateRequestModuleType**](ConsolePortTemplateRequestModuleType.md) |  |  [optional] |
|**name** | **String** | {module} is accepted as a substitution for the module bay position when attached to a module type. |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;de-9&#x60; - DE-9 * &#x60;db-25&#x60; - DB-25 * &#x60;rj-11&#x60; - RJ-11 * &#x60;rj-12&#x60; - RJ-12 * &#x60;rj-45&#x60; - RJ-45 * &#x60;mini-din-8&#x60; - Mini-DIN 8 * &#x60;usb-a&#x60; - USB Type A * &#x60;usb-b&#x60; - USB Type B * &#x60;usb-c&#x60; - USB Type C * &#x60;usb-mini-a&#x60; - USB Mini A * &#x60;usb-mini-b&#x60; - USB Mini B * &#x60;usb-micro-a&#x60; - USB Micro A * &#x60;usb-micro-b&#x60; - USB Micro B * &#x60;usb-micro-ab&#x60; - USB Micro AB * &#x60;other&#x60; - Other |  [optional] |
|**description** | **String** |  |  [optional] |



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


## Implemented Interfaces

* Serializable


