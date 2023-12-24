
# EzsigndocumentResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument | 
**fkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder | 
**dtEzsigndocumentDuedate** | **kotlin.String** | The maximum date and time at which the Ezsigndocument can be signed. | 
**sEzsigndocumentName** | **kotlin.String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 
**eEzsigndocumentStep** | [**FieldEEzsigndocumentStep**](FieldEEzsigndocumentStep.md) |  | 
**iEzsigndocumentOrder** | **kotlin.Int** | The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder. | 
**iEzsigndocumentPagetotal** | **kotlin.Int** | The number of pages in the Ezsigndocument. | 
**iEzsigndocumentSignaturesigned** | **kotlin.Int** | The number of signatures that were signed in the document. | 
**iEzsigndocumentSignaturetotal** | **kotlin.Int** | The number of total signatures that were requested in the Ezsigndocument. | 
**iEzsigndocumentEzsignsignatureattachmenttotal** | **kotlin.Int** | The number of Ezsigndocumentattachment total | 
**eEzsigndocumentSteptype** | [**ComputedEEzsigndocumentSteptype**](ComputedEEzsigndocumentSteptype.md) |  | 
**iEzsigndocumentStepformtotal** | **kotlin.Int** | The total number of steps in the form filling phase | 
**iEzsigndocumentStepformcurrent** | **kotlin.Int** | The current step in the form filling phase | 
**iEzsigndocumentStepsignaturetotal** | **kotlin.Int** | The total number of steps in the signature filling phase | 
**iEzsigndocumentStepsignatureCurrent** | **kotlin.Int** | The current step in the signature phase | 
**aObjEzsignfoldersignerassociationstatus** | [**kotlin.collections.List&lt;CustomEzsignfoldersignerassociationstatusResponse&gt;**](CustomEzsignfoldersignerassociationstatusResponse.md) |  | 
**fkiEzsignfoldersignerassociationIDDeclinedtosign** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation |  [optional]
**dtEzsignformCompleted** | **kotlin.String** | The date and time at which the Ezsignform has been completed. |  [optional]
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  [optional]
**dtEzsigndocumentFirstsend** | **kotlin.String** | The date and time when the Ezsigndocument was first sent. |  [optional]
**dtEzsigndocumentLastsend** | **kotlin.String** | The date and time when the Ezsigndocument was sent the last time. |  [optional]
**sEzsigndocumentMD5initial** | **kotlin.String** | MD5 Hash of the initial PDF Document before signatures were applied to it. |  [optional]
**tEzsigndocumentDeclinedtosignreason** | **kotlin.String** | A custom text message that will contain the refusal message if the Ezsigndocument is declined to sign |  [optional]
**sEzsigndocumentMD5signed** | **kotlin.String** | MD5 Hash of the final PDF Document after all signatures were applied to it. |  [optional]
**bEzsigndocumentEzsignform** | **kotlin.Boolean** | If the Ezsigndocument contains an Ezsignform or not |  [optional]
**bEzsigndocumentHassignedsignatures** | **kotlin.Boolean** | If the Ezsigndocument contains signed signatures (From internal or external sources) |  [optional]
**objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional]
**sEzsigndocumentExternalid** | **kotlin.String** | This field can be used to store an External ID from the client&#39;s system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  |  [optional]



