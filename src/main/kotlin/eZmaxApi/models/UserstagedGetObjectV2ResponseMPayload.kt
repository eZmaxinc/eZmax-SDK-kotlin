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

import eZmaxApi.models.UserstagedResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/userstaged/{pkiUserstagedID}
 *
 * @param objUserstaged A Userstaged Object
 */


data class UserstagedGetObjectV2ResponseMPayload (

    /* A Userstaged Object */
    @Json(name = "objUserstaged")
    val objUserstaged: UserstagedResponse

) {


}

