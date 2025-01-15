
# CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument |  |
| **eEzsignformfieldgroupType** | [**FieldEEzsignformfieldgroupType**](FieldEEzsignformfieldgroupType.md) |  |  |
| **sEzsignformfieldgroupLabel** | **kotlin.String** | The Label for the Ezsignformfieldgroup |  |
| **iEzsignformfieldgroupStep** | **kotlin.Int** | The step when the Ezsignsigner will be invited to fill the form fields |  |
| **iEzsignformfieldgroupFilledmin** | **kotlin.Int** | The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup |  |
| **iEzsignformfieldgroupFilledmax** | **kotlin.Int** | The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup |  |
| **bEzsignformfieldgroupReadonly** | **kotlin.Boolean** | Whether the Ezsignformfieldgroup is read only or not. |  |
| **aObjEzsignformfieldgroupsigner** | [**kotlin.collections.List&lt;EzsignformfieldgroupsignerRequestCompound&gt;**](EzsignformfieldgroupsignerRequest.md) |  |  |
| **aObjEzsignformfield** | [**kotlin.collections.List&lt;EzsignformfieldRequestCompound&gt;**](EzsignformfieldRequestCompound.md) |  |  |
| **objCreateezsignelementspositionedbyword** | [**CustomCreateEzsignelementsPositionedByWordRequest**](CustomCreateEzsignelementsPositionedByWordRequest.md) |  |  |
| **pkiEzsignformfieldgroupID** | **kotlin.Int** | The unique ID of the Ezsignformfieldgroup |  [optional] |
| **eEzsignformfieldgroupSignerrequirement** | [**FieldEEzsignformfieldgroupSignerrequirement**](FieldEEzsignformfieldgroupSignerrequirement.md) |  |  [optional] |
| **sEzsignformfieldgroupDefaultvalue** | **kotlin.String** | The default value for the Ezsignformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | |  [optional] |
| **iEzsignformfieldgroupMaxlength** | **kotlin.Int** | The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** |  [optional] |
| **bEzsignformfieldgroupEncrypted** | **kotlin.Boolean** | Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** |  [optional] |
| **sEzsignformfieldgroupRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** |  [optional] |
| **sEzsignformfieldgroupTextvalidationcustommessage** | **kotlin.String** | Description of validation rule. Show by signatory. |  [optional] |
| **tEzsignformfieldgroupTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup |  [optional] |
| **eEzsignformfieldgroupTooltipposition** | [**FieldEEzsignformfieldgroupTooltipposition**](FieldEEzsignformfieldgroupTooltipposition.md) |  |  [optional] |
| **eEzsignformfieldgroupTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional] |
| **aObjDropdownElement** | [**kotlin.collections.List&lt;CustomDropdownElementRequestCompound&gt;**](CustomDropdownElementRequest.md) |  |  [optional] |



