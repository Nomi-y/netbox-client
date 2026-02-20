

# CustomField

Adds an `owner` field for models which have a ForeignKey to users.Owner.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**objectTypes** | **List&lt;String&gt;** |  |  |
|**type** | [**CustomFieldType**](CustomFieldType.md) |  |  |
|**relatedObjectType** | **String** |  |  [optional] |
|**dataType** | **String** |  |  [readonly] |
|**name** | **String** | Internal field name |  |
|**label** | **String** | Name of the field as displayed to users (if not provided, &#39;the field&#39;s name will be used) |  [optional] |
|**groupName** | **String** | Custom fields within the same group will be displayed together |  [optional] |
|**description** | **String** |  |  [optional] |
|**required** | **Boolean** | This field is required when creating new objects or editing an existing object. |  [optional] |
|**unique** | **Boolean** | The value of this field must be unique for the assigned object |  [optional] |
|**searchWeight** | **Integer** | Weighting for search. Lower values are considered more important. Fields with a search weight of zero will be ignored. |  [optional] |
|**filterLogic** | [**CustomFieldFilterLogic**](CustomFieldFilterLogic.md) |  |  [optional] |
|**uiVisible** | [**CustomFieldUiVisible**](CustomFieldUiVisible.md) |  |  [optional] |
|**uiEditable** | [**CustomFieldUiEditable**](CustomFieldUiEditable.md) |  |  [optional] |
|**isCloneable** | **Boolean** | Replicate this value when cloning objects |  [optional] |
|**_default** | **Object** | Default value for the field (must be a JSON value). Encapsulate strings with double quotes (e.g. \&quot;Foo\&quot;). |  [optional] |
|**relatedObjectFilter** | **Object** | Filter the object selection choices using a query_params dict (must be a JSON value).Encapsulate strings with double quotes (e.g. \&quot;Foo\&quot;). |  [optional] |
|**weight** | **Integer** | Fields with higher weights appear lower in a form. |  [optional] |
|**validationMinimum** | **Double** | Minimum allowed value (for numeric fields) |  [optional] |
|**validationMaximum** | **Double** | Maximum allowed value (for numeric fields) |  [optional] |
|**validationRegex** | **String** | Regular expression to enforce on text field values. Use ^ and $ to force matching of entire string. For example, &lt;code&gt;^[A-Z]{3}$&lt;/code&gt; will limit values to exactly three uppercase letters. |  [optional] |
|**choiceSet** | [**BriefCustomFieldChoiceSet**](BriefCustomFieldChoiceSet.md) |  |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


