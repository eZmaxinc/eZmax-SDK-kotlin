
# EzsigntemplateformfieldMinusRequestCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iEzsigntemplatedocumentpagePagenumber** | **kotlin.Int** | The page number in the Ezsigntemplatedocument | 
**sEzsigntemplateformfieldLabel** | **kotlin.String** | The Label for the Ezsigntemplateformfield | 
**iEzsigntemplateformfieldX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsigntemplateformfieldY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsigntemplateformfieldWidth** | **kotlin.Int** | The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     | | 
**iEzsigntemplateformfieldHeight** | **kotlin.Int** | The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     |  | 
**pkiEzsigntemplateformfieldID** | **kotlin.Int** | The unique ID of the Ezsigntemplateformfield |  [optional]
**sEzsigntemplateformfieldValue** | **kotlin.String** | The value for the Ezsigntemplateformfield |  [optional]
**bEzsigntemplateformfieldSelected** | **kotlin.Boolean** | Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio** |  [optional]



