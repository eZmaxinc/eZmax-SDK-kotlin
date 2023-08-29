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
 * Payload for POST /1/object/ezsignfolder
 *
 * @param aPkiEzsignfolderID An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
 */


data class EzsignfolderCreateObjectV1ResponseMPayload (

    /* An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request. */
    @Json(name = "a_pkiEzsignfolderID")
    val aPkiEzsignfolderID: kotlin.collections.List<kotlin.Int>

)

