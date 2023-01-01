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

/**
 * A form Signer Object in the context of an Ezsignfoldertransmissions
 *
 * @param sContactFirstname The First name of the contact
 * @param sContactLastname The Last name of the contact
 * @param fkiUserID The unique ID of the User
 */


data class CustomMinusEzsignfoldertransmissionSignerMinusResponse (

    /* The First name of the contact */
    @Json(name = "sContactFirstname")
    val sContactFirstname: kotlin.String,

    /* The Last name of the contact */
    @Json(name = "sContactLastname")
    val sContactLastname: kotlin.String,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null

)

