
# EzsigntemplatesignatureResponseCompound

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatesignatureID** | **kotlin.Int** | The unique ID of the Ezsigntemplatesignature |  |
| **fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument |  |
| **fkiEzsigntemplatesignerID** | **kotlin.Int** | The unique ID of the Ezsigntemplatesigner |  |
| **iEzsigntemplatedocumentpagePagenumber** | **kotlin.Int** | The page number in the Ezsigntemplatedocument |  |
| **iEzsigntemplatesignatureStep** | **kotlin.Int** | The step when the Ezsigntemplatesigner will be invited to sign |  |
| **eEzsigntemplatesignatureType** | [**FieldEEzsigntemplatesignatureType**](FieldEEzsigntemplatesignatureType.md) |  |  |
| **fkiEzsigntemplatesignerIDValidation** | **kotlin.Int** | The unique ID of the Ezsigntemplatesigner |  [optional] |
| **bEzsigntemplatesignatureHandwritten** | **kotlin.Boolean** | Whether the Ezsigntemplatesignature must be handwritten or not when eEzsigntemplatesignatureType &#x3D; Signature. |  [optional] |
| **bEzsigntemplatesignatureReason** | **kotlin.Boolean** | Whether the Ezsigntemplatesignature must include a reason or not when eEzsigntemplatesignatureType &#x3D; Signature. |  [optional] |
| **eEzsigntemplatesignaturePositioning** | [**FieldEEzsigntemplatesignaturePositioning**](FieldEEzsigntemplatesignaturePositioning.md) |  |  [optional] |
| **iEzsigntemplatesignatureX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. |  [optional] |
| **iEzsigntemplatesignatureY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. |  [optional] |
| **iEzsigntemplatesignatureWidth** | **kotlin.Int** | The width of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have a width of 2 inches, you would use \&quot;200\&quot; for the iEzsigntemplatesignatureWidth. |  [optional] |
| **iEzsigntemplatesignatureHeight** | **kotlin.Int** | The height of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have an height of 2 inches, you would use \&quot;200\&quot; for the iEzsigntemplatesignatureHeight. |  [optional] |
| **eEzsigntemplatesignatureConsultationtrigger** | [**FieldEEzsigntemplatesignatureConsultationtrigger**](FieldEEzsigntemplatesignatureConsultationtrigger.md) |  |  [optional] |
| **tEzsigntemplatesignatureTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature |  [optional] |
| **eEzsigntemplatesignatureTooltipposition** | [**FieldEEzsigntemplatesignatureTooltipposition**](FieldEEzsigntemplatesignatureTooltipposition.md) |  |  [optional] |
| **eEzsigntemplatesignatureFont** | [**FieldEEzsigntemplatesignatureFont**](FieldEEzsigntemplatesignatureFont.md) |  |  [optional] |
| **iEzsigntemplatesignatureValidationstep** | **kotlin.Int** | The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments |  [optional] |
| **sEzsigntemplatesignatureAttachmentdescription** | **kotlin.String** | The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments |  [optional] |
| **eEzsigntemplatesignatureAttachmentnamesource** | [**FieldEEzsigntemplatesignatureAttachmentnamesource**](FieldEEzsigntemplatesignatureAttachmentnamesource.md) |  |  [optional] |
| **bEzsigntemplatesignatureRequired** | **kotlin.Boolean** | Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType &#x3D; Attachments. |  [optional] |
| **iEzsigntemplatesignatureMaxlength** | **kotlin.Int** | The maximum length for the value in the Ezsigntemplatesignature  This can only be set if eEzsigntemplatesignatureType is **FieldText** or **FieldTextarea** |  [optional] |
| **sEzsigntemplatesignatureDefaultvalue** | **kotlin.String** | The default value for the Ezsigntemplatesignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | |  [optional] |
| **sEzsigntemplatesignatureRegexp** | **kotlin.String** | A regular expression to indicate what values are acceptable for the Ezsigntemplatesignature.  This can only be set if eEzsigntemplatesignatureType is **Text** or **Textarea** |  [optional] |
| **eEzsigntemplatesignatureTextvalidation** | [**EnumTextvalidation**](EnumTextvalidation.md) |  |  [optional] |
| **sEzsigntemplatesignatureTextvalidationcustommessage** | **kotlin.String** | Description of validation rule. Show by signatory. |  [optional] |
| **eEzsigntemplatesignatureDependencyrequirement** | [**FieldEEzsigntemplatesignatureDependencyrequirement**](FieldEEzsigntemplatesignatureDependencyrequirement.md) |  |  [optional] |
| **sEzsigntemplatesignaturePositioningpattern** | **kotlin.String** | The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates** |  [optional] |
| **iEzsigntemplatesignaturePositioningoffsetx** | **kotlin.Int** | The offset X  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates** |  [optional] |
| **iEzsigntemplatesignaturePositioningoffsety** | **kotlin.Int** | The offset Y  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates** |  [optional] |
| **eEzsigntemplatesignaturePositioningoccurence** | [**FieldEEzsigntemplatesignaturePositioningoccurence**](FieldEEzsigntemplatesignaturePositioningoccurence.md) |  |  [optional] |
| **bEzsigntemplatesignatureCustomdate** | **kotlin.Boolean** | Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**) |  [optional] |
| **aObjEzsigntemplatesignaturecustomdate** | [**kotlin.collections.List&lt;EzsigntemplatesignaturecustomdateResponseCompound&gt;**](EzsigntemplatesignaturecustomdateResponseCompound.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional] |
| **aObjEzsigntemplateelementdependency** | [**kotlin.collections.List&lt;EzsigntemplateelementdependencyResponseCompound&gt;**](EzsigntemplateelementdependencyResponseCompound.md) |  |  [optional] |



