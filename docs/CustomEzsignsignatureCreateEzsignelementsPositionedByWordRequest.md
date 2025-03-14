
# CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fkiEzsignfoldersignerassociationID** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation |  |
| **iEzsignpagePagenumber** | **kotlin.Int** | The page number in the Ezsigndocument |  |
| **iEzsignsignatureX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. |  |
| **iEzsignsignatureY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. |  |
| **iEzsignsignatureStep** | **kotlin.Int** | The step when the Ezsignsigner will be invited to sign |  |
| **eEzsignsignatureType** | [**FieldEEzsignsignatureType**](FieldEEzsignsignatureType.md) |  |  |
| **fkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument |  |
| **objCreateezsignelementspositionedbyword** | [**CustomCreateEzsignelementsPositionedByWordRequest**](CustomCreateEzsignelementsPositionedByWordRequest.md) |  |  |
| **pkiEzsignsignatureID** | **kotlin.Int** | The unique ID of the Ezsignsignature |  [optional] |
| **fkiPaymentgatewayID** | **kotlin.Int** | The unique ID of the Paymentgateway |  [optional] |
| **iEzsignsignatureWidth** | **kotlin.Int** | The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureWidth. |  [optional] |
| **iEzsignsignatureHeight** | **kotlin.Int** | The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \&quot;200\&quot; for the iEzsignsignatureHeight. |  [optional] |
| **tEzsignsignatureTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsignsigner about the Ezsignsignature |  [optional] |
| **eEzsignsignatureTooltipposition** | [**FieldEEzsignsignatureTooltipposition**](FieldEEzsignsignatureTooltipposition.md) |  |  [optional] |
| **eEzsignsignatureFont** | [**FieldEEzsignsignatureFont**](FieldEEzsignsignatureFont.md) |  |  [optional] |
| **fkiEzsignfoldersignerassociationIDValidation** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation |  [optional] |
| **bEzsignsignatureHandwritten** | **kotlin.Boolean** | Whether the Ezsignsignature must be handwritten or not when eEzsignsignatureType &#x3D; Signature. |  [optional] |
| **bEzsignsignatureReason** | **kotlin.Boolean** | Whether the Ezsignsignature must include a reason or not when eEzsignsignatureType &#x3D; Signature. |  [optional] |
| **bEzsignsignatureRequired** | **kotlin.Boolean** | Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType &#x3D; Attachments, Text or Textarea. |  [optional] |
| **eEzsignsignatureAttachmentnamesource** | [**FieldEEzsignsignatureAttachmentnamesource**](FieldEEzsignsignatureAttachmentnamesource.md) |  |  [optional] |
| **sEzsignsignatureAttachmentdescription** | **kotlin.String** | The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments |  [optional] |
| **eEzsignsignatureConsultationtrigger** | [**FieldEEzsignsignatureConsultationtrigger**](FieldEEzsignsignatureConsultationtrigger.md) |  |  [optional] |
| **iEzsignsignatureValidationstep** | **kotlin.Int** | The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments |  [optional] |
| **iEzsignsignatureMaxlength** | **kotlin.Int** | The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** |  [optional] |
| **sEzsignsignatureDefaultvalue** | **kotlin.String** | The default value for the Ezsignsignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | |  [optional] |
| **eEzsignsignatureTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional] |
| **sEzsignsignatureTextvalidationcustommessage** | **kotlin.String** | Description of validation rule. Show by signatory. |  [optional] |
| **sEzsignsignatureRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom** |  [optional] |
| **eEzsignsignatureDependencyrequirement** | [**FieldEEzsignsignatureDependencyrequirement**](FieldEEzsignsignatureDependencyrequirement.md) |  |  [optional] |
| **bEzsignsignatureCustomdate** | **kotlin.Boolean** | Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) |  [optional] |
| **aObjEzsignsignaturecustomdate** | [**kotlin.collections.List&lt;EzsignsignaturecustomdateRequestCompound&gt;**](EzsignsignaturecustomdateRequestCompound.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional] |
| **aObjEzsignelementdependency** | [**kotlin.collections.List&lt;EzsignelementdependencyRequestCompound&gt;**](EzsignelementdependencyRequestCompound.md) |  |  [optional] |



