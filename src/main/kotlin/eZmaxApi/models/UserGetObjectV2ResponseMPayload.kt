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

import eZmaxApi.models.UserResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/user/{pkiUserID}
 *
 * @param objUser A User Object and children to create a complete structure
 */


data class UserGetObjectV2ResponseMPayload (

    /* A User Object and children to create a complete structure */
    @Json(name = "objUser")
    val objUser: UserResponse

) {


}

