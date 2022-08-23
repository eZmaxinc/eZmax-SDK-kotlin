
# EzsigndocumentMinusGetObjectMinusV1MinusResponseMinusMPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder | 
**dtEzsigndocumentDuedate** | **kotlin.String** | The maximum date and time at which the Ezsigndocument can be signed. | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sEzsigndocumentName** | **kotlin.String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 
**pkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument | 
**eEzsigndocumentStep** | [**FieldMinusEEzsigndocumentStep**](FieldMinusEEzsigndocumentStep.md) |  | 
**iEzsigndocumentOrder** | **kotlin.Int** | The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder. | 
**iEzsigndocumentPagetotal** | **kotlin.Int** | The number of pages in the Ezsigndocument. | 
**iEzsigndocumentSignaturesigned** | **kotlin.Int** | The number of signatures that were signed in the document. | 
**iEzsigndocumentSignaturetotal** | **kotlin.Int** | The number of total signatures that were requested in the Ezsigndocument. | 
**sEzsigndocumentMD5initial** | **kotlin.String** | MD5 Hash of the initial PDF Document before signatures were applied to it. | 
**sEzsigndocumentMD5signed** | **kotlin.String** | MD5 Hash of the final PDF Document after all signatures were applied to it. | 
**bEzsigndocumentEzsignform** | **kotlin.Boolean** | If the Ezsigndocument contains an Ezsignform or not | 
**objAudit** | [**CommonMinusAudit**](CommonMinusAudit.md) |  | 
**iEzsigndocumentStepformtotal** | **kotlin.Int** | The total number of steps in the form filling phase | 
**iEzsigndocumentStepformcurrent** | **kotlin.Int** | The current step in the form filling phase | 
**iEzsigndocumentStepsignaturetotal** | **kotlin.Int** | The total number of steps in the signature filling phase | 
**iEzsigndocumentStepsignatureCurrent** | **kotlin.Int** | The current step in the signature phase | 
**aObjEzsignfoldersignerassociationstatus** | [**kotlin.collections.List&lt;CustomMinusEzsignfoldersignerassociationstatusMinusResponse&gt;**](CustomMinusEzsignfoldersignerassociationstatusMinusResponse.md) |  | 
**dtEzsignformCompleted** | **kotlin.String** | The date and time at which the Ezsignform has been completed. |  [optional]
**dtEzsigndocumentFirstsend** | **kotlin.String** | The date and time when the Ezsigndocument was first sent. |  [optional]
**dtEzsigndocumentLastsend** | **kotlin.String** | The date and time when the Ezsigndocument was sent the last time. |  [optional]



