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
 * Request for POST /1/object/userstaged/{pkiUserstagedID}/map
 *
 * @param fkiUserID The unique ID of the User
 */


data class UserstagedMapV1Request (

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int

)

