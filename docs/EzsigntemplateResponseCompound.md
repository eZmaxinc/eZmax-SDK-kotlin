
# EzsigntemplateMinusResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplateID** | **kotlin.Int** | The unique ID of the Ezsigntemplate | 
**fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **kotlin.String** | The Name of the Language in the language of the requester | 
**sEzsigntemplateDescription** | **kotlin.String** | The description of the Ezsigntemplate | 
**bEzsigntemplateAdminonly** | **kotlin.Boolean** | Whether the Ezsigntemplate can be accessed by admin users only (eUserType&#x3D;Normal) | 
**sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester | 
**objAudit** | [**CommonMinusAudit**](CommonMinusAudit.md) |  | 
**aObjEzsigntemplatesigner** | [**kotlin.collections.List&lt;EzsigntemplatesignerMinusResponseCompound&gt;**](EzsigntemplatesignerMinusResponseCompound.md) |  | 
**fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument |  [optional]
**objEzsigntemplatedocument** | [**EzsigntemplatedocumentMinusResponse**](EzsigntemplatedocumentMinusResponse.md) |  |  [optional]



