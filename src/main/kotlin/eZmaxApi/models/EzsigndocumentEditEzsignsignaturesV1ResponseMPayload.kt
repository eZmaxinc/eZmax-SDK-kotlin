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
 * Payload for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures
 *
 * @param aPkiEzsignsignatureID 
 */


data class EzsigndocumentEditEzsignsignaturesV1ResponseMPayload (

    @Json(name = "a_pkiEzsignsignatureID")
    val aPkiEzsignsignatureID: kotlin.collections.List<kotlin.Int>

) {


}

