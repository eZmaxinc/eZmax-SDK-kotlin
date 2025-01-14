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
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getDownloadUrl
 *
 * @param sDownloadUrl The Url to the requested document.  Url will expire after 5 minutes.
 */


data class EzsigndocumentGetDownloadUrlV1ResponseMPayload (

    /* The Url to the requested document.  Url will expire after 5 minutes. */
    @Json(name = "sDownloadUrl")
    val sDownloadUrl: kotlin.String

) {


}

