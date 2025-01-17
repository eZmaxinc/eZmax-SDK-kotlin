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

import eZmaxApi.models.EzsigntemplatedocumentpagerecognitionRequest
import eZmaxApi.models.FieldEEzsigntemplatedocumentpagerecognitionOperator
import eZmaxApi.models.FieldEEzsigntemplatedocumentpagerecognitionSection

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatedocumentpagerecognition Object and children
 *
 * @param fkiEzsigntemplatedocumentpageID The unique ID of the Ezsigntemplatedocumentpage
 * @param eEzsigntemplatedocumentpagerecognitionOperator 
 * @param eEzsigntemplatedocumentpagerecognitionSection 
 * @param tEzsigntemplatedocumentpagerecognitionText The text of the Ezsigntemplatedocumentpagerecognition
 * @param pkiEzsigntemplatedocumentpagerecognitionID The unique ID of the Ezsigntemplatedocumentpagerecognition
 * @param iEzsigntemplatedocumentpagerecognitionSimilarpercentage The similarpercentage of the Ezsigntemplatedocumentpagerecognition
 * @param iEzsigntemplatedocumentpagerecognitionX The x of the Ezsigntemplatedocumentpagerecognition
 * @param iEzsigntemplatedocumentpagerecognitionY The y of the Ezsigntemplatedocumentpagerecognition
 * @param iEzsigntemplatedocumentpagerecognitionWidth The width of the Ezsigntemplatedocumentpagerecognition
 * @param iEzsigntemplatedocumentpagerecognitionHeight The height of the Ezsigntemplatedocumentpagerecognition
 */


class EzsigntemplatedocumentpagerecognitionRequestCompound (

    /* The unique ID of the Ezsigntemplatedocumentpage */
    @Json(name = "fkiEzsigntemplatedocumentpageID")
    override val fkiEzsigntemplatedocumentpageID: kotlin.Int,

    @Json(name = "eEzsigntemplatedocumentpagerecognitionOperator")
    override val eEzsigntemplatedocumentpagerecognitionOperator: FieldEEzsigntemplatedocumentpagerecognitionOperator,

    @Json(name = "eEzsigntemplatedocumentpagerecognitionSection")
    override val eEzsigntemplatedocumentpagerecognitionSection: FieldEEzsigntemplatedocumentpagerecognitionSection,

    /* The text of the Ezsigntemplatedocumentpagerecognition */
    @Json(name = "tEzsigntemplatedocumentpagerecognitionText")
    override val tEzsigntemplatedocumentpagerecognitionText: kotlin.String,

    /* The unique ID of the Ezsigntemplatedocumentpagerecognition */
    @Json(name = "pkiEzsigntemplatedocumentpagerecognitionID")
    override val pkiEzsigntemplatedocumentpagerecognitionID: kotlin.Int? = null,

    /* The similarpercentage of the Ezsigntemplatedocumentpagerecognition */
    @Json(name = "iEzsigntemplatedocumentpagerecognitionSimilarpercentage")
    override val iEzsigntemplatedocumentpagerecognitionSimilarpercentage: kotlin.Int? = null,

    /* The x of the Ezsigntemplatedocumentpagerecognition */
    @Json(name = "iEzsigntemplatedocumentpagerecognitionX")
    override val iEzsigntemplatedocumentpagerecognitionX: kotlin.Int? = null,

    /* The y of the Ezsigntemplatedocumentpagerecognition */
    @Json(name = "iEzsigntemplatedocumentpagerecognitionY")
    override val iEzsigntemplatedocumentpagerecognitionY: kotlin.Int? = null,

    /* The width of the Ezsigntemplatedocumentpagerecognition */
    @Json(name = "iEzsigntemplatedocumentpagerecognitionWidth")
    override val iEzsigntemplatedocumentpagerecognitionWidth: kotlin.Int? = null,

    /* The height of the Ezsigntemplatedocumentpagerecognition */
    @Json(name = "iEzsigntemplatedocumentpagerecognitionHeight")
    override val iEzsigntemplatedocumentpagerecognitionHeight: kotlin.Int? = null

) : EzsigntemplatedocumentpagerecognitionRequest {


}

