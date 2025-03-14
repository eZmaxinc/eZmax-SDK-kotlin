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

import eZmaxApi.models.ApikeyResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/apikey/{pkiApikeyID}/regenerate
 *
 * @param objApikey 
 */


data class ApikeyRegenerateV1ResponseMPayload (

    @Json(name = "objApikey")
    val objApikey: ApikeyResponseCompound

) {


}

