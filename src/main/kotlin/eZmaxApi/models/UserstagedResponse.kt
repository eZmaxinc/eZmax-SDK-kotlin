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
 * A Userstaged Object
 *
 * @param pkiUserstagedID The unique ID of the Userstaged
 * @param fkiEmailID The unique ID of the Email
 * @param sEmailAddress The email address.
 * @param sUserstagedFirstname The firstname of the Userstaged
 * @param sUserstagedLastname The lastname of the Userstaged
 * @param sUserstagedExternalid The externalid of the Userstaged
 */


data class UserstagedResponse (

    /* The unique ID of the Userstaged */
    @Json(name = "pkiUserstagedID")
    val pkiUserstagedID: kotlin.Int,

    /* The unique ID of the Email */
    @Json(name = "fkiEmailID")
    val fkiEmailID: kotlin.Int,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String,

    /* The firstname of the Userstaged */
    @Json(name = "sUserstagedFirstname")
    val sUserstagedFirstname: kotlin.String,

    /* The lastname of the Userstaged */
    @Json(name = "sUserstagedLastname")
    val sUserstagedLastname: kotlin.String,

    /* The externalid of the Userstaged */
    @Json(name = "sUserstagedExternalid")
    val sUserstagedExternalid: kotlin.String

) {


}

