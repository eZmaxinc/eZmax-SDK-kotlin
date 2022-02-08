
# EzsigndocumentMinusRequestCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eEzsigndocumentSource** | [**inline**](#EEzsigndocumentSource) | Indicates where to look for the document binary content. | 
**eEzsigndocumentFormat** | [**inline**](#EEzsigndocumentFormat) | Indicates the format of the document. | 
**fkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder | 
**dtEzsigndocumentDuedate** | **kotlin.String** | The maximum date and time at which the Ezsigndocument can be signed. | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sEzsigndocumentName** | **kotlin.String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 
**pkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument |  [optional]
**sEzsigndocumentBase64** | **kotlin.ByteArray** | The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource &#x3D; Base64. |  [optional]
**sEzsigndocumentUrl** | **kotlin.String** | The url where the document content resides.  This field is Required when eEzsigndocumentSource &#x3D; Url. |  [optional]
**bEzsigndocumentForcerepair** | **kotlin.Boolean** | Try to repair the document or flatten it if it cannot be used for electronic signature.  |  [optional]
**sEzsigndocumentPassword** | **kotlin.String** | If the source document is password protected, the password to open/modify it. |  [optional]


<a name="EEzsigndocumentSource"></a>
## Enum: eEzsigndocumentSource
Name | Value
---- | -----
eEzsigndocumentSource | Base64, Url


<a name="EEzsigndocumentFormat"></a>
## Enum: eEzsigndocumentFormat
Name | Value
---- | -----
eEzsigndocumentFormat | Pdf



