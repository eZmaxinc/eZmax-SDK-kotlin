
# EzsigntemplatepackageResponseCompound

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatepackageID** | **kotlin.Int** | The unique ID of the Ezsigntemplatepackage |  |
| **fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  |
| **fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
| **sLanguageNameX** | **kotlin.String** | The Name of the Language in the language of the requester |  |
| **sEzsigntemplatepackageDescription** | **kotlin.String** | The description of the Ezsigntemplatepackage |  |
| **bEzsigntemplatepackageAdminonly** | **kotlin.Boolean** | Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType&#x3D;Normal) |  |
| **bEzsigntemplatepackageNeedvalidation** | **kotlin.Boolean** | Whether the Ezsignbulksend was automatically modified and needs a manual validation |  |
| **bEzsigntemplatepackageIsactive** | **kotlin.Boolean** | Whether the Ezsigntemplatepackage is active or not |  |
| **sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester |  |
| **bEzsigntemplatepackageEditallowed** | **kotlin.Boolean** | Whether the Ezsigntemplatepackage if allowed to edit or not |  |
| **aObjEzsigntemplatepackagesigner** | [**kotlin.collections.List&lt;EzsigntemplatepackagesignerResponseCompound&gt;**](EzsigntemplatepackagesignerResponseCompound.md) |  |  |
| **aObjEzsigntemplatepackagemembership** | [**kotlin.collections.List&lt;EzsigntemplatepackagemembershipResponseCompound&gt;**](EzsigntemplatepackagemembershipResponseCompound.md) |  |  |
| **fkiEzdoctemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezdoctemplatedocument |  [optional] |
| **sEzdoctemplatedocumentNameX** | **kotlin.String** | The name of the Ezdoctemplatedocument in the language of the requester |  [optional] |



