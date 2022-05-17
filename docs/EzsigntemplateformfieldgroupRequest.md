
# EzsigntemplateformfieldgroupMinusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument | 
**eEzsigntemplateformfieldgroupType** | [**FieldMinusEEzsigntemplateformfieldgroupType**](FieldMinusEEzsigntemplateformfieldgroupType.md) |  | 
**eEzsigntemplateformfieldgroupSignerrequirement** | [**FieldMinusEEzsigntemplateformfieldgroupSignerrequirement**](FieldMinusEEzsigntemplateformfieldgroupSignerrequirement.md) |  | 
**sEzsigntemplateformfieldgroupLabel** | **kotlin.String** | The Label for the Ezsigntemplateformfieldgroup | 
**iEzsigntemplateformfieldgroupStep** | **kotlin.Int** | The step when the Ezsigntemplatesigner will be invited to fill the form fields | 
**sEzsigntemplateformfieldgroupDefaultvalue** | **kotlin.String** | The default value for the Ezsigntemplateformfieldgroup | 
**iEzsigntemplateformfieldgroupFilledmin** | **kotlin.Int** | The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup | 
**iEzsigntemplateformfieldgroupFilledmax** | **kotlin.Int** | The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup | 
**bEzsigntemplateformfieldgroupReadonly** | **kotlin.Boolean** | Whether the Ezsigntemplateformfieldgroup is read only or not. | 
**pkiEzsigntemplateformfieldgroupID** | **kotlin.Int** | The unique ID of the Ezsigntemplateformfieldgroup |  [optional]
**iEzsigntemplateformfieldgroupMaxlength** | **kotlin.Int** | The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**bEzsigntemplateformfieldgroupEncrypted** | **kotlin.Boolean** | Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**sEzsigntemplateformfieldgroupRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**tEzsigntemplateformfieldgroupTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup |  [optional]
**eEzsigntemplateformfieldgroupTooltipposition** | [**FieldMinusEEzsigntemplateformfieldgroupTooltipposition**](FieldMinusEEzsigntemplateformfieldgroupTooltipposition.md) |  |  [optional]



