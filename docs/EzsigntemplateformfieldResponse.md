
# EzsigntemplateformfieldResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateformfieldID** | **kotlin.Int** | The unique ID of the Ezsigntemplateformfield |  |
| **iEzsigntemplatedocumentpagePagenumber** | **kotlin.Int** | The page number in the Ezsigntemplatedocument |  |
| **sEzsigntemplateformfieldLabel** | **kotlin.String** | The Label for the Ezsigntemplateformfield |  |
| **iEzsigntemplateformfieldWidth** | **kotlin.Int** | The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI |  |
| **iEzsigntemplateformfieldHeight** | **kotlin.Int** | The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  |  |
| **eEzsigntemplateformfieldPositioning** | [**FieldEEzsigntemplateformfieldPositioning**](FieldEEzsigntemplateformfieldPositioning.md) |  |  [optional] |
| **sEzsigntemplateformfieldValue** | **kotlin.String** | The value for the Ezsigntemplateformfield |  [optional] |
| **iEzsigntemplateformfieldX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. |  [optional] |
| **iEzsigntemplateformfieldY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. |  [optional] |
| **bEzsigntemplateformfieldAutocomplete** | **kotlin.Boolean** | Whether the Ezsigntemplateformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** |  [optional] |
| **bEzsigntemplateformfieldSelected** | **kotlin.Boolean** | Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio** |  [optional] |
| **eEzsigntemplateformfieldDependencyrequirement** | [**FieldEEzsigntemplateformfieldDependencyrequirement**](FieldEEzsigntemplateformfieldDependencyrequirement.md) |  |  [optional] |
| **sEzsigntemplateformfieldPositioningpattern** | **kotlin.String** | The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates** |  [optional] |
| **iEzsigntemplateformfieldPositioningoffsetx** | **kotlin.Int** | The offset X  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates** |  [optional] |
| **iEzsigntemplateformfieldPositioningoffsety** | **kotlin.Int** | The offset Y  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates** |  [optional] |
| **eEzsigntemplateformfieldPositioningoccurence** | [**FieldEEzsigntemplateformfieldPositioningoccurence**](FieldEEzsigntemplateformfieldPositioningoccurence.md) |  |  [optional] |
| **eEzsigntemplateformfieldHorizontalalignment** | [**EnumHorizontalalignment**](EnumHorizontalalignment.md) |  |  [optional] |
| **objTextstylestatic** | [**TextstylestaticResponseCompound**](TextstylestaticResponseCompound.md) |  |  [optional] |



