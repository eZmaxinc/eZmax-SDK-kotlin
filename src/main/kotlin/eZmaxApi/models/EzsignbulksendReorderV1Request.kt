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
 * Request for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/reorder
 *
 * @param aPkiEzsignbulksenddocumentmappingID 
 */


data class EzsignbulksendReorderV1Request (

    @Json(name = "a_pkiEzsignbulksenddocumentmappingID")
    val aPkiEzsignbulksenddocumentmappingID: kotlin.collections.List<kotlin.Int>

)

