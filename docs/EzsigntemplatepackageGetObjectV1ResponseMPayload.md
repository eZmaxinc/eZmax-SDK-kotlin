
# EzsigntemplatepackageMinusGetObjectMinusV1MinusResponseMinusMPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplatepackageID** | **kotlin.Int** | The unique ID of the Ezsigntemplatepackage | 
**fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **kotlin.String** | The Name of the Language in the language of the requester | 
**sEzsigntemplatepackageDescription** | **kotlin.String** | The description of the Ezsigntemplatepackage | 
**bEzsigntemplatepackageAdminonly** | **kotlin.Boolean** | Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType&#x3D;Normal) | 
**bEzsigntemplatepackageNeedvalidation** | **kotlin.Boolean** | Whether the Ezsignbulksend was automatically modified and needs a manual validation | 
**bEzsigntemplatepackageIsactive** | **kotlin.Boolean** | Whether the Ezsigntemplatepackage is active or not | 
**sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester | 
**aObjEzsigntemplatepackagesigner** | [**kotlin.collections.List&lt;EzsigntemplatepackagesignerMinusResponseCompound&gt;**](EzsigntemplatepackagesignerMinusResponseCompound.md) |  | 
**aObjEzsigntemplatepackagemembership** | [**kotlin.collections.List&lt;EzsigntemplatepackagemembershipMinusResponseCompound&gt;**](EzsigntemplatepackagemembershipMinusResponseCompound.md) |  | 



