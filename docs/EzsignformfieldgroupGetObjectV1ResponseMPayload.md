
# EzsignformfieldgroupMinusGetObjectMinusV1MinusResponseMinusMPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignformfieldgroupID** | **kotlin.Int** | The unique ID of the Ezsignformfieldgroup | 
**fkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument | 
**eEzsignformfieldgroupType** | [**FieldMinusEEzsignformfieldgroupType**](FieldMinusEEzsignformfieldgroupType.md) |  | 
**eEzsignformfieldgroupSignerrequirement** | [**FieldMinusEEzsignformfieldgroupSignerrequirement**](FieldMinusEEzsignformfieldgroupSignerrequirement.md) |  | 
**sEzsignformfieldgroupLabel** | **kotlin.String** | The Label for the Ezsignformfieldgroup | 
**iEzsignformfieldgroupStep** | **kotlin.Int** | The step when the Ezsignsigner will be invited to fill the form fields | 
**sEzsignformfieldgroupDefaultvalue** | **kotlin.String** | The default value for the Ezsignformfieldgroup | 
**iEzsignformfieldgroupFilledmin** | **kotlin.Int** | The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup | 
**iEzsignformfieldgroupFilledmax** | **kotlin.Int** | The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup | 
**bEzsignformfieldgroupReadonly** | **kotlin.Boolean** | Whether the Ezsignformfieldgroup is read only or not. | 
**aObjEzsignformfield** | [**kotlin.collections.List&lt;EzsignformfieldMinusResponseCompound&gt;**](EzsignformfieldMinusResponseCompound.md) |  | 
**aObjEzsignformfieldgroupsigner** | [**EzsignformfieldgroupsignerMinusResponseCompound**](EzsignformfieldgroupsignerMinusResponseCompound.md) |  | 
**iEzsignformfieldgroupMaxlength** | **kotlin.Int** | The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** |  [optional]
**bEzsignformfieldgroupEncrypted** | **kotlin.Boolean** | Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** |  [optional]
**sEzsignformfieldgroupRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** |  [optional]
**tEzsignformfieldgroupTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup |  [optional]
**eEzsignformfieldgroupTooltipposition** | [**FieldMinusEEzsignformfieldgroupTooltipposition**](FieldMinusEEzsignformfieldgroupTooltipposition.md) |  |  [optional]
**aObjDropdownElement** | [**kotlin.collections.List&lt;CustomMinusDropdownElementMinusResponseCompound&gt;**](CustomMinusDropdownElementMinusResponseCompound.md) |  |  [optional]



