

# PatchedWritablePowerPortTemplateRequest

Extends the built-in ModelSerializer to enforce calling full_clean() on a copy of the associated instance during validation. (DRF does not do this by default; see https://github.com/encode/django-rest-framework/issues/3144)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceType** | [**ConsolePortTemplateRequestDeviceType**](ConsolePortTemplateRequestDeviceType.md) |  |  [optional] |
|**moduleType** | [**ConsolePortTemplateRequestModuleType**](ConsolePortTemplateRequestModuleType.md) |  |  [optional] |
|**name** | **String** | {module} is accepted as a substitution for the module bay position when attached to a module type. |  [optional] |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;iec-60320-c6&#x60; - C6 * &#x60;iec-60320-c8&#x60; - C8 * &#x60;iec-60320-c14&#x60; - C14 * &#x60;iec-60320-c16&#x60; - C16 * &#x60;iec-60320-c18&#x60; - C18 * &#x60;iec-60320-c20&#x60; - C20 * &#x60;iec-60320-c22&#x60; - C22 * &#x60;iec-60309-p-n-e-4h&#x60; - P+N+E 4H * &#x60;iec-60309-p-n-e-6h&#x60; - P+N+E 6H * &#x60;iec-60309-p-n-e-9h&#x60; - P+N+E 9H * &#x60;iec-60309-2p-e-4h&#x60; - 2P+E 4H * &#x60;iec-60309-2p-e-6h&#x60; - 2P+E 6H * &#x60;iec-60309-2p-e-9h&#x60; - 2P+E 9H * &#x60;iec-60309-3p-e-4h&#x60; - 3P+E 4H * &#x60;iec-60309-3p-e-6h&#x60; - 3P+E 6H * &#x60;iec-60309-3p-e-9h&#x60; - 3P+E 9H * &#x60;iec-60309-3p-n-e-4h&#x60; - 3P+N+E 4H * &#x60;iec-60309-3p-n-e-6h&#x60; - 3P+N+E 6H * &#x60;iec-60309-3p-n-e-9h&#x60; - 3P+N+E 9H * &#x60;iec-60906-1&#x60; - IEC 60906-1 * &#x60;nbr-14136-10a&#x60; - 2P+T 10A (NBR 14136) * &#x60;nbr-14136-20a&#x60; - 2P+T 20A (NBR 14136) * &#x60;nema-1-15p&#x60; - NEMA 1-15P * &#x60;nema-5-15p&#x60; - NEMA 5-15P * &#x60;nema-5-20p&#x60; - NEMA 5-20P * &#x60;nema-5-30p&#x60; - NEMA 5-30P * &#x60;nema-5-50p&#x60; - NEMA 5-50P * &#x60;nema-6-15p&#x60; - NEMA 6-15P * &#x60;nema-6-20p&#x60; - NEMA 6-20P * &#x60;nema-6-30p&#x60; - NEMA 6-30P * &#x60;nema-6-50p&#x60; - NEMA 6-50P * &#x60;nema-10-30p&#x60; - NEMA 10-30P * &#x60;nema-10-50p&#x60; - NEMA 10-50P * &#x60;nema-14-20p&#x60; - NEMA 14-20P * &#x60;nema-14-30p&#x60; - NEMA 14-30P * &#x60;nema-14-50p&#x60; - NEMA 14-50P * &#x60;nema-14-60p&#x60; - NEMA 14-60P * &#x60;nema-15-15p&#x60; - NEMA 15-15P * &#x60;nema-15-20p&#x60; - NEMA 15-20P * &#x60;nema-15-30p&#x60; - NEMA 15-30P * &#x60;nema-15-50p&#x60; - NEMA 15-50P * &#x60;nema-15-60p&#x60; - NEMA 15-60P * &#x60;nema-l1-15p&#x60; - NEMA L1-15P * &#x60;nema-l5-15p&#x60; - NEMA L5-15P * &#x60;nema-l5-20p&#x60; - NEMA L5-20P * &#x60;nema-l5-30p&#x60; - NEMA L5-30P * &#x60;nema-l5-50p&#x60; - NEMA L5-50P * &#x60;nema-l6-15p&#x60; - NEMA L6-15P * &#x60;nema-l6-20p&#x60; - NEMA L6-20P * &#x60;nema-l6-30p&#x60; - NEMA L6-30P * &#x60;nema-l6-50p&#x60; - NEMA L6-50P * &#x60;nema-l10-30p&#x60; - NEMA L10-30P * &#x60;nema-l14-20p&#x60; - NEMA L14-20P * &#x60;nema-l14-30p&#x60; - NEMA L14-30P * &#x60;nema-l14-50p&#x60; - NEMA L14-50P * &#x60;nema-l14-60p&#x60; - NEMA L14-60P * &#x60;nema-l15-20p&#x60; - NEMA L15-20P * &#x60;nema-l15-30p&#x60; - NEMA L15-30P * &#x60;nema-l15-50p&#x60; - NEMA L15-50P * &#x60;nema-l15-60p&#x60; - NEMA L15-60P * &#x60;nema-l21-20p&#x60; - NEMA L21-20P * &#x60;nema-l21-30p&#x60; - NEMA L21-30P * &#x60;nema-l22-20p&#x60; - NEMA L22-20P * &#x60;nema-l22-30p&#x60; - NEMA L22-30P * &#x60;cs6361c&#x60; - CS6361C * &#x60;cs6365c&#x60; - CS6365C * &#x60;cs8165c&#x60; - CS8165C * &#x60;cs8265c&#x60; - CS8265C * &#x60;cs8365c&#x60; - CS8365C * &#x60;cs8465c&#x60; - CS8465C * &#x60;ita-c&#x60; - ITA Type C (CEE 7/16) * &#x60;ita-e&#x60; - ITA Type E (CEE 7/6) * &#x60;ita-f&#x60; - ITA Type F (CEE 7/4) * &#x60;ita-ef&#x60; - ITA Type E/F (CEE 7/7) * &#x60;ita-g&#x60; - ITA Type G (BS 1363) * &#x60;ita-h&#x60; - ITA Type H * &#x60;ita-i&#x60; - ITA Type I * &#x60;ita-j&#x60; - ITA Type J * &#x60;ita-k&#x60; - ITA Type K * &#x60;ita-l&#x60; - ITA Type L (CEI 23-50) * &#x60;ita-m&#x60; - ITA Type M (BS 546) * &#x60;ita-n&#x60; - ITA Type N * &#x60;ita-o&#x60; - ITA Type O * &#x60;usb-a&#x60; - USB Type A * &#x60;usb-b&#x60; - USB Type B * &#x60;usb-c&#x60; - USB Type C * &#x60;usb-mini-a&#x60; - USB Mini A * &#x60;usb-mini-b&#x60; - USB Mini B * &#x60;usb-micro-a&#x60; - USB Micro A * &#x60;usb-micro-b&#x60; - USB Micro B * &#x60;usb-micro-ab&#x60; - USB Micro AB * &#x60;usb-3-b&#x60; - USB 3.0 Type B * &#x60;usb-3-micro-b&#x60; - USB 3.0 Micro B * &#x60;molex-micro-fit-1x2&#x60; - Molex Micro-Fit 1x2 * &#x60;molex-micro-fit-2x2&#x60; - Molex Micro-Fit 2x2 * &#x60;molex-micro-fit-2x3&#x60; - Molex Micro-Fit 2x3 * &#x60;molex-micro-fit-2x4&#x60; - Molex Micro-Fit 2x4 * &#x60;dc-terminal&#x60; - DC Terminal * &#x60;saf-d-grid&#x60; - Saf-D-Grid * &#x60;neutrik-powercon-20&#x60; - Neutrik powerCON (20A) * &#x60;neutrik-powercon-32&#x60; - Neutrik powerCON (32A) * &#x60;neutrik-powercon-true1&#x60; - Neutrik powerCON TRUE1 * &#x60;neutrik-powercon-true1-top&#x60; - Neutrik powerCON TRUE1 TOP * &#x60;ubiquiti-smartpower&#x60; - Ubiquiti SmartPower * &#x60;hardwired&#x60; - Hardwired * &#x60;other&#x60; - Other |  [optional] |
|**maximumDraw** | **Integer** | Maximum power draw (watts) |  [optional] |
|**allocatedDraw** | **Integer** | Allocated power draw (watts) |  [optional] |
|**description** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IEC_60320_C6 | &quot;iec-60320-c6&quot; |
| IEC_60320_C8 | &quot;iec-60320-c8&quot; |
| IEC_60320_C14 | &quot;iec-60320-c14&quot; |
| IEC_60320_C16 | &quot;iec-60320-c16&quot; |
| IEC_60320_C18 | &quot;iec-60320-c18&quot; |
| IEC_60320_C20 | &quot;iec-60320-c20&quot; |
| IEC_60320_C22 | &quot;iec-60320-c22&quot; |
| IEC_60309_P_N_E_4H | &quot;iec-60309-p-n-e-4h&quot; |
| IEC_60309_P_N_E_6H | &quot;iec-60309-p-n-e-6h&quot; |
| IEC_60309_P_N_E_9H | &quot;iec-60309-p-n-e-9h&quot; |
| IEC_60309_2P_E_4H | &quot;iec-60309-2p-e-4h&quot; |
| IEC_60309_2P_E_6H | &quot;iec-60309-2p-e-6h&quot; |
| IEC_60309_2P_E_9H | &quot;iec-60309-2p-e-9h&quot; |
| IEC_60309_3P_E_4H | &quot;iec-60309-3p-e-4h&quot; |
| IEC_60309_3P_E_6H | &quot;iec-60309-3p-e-6h&quot; |
| IEC_60309_3P_E_9H | &quot;iec-60309-3p-e-9h&quot; |
| IEC_60309_3P_N_E_4H | &quot;iec-60309-3p-n-e-4h&quot; |
| IEC_60309_3P_N_E_6H | &quot;iec-60309-3p-n-e-6h&quot; |
| IEC_60309_3P_N_E_9H | &quot;iec-60309-3p-n-e-9h&quot; |
| IEC_60906_1 | &quot;iec-60906-1&quot; |
| NBR_14136_10A | &quot;nbr-14136-10a&quot; |
| NBR_14136_20A | &quot;nbr-14136-20a&quot; |
| NEMA_1_15P | &quot;nema-1-15p&quot; |
| NEMA_5_15P | &quot;nema-5-15p&quot; |
| NEMA_5_20P | &quot;nema-5-20p&quot; |
| NEMA_5_30P | &quot;nema-5-30p&quot; |
| NEMA_5_50P | &quot;nema-5-50p&quot; |
| NEMA_6_15P | &quot;nema-6-15p&quot; |
| NEMA_6_20P | &quot;nema-6-20p&quot; |
| NEMA_6_30P | &quot;nema-6-30p&quot; |
| NEMA_6_50P | &quot;nema-6-50p&quot; |
| NEMA_10_30P | &quot;nema-10-30p&quot; |
| NEMA_10_50P | &quot;nema-10-50p&quot; |
| NEMA_14_20P | &quot;nema-14-20p&quot; |
| NEMA_14_30P | &quot;nema-14-30p&quot; |
| NEMA_14_50P | &quot;nema-14-50p&quot; |
| NEMA_14_60P | &quot;nema-14-60p&quot; |
| NEMA_15_15P | &quot;nema-15-15p&quot; |
| NEMA_15_20P | &quot;nema-15-20p&quot; |
| NEMA_15_30P | &quot;nema-15-30p&quot; |
| NEMA_15_50P | &quot;nema-15-50p&quot; |
| NEMA_15_60P | &quot;nema-15-60p&quot; |
| NEMA_L1_15P | &quot;nema-l1-15p&quot; |
| NEMA_L5_15P | &quot;nema-l5-15p&quot; |
| NEMA_L5_20P | &quot;nema-l5-20p&quot; |
| NEMA_L5_30P | &quot;nema-l5-30p&quot; |
| NEMA_L5_50P | &quot;nema-l5-50p&quot; |
| NEMA_L6_15P | &quot;nema-l6-15p&quot; |
| NEMA_L6_20P | &quot;nema-l6-20p&quot; |
| NEMA_L6_30P | &quot;nema-l6-30p&quot; |
| NEMA_L6_50P | &quot;nema-l6-50p&quot; |
| NEMA_L10_30P | &quot;nema-l10-30p&quot; |
| NEMA_L14_20P | &quot;nema-l14-20p&quot; |
| NEMA_L14_30P | &quot;nema-l14-30p&quot; |
| NEMA_L14_50P | &quot;nema-l14-50p&quot; |
| NEMA_L14_60P | &quot;nema-l14-60p&quot; |
| NEMA_L15_20P | &quot;nema-l15-20p&quot; |
| NEMA_L15_30P | &quot;nema-l15-30p&quot; |
| NEMA_L15_50P | &quot;nema-l15-50p&quot; |
| NEMA_L15_60P | &quot;nema-l15-60p&quot; |
| NEMA_L21_20P | &quot;nema-l21-20p&quot; |
| NEMA_L21_30P | &quot;nema-l21-30p&quot; |
| NEMA_L22_20P | &quot;nema-l22-20p&quot; |
| NEMA_L22_30P | &quot;nema-l22-30p&quot; |
| CS6361C | &quot;cs6361c&quot; |
| CS6365C | &quot;cs6365c&quot; |
| CS8165C | &quot;cs8165c&quot; |
| CS8265C | &quot;cs8265c&quot; |
| CS8365C | &quot;cs8365c&quot; |
| CS8465C | &quot;cs8465c&quot; |
| ITA_C | &quot;ita-c&quot; |
| ITA_E | &quot;ita-e&quot; |
| ITA_F | &quot;ita-f&quot; |
| ITA_EF | &quot;ita-ef&quot; |
| ITA_G | &quot;ita-g&quot; |
| ITA_H | &quot;ita-h&quot; |
| ITA_I | &quot;ita-i&quot; |
| ITA_J | &quot;ita-j&quot; |
| ITA_K | &quot;ita-k&quot; |
| ITA_L | &quot;ita-l&quot; |
| ITA_M | &quot;ita-m&quot; |
| ITA_N | &quot;ita-n&quot; |
| ITA_O | &quot;ita-o&quot; |
| USB_A | &quot;usb-a&quot; |
| USB_B | &quot;usb-b&quot; |
| USB_C | &quot;usb-c&quot; |
| USB_MINI_A | &quot;usb-mini-a&quot; |
| USB_MINI_B | &quot;usb-mini-b&quot; |
| USB_MICRO_A | &quot;usb-micro-a&quot; |
| USB_MICRO_B | &quot;usb-micro-b&quot; |
| USB_MICRO_AB | &quot;usb-micro-ab&quot; |
| USB_3_B | &quot;usb-3-b&quot; |
| USB_3_MICRO_B | &quot;usb-3-micro-b&quot; |
| MOLEX_MICRO_FIT_1X2 | &quot;molex-micro-fit-1x2&quot; |
| MOLEX_MICRO_FIT_2X2 | &quot;molex-micro-fit-2x2&quot; |
| MOLEX_MICRO_FIT_2X3 | &quot;molex-micro-fit-2x3&quot; |
| MOLEX_MICRO_FIT_2X4 | &quot;molex-micro-fit-2x4&quot; |
| DC_TERMINAL | &quot;dc-terminal&quot; |
| SAF_D_GRID | &quot;saf-d-grid&quot; |
| NEUTRIK_POWERCON_20 | &quot;neutrik-powercon-20&quot; |
| NEUTRIK_POWERCON_32 | &quot;neutrik-powercon-32&quot; |
| NEUTRIK_POWERCON_TRUE1 | &quot;neutrik-powercon-true1&quot; |
| NEUTRIK_POWERCON_TRUE1_TOP | &quot;neutrik-powercon-true1-top&quot; |
| UBIQUITI_SMARTPOWER | &quot;ubiquiti-smartpower&quot; |
| HARDWIRED | &quot;hardwired&quot; |
| OTHER | &quot;other&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


