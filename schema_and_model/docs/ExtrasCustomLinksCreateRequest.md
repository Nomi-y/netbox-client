

# ExtrasCustomLinksCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**objectTypes** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**linkText** | **String** | Jinja2 template code for link text |  |
|**linkUrl** | **String** | Jinja2 template code for link URL |  |
|**weight** | **Integer** |  |  [optional] |
|**groupName** | **String** | Links with the same group will appear as a dropdown menu |  [optional] |
|**buttonClass** | [**ButtonClassEnum**](#ButtonClassEnum) | The class of the first link in a group will be used for the dropdown button  * &#x60;default&#x60; - Default * &#x60;blue&#x60; - Blue * &#x60;indigo&#x60; - Indigo * &#x60;purple&#x60; - Purple * &#x60;pink&#x60; - Pink * &#x60;red&#x60; - Red * &#x60;orange&#x60; - Orange * &#x60;yellow&#x60; - Yellow * &#x60;green&#x60; - Green * &#x60;teal&#x60; - Teal * &#x60;cyan&#x60; - Cyan * &#x60;gray&#x60; - Gray * &#x60;black&#x60; - Black * &#x60;white&#x60; - White * &#x60;ghost-dark&#x60; - Link |  [optional] |
|**newWindow** | **Boolean** | Force link to open in a new window |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |



## Enum: ButtonClassEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| BLUE | &quot;blue&quot; |
| INDIGO | &quot;indigo&quot; |
| PURPLE | &quot;purple&quot; |
| PINK | &quot;pink&quot; |
| RED | &quot;red&quot; |
| ORANGE | &quot;orange&quot; |
| YELLOW | &quot;yellow&quot; |
| GREEN | &quot;green&quot; |
| TEAL | &quot;teal&quot; |
| CYAN | &quot;cyan&quot; |
| GRAY | &quot;gray&quot; |
| BLACK | &quot;black&quot; |
| WHITE | &quot;white&quot; |
| GHOST_DARK | &quot;ghost-dark&quot; |


## Implemented Interfaces

* Serializable


