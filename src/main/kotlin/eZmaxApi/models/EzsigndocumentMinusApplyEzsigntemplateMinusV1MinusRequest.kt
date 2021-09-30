/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
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


import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate API Request
 *
 * @param fkiEzsigntemplateID The unique ID of the Ezsigndocument
 * @param aSEzsigntemplatesigner 
 * @param aPkiEzsignfoldersignerassociationID 
 */

data class EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest (

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int,

    @Json(name = "a_sEzsigntemplatesigner")
    val aSEzsigntemplatesigner: kotlin.collections.List<kotlin.String>,

    @Json(name = "a_pkiEzsignfoldersignerassociationID")
    val aPkiEzsignfoldersignerassociationID: kotlin.collections.List<kotlin.Int>

)

