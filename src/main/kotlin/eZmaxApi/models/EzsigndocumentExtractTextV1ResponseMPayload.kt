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
 * Response for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/ExtractText
 *
 * @param sText The text extract from document
 */


data class EzsigndocumentExtractTextV1ResponseMPayload (

    /* The text extract from document */
    @Json(name = "sText")
    val sText: kotlin.String

) {


}

