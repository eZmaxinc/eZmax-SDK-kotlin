
# EzsigntemplateResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplateID** | **kotlin.Int** | The unique ID of the Ezsigntemplate | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **kotlin.String** | The Name of the Language in the language of the requester | 
**sEzsigntemplateDescription** | **kotlin.String** | The description of the Ezsigntemplate | 
**bEzsigntemplateAdminonly** | **kotlin.Boolean** | Whether the Ezsigntemplate can be accessed by admin users only (eUserType&#x3D;Normal) | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 
**bEzsigntemplateEditallowed** | **kotlin.Boolean** | Whether the Ezsigntemplate if allowed to edit or not | 
**aObjEzsigntemplatesigner** | [**kotlin.collections.List&lt;EzsigntemplatesignerResponseCompound&gt;**](EzsigntemplatesignerResponseCompound.md) |  | 
**fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument |  [optional]
**fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  [optional]
**sEzsigntemplateFilenamepattern** | **kotlin.String** | The filename pattern of the Ezsigntemplate |  [optional]
**sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester |  [optional]
**eEzsigntemplateType** | [**FieldEEzsigntemplateType**](FieldEEzsigntemplateType.md) |  |  [optional]
**objEzsigntemplatedocument** | [**EzsigntemplatedocumentResponse**](EzsigntemplatedocumentResponse.md) |  |  [optional]



