
# EzsigndocumentMinusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eEzsigndocumentSource** | [**inline**](#EEzsigndocumentSourceEnum) | Indicates where to look for the document binary content. | 
**eEzsigndocumentFormat** | [**inline**](#EEzsigndocumentFormatEnum) | Indicates the format of the document. | 
**fkiEzsignfolderID** | **kotlin.Int** | A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation. | 
**dtEzsigndocumentDuedate** | **kotlin.String** | Represent a Date Time. The timezone is the one configured in the User&#39;s profile. | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sEzsigndocumentName** | **kotlin.String** | The name of the document that will be presented to Ezsignfoldersignerassociations | 
**sEzsigndocumentBase64** | **kotlin.ByteArray** | The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource &#x3D; Base64. |  [optional]


<a name="EEzsigndocumentSourceEnum"></a>
## Enum: eEzsigndocumentSource
Name | Value
---- | -----
eEzsigndocumentSource | Base64


<a name="EEzsigndocumentFormatEnum"></a>
## Enum: eEzsigndocumentFormat
Name | Value
---- | -----
eEzsigndocumentFormat | Pdf



