
# EzsigntemplatesignatureMinusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument | 
**fkiEzsigntemplatesignerID** | **kotlin.Int** | The unique ID of the Ezsigntemplatesigner | 
**iEzsigntemplatedocumentpagePagenumber** | **kotlin.Int** | The page number in the Ezsigntemplatedocument | 
**iEzsigntemplatesignatureX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsigntemplatesignatureY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsigntemplatesignatureStep** | **kotlin.Int** | The step when the Ezsigntemplatesigner will be invited to sign | 
**eEzsigntemplatesignatureType** | [**FieldMinusEEzsigntemplatesignatureType**](FieldMinusEEzsigntemplatesignatureType.md) |  | 
**pkiEzsigntemplatesignatureID** | **kotlin.Int** | The unique ID of the Ezsigntemplatesignature |  [optional]
**fkiEzsigntemplatesignerIDValidation** | **kotlin.Int** | The unique ID of the Ezsigntemplatesigner |  [optional]
**tEzsigntemplatesignatureTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature |  [optional]
**eEzsigntemplatesignatureTooltipposition** | [**FieldMinusEEzsigntemplatesignatureTooltipposition**](FieldMinusEEzsigntemplatesignatureTooltipposition.md) |  |  [optional]
**eEzsigntemplatesignatureFont** | [**FieldMinusEEzsigntemplatesignatureFont**](FieldMinusEEzsigntemplatesignatureFont.md) |  |  [optional]
**bEzsigntemplatesignatureRequired** | **kotlin.Boolean** | Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType &#x3D; Attachments. |  [optional]
**eEzsigntemplatesignatureAttachmentnamesource** | [**FieldMinusEEzsigntemplatesignatureAttachmentnamesource**](FieldMinusEEzsigntemplatesignatureAttachmentnamesource.md) |  |  [optional]
**sEzsigntemplatesignatureAttachmentdescription** | **kotlin.String** | The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments |  [optional]
**iEzsigntemplatesignatureValidationstep** | **kotlin.Int** | The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments |  [optional]



