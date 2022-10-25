
# EzsignbulksendMinusGetObjectMinusV1MinusResponseMinusMPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignbulksendID** | **kotlin.Int** | The unique ID of the Ezsignbulksend | 
**fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sLanguageNameX** | **kotlin.String** | The Name of the Language in the language of the requester | 
**eEzsignfoldertypePrivacylevel** | [**FieldMinusEEzsignfoldertypePrivacylevel**](FieldMinusEEzsignfoldertypePrivacylevel.md) |  | 
**sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester | 
**sEzsignbulksendDescription** | **kotlin.String** | The description of the Ezsignbulksend | 
**tEzsignbulksendNote** | **kotlin.String** | Note about the Ezsignbulksend | 
**bEzsignbulksendNeedvalidation** | **kotlin.Boolean** | Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation | 
**bEzsignbulksendIsactive** | **kotlin.Boolean** | Whether the Ezsignbulksend is active or not | 
**objAudit** | [**CommonMinusAudit**](CommonMinusAudit.md) |  | 
**aObjEzsignbulksenddocumentmapping** | [**kotlin.collections.List&lt;EzsignbulksenddocumentmappingMinusResponseCompound&gt;**](EzsignbulksenddocumentmappingMinusResponseCompound.md) |  | 
**aObjEzsignbulksendsignermapping** | [**kotlin.collections.List&lt;EzsignbulksendsignermappingMinusResponse&gt;**](EzsignbulksendsignermappingMinusResponse.md) |  | 



