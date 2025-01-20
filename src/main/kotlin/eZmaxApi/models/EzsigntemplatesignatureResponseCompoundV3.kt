/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.EnumTextvalidation
import eZmaxApi.models.EzsigntemplateelementdependencyResponse
import eZmaxApi.models.EzsigntemplatesignaturecustomdateResponseV2
import eZmaxApi.models.FieldEEzsigntemplatesignatureAttachmentnamesource
import eZmaxApi.models.FieldEEzsigntemplatesignatureConsultationtrigger
import eZmaxApi.models.FieldEEzsigntemplatesignatureDependencyrequirement
import eZmaxApi.models.FieldEEzsigntemplatesignatureFont
import eZmaxApi.models.FieldEEzsigntemplatesignaturePositioning
import eZmaxApi.models.FieldEEzsigntemplatesignaturePositioningoccurence
import eZmaxApi.models.FieldEEzsigntemplatesignatureTooltipposition
import eZmaxApi.models.FieldEEzsigntemplatesignatureType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatesignature Object
 *
 * @param pkiEzsigntemplatesignatureID The unique ID of the Ezsigntemplatesignature
 * @param fkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param fkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 * @param iEzsigntemplatedocumentpagePagenumber The page number in the Ezsigntemplatedocument
 * @param iEzsigntemplatesignatureStep The step when the Ezsigntemplatesigner will be invited to sign
 * @param eEzsigntemplatesignatureType 
 * @param fkiEzsigntemplatesignerIDValidation The unique ID of the Ezsigntemplatesigner
 * @param bEzsigntemplatesignatureHandwritten Whether the Ezsigntemplatesignature must be handwritten or not when eEzsigntemplatesignatureType = Signature.
 * @param bEzsigntemplatesignatureReason Whether the Ezsigntemplatesignature must include a reason or not when eEzsigntemplatesignatureType = Signature.
 * @param eEzsigntemplatesignaturePositioning 
 * @param iEzsigntemplatesignatureX The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsigntemplatesignatureY The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsigntemplatesignatureWidth The width of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have a width of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureWidth.
 * @param iEzsigntemplatesignatureHeight The height of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have an height of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureHeight.
 * @param eEzsigntemplatesignatureConsultationtrigger 
 * @param tEzsigntemplatesignatureTooltip A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature
 * @param eEzsigntemplatesignatureTooltipposition 
 * @param eEzsigntemplatesignatureFont 
 * @param iEzsigntemplatesignatureValidationstep The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
 * @param sEzsigntemplatesignatureAttachmentdescription The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
 * @param eEzsigntemplatesignatureAttachmentnamesource 
 * @param bEzsigntemplatesignatureRequired Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments.
 * @param iEzsigntemplatesignatureMaxlength The maximum length for the value in the Ezsigntemplatesignature  This can only be set if eEzsigntemplatesignatureType is **FieldText** or **FieldTextarea**
 * @param sEzsigntemplatesignatureDefaultvalue The default value for the Ezsigntemplatesignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
 * @param sEzsigntemplatesignatureRegexp A regular expression to indicate what values are acceptable for the Ezsigntemplatesignature.  This can only be set if eEzsigntemplatesignatureType is **Text** or **Textarea**
 * @param eEzsigntemplatesignatureTextvalidation 
 * @param sEzsigntemplatesignatureTextvalidationcustommessage Description of validation rule. Show by signatory.
 * @param eEzsigntemplatesignatureDependencyrequirement 
 * @param sEzsigntemplatesignaturePositioningpattern The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates**
 * @param iEzsigntemplatesignaturePositioningoffsetx The offset X  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates**
 * @param iEzsigntemplatesignaturePositioningoffsety The offset Y  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates**
 * @param eEzsigntemplatesignaturePositioningoccurence 
 * @param bEzsigntemplatesignatureCustomdate Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**)
 * @param aObjEzsigntemplatesignaturecustomdate An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
 * @param aObjEzsigntemplateelementdependency 
 */


