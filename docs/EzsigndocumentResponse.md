
# EzsigndocumentMinusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder | 
**dtEzsigndocumentDuedate** | **kotlin.String** | The maximum date and time at which the document can be signed. | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sEzsigndocumentFilename** | **kotlin.String** | The actual file name that will be used when downloading or attaching to an email. | 
**sEzsigndocumentName** | **kotlin.String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 
**pkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplate | 
**eEzsigndocumentStep** | [**FieldMinusEEzsigndocumentStep**](FieldMinusEEzsigndocumentStep.md) |  | 
**dtEzsigndocumentFirstsend** | **kotlin.String** | The date and time when the Ezsigndocument was first sent. | 
**dtEzsigndocumentLastsend** | **kotlin.String** | The date and time when the Ezsigndocument was sent the last time. | 
**iEzsigndocumentOrder** | **kotlin.Int** | The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder. | 
**iEzsigndocumentPagetotal** | **kotlin.Int** | The number of pages in the Ezsigndocument. | 
**iEzsigndocumentSignaturesigned** | **kotlin.Int** | The number of signatures that were signed in the document. | 
**iEzsigndocumentSignaturetotal** | **kotlin.Int** | The number of total signatures that were requested in the Ezsigndocument. | 
**sEzsigndocumentMD5initial** | **kotlin.String** | MD5 Hash of the initial PDF Document before signatures were applied to it. | 
**sEzsigndocumentMD5signed** | **kotlin.String** | MD5 Hash of the final PDF Document after all signatures were applied to it. | 
**objAudit** | [**CommonMinusAudit**](CommonMinusAudit.md) |  | 



