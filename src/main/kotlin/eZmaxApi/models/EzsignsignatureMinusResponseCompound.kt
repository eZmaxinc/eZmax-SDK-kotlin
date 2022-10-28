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

import eZmaxApi.models.EzsignsignatureMinusResponse
import eZmaxApi.models.EzsignsignatureResponseCompoundAllOf
import eZmaxApi.models.EzsignsignaturecustomdateMinusResponseCompound
import eZmaxApi.models.FieldMinusEEzsignsignatureAttachmentnamesource
import eZmaxApi.models.FieldMinusEEzsignsignatureFont
import eZmaxApi.models.FieldMinusEEzsignsignatureTooltipposition
import eZmaxApi.models.FieldMinusEEzsignsignatureType

import com.squareup.moshi.Json

/**
 * An Ezsignsignature Object and children to create a complete structure
 *
 * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param fkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param iEzsignpagePagenumber The page number in the Ezsigndocument
 * @param iEzsignsignatureX The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsignsignatureY The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsignsignatureStep The step when the Ezsignsigner will be invited to sign
 * @param eEzsignsignatureType 
 * @param tEzsignsignatureTooltip A tooltip that will be presented to Ezsignsigner about the Ezsignsignature
 * @param eEzsignsignatureTooltipposition 
 * @param eEzsignsignatureFont 
 * @param iEzsignsignatureValidationstep The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments
 * @param sEzsignsignatureAttachmentdescription The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments
 * @param eEzsignsignatureAttachmentnamesource 
 * @param bEzsignsignatureRequired Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments.
 * @param fkiEzsignfoldersignerassociationIDValidation The unique ID of the Ezsignfoldersignerassociation
 * @param bEzsignsignatureCustomdate Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)
 * @param aObjEzsignsignaturecustomdate An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
 */

data class EzsignsignatureMinusResponseCompound (

    /* The unique ID of the Ezsignsignature */
    @Json(name = "pkiEzsignsignatureID")
    val pkiEzsignsignatureID: kotlin.Int,

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int,

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationID")
    val fkiEzsignfoldersignerassociationID: kotlin.Int,

    /* The page number in the Ezsigndocument */
    @Json(name = "iEzsignpagePagenumber")
    val iEzsignpagePagenumber: kotlin.Int,

    /* The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate. */
    @Json(name = "iEzsignsignatureX")
    val iEzsignsignatureX: kotlin.Int,

    /* The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate. */
    @Json(name = "iEzsignsignatureY")
    val iEzsignsignatureY: kotlin.Int,

    /* The step when the Ezsignsigner will be invited to sign */
    @Json(name = "iEzsignsignatureStep")
    val iEzsignsignatureStep: kotlin.Int,

    @Json(name = "eEzsignsignatureType")
    val eEzsignsignatureType: FieldMinusEEzsignsignatureType,

    /* A tooltip that will be presented to Ezsignsigner about the Ezsignsignature */
    @Json(name = "tEzsignsignatureTooltip")
    val tEzsignsignatureTooltip: kotlin.String? = null,

    @Json(name = "eEzsignsignatureTooltipposition")
    val eEzsignsignatureTooltipposition: FieldMinusEEzsignsignatureTooltipposition? = null,

    @Json(name = "eEzsignsignatureFont")
    val eEzsignsignatureFont: FieldMinusEEzsignsignatureFont? = null,

    /* The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments */
    @Json(name = "iEzsignsignatureValidationstep")
    val iEzsignsignatureValidationstep: kotlin.Int? = null,

    /* The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments */
    @Json(name = "sEzsignsignatureAttachmentdescription")
    val sEzsignsignatureAttachmentdescription: kotlin.String? = null,

    @Json(name = "eEzsignsignatureAttachmentnamesource")
    val eEzsignsignatureAttachmentnamesource: FieldMinusEEzsignsignatureAttachmentnamesource? = null,

    /* Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments. */
    @Json(name = "bEzsignsignatureRequired")
    val bEzsignsignatureRequired: kotlin.Boolean? = null,

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationIDValidation")
    val fkiEzsignfoldersignerassociationIDValidation: kotlin.Int? = null,

    /* Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) */
    @Json(name = "bEzsignsignatureCustomdate")
    val bEzsignsignatureCustomdate: kotlin.Boolean? = null,

    /* An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all. */
    @Json(name = "a_objEzsignsignaturecustomdate")
    val aObjEzsignsignaturecustomdate: kotlin.collections.List<EzsignsignaturecustomdateMinusResponseCompound>? = null

)

