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
import eZmaxApi.models.FieldEEzsigntemplatesignatureAttachmentnamesource
import eZmaxApi.models.FieldEEzsigntemplatesignatureDependencyrequirement
import eZmaxApi.models.FieldEEzsigntemplatesignatureFont
import eZmaxApi.models.FieldEEzsigntemplatesignatureTooltipposition
import eZmaxApi.models.FieldEEzsigntemplatesignatureType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatesignature Object
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
 * @param iEzsigntemplatesignatureWidth The width of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have a width of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureWidth.
 * @param iEzsigntemplatesignatureHeight The height of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have an height of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureHeight.
 * @param tEzsigntemplatesignatureTooltip A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature
 * @param eEzsigntemplatesignatureTooltipposition 
 * @param eEzsigntemplatesignatureFont 
 * @param bEzsigntemplatesignatureRequired Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments.
 * @param eEzsigntemplatesignatureAttachmentnamesource 
 * @param sEzsigntemplatesignatureAttachmentdescription The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
 * @param iEzsigntemplatesignatureValidationstep The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
 * @param iEzsigntemplatesignatureMaxlength The maximum length for the value in the Ezsigntemplatesignature  This can only be set if eEzsigntemplatesignatureType is **FieldText** or **FieldTextarea**
 * @param sEzsigntemplatesignatureRegexp A regular expression to indicate what values are acceptable for the Ezsigntemplatesignature.  This can only be set if eEzsigntemplatesignatureType is **Text** or **Textarea**
 * @param eEzsigntemplatesignatureTextvalidation 
 * @param eEzsigntemplatesignatureDependencyrequirement 
 */


data class EzsigntemplatesignatureRequest (

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
    val eEzsigntemplatesignatureType: FieldEEzsigntemplatesignatureType,

    /* The unique ID of the Ezsigntemplatesignature */
    @Json(name = "pkiEzsigntemplatesignatureID")
    val pkiEzsigntemplatesignatureID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerIDValidation")
    val fkiEzsigntemplatesignerIDValidation: kotlin.Int? = null,

    /* The width of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have a width of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureWidth. */
    @Json(name = "iEzsigntemplatesignatureWidth")
    val iEzsigntemplatesignatureWidth: kotlin.Int? = null,

    /* The height of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have an height of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureHeight. */
    @Json(name = "iEzsigntemplatesignatureHeight")
    val iEzsigntemplatesignatureHeight: kotlin.Int? = null,

    /* A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature */
    @Json(name = "tEzsigntemplatesignatureTooltip")
    val tEzsigntemplatesignatureTooltip: kotlin.String? = null,

    @Json(name = "eEzsigntemplatesignatureTooltipposition")
    val eEzsigntemplatesignatureTooltipposition: FieldEEzsigntemplatesignatureTooltipposition? = null,

    @Json(name = "eEzsigntemplatesignatureFont")
    val eEzsigntemplatesignatureFont: FieldEEzsigntemplatesignatureFont? = null,

    /* Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments. */
    @Json(name = "bEzsigntemplatesignatureRequired")
    val bEzsigntemplatesignatureRequired: kotlin.Boolean? = null,

    @Json(name = "eEzsigntemplatesignatureAttachmentnamesource")
    val eEzsigntemplatesignatureAttachmentnamesource: FieldEEzsigntemplatesignatureAttachmentnamesource? = null,

    /* The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments */
    @Json(name = "sEzsigntemplatesignatureAttachmentdescription")
    val sEzsigntemplatesignatureAttachmentdescription: kotlin.String? = null,

    /* The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments */
    @Json(name = "iEzsigntemplatesignatureValidationstep")
    val iEzsigntemplatesignatureValidationstep: kotlin.Int? = null,

    /* The maximum length for the value in the Ezsigntemplatesignature  This can only be set if eEzsigntemplatesignatureType is **FieldText** or **FieldTextarea** */
    @Json(name = "iEzsigntemplatesignatureMaxlength")
    val iEzsigntemplatesignatureMaxlength: kotlin.Int? = null,

    /* A regular expression to indicate what values are acceptable for the Ezsigntemplatesignature.  This can only be set if eEzsigntemplatesignatureType is **Text** or **Textarea** */
    @Json(name = "sEzsigntemplatesignatureRegexp")
    val sEzsigntemplatesignatureRegexp: kotlin.String? = null,

    @Json(name = "eEzsigntemplatesignatureTextvalidation")
    val eEzsigntemplatesignatureTextvalidation: EnumTextvalidation? = null,

    @Json(name = "eEzsigntemplatesignatureDependencyrequirement")
    val eEzsigntemplatesignatureDependencyrequirement: FieldEEzsigntemplatesignatureDependencyrequirement? = null

)
