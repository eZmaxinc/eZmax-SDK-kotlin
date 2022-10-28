
# EzsignsignatureMinusResponse

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
**eEzsignsignatureType** | [**FieldMinusEEzsignsignatureType**](FieldMinusEEzsignsignatureType.md) |  | 
**tEzsignsignatureTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsignsigner about the Ezsignsignature |  [optional]
**eEzsignsignatureTooltipposition** | [**FieldMinusEEzsignsignatureTooltipposition**](FieldMinusEEzsignsignatureTooltipposition.md) |  |  [optional]
**eEzsignsignatureFont** | [**FieldMinusEEzsignsignatureFont**](FieldMinusEEzsignsignatureFont.md) |  |  [optional]
**iEzsignsignatureValidationstep** | **kotlin.Int** | The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**sEzsignsignatureAttachmentdescription** | **kotlin.String** | The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**eEzsignsignatureAttachmentnamesource** | [**FieldMinusEEzsignsignatureAttachmentnamesource**](FieldMinusEEzsignsignatureAttachmentnamesource.md) |  |  [optional]
**bEzsignsignatureRequired** | **kotlin.Boolean** | Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType &#x3D; Attachments. |  [optional]
**fkiEzsignfoldersignerassociationIDValidation** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation |  [optional]



