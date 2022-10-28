/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * A User Object
 *
 * @param pkiUserID The unique ID of the User
 * @param sUserLastname The Last name of the user
 * @param sUserFirstname The First name of the user
 * @param sEmailAddress The email address.
 */

data class CustomMinusUserMinusResponse (

    /* The unique ID of the User */
    @Json(name = "pkiUserID")
    val pkiUserID: kotlin.Int,

    /* The Last name of the user */
    @Json(name = "sUserLastname")
    val sUserLastname: kotlin.String,

    /* The First name of the user */
    @Json(name = "sUserFirstname")
    val sUserFirstname: kotlin.String,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String

)

