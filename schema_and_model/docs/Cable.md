

# Cable

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | * &#x60;cat3&#x60; - CAT3 * &#x60;cat5&#x60; - CAT5 * &#x60;cat5e&#x60; - CAT5e * &#x60;cat6&#x60; - CAT6 * &#x60;cat6a&#x60; - CAT6a * &#x60;cat7&#x60; - CAT7 * &#x60;cat7a&#x60; - CAT7a * &#x60;cat8&#x60; - CAT8 * &#x60;mrj21-trunk&#x60; - MRJ21 Trunk * &#x60;dac-active&#x60; - Direct Attach Copper (Active) * &#x60;dac-passive&#x60; - Direct Attach Copper (Passive) * &#x60;coaxial&#x60; - Coaxial * &#x60;rg-6&#x60; - RG-6 * &#x60;rg-8&#x60; - RG-8 * &#x60;rg-11&#x60; - RG-11 * &#x60;rg-59&#x60; - RG-59 * &#x60;rg-62&#x60; - RG-62 * &#x60;rg-213&#x60; - RG-213 * &#x60;lmr-100&#x60; - LMR-100 * &#x60;lmr-200&#x60; - LMR-200 * &#x60;lmr-400&#x60; - LMR-400 * &#x60;mmf&#x60; - Multimode Fiber * &#x60;mmf-om1&#x60; - Multimode Fiber (OM1) * &#x60;mmf-om2&#x60; - Multimode Fiber (OM2) * &#x60;mmf-om3&#x60; - Multimode Fiber (OM3) * &#x60;mmf-om4&#x60; - Multimode Fiber (OM4) * &#x60;mmf-om5&#x60; - Multimode Fiber (OM5) * &#x60;smf&#x60; - Single-mode Fiber * &#x60;smf-os1&#x60; - Single-mode Fiber (OS1) * &#x60;smf-os2&#x60; - Single-mode Fiber (OS2) * &#x60;aoc&#x60; - Active Optical Cabling (AOC) * &#x60;power&#x60; - Power * &#x60;usb&#x60; - USB |  [optional] |
|**aTerminations** | [**List&lt;GenericObject&gt;**](GenericObject.md) |  |  [optional] |
|**bTerminations** | [**List&lt;GenericObject&gt;**](GenericObject.md) |  |  [optional] |
|**status** | [**CableStatus**](CableStatus.md) |  |  [optional] |
|**profile** | [**CableProfile**](CableProfile.md) |  |  [optional] |
|**tenant** | [**BriefTenant**](BriefTenant.md) |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**color** | **String** |  |  [optional] |
|**length** | **Double** |  |  [optional] |
|**lengthUnit** | [**CableLengthUnit**](CableLengthUnit.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |



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


## Implemented Interfaces

* Serializable


