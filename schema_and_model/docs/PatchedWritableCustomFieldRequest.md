

# PatchedWritableCustomFieldRequest

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectTypes** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of data this custom field holds  * &#x60;text&#x60; - Text * &#x60;longtext&#x60; - Text (long) * &#x60;integer&#x60; - Integer * &#x60;decimal&#x60; - Decimal * &#x60;boolean&#x60; - Boolean (true/false) * &#x60;date&#x60; - Date * &#x60;datetime&#x60; - Date &amp; time * &#x60;url&#x60; - URL * &#x60;json&#x60; - JSON * &#x60;select&#x60; - Selection * &#x60;multiselect&#x60; - Multiple selection * &#x60;object&#x60; - Object * &#x60;multiobject&#x60; - Multiple objects |  [optional] |
|**relatedObjectType** | **String** |  |  [optional] |
|**name** | **String** | Internal field name |  [optional] |
|**label** | **String** | Name of the field as displayed to users (if not provided, &#39;the field&#39;s name will be used) |  [optional] |
|**groupName** | **String** | Custom fields within the same group will be displayed together |  [optional] |
|**description** | **String** |  |  [optional] |
|**required** | **Boolean** | This field is required when creating new objects or editing an existing object. |  [optional] |
|**unique** | **Boolean** | The value of this field must be unique for the assigned object |  [optional] |
|**searchWeight** | **Integer** | Weighting for search. Lower values are considered more important. Fields with a search weight of zero will be ignored. |  [optional] |
|**filterLogic** | [**FilterLogicEnum**](#FilterLogicEnum) | Loose matches any instance of a given string; exact matches the entire field.  * &#x60;disabled&#x60; - Disabled * &#x60;loose&#x60; - Loose * &#x60;exact&#x60; - Exact |  [optional] |
|**uiVisible** | [**UiVisibleEnum**](#UiVisibleEnum) | Specifies whether the custom field is displayed in the UI  * &#x60;always&#x60; - Always * &#x60;if-set&#x60; - If set * &#x60;hidden&#x60; - Hidden |  [optional] |
|**uiEditable** | [**UiEditableEnum**](#UiEditableEnum) | Specifies whether the custom field value can be edited in the UI  * &#x60;yes&#x60; - Yes * &#x60;no&#x60; - No * &#x60;hidden&#x60; - Hidden |  [optional] |
|**isCloneable** | **Boolean** | Replicate this value when cloning objects |  [optional] |
|**_default** | **Object** | Default value for the field (must be a JSON value). Encapsulate strings with double quotes (e.g. \&quot;Foo\&quot;). |  [optional] |
|**relatedObjectFilter** | **Object** | Filter the object selection choices using a query_params dict (must be a JSON value).Encapsulate strings with double quotes (e.g. \&quot;Foo\&quot;). |  [optional] |
|**weight** | **Integer** | Fields with higher weights appear lower in a form. |  [optional] |
|**validationMinimum** | **Double** | Minimum allowed value (for numeric fields) |  [optional] |
|**validationMaximum** | **Double** | Maximum allowed value (for numeric fields) |  [optional] |
|**validationRegex** | **String** | Regular expression to enforce on text field values. Use ^ and $ to force matching of entire string. For example, &lt;code&gt;^[A-Z]{3}$&lt;/code&gt; will limit values to exactly three uppercase letters. |  [optional] |
|**choiceSet** | [**CustomFieldRequestChoiceSet**](CustomFieldRequestChoiceSet.md) |  |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| LONGTEXT | &quot;longtext&quot; |
| INTEGER | &quot;integer&quot; |
| DECIMAL | &quot;decimal&quot; |
| BOOLEAN | &quot;boolean&quot; |
| DATE | &quot;date&quot; |
| DATETIME | &quot;datetime&quot; |
| URL | &quot;url&quot; |
| JSON | &quot;json&quot; |
| SELECT | &quot;select&quot; |
| MULTISELECT | &quot;multiselect&quot; |
| OBJECT | &quot;object&quot; |
| MULTIOBJECT | &quot;multiobject&quot; |



## Enum: FilterLogicEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| LOOSE | &quot;loose&quot; |
| EXACT | &quot;exact&quot; |



## Enum: UiVisibleEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;always&quot; |
| IF_SET | &quot;if-set&quot; |
| HIDDEN | &quot;hidden&quot; |



## Enum: UiEditableEnum

| Name | Value |
|---- | -----|
| YES | &quot;yes&quot; |
| NO | &quot;no&quot; |
| HIDDEN | &quot;hidden&quot; |


## Implemented Interfaces

* Serializable


