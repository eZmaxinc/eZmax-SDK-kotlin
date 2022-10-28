/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.EzsigntemplatesignatureMinusRequest
import eZmaxApi.models.EzsigntemplatesignatureRequestCompoundAllOf
import eZmaxApi.models.EzsigntemplatesignaturecustomdateMinusRequestCompound
import eZmaxApi.models.FieldMinusEEzsigntemplatesignatureAttachmentnamesource
import eZmaxApi.models.FieldMinusEEzsigntemplatesignatureFont
import eZmaxApi.models.FieldMinusEEzsigntemplatesignatureTooltipposition
import eZmaxApi.models.FieldMinusEEzsigntemplatesignatureType

import com.squareup.moshi.Json

/**
 * A Ezsigntemplatesignature Object and children
 *
 * @param fkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param fkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 * @param iEzsigntemplatedocumentpagePagenumber The page number in the Ezsigntemplatedocument
 * @param iEzsigntemplatesignatureX The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsigntemplatesignatureY The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsigntemplatesignatureStep The step when the Ezsigntemplatesigner will be invited to sign
 * @param eEzsigntemplatesignatureType 
 * @param pkiEzsigntemplatesignatureID The unique ID of the Ezsigntemplatesignature
 * @param fkiEzsigntemplatesignerIDValidation The unique ID of the Ezsigntemplatesigner
 * @param tEzsigntemplatesignatureTooltip A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature
 * @param eEzsigntemplatesignatureTooltipposition 
 * @param eEzsigntemplatesignatureFont 
 * @param bEzsigntemplatesignatureRequired Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments.
 * @param eEzsigntemplatesignatureAttachmentnamesource 
 * @param sEzsigntemplatesignatureAttachmentdescription The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
 * @param iEzsigntemplatesignatureValidationstep The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
 * @param bEzsigntemplatesignatureCustomdate Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**)
 * @param aObjEzsigntemplatesignaturecustomdate An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
 */

data class EzsigntemplatesignatureMinusRequestCompound (

    /* The unique ID of the Ezsigntemplatedocument */
    @Json(name = "fkiEzsigntemplatedocumentID")
    val fkiEzsigntemplatedocumentID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerID")
    val fkiEzsigntemplatesignerID: kotlin.Int,

    /* The page number in the Ezsigntemplatedocument */
    @Json(name = "iEzsigntemplatedocumentpagePagenumber")
    val iEzsigntemplatedocumentpagePagenumber: kotlin.Int,

    /* The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate. */
    @Json(name = "iEzsigntemplatesignatureX")
    val iEzsigntemplatesignatureX: kotlin.Int,

    /* The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate. */
    @Json(name = "iEzsigntemplatesignatureY")
    val iEzsigntemplatesignatureY: kotlin.Int,

    /* The step when the Ezsigntemplatesigner will be invited to sign */
    @Json(name = "iEzsigntemplatesignatureStep")
    val iEzsigntemplatesignatureStep: kotlin.Int,

    @Json(name = "eEzsigntemplatesignatureType")
    val eEzsigntemplatesignatureType: FieldMinusEEzsigntemplatesignatureType,

    /* The unique ID of the Ezsigntemplatesignature */
    @Json(name = "pkiEzsigntemplatesignatureID")
    val pkiEzsigntemplatesignatureID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerIDValidation")
    val fkiEzsigntemplatesignerIDValidation: kotlin.Int? = null,

    /* A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature */
    @Json(name = "tEzsigntemplatesignatureTooltip")
    val tEzsigntemplatesignatureTooltip: kotlin.String? = null,

    @Json(name = "eEzsigntemplatesignatureTooltipposition")
    val eEzsigntemplatesignatureTooltipposition: FieldMinusEEzsigntemplatesignatureTooltipposition? = null,

    @Json(name = "eEzsigntemplatesignatureFont")
    val eEzsigntemplatesignatureFont: FieldMinusEEzsigntemplatesignatureFont? = null,

    /* Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments. */
    @Json(name = "bEzsigntemplatesignatureRequired")
    val bEzsigntemplatesignatureRequired: kotlin.Boolean? = null,

    @Json(name = "eEzsigntemplatesignatureAttachmentnamesource")
    val eEzsigntemplatesignatureAttachmentnamesource: FieldMinusEEzsigntemplatesignatureAttachmentnamesource? = null,

    /* The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments */
    @Json(name = "sEzsigntemplatesignatureAttachmentdescription")
    val sEzsigntemplatesignatureAttachmentdescription: kotlin.String? = null,

    /* The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments */
    @Json(name = "iEzsigntemplatesignatureValidationstep")
    val iEzsigntemplatesignatureValidationstep: kotlin.Int? = null,

    /* Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**) */
    @Json(name = "bEzsigntemplatesignatureCustomdate")
    val bEzsigntemplatesignatureCustomdate: kotlin.Boolean? = null,

    /* An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all. */
    @Json(name = "a_objEzsigntemplatesignaturecustomdate")
    val aObjEzsigntemplatesignaturecustomdate: kotlin.collections.List<EzsigntemplatesignaturecustomdateMinusRequestCompound>? = null

)

