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

import eZmaxApi.models.EnumHorizontalalignment
import eZmaxApi.models.EnumVerticalalignment
import eZmaxApi.models.EzsignannotationRequest
import eZmaxApi.models.FieldEEzsignannotationType
import eZmaxApi.models.TextstylestaticRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsignannotation Object and children
 *
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param eEzsignannotationType 
 * @param iEzsignannotationX The X coordinate (Horizontal) where to put the Ezsignannotation on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignannotation 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsignannotationY The Y coordinate (Vertical) where to put the Ezsignannotation on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignannotation 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsignpagePagenumber The page number in the Ezsigndocument
 * @param pkiEzsignannotationID The unique ID of the Ezsignannotation
 * @param eEzsignannotationHorizontalalignment 
 * @param eEzsignannotationVerticalalignment 
 * @param iEzsignannotationWidth The Width of the Ezsignannotation.  Width is calculated at 100dpi (dot per inch). So for example, if you want to have the width of the Ezsignannotation to be 3 inches, you would use \"300\" for the Width.
 * @param iEzsignannotationHeight The Height of the Ezsignannotation.  Height is calculated at 100dpi (dot per inch). So for example, if you want to have the height of the Ezsignannotation to be 2 inches, you would use \"200\" for the Height.  This can only be set if eEzsignannotationType is **StrikethroughBlock** or **Text**
 * @param sEzsignannotationText The Text of the Ezsignannotation
 * @param objTextstylestatic 
 */


data class EzsignannotationRequestCompound (

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    override val fkiEzsigndocumentID: kotlin.Int,

    @Json(name = "eEzsignannotationType")
    override val eEzsignannotationType: FieldEEzsignannotationType,

    /* The X coordinate (Horizontal) where to put the Ezsignannotation on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignannotation 2 inches from the left border of the page, you would use \"200\" for the X coordinate. */
    @Json(name = "iEzsignannotationX")
    override val iEzsignannotationX: kotlin.Int,

    /* The Y coordinate (Vertical) where to put the Ezsignannotation on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignannotation 3 inches from the top border of the page, you would use \"300\" for the Y coordinate. */
    @Json(name = "iEzsignannotationY")
    override val iEzsignannotationY: kotlin.Int,

    /* The page number in the Ezsigndocument */
    @Json(name = "iEzsignpagePagenumber")
    override val iEzsignpagePagenumber: kotlin.Int,

    /* The unique ID of the Ezsignannotation */
    @Json(name = "pkiEzsignannotationID")
    override val pkiEzsignannotationID: kotlin.Int? = null,

    @Json(name = "eEzsignannotationHorizontalalignment")
    override val eEzsignannotationHorizontalalignment: EnumHorizontalalignment? = null,

    @Json(name = "eEzsignannotationVerticalalignment")
    override val eEzsignannotationVerticalalignment: EnumVerticalalignment? = null,

    /* The Width of the Ezsignannotation.  Width is calculated at 100dpi (dot per inch). So for example, if you want to have the width of the Ezsignannotation to be 3 inches, you would use \"300\" for the Width. */
    @Json(name = "iEzsignannotationWidth")
    override val iEzsignannotationWidth: kotlin.Int? = null,

    /* The Height of the Ezsignannotation.  Height is calculated at 100dpi (dot per inch). So for example, if you want to have the height of the Ezsignannotation to be 2 inches, you would use \"200\" for the Height.  This can only be set if eEzsignannotationType is **StrikethroughBlock** or **Text** */
    @Json(name = "iEzsignannotationHeight")
    override val iEzsignannotationHeight: kotlin.Int? = null,

    /* The Text of the Ezsignannotation */
    @Json(name = "sEzsignannotationText")
    override val sEzsignannotationText: kotlin.String? = null,

    @Json(name = "objTextstylestatic")
    val objTextstylestatic: TextstylestaticRequestCompound? = null

) : EzsignannotationRequest {


}

