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
 * Payload for GET /2/object/apikey/{pkiApikeyID}
 *
 * @param objApikey 
 */


data class ApikeyGetObjectV2ResponseMPayload (

    @Json(name = "objApikey")
    val objApikey: ApikeyResponseCompound

) {


}

