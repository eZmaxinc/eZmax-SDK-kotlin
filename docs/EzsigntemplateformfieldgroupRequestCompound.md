
# EzsigntemplateformfieldgroupRequestCompound

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument |  |
| **eEzsigntemplateformfieldgroupType** | [**FieldEEzsigntemplateformfieldgroupType**](FieldEEzsigntemplateformfieldgroupType.md) |  |  |
| **sEzsigntemplateformfieldgroupLabel** | **kotlin.String** | The Label for the Ezsigntemplateformfieldgroup |  |
| **iEzsigntemplateformfieldgroupStep** | **kotlin.Int** | The step when the Ezsigntemplatesigner will be invited to fill the form fields |  |
| **sEzsigntemplateformfieldgroupDefaultvalue** | **kotlin.String** | The default value for the Ezsigntemplateformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | |  |
| **iEzsigntemplateformfieldgroupFilledmin** | **kotlin.Int** | The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup |  |
| **iEzsigntemplateformfieldgroupFilledmax** | **kotlin.Int** | The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup |  |
| **bEzsigntemplateformfieldgroupReadonly** | **kotlin.Boolean** | Whether the Ezsigntemplateformfieldgroup is read only or not. |  |
| **aObjEzsigntemplateformfieldgroupsigner** | [**kotlin.collections.List&lt;EzsigntemplateformfieldgroupsignerRequestCompound&gt;**](EzsigntemplateformfieldgroupsignerRequestCompound.md) |  |  |
| **aObjEzsigntemplateformfield** | [**kotlin.collections.List&lt;EzsigntemplateformfieldRequestCompound&gt;**](EzsigntemplateformfieldRequestCompound.md) |  |  |
| **pkiEzsigntemplateformfieldgroupID** | **kotlin.Int** | The unique ID of the Ezsigntemplateformfieldgroup |  [optional] |
| **eEzsigntemplateformfieldgroupSignerrequirement** | [**FieldEEzsigntemplateformfieldgroupSignerrequirement**](FieldEEzsigntemplateformfieldgroupSignerrequirement.md) |  |  [optional] |
| **iEzsigntemplateformfieldgroupMaxlength** | **kotlin.Int** | The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional] |
| **bEzsigntemplateformfieldgroupEncrypted** | **kotlin.Boolean** | Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional] |
| **sEzsigntemplateformfieldgroupRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** |  [optional] |
| **sEzsigntemplateformfieldgroupTextvalidationcustommessage** | **kotlin.String** | Description of validation rule. Show by signatory. |  [optional] |
| **eEzsigntemplateformfieldgroupTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional] |
| **tEzsigntemplateformfieldgroupTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup |  [optional] |
| **eEzsigntemplateformfieldgroupTooltipposition** | [**FieldEEzsigntemplateformfieldgroupTooltipposition**](FieldEEzsigntemplateformfieldgroupTooltipposition.md) |  |  [optional] |
| **aObjDropdownElement** | [**kotlin.collections.List&lt;CustomDropdownElementRequestCompound&gt;**](CustomDropdownElementRequestCompound.md) |  |  [optional] |



