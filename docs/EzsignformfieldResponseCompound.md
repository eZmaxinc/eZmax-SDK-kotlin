
# EzsignformfieldResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignformfieldID** | **kotlin.Int** | The unique ID of the Ezsignformfield | 
**iEzsignpagePagenumber** | **kotlin.Int** | The page number in the Ezsigndocument | 
**sEzsignformfieldLabel** | **kotlin.String** | The Label for the Ezsignformfield | 
**iEzsignformfieldX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsignformfieldY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsignformfieldWidth** | **kotlin.Int** | The Width of the Ezsignformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsignformfieldgroupType.  | eEzsignformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     | | 
**iEzsignformfieldHeight** | **kotlin.Int** | The Height of the Ezsignformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsignformfieldgroupType.  | eEzsignformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     |  | 
**sEzsignformfieldValue** | **kotlin.String** | The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio |  [optional]
**bEzsignformfieldAutocomplete** | **kotlin.Boolean** | Whether the Ezsignformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsignformfieldgroupType is **Text** |  [optional]
**bEzsignformfieldSelected** | **kotlin.Boolean** | Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio** |  [optional]
**sEzsignformfieldEnteredvalue** | **kotlin.String** | This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea**  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | |  [optional]
**eEzsignformfieldDependencyrequirement** | [**FieldEEzsignformfieldDependencyrequirement**](FieldEEzsignformfieldDependencyrequirement.md) |  |  [optional]
**aObjEzsignelementdependency** | [**kotlin.collections.List&lt;EzsignelementdependencyResponseCompound&gt;**](EzsignelementdependencyResponseCompound.md) |  |  [optional]



