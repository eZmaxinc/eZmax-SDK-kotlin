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
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /1/object/ezsigntemplate/{pkiEzsigntemplateID}/copy
 *
 * @param aPkiEzsigntemplateID An array of unique IDs representing the object that were requested to be copied.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
 */


data class EzsigntemplateMinusCopyMinusV1MinusResponseMinusMPayload (

    /* An array of unique IDs representing the object that were requested to be copied.  They are returned in the same order as the array containing the objects to be created that was sent in the request. */
    @Json(name = "a_pkiEzsigntemplateID")
    val aPkiEzsigntemplateID: kotlin.collections.List<kotlin.Int>

)