data class EzsigntemplatesignatureResponseCompoundV3 (

    /* The unique ID of the Ezsigntemplatesignature */
    @Json(name = "pkiEzsigntemplatesignatureID")
    val pkiEzsigntemplatesignatureID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatedocument */
    @Json(name = "fkiEzsigntemplatedocumentID")
    val fkiEzsigntemplatedocumentID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerID")
    val fkiEzsigntemplatesignerID: kotlin.Int,

    /* The page number in the Ezsigntemplatedocument */
    @Json(name = "iEzsigntemplatedocumentpagePagenumber")
    val iEzsigntemplatedocumentpagePagenumber: kotlin.Int,

    /* The step when the Ezsigntemplatesigner will be invited to sign */
    @Json(name = "iEzsigntemplatesignatureStep")
    val iEzsigntemplatesignatureStep: kotlin.Int,

    @Json(name = "eEzsigntemplatesignatureType")
    val eEzsigntemplatesignatureType: FieldEEzsigntemplatesignatureType,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerIDValidation")
    val fkiEzsigntemplatesignerIDValidation: kotlin.Int? = null,

    /* Whether the Ezsigntemplatesignature must be handwritten or not when eEzsigntemplatesignatureType = Signature. */
    @Json(name = "bEzsigntemplatesignatureHandwritten")
    val bEzsigntemplatesignatureHandwritten: kotlin.Boolean? = null,

    /* Whether the Ezsigntemplatesignature must include a reason or not when eEzsigntemplatesignatureType = Signature. */
    @Json(name = "bEzsigntemplatesignatureReason")
    val bEzsigntemplatesignatureReason: kotlin.Boolean? = null,

    @Json(name = "eEzsigntemplatesignaturePositioning")
    val eEzsigntemplatesignaturePositioning: FieldEEzsigntemplatesignaturePositioning? = null,

    /* The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate. */
    @Json(name = "iEzsigntemplatesignatureX")
    val iEzsigntemplatesignatureX: kotlin.Int? = null,

    /* The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate. */
    @Json(name = "iEzsigntemplatesignatureY")
    val iEzsigntemplatesignatureY: kotlin.Int? = null,

    /* The width of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have a width of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureWidth. */
    @Json(name = "iEzsigntemplatesignatureWidth")
    val iEzsigntemplatesignatureWidth: kotlin.Int? = null,

    /* The height of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have an height of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureHeight. */
    @Json(name = "iEzsigntemplatesignatureHeight")
    val iEzsigntemplatesignatureHeight: kotlin.Int? = null,

    @Json(name = "eEzsigntemplatesignatureConsultationtrigger")
    val eEzsigntemplatesignatureConsultationtrigger: FieldEEzsigntemplatesignatureConsultationtrigger? = null,

    /* A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature */
    @Json(name = "tEzsigntemplatesignatureTooltip")
    val tEzsigntemplatesignatureTooltip: kotlin.String? = null,

    @Json(name = "eEzsigntemplatesignatureTooltipposition")
    val eEzsigntemplatesignatureTooltipposition: FieldEEzsigntemplatesignatureTooltipposition? = null,

    @Json(name = "eEzsigntemplatesignatureFont")
    val eEzsigntemplatesignatureFont: FieldEEzsigntemplatesignatureFont? = null,

    /* The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments */
    @Json(name = "iEzsigntemplatesignatureValidationstep")
    val iEzsigntemplatesignatureValidationstep: kotlin.Int? = null,

    /* The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments */
    @Json(name = "sEzsigntemplatesignatureAttachmentdescription")
    val sEzsigntemplatesignatureAttachmentdescription: kotlin.String? = null,

    @Json(name = "eEzsigntemplatesignatureAttachmentnamesource")
    val eEzsigntemplatesignatureAttachmentnamesource: FieldEEzsigntemplatesignatureAttachmentnamesource? = null,

    /* Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments. */
    @Json(name = "bEzsigntemplatesignatureRequired")
    val bEzsigntemplatesignatureRequired: kotlin.Boolean? = null,

    /* The maximum length for the value in the Ezsigntemplatesignature  This can only be set if eEzsigntemplatesignatureType is **FieldText** or **FieldTextarea** */
    @Json(name = "iEzsigntemplatesignatureMaxlength")
    val iEzsigntemplatesignatureMaxlength: kotlin.Int? = null,

    /* The default value for the Ezsigntemplatesignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | */
    @Json(name = "sEzsigntemplatesignatureDefaultvalue")
    val sEzsigntemplatesignatureDefaultvalue: kotlin.String? = null,

    /* A regular expression to indicate what values are acceptable for the Ezsigntemplatesignature.  This can only be set if eEzsigntemplatesignatureType is **Text** or **Textarea** */
    @Json(name = "sEzsigntemplatesignatureRegexp")
    val sEzsigntemplatesignatureRegexp: kotlin.String? = null,

    @Json(name = "eEzsigntemplatesignatureTextvalidation")
    val eEzsigntemplatesignatureTextvalidation: EnumTextvalidation? = null,

    /* Description of validation rule. Show by signatory. */
    @Json(name = "sEzsigntemplatesignatureTextvalidationcustommessage")
    val sEzsigntemplatesignatureTextvalidationcustommessage: kotlin.String? = null,

    @Json(name = "eEzsigntemplatesignatureDependencyrequirement")
    val eEzsigntemplatesignatureDependencyrequirement: FieldEEzsigntemplatesignatureDependencyrequirement? = null,

    /* The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates** */
    @Json(name = "sEzsigntemplatesignaturePositioningpattern")
    val sEzsigntemplatesignaturePositioningpattern: kotlin.String? = null,

    /* The offset X  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates** */
    @Json(name = "iEzsigntemplatesignaturePositioningoffsetx")
    val iEzsigntemplatesignaturePositioningoffsetx: kotlin.Int? = null,

    /* The offset Y  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates** */
    @Json(name = "iEzsigntemplatesignaturePositioningoffsety")
    val iEzsigntemplatesignaturePositioningoffsety: kotlin.Int? = null,

    @Json(name = "eEzsigntemplatesignaturePositioningoccurence")
    val eEzsigntemplatesignaturePositioningoccurence: FieldEEzsigntemplatesignaturePositioningoccurence? = null,

    /* Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**) */
    @Json(name = "bEzsigntemplatesignatureCustomdate")
    val bEzsigntemplatesignatureCustomdate: kotlin.Boolean? = null,

    /* An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all. */
    @Json(name = "a_objEzsigntemplatesignaturecustomdate")
    val aObjEzsigntemplatesignaturecustomdate: kotlin.collections.List<EzsigntemplatesignaturecustomdateResponseV2>? = null,

    @Json(name = "a_objEzsigntemplateelementdependency")
    val aObjEzsigntemplateelementdependency: kotlin.collections.List<EzsigntemplateelementdependencyResponse>? = null

) {


}

