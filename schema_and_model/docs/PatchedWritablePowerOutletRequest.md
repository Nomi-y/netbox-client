

# PatchedWritablePowerOutletRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**device** | [**BriefInterfaceRequestDevice**](BriefInterfaceRequestDevice.md) |  |  [optional] |
|**module** | [**ConsolePortRequestModule**](ConsolePortRequestModule.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Physical port type  * &#x60;iec-60320-c5&#x60; - C5 * &#x60;iec-60320-c7&#x60; - C7 * &#x60;iec-60320-c13&#x60; - C13 * &#x60;iec-60320-c15&#x60; - C15 * &#x60;iec-60320-c17&#x60; - C17 * &#x60;iec-60320-c19&#x60; - C19 * &#x60;iec-60320-c21&#x60; - C21 * &#x60;iec-60309-p-n-e-4h&#x60; - P+N+E 4H * &#x60;iec-60309-p-n-e-6h&#x60; - P+N+E 6H * &#x60;iec-60309-p-n-e-9h&#x60; - P+N+E 9H * &#x60;iec-60309-2p-e-4h&#x60; - 2P+E 4H * &#x60;iec-60309-2p-e-6h&#x60; - 2P+E 6H * &#x60;iec-60309-2p-e-9h&#x60; - 2P+E 9H * &#x60;iec-60309-3p-e-4h&#x60; - 3P+E 4H * &#x60;iec-60309-3p-e-6h&#x60; - 3P+E 6H * &#x60;iec-60309-3p-e-9h&#x60; - 3P+E 9H * &#x60;iec-60309-3p-n-e-4h&#x60; - 3P+N+E 4H * &#x60;iec-60309-3p-n-e-6h&#x60; - 3P+N+E 6H * &#x60;iec-60309-3p-n-e-9h&#x60; - 3P+N+E 9H * &#x60;iec-60906-1&#x60; - IEC 60906-1 * &#x60;nbr-14136-10a&#x60; - 2P+T 10A (NBR 14136) * &#x60;nbr-14136-20a&#x60; - 2P+T 20A (NBR 14136) * &#x60;nema-1-15r&#x60; - NEMA 1-15R * &#x60;nema-5-15r&#x60; - NEMA 5-15R * &#x60;nema-5-20r&#x60; - NEMA 5-20R * &#x60;nema-5-30r&#x60; - NEMA 5-30R * &#x60;nema-5-50r&#x60; - NEMA 5-50R * &#x60;nema-6-15r&#x60; - NEMA 6-15R * &#x60;nema-6-20r&#x60; - NEMA 6-20R * &#x60;nema-6-30r&#x60; - NEMA 6-30R * &#x60;nema-6-50r&#x60; - NEMA 6-50R * &#x60;nema-10-30r&#x60; - NEMA 10-30R * &#x60;nema-10-50r&#x60; - NEMA 10-50R * &#x60;nema-14-20r&#x60; - NEMA 14-20R * &#x60;nema-14-30r&#x60; - NEMA 14-30R * &#x60;nema-14-50r&#x60; - NEMA 14-50R * &#x60;nema-14-60r&#x60; - NEMA 14-60R * &#x60;nema-15-15r&#x60; - NEMA 15-15R * &#x60;nema-15-20r&#x60; - NEMA 15-20R * &#x60;nema-15-30r&#x60; - NEMA 15-30R * &#x60;nema-15-50r&#x60; - NEMA 15-50R * &#x60;nema-15-60r&#x60; - NEMA 15-60R * &#x60;nema-l1-15r&#x60; - NEMA L1-15R * &#x60;nema-l5-15r&#x60; - NEMA L5-15R * &#x60;nema-l5-20r&#x60; - NEMA L5-20R * &#x60;nema-l5-30r&#x60; - NEMA L5-30R * &#x60;nema-l5-50r&#x60; - NEMA L5-50R * &#x60;nema-l6-15r&#x60; - NEMA L6-15R * &#x60;nema-l6-20r&#x60; - NEMA L6-20R * &#x60;nema-l6-30r&#x60; - NEMA L6-30R * &#x60;nema-l6-50r&#x60; - NEMA L6-50R * &#x60;nema-l10-30r&#x60; - NEMA L10-30R * &#x60;nema-l14-20r&#x60; - NEMA L14-20R * &#x60;nema-l14-30r&#x60; - NEMA L14-30R * &#x60;nema-l14-50r&#x60; - NEMA L14-50R * &#x60;nema-l14-60r&#x60; - NEMA L14-60R * &#x60;nema-l15-20r&#x60; - NEMA L15-20R * &#x60;nema-l15-30r&#x60; - NEMA L15-30R * &#x60;nema-l15-50r&#x60; - NEMA L15-50R * &#x60;nema-l15-60r&#x60; - NEMA L15-60R * &#x60;nema-l21-20r&#x60; - NEMA L21-20R * &#x60;nema-l21-30r&#x60; - NEMA L21-30R * &#x60;nema-l22-20r&#x60; - NEMA L22-20R * &#x60;nema-l22-30r&#x60; - NEMA L22-30R * &#x60;CS6360C&#x60; - CS6360C * &#x60;CS6364C&#x60; - CS6364C * &#x60;CS8164C&#x60; - CS8164C * &#x60;CS8264C&#x60; - CS8264C * &#x60;CS8364C&#x60; - CS8364C * &#x60;CS8464C&#x60; - CS8464C * &#x60;ita-e&#x60; - ITA Type E (CEE 7/5) * &#x60;ita-f&#x60; - ITA Type F (CEE 7/3) * &#x60;ita-g&#x60; - ITA Type G (BS 1363) * &#x60;ita-h&#x60; - ITA Type H * &#x60;ita-i&#x60; - ITA Type I * &#x60;ita-j&#x60; - ITA Type J * &#x60;ita-k&#x60; - ITA Type K * &#x60;ita-l&#x60; - ITA Type L (CEI 23-50) * &#x60;ita-m&#x60; - ITA Type M (BS 546) * &#x60;ita-n&#x60; - ITA Type N * &#x60;ita-o&#x60; - ITA Type O * &#x60;ita-multistandard&#x60; - ITA Multistandard * &#x60;usb-a&#x60; - USB Type A * &#x60;usb-micro-b&#x60; - USB Micro B * &#x60;usb-c&#x60; - USB Type C * &#x60;molex-micro-fit-1x2&#x60; - Molex Micro-Fit 1x2 * &#x60;molex-micro-fit-2x2&#x60; - Molex Micro-Fit 2x2 * &#x60;molex-micro-fit-2x3&#x60; - Molex Micro-Fit 2x3 * &#x60;molex-micro-fit-2x4&#x60; - Molex Micro-Fit 2x4 * &#x60;dc-terminal&#x60; - DC Terminal * &#x60;eaton-c39&#x60; - Eaton C39 * &#x60;hdot-cx&#x60; - HDOT Cx * &#x60;saf-d-grid&#x60; - Saf-D-Grid * &#x60;neutrik-powercon-20a&#x60; - Neutrik powerCON (20A) * &#x60;neutrik-powercon-32a&#x60; - Neutrik powerCON (32A) * &#x60;neutrik-powercon-true1&#x60; - Neutrik powerCON TRUE1 * &#x60;neutrik-powercon-true1-top&#x60; - Neutrik powerCON TRUE1 TOP * &#x60;ubiquiti-smartpower&#x60; - Ubiquiti SmartPower * &#x60;hardwired&#x60; - Hardwired * &#x60;other&#x60; - Other |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;enabled&#x60; - Enabled * &#x60;disabled&#x60; - Disabled * &#x60;faulty&#x60; - Faulty |  [optional] |
|**color** | **String** |  |  [optional] |
|**powerPort** | [**PatchedWritablePowerOutletRequestPowerPort**](PatchedWritablePowerOutletRequestPowerPort.md) |  |  [optional] |
|**feedLeg** | [**FeedLegEnum**](#FeedLegEnum) | Phase (for three-phase feeds)  * &#x60;A&#x60; - A * &#x60;B&#x60; - B * &#x60;C&#x60; - C |  [optional] |
|**description** | **String** |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IEC_60320_C5 | &quot;iec-60320-c5&quot; |
| IEC_60320_C7 | &quot;iec-60320-c7&quot; |
| IEC_60320_C13 | &quot;iec-60320-c13&quot; |
| IEC_60320_C15 | &quot;iec-60320-c15&quot; |
| IEC_60320_C17 | &quot;iec-60320-c17&quot; |
| IEC_60320_C19 | &quot;iec-60320-c19&quot; |
| IEC_60320_C21 | &quot;iec-60320-c21&quot; |
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
| NEMA_1_15R | &quot;nema-1-15r&quot; |
| NEMA_5_15R | &quot;nema-5-15r&quot; |
| NEMA_5_20R | &quot;nema-5-20r&quot; |
| NEMA_5_30R | &quot;nema-5-30r&quot; |
| NEMA_5_50R | &quot;nema-5-50r&quot; |
| NEMA_6_15R | &quot;nema-6-15r&quot; |
| NEMA_6_20R | &quot;nema-6-20r&quot; |
| NEMA_6_30R | &quot;nema-6-30r&quot; |
| NEMA_6_50R | &quot;nema-6-50r&quot; |
| NEMA_10_30R | &quot;nema-10-30r&quot; |
| NEMA_10_50R | &quot;nema-10-50r&quot; |
| NEMA_14_20R | &quot;nema-14-20r&quot; |
| NEMA_14_30R | &quot;nema-14-30r&quot; |
| NEMA_14_50R | &quot;nema-14-50r&quot; |
| NEMA_14_60R | &quot;nema-14-60r&quot; |
| NEMA_15_15R | &quot;nema-15-15r&quot; |
| NEMA_15_20R | &quot;nema-15-20r&quot; |
| NEMA_15_30R | &quot;nema-15-30r&quot; |
| NEMA_15_50R | &quot;nema-15-50r&quot; |
| NEMA_15_60R | &quot;nema-15-60r&quot; |
| NEMA_L1_15R | &quot;nema-l1-15r&quot; |
| NEMA_L5_15R | &quot;nema-l5-15r&quot; |
| NEMA_L5_20R | &quot;nema-l5-20r&quot; |
| NEMA_L5_30R | &quot;nema-l5-30r&quot; |
| NEMA_L5_50R | &quot;nema-l5-50r&quot; |
| NEMA_L6_15R | &quot;nema-l6-15r&quot; |
| NEMA_L6_20R | &quot;nema-l6-20r&quot; |
| NEMA_L6_30R | &quot;nema-l6-30r&quot; |
| NEMA_L6_50R | &quot;nema-l6-50r&quot; |
| NEMA_L10_30R | &quot;nema-l10-30r&quot; |
| NEMA_L14_20R | &quot;nema-l14-20r&quot; |
| NEMA_L14_30R | &quot;nema-l14-30r&quot; |
| NEMA_L14_50R | &quot;nema-l14-50r&quot; |
| NEMA_L14_60R | &quot;nema-l14-60r&quot; |
| NEMA_L15_20R | &quot;nema-l15-20r&quot; |
| NEMA_L15_30R | &quot;nema-l15-30r&quot; |
| NEMA_L15_50R | &quot;nema-l15-50r&quot; |
| NEMA_L15_60R | &quot;nema-l15-60r&quot; |
| NEMA_L21_20R | &quot;nema-l21-20r&quot; |
| NEMA_L21_30R | &quot;nema-l21-30r&quot; |
| NEMA_L22_20R | &quot;nema-l22-20r&quot; |
| NEMA_L22_30R | &quot;nema-l22-30r&quot; |
| CS6360_C | &quot;CS6360C&quot; |
| CS6364_C | &quot;CS6364C&quot; |
| CS8164_C | &quot;CS8164C&quot; |
| CS8264_C | &quot;CS8264C&quot; |
| CS8364_C | &quot;CS8364C&quot; |
| CS8464_C | &quot;CS8464C&quot; |
| ITA_E | &quot;ita-e&quot; |
| ITA_F | &quot;ita-f&quot; |
| ITA_G | &quot;ita-g&quot; |
| ITA_H | &quot;ita-h&quot; |
| ITA_I | &quot;ita-i&quot; |
| ITA_J | &quot;ita-j&quot; |
| ITA_K | &quot;ita-k&quot; |
| ITA_L | &quot;ita-l&quot; |
| ITA_M | &quot;ita-m&quot; |
| ITA_N | &quot;ita-n&quot; |
| ITA_O | &quot;ita-o&quot; |
| ITA_MULTISTANDARD | &quot;ita-multistandard&quot; |
| USB_A | &quot;usb-a&quot; |
| USB_MICRO_B | &quot;usb-micro-b&quot; |
| USB_C | &quot;usb-c&quot; |
| MOLEX_MICRO_FIT_1X2 | &quot;molex-micro-fit-1x2&quot; |
| MOLEX_MICRO_FIT_2X2 | &quot;molex-micro-fit-2x2&quot; |
| MOLEX_MICRO_FIT_2X3 | &quot;molex-micro-fit-2x3&quot; |
| MOLEX_MICRO_FIT_2X4 | &quot;molex-micro-fit-2x4&quot; |
| DC_TERMINAL | &quot;dc-terminal&quot; |
| EATON_C39 | &quot;eaton-c39&quot; |
| HDOT_CX | &quot;hdot-cx&quot; |
| SAF_D_GRID | &quot;saf-d-grid&quot; |
| NEUTRIK_POWERCON_20A | &quot;neutrik-powercon-20a&quot; |
| NEUTRIK_POWERCON_32A | &quot;neutrik-powercon-32a&quot; |
| NEUTRIK_POWERCON_TRUE1 | &quot;neutrik-powercon-true1&quot; |
| NEUTRIK_POWERCON_TRUE1_TOP | &quot;neutrik-powercon-true1-top&quot; |
| UBIQUITI_SMARTPOWER | &quot;ubiquiti-smartpower&quot; |
| HARDWIRED | &quot;hardwired&quot; |
| OTHER | &quot;other&quot; |
| EMPTY | &quot;&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |
| FAULTY | &quot;faulty&quot; |



## Enum: FeedLegEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


