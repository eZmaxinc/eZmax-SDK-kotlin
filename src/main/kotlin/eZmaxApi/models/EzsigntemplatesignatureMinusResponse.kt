/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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

import eZmaxApi.models.FieldMinusEEzsigntemplatesignatureFont
import eZmaxApi.models.FieldMinusEEzsigntemplatesignatureTooltipposition
import eZmaxApi.models.FieldMinusEEzsigntemplatesignatureType

import com.squareup.moshi.Json

/**
 * A Ezsigntemplatesignature Object
 *
 * @param pkiEzsigntemplatesignatureID The unique ID of the Ezsigntemplatesignature
 * @param fkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param fkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 * @param iEzsigntemplatedocumentpagePagenumber The page number in the Ezsigntemplatedocument
 * @param iEzsigntemplatesignatureX The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsigntemplatesignatureY The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsigntemplatesignatureStep The step when the Ezsigntemplatesigner will be invited to sign
 * @param eEzsigntemplatesignatureType 
 * @param tEzsigntemplatesignatureTooltip A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature
 * @param eEzsigntemplatesignatureTooltipposition 
 * @param eEzsigntemplatesignatureFont 
 */

data class EzsigntemplatesignatureMinusResponse (

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

    /* A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature */
    @Json(name = "tEzsigntemplatesignatureTooltip")
    val tEzsigntemplatesignatureTooltip: kotlin.String? = null,

    @Json(name = "eEzsigntemplatesignatureTooltipposition")
    val eEzsigntemplatesignatureTooltipposition: FieldMinusEEzsigntemplatesignatureTooltipposition? = null,

    @Json(name = "eEzsigntemplatesignatureFont")
    val eEzsigntemplatesignatureFont: FieldMinusEEzsigntemplatesignatureFont? = null

)

