
# EzsignsignatureMinusResponseCompound

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
**objContactName** | [**CustomMinusContactNameMinusResponse**](CustomMinusContactNameMinusResponse.md) |  | 
**iEzsignsignatureHeight** | **kotlin.Int** | The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureHeight. |  [optional]
**iEzsignsignatureWidth** | **kotlin.Int** | The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureWidth. |  [optional]
**tEzsignsignatureTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsignsigner about the Ezsignsignature |  [optional]
**eEzsignsignatureTooltipposition** | [**FieldMinusEEzsignsignatureTooltipposition**](FieldMinusEEzsignsignatureTooltipposition.md) |  |  [optional]
**eEzsignsignatureFont** | [**FieldMinusEEzsignsignatureFont**](FieldMinusEEzsignsignatureFont.md) |  |  [optional]
**iEzsignsignatureValidationstep** | **kotlin.Int** | The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**sEzsignsignatureAttachmentdescription** | **kotlin.String** | The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments |  [optional]
**eEzsignsignatureAttachmentnamesource** | [**FieldMinusEEzsignsignatureAttachmentnamesource**](FieldMinusEEzsignsignatureAttachmentnamesource.md) |  |  [optional]
**bEzsignsignatureRequired** | **kotlin.Boolean** | Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType &#x3D; Attachments. |  [optional]
**fkiEzsignfoldersignerassociationIDValidation** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation |  [optional]
**dtEzsignsignatureDate** | **kotlin.String** | The date the Ezsignsignature was signed |  [optional]
**iEzsignsignatureattachmentCount** | **kotlin.Int** | The count of Ezsignsignatureattachment |  [optional]
**sEzsignsignatureDescription** | **kotlin.String** | The value entered while signing Ezsignsignature of eEzsignsignatureType **City**, **FieldText** and **FieldTextarea** |  [optional]
**eEzsignsignatureTextvalidation** | [**EnumMinusTextvalidation**](EnumMinusTextvalidation.md) |  |  [optional]
**sEzsignsignatureRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom** |  [optional]
**objSignature** | [**SignatureMinusResponseCompound**](SignatureMinusResponseCompound.md) |  |  [optional]
**bEzsignsignatureCustomdate** | **kotlin.Boolean** | Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) |  [optional]
**aObjEzsignsignaturecustomdate** | [**kotlin.collections.List&lt;EzsignsignaturecustomdateMinusResponseCompound&gt;**](EzsignsignaturecustomdateMinusResponseCompound.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional]
**objCreditcardtransaction** | [**CustomMinusCreditcardtransactionMinusResponse**](CustomMinusCreditcardtransactionMinusResponse.md) |  |  [optional]



