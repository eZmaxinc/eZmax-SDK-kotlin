
# EzsigntemplateformfieldgroupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplateformfieldgroupID** | **kotlin.Int** | The unique ID of the Ezsigntemplateformfieldgroup | 
**fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument | 
**eEzsigntemplateformfieldgroupType** | [**FieldEEzsigntemplateformfieldgroupType**](FieldEEzsigntemplateformfieldgroupType.md) |  | 
**eEzsigntemplateformfieldgroupSignerrequirement** | [**FieldEEzsigntemplateformfieldgroupSignerrequirement**](FieldEEzsigntemplateformfieldgroupSignerrequirement.md) |  | 
**sEzsigntemplateformfieldgroupLabel** | **kotlin.String** | The Label for the Ezsigntemplateformfieldgroup | 
**iEzsigntemplateformfieldgroupStep** | **kotlin.Int** | The step when the Ezsigntemplatesigner will be invited to fill the form fields | 
**iEzsigntemplateformfieldgroupFilledmin** | **kotlin.Int** | The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup | 
**iEzsigntemplateformfieldgroupFilledmax** | **kotlin.Int** | The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup | 
**bEzsigntemplateformfieldgroupReadonly** | **kotlin.Boolean** | Whether the Ezsigntemplateformfieldgroup is read only or not. | 
**sEzsigntemplateformfieldgroupDefaultvalue** | **kotlin.String** | The default value for the Ezsigntemplateformfieldgroup |  [optional]
**iEzsigntemplateformfieldgroupMaxlength** | **kotlin.Int** | The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**bEzsigntemplateformfieldgroupEncrypted** | **kotlin.Boolean** | Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**sEzsigntemplateformfieldgroupRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional]
**eEzsigntemplateformfieldgroupTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional]
**tEzsigntemplateformfieldgroupTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup |  [optional]
**eEzsigntemplateformfieldgroupTooltipposition** | [**FieldEEzsigntemplateformfieldgroupTooltipposition**](FieldEEzsigntemplateformfieldgroupTooltipposition.md) |  |  [optional]



