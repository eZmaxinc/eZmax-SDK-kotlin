
# EzsigntemplateRequestCompoundV3

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
| **sEzsigntemplateDescription** | **kotlin.String** | The description of the Ezsigntemplate |  |
| **bEzsigntemplateAdminonly** | **kotlin.Boolean** | Whether the Ezsigntemplate can be accessed by admin users only (eUserType&#x3D;Normal) |  |
| **eEzsigntemplateType** | [**FieldEEzsigntemplateType**](FieldEEzsigntemplateType.md) |  |  |
| **pkiEzsigntemplateID** | **kotlin.Int** | The unique ID of the Ezsigntemplate |  [optional] |
| **fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  [optional] |
| **fkiEzdoctemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezdoctemplatedocument |  [optional] |
| **sEzsigntemplateExternaldescription** | **kotlin.String** | The external description of the Ezsigntemplate |  [optional] |
| **tEzsigntemplateComment** | **kotlin.String** | The comment of the Ezsigntemplate |  [optional] |
| **eEzsigntemplateRecognition** | [**FieldEEzsigntemplateRecognition**](FieldEEzsigntemplateRecognition.md) |  |  [optional] |
| **sEzsigntemplateFilenameregexp** | **kotlin.String** | The filename regexp of the Ezsigntemplate. |  [optional] |



