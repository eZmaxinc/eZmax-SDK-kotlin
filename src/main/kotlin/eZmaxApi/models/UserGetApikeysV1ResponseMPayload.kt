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
 * Response for GET /1/object/user/{pkiUserID}/getApikeys
 *
 * @param aObjApikey 
 */


data class UserGetApikeysV1ResponseMPayload (

    @Json(name = "a_objApikey")
    val aObjApikey: kotlin.collections.List<ApikeyResponseCompound>

) {


}

