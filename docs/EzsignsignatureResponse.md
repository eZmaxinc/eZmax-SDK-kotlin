
# EzsignsignatureResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignsignatureID** | **kotlin.Int** | The unique ID of the Ezsignsignature | 
**fkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument | 
**fkiEzsignfoldersignerassociationID** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation | 
**iEzsignpagePagenumber** | **kotlin.Int** | The page number in the Ezsigndocument | 
**iEzsignsignatureX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsignsignatureY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsignsignatureStep** | **kotlin.Int** | The step when the Ezsignsigner will be invited to sign | 
**eEzsignsignatureType** | [**FieldEEzsignsignatureType**](FieldEEzsignsignatureType.md) |  | 
**objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  | 
**fkiEzsignsigningreasonID** | **kotlin.Int** | The unique ID of the Ezsignsigningreason |  [optional]
**sEzsignsigningreasonDescriptionX** | **kotlin.String** | The description of the Ezsignsigningreason in the language of the requester |  [optional]
**iEzsignsignatureHeight** | **kotlin.Int** | The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureHeight. |  [optional]
**iEzsignsignatureWidth** | **kotlin.Int** | The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureWidth. |  [optional]
**iEzsignsignatureStepadjusted** | **kotlin.Int** | The step when the Ezsignsigner will be invited to sign |  [optional]
**tEzsignsignatureTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsignsigner about the Ezsignsignature |  [optional]
**eEzsignsignatureTooltipposition** | [**FieldEEzsignsignatureTooltipposition**](FieldEEzsignsignatureTooltipposition.md) |  |  [optional]
**eEzsignsignatureFont** | [**FieldEEzsignsignatureFont**](FieldEEzsignsignatureFont.md) |  |  [optional]
**iEzsignsignatureValidationstep** | **kotlin.Int** | The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**sEzsignsignatureAttachmentdescription** | **kotlin.String** | The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**eEzsignsignatureAttachmentnamesource** | [**FieldEEzsignsignatureAttachmentnamesource**](FieldEEzsignsignatureAttachmentnamesource.md) |  |  [optional]
**bEzsignsignatureRequired** | **kotlin.Boolean** | Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType &#x3D; Attachments. |  [optional]
**fkiEzsignfoldersignerassociationIDValidation** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation |  [optional]
**dtEzsignsignatureDate** | **kotlin.String** | The date the Ezsignsignature was signed |  [optional]
**iEzsignsignatureattachmentCount** | **kotlin.Int** | The count of Ezsignsignatureattachment |  [optional]
**sEzsignsignatureDescription** | **kotlin.String** | The value entered while signing Ezsignsignature of eEzsignsignatureType **City**, **FieldText** and **FieldTextarea** |  [optional]
**iEzsignsignatureMaxlength** | **kotlin.Int** | The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** |  [optional]
**eEzsignsignatureTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional]
**eEzsignsignatureDependencyrequirement** | [**FieldEEzsignsignatureDependencyrequirement**](FieldEEzsignsignatureDependencyrequirement.md) |  |  [optional]
**sEzsignsignatureRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom** |  [optional]
**objContactNameDelegation** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  |  [optional]
**objSignature** | [**SignatureResponseCompound**](SignatureResponseCompound.md) |  |  [optional]



