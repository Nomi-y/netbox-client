

# PatchedWritableCableRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;cat3&#x60; - CAT3 * &#x60;cat5&#x60; - CAT5 * &#x60;cat5e&#x60; - CAT5e * &#x60;cat6&#x60; - CAT6 * &#x60;cat6a&#x60; - CAT6a * &#x60;cat7&#x60; - CAT7 * &#x60;cat7a&#x60; - CAT7a * &#x60;cat8&#x60; - CAT8 * &#x60;mrj21-trunk&#x60; - MRJ21 Trunk * &#x60;dac-active&#x60; - Direct Attach Copper (Active) * &#x60;dac-passive&#x60; - Direct Attach Copper (Passive) * &#x60;coaxial&#x60; - Coaxial * &#x60;rg-6&#x60; - RG-6 * &#x60;rg-8&#x60; - RG-8 * &#x60;rg-11&#x60; - RG-11 * &#x60;rg-59&#x60; - RG-59 * &#x60;rg-62&#x60; - RG-62 * &#x60;rg-213&#x60; - RG-213 * &#x60;lmr-100&#x60; - LMR-100 * &#x60;lmr-200&#x60; - LMR-200 * &#x60;lmr-400&#x60; - LMR-400 * &#x60;mmf&#x60; - Multimode Fiber * &#x60;mmf-om1&#x60; - Multimode Fiber (OM1) * &#x60;mmf-om2&#x60; - Multimode Fiber (OM2) * &#x60;mmf-om3&#x60; - Multimode Fiber (OM3) * &#x60;mmf-om4&#x60; - Multimode Fiber (OM4) * &#x60;mmf-om5&#x60; - Multimode Fiber (OM5) * &#x60;smf&#x60; - Single-mode Fiber * &#x60;smf-os1&#x60; - Single-mode Fiber (OS1) * &#x60;smf-os2&#x60; - Single-mode Fiber (OS2) * &#x60;aoc&#x60; - Active Optical Cabling (AOC) * &#x60;power&#x60; - Power * &#x60;usb&#x60; - USB |  [optional] |
|**aTerminations** | [**List&lt;GenericObjectRequest&gt;**](GenericObjectRequest.md) |  |  [optional] |
|**bTerminations** | [**List&lt;GenericObjectRequest&gt;**](GenericObjectRequest.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | * &#x60;connected&#x60; - Connected * &#x60;planned&#x60; - Planned * &#x60;decommissioning&#x60; - Decommissioning |  [optional] |
|**profile** | [**ProfileEnum**](#ProfileEnum) | * &#x60;single-1c1p&#x60; - 1C1P * &#x60;single-1c2p&#x60; - 1C2P * &#x60;single-1c4p&#x60; - 1C4P * &#x60;single-1c6p&#x60; - 1C6P * &#x60;single-1c8p&#x60; - 1C8P * &#x60;single-1c12p&#x60; - 1C12P * &#x60;single-1c16p&#x60; - 1C16P * &#x60;trunk-2c1p&#x60; - 2C1P trunk * &#x60;trunk-2c2p&#x60; - 2C2P trunk * &#x60;trunk-2c4p&#x60; - 2C4P trunk * &#x60;trunk-2c4p-shuffle&#x60; - 2C4P trunk (shuffle) * &#x60;trunk-2c6p&#x60; - 2C6P trunk * &#x60;trunk-2c8p&#x60; - 2C8P trunk * &#x60;trunk-2c12p&#x60; - 2C12P trunk * &#x60;trunk-4c1p&#x60; - 4C1P trunk * &#x60;trunk-4c2p&#x60; - 4C2P trunk * &#x60;trunk-4c4p&#x60; - 4C4P trunk * &#x60;trunk-4c4p-shuffle&#x60; - 4C4P trunk (shuffle) * &#x60;trunk-4c6p&#x60; - 4C6P trunk * &#x60;trunk-4c8p&#x60; - 4C8P trunk * &#x60;trunk-8c4p&#x60; - 8C4P trunk * &#x60;breakout-1c4p-4c1p&#x60; - 1C4P:4C1P breakout * &#x60;breakout-1c6p-6c1p&#x60; - 1C6P:6C1P breakout * &#x60;breakout-2c4p-8c1p-shuffle&#x60; - 2C4P:8C1P breakout (shuffle) |  [optional] |
|**tenant** | [**ASNRangeRequestTenant**](ASNRangeRequestTenant.md) |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**color** | **String** |  |  [optional] |
|**length** | **Double** |  |  [optional] |
|**lengthUnit** | [**LengthUnitEnum**](#LengthUnitEnum) | * &#x60;km&#x60; - Kilometers * &#x60;m&#x60; - Meters * &#x60;cm&#x60; - Centimeters * &#x60;mi&#x60; - Miles * &#x60;ft&#x60; - Feet * &#x60;in&#x60; - Inches |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CAT3 | &quot;cat3&quot; |
| CAT5 | &quot;cat5&quot; |
| CAT5E | &quot;cat5e&quot; |
| CAT6 | &quot;cat6&quot; |
| CAT6A | &quot;cat6a&quot; |
| CAT7 | &quot;cat7&quot; |
| CAT7A | &quot;cat7a&quot; |
| CAT8 | &quot;cat8&quot; |
| MRJ21_TRUNK | &quot;mrj21-trunk&quot; |
| DAC_ACTIVE | &quot;dac-active&quot; |
| DAC_PASSIVE | &quot;dac-passive&quot; |
| COAXIAL | &quot;coaxial&quot; |
| RG_6 | &quot;rg-6&quot; |
| RG_8 | &quot;rg-8&quot; |
| RG_11 | &quot;rg-11&quot; |
| RG_59 | &quot;rg-59&quot; |
| RG_62 | &quot;rg-62&quot; |
| RG_213 | &quot;rg-213&quot; |
| LMR_100 | &quot;lmr-100&quot; |
| LMR_200 | &quot;lmr-200&quot; |
| LMR_400 | &quot;lmr-400&quot; |
| MMF | &quot;mmf&quot; |
| MMF_OM1 | &quot;mmf-om1&quot; |
| MMF_OM2 | &quot;mmf-om2&quot; |
| MMF_OM3 | &quot;mmf-om3&quot; |
| MMF_OM4 | &quot;mmf-om4&quot; |
| MMF_OM5 | &quot;mmf-om5&quot; |
| SMF | &quot;smf&quot; |
| SMF_OS1 | &quot;smf-os1&quot; |
| SMF_OS2 | &quot;smf-os2&quot; |
| AOC | &quot;aoc&quot; |
| POWER | &quot;power&quot; |
| USB | &quot;usb&quot; |
| EMPTY | &quot;&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| PLANNED | &quot;planned&quot; |
| DECOMMISSIONING | &quot;decommissioning&quot; |



## Enum: ProfileEnum

| Name | Value |
|---- | -----|
| SINGLE_1C1P | &quot;single-1c1p&quot; |
| SINGLE_1C2P | &quot;single-1c2p&quot; |
| SINGLE_1C4P | &quot;single-1c4p&quot; |
| SINGLE_1C6P | &quot;single-1c6p&quot; |
| SINGLE_1C8P | &quot;single-1c8p&quot; |
| SINGLE_1C12P | &quot;single-1c12p&quot; |
| SINGLE_1C16P | &quot;single-1c16p&quot; |
| TRUNK_2C1P | &quot;trunk-2c1p&quot; |
| TRUNK_2C2P | &quot;trunk-2c2p&quot; |
| TRUNK_2C4P | &quot;trunk-2c4p&quot; |
| TRUNK_2C4P_SHUFFLE | &quot;trunk-2c4p-shuffle&quot; |
| TRUNK_2C6P | &quot;trunk-2c6p&quot; |
| TRUNK_2C8P | &quot;trunk-2c8p&quot; |
| TRUNK_2C12P | &quot;trunk-2c12p&quot; |
| TRUNK_4C1P | &quot;trunk-4c1p&quot; |
| TRUNK_4C2P | &quot;trunk-4c2p&quot; |
| TRUNK_4C4P | &quot;trunk-4c4p&quot; |
| TRUNK_4C4P_SHUFFLE | &quot;trunk-4c4p-shuffle&quot; |
| TRUNK_4C6P | &quot;trunk-4c6p&quot; |
| TRUNK_4C8P | &quot;trunk-4c8p&quot; |
| TRUNK_8C4P | &quot;trunk-8c4p&quot; |
| BREAKOUT_1C4P_4C1P | &quot;breakout-1c4p-4c1p&quot; |
| BREAKOUT_1C6P_6C1P | &quot;breakout-1c6p-6c1p&quot; |
| BREAKOUT_2C4P_8C1P_SHUFFLE | &quot;breakout-2c4p-8c1p-shuffle&quot; |
| EMPTY | &quot;&quot; |



## Enum: LengthUnitEnum

| Name | Value |
|---- | -----|
| KM | &quot;km&quot; |
| M | &quot;m&quot; |
| CM | &quot;cm&quot; |
| MI | &quot;mi&quot; |
| FT | &quot;ft&quot; |
| IN | &quot;in&quot; |
| EMPTY | &quot;&quot; |


## Implemented Interfaces

* Serializable


