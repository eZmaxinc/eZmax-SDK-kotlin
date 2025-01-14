
# EzsigntemplateResponseCompoundV3

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateID** | **kotlin.Int** | The unique ID of the Ezsigntemplate |  |
| **fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
| **sLanguageNameX** | **kotlin.String** | The Name of the Language in the language of the requester |  |
| **sEzsigntemplateDescription** | **kotlin.String** | The description of the Ezsigntemplate |  |
| **bEzsigntemplateAdminonly** | **kotlin.Boolean** | Whether the Ezsigntemplate can be accessed by admin users only (eUserType&#x3D;Normal) |  |
| **objAudit** | [**CommonAudit**](CommonAudit.md) |  |  |
| **bEzsigntemplateEditallowed** | **kotlin.Boolean** | Whether the Ezsigntemplate if allowed to edit or not |  |
| **aObjEzsigntemplatesigner** | [**kotlin.collections.List&lt;EzsigntemplatesignerResponseCompound&gt;**](EzsigntemplatesignerResponseCompound.md) |  |  |
| **fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument |  [optional] |
| **fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  [optional] |
| **fkiEzdoctemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezdoctemplatedocument |  [optional] |
| **sEzdoctemplatedocumentNameX** | **kotlin.String** | The name of the Ezdoctemplatedocument in the language of the requester |  [optional] |
| **sEzsigntemplateExternaldescription** | **kotlin.String** | The external description of the Ezsigntemplate |  [optional] |
| **tEzsigntemplateComment** | **kotlin.String** | The comment of the Ezsigntemplate |  [optional] |
| **eEzsigntemplateRecognition** | [**FieldEEzsigntemplateRecognition**](FieldEEzsigntemplateRecognition.md) |  |  [optional] |
| **sEzsigntemplateFilenameregexp** | **kotlin.String** | The filename regexp of the Ezsigntemplate. |  [optional] |
| **sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester |  [optional] |
| **eEzsigntemplateType** | [**FieldEEzsigntemplateType**](FieldEEzsigntemplateType.md) |  |  [optional] |
| **objEzsigntemplatedocument** | [**EzsigntemplatedocumentResponse**](EzsigntemplatedocumentResponse.md) |  |  [optional] |



