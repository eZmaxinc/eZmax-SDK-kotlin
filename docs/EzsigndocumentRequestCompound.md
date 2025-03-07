
# EzsigndocumentRequestCompound

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder |  |
| **fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
| **eEzsigndocumentSource** | [**inline**](#EEzsigndocumentSource) | Indicates where to look for the document binary content. |  |
| **dtEzsigndocumentDuedate** | **kotlin.String** | The maximum date and time at which the Ezsigndocument can be signed. |  |
| **sEzsigndocumentName** | **kotlin.String** | The name of the document that will be presented to Ezsignfoldersignerassociations |  |
| **pkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument |  [optional] |
| **fkiEzsigntemplateID** | **kotlin.Int** | The unique ID of the Ezsigntemplate |  [optional] |
| **fkiEzsignfoldersignerassociationID** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation |  [optional] |
| **fkiEzsignimportdocumentID** | **kotlin.Int** | The unique ID of the Ezsignimportdocument |  [optional] |
| **eEzsigndocumentFormat** | [**inline**](#EEzsigndocumentFormat) | Indicates the format of the document. |  [optional] |
| **sEzsigndocumentBase64** | **kotlin.ByteArray** | The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource &#x3D; Base64. |  [optional] |
| **sEzsigndocumentUrl** | **kotlin.String** | The url where the document content resides.  This field is Required when eEzsigndocumentSource &#x3D; Url. |  [optional] |
| **bEzsigndocumentForcerepair** | **kotlin.Boolean** | Try to repair the document or flatten it if it cannot be used for electronic signature.  |  [optional] |
| **sEzsigndocumentPassword** | **kotlin.String** | If the source document is password protected, the password to open/modify it. |  [optional] |
| **eEzsigndocumentForm** | [**inline**](#EEzsigndocumentForm) | If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsignformfieldgroups and assign them to the specified **fkiEzsignfoldersignerassociationID**  **Discard** removes the form from the document.  **Flatten** prints the form values in the document. |  [optional] |
| **sEzsigndocumentExternalid** | **kotlin.String** | This field can be used to store an External ID from the client&#39;s system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  |  [optional] |


<a id="EEzsigndocumentSource"></a>
## Enum: eEzsigndocumentSource
| Name | Value |
| ---- | ----- |
| eEzsigndocumentSource | Base64, Ezsignimportdocument, Ezsigntemplate, Url |


<a id="EEzsigndocumentFormat"></a>
## Enum: eEzsigndocumentFormat
| Name | Value |
| ---- | ----- |
| eEzsigndocumentFormat | Pdf, Doc, Docx, Xls, Xlsx, Ppt, Pptx |


<a id="EEzsigndocumentForm"></a>
## Enum: eEzsigndocumentForm
| Name | Value |
| ---- | ----- |
| eEzsigndocumentForm | Keep, Convert, Discard, Flatten |



