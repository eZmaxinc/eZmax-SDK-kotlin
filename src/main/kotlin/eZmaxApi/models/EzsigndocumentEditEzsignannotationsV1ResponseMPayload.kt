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
 * Payload for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignannotations
 *
 * @param aPkiEzsignannotationID 
 */


data class EzsigndocumentEditEzsignannotationsV1ResponseMPayload (

    @Json(name = "a_pkiEzsignannotationID")
    val aPkiEzsignannotationID: kotlin.collections.List<kotlin.Int>

) {


}

