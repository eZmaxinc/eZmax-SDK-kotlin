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

import eZmaxApi.models.EnumMinusTextvalidation
import eZmaxApi.models.FieldMinusEEzsignsignatureAttachmentnamesource
import eZmaxApi.models.FieldMinusEEzsignsignatureFont
import eZmaxApi.models.FieldMinusEEzsignsignatureTooltipposition
import eZmaxApi.models.FieldMinusEEzsignsignatureType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignsignature Object
 *
 * @param fkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param iEzsignpagePagenumber The page number in the Ezsigndocument
 * @param iEzsignsignatureX The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsignsignatureY The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsignsignatureStep The step when the Ezsignsigner will be invited to sign
 * @param eEzsignsignatureType 
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
 * @param iEzsignsignatureWidth The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \"200\" for the iEzsignsignatureWidth.
 * @param iEzsignsignatureHeight The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \"200\" for the iEzsignsignatureHeight.
 * @param tEzsignsignatureTooltip A tooltip that will be presented to Ezsignsigner about the Ezsignsignature
 * @param eEzsignsignatureTooltipposition 
 * @param eEzsignsignatureFont 
 * @param fkiEzsignfoldersignerassociationIDValidation The unique ID of the Ezsignfoldersignerassociation
 * @param bEzsignsignatureRequired Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments.
 * @param eEzsignsignatureAttachmentnamesource 
 * @param sEzsignsignatureAttachmentdescription The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments
 * @param iEzsignsignatureValidationstep The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments
 * @param eEzsignsignatureTextvalidation 
 * @param sEzsignsignatureRegexp A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom**
 */


data class EzsignsignatureMinusRequest (

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

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int,

    /* The unique ID of the Ezsignsignature */
    @Json(name = "pkiEzsignsignatureID")
    val pkiEzsignsignatureID: kotlin.Int? = null,

    /* The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \"200\" for the iEzsignsignatureWidth. */
    @Json(name = "iEzsignsignatureWidth")
    val iEzsignsignatureWidth: kotlin.Int? = null,

    /* The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \"200\" for the iEzsignsignatureHeight. */
    @Json(name = "iEzsignsignatureHeight")
    val iEzsignsignatureHeight: kotlin.Int? = null,

    /* A tooltip that will be presented to Ezsignsigner about the Ezsignsignature */
    @Json(name = "tEzsignsignatureTooltip")
    val tEzsignsignatureTooltip: kotlin.String? = null,

    @Json(name = "eEzsignsignatureTooltipposition")
    val eEzsignsignatureTooltipposition: FieldMinusEEzsignsignatureTooltipposition? = null,

    @Json(name = "eEzsignsignatureFont")
    val eEzsignsignatureFont: FieldMinusEEzsignsignatureFont? = null,

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationIDValidation")
    val fkiEzsignfoldersignerassociationIDValidation: kotlin.Int? = null,

    /* Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments. */
    @Json(name = "bEzsignsignatureRequired")
    val bEzsignsignatureRequired: kotlin.Boolean? = null,

    @Json(name = "eEzsignsignatureAttachmentnamesource")
    val eEzsignsignatureAttachmentnamesource: FieldMinusEEzsignsignatureAttachmentnamesource? = null,

    /* The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments */
    @Json(name = "sEzsignsignatureAttachmentdescription")
    val sEzsignsignatureAttachmentdescription: kotlin.String? = null,

    /* The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments */
    @Json(name = "iEzsignsignatureValidationstep")
    val iEzsignsignatureValidationstep: kotlin.Int? = null,

    @Json(name = "eEzsignsignatureTextvalidation")
    val eEzsignsignatureTextvalidation: EnumMinusTextvalidation? = null,

    /* A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom** */
    @Json(name = "sEzsignsignatureRegexp")
    val sEzsignsignatureRegexp: kotlin.String? = null

)

