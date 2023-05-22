
# EzsigntemplatedocumentMinusRequestCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiEzsigntemplateID** | **kotlin.Int** | The unique ID of the Ezsigntemplate | 
**sEzsigntemplatedocumentName** | **kotlin.String** | The name of the Ezsigntemplatedocument. | 
**eEzsigntemplatedocumentSource** | [**inline**](#EEzsigntemplatedocumentSource) | Indicates where to look for the document binary content. | 
**pkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument |  [optional]
**fkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument |  [optional]
**fkiEzsigntemplatesignerID** | **kotlin.Int** | The unique ID of the Ezsigntemplatesigner |  [optional]
**eEzsigntemplatedocumentFormat** | [**inline**](#EEzsigntemplatedocumentFormat) | Indicates the format of the template. |  [optional]
**sEzsigntemplatedocumentBase64** | **kotlin.ByteArray** | The Base64 encoded binary content of the document.  This field is Required when eEzsigntemplatedocumentSource &#x3D; Base64. |  [optional]
**sEzsigntemplatedocumentUrl** | **kotlin.String** | The url where the document content resides.  This field is Required when eEzsigntemplatedocumentSource &#x3D; Url. |  [optional]
**bEzsigntemplatedocumentForcerepair** | **kotlin.Boolean** | Try to repair the document or flatten it if it cannot be used for electronic signature. |  [optional]
**eEzsigntemplatedocumentForm** | [**inline**](#EEzsigntemplatedocumentForm) | If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsigntemplateformfieldgroups and assign them to the specified **fkiEzsigntemplatesignerID** |  [optional]
**sEzsigntemplatedocumentPassword** | **kotlin.String** | If the source template is password protected, the password to open/modify it. |  [optional]


<a id="EEzsigntemplatedocumentSource"></a>
## Enum: eEzsigntemplatedocumentSource
Name | Value
---- | -----
eEzsigntemplatedocumentSource | Base64, Url, Ezsigndocument


<a id="EEzsigntemplatedocumentFormat"></a>
## Enum: eEzsigntemplatedocumentFormat
Name | Value
---- | -----
eEzsigntemplatedocumentFormat | Pdf, Doc, Docx, Xls, Xlsx, Ppt, Pptx


<a id="EEzsigntemplatedocumentForm"></a>
## Enum: eEzsigntemplatedocumentForm
Name | Value
---- | -----
eEzsigntemplatedocumentForm | Keep, Convert



