
# EzsignformfieldRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **iEzsignpagePagenumber** | **kotlin.Int** | The page number in the Ezsigndocument |  |
| **sEzsignformfieldLabel** | **kotlin.String** | The Label for the Ezsignformfield |  |
| **iEzsignformfieldX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. |  |
| **iEzsignformfieldY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. |  |
| **iEzsignformfieldWidth** | **kotlin.Int** | The Width of the Ezsignformfield in pixels calculated at 100 DPI |  |
| **iEzsignformfieldHeight** | **kotlin.Int** | The Height of the Ezsignformfield in pixels calculated at 100 DPI  |  |
| **pkiEzsignformfieldID** | **kotlin.Int** | The unique ID of the Ezsignformfield |  [optional] |
| **sEzsignformfieldValue** | **kotlin.String** | The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio |  [optional] |
| **bEzsignformfieldAutocomplete** | **kotlin.Boolean** | Whether the Ezsignformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsignformfieldgroupType is **Text** |  [optional] |
| **bEzsignformfieldSelected** | **kotlin.Boolean** | Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio** |  [optional] |
| **sEzsignformfieldEnteredvalue** | **kotlin.String** | This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea** |  [optional] |
| **eEzsignformfieldDependencyrequirement** | [**FieldEEzsignformfieldDependencyrequirement**](FieldEEzsignformfieldDependencyrequirement.md) |  |  [optional] |
| **eEzsignformfieldHorizontalalignment** | [**EnumHorizontalalignment**](EnumHorizontalalignment.md) |  |  [optional] |
| **objTextstylestatic** | [**TextstylestaticRequestCompound**](TextstylestaticRequestCompound.md) |  |  [optional] |



