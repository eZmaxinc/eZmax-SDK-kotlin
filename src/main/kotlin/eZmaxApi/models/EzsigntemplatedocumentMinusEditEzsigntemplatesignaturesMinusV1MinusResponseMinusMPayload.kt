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


import com.squareup.moshi.Json

/**
 * Payload for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures
 *
 * @param aPkiEzsigntemplatesignatureID 
 */


data class EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_pkiEzsigntemplatesignatureID")
    val aPkiEzsigntemplatesignatureID: kotlin.collections.List<kotlin.Int>

)

