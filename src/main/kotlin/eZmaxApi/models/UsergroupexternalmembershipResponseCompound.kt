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
 * A Usergroupexternalmembership Object
 *
 * @param pkiUsergroupexternalmembershipID The unique ID of the Usergroupexternalmembership
 * @param fkiUsergroupexternalID The unique ID of the Usergroupexternal
 * @param fkiUserID The unique ID of the User
 * @param sUserFirstname The first name of the user
 * @param sUserLastname The last name of the user
 * @param sUserLoginname The login name of the User.
 * @param sEmailAddress The email address.
 * @param sUsergroupexternalName The name of the Usergroupexternal
 */


data class UsergroupexternalmembershipResponseCompound (

    /* The unique ID of the Usergroupexternalmembership */
    @Json(name = "pkiUsergroupexternalmembershipID")
    val pkiUsergroupexternalmembershipID: kotlin.Int,

    /* The unique ID of the Usergroupexternal */
    @Json(name = "fkiUsergroupexternalID")
    val fkiUsergroupexternalID: kotlin.Int,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,

    /* The first name of the user */
    @Json(name = "sUserFirstname")
    val sUserFirstname: kotlin.String,

    /* The last name of the user */
    @Json(name = "sUserLastname")
    val sUserLastname: kotlin.String,

    /* The login name of the User. */
    @Json(name = "sUserLoginname")
    val sUserLoginname: kotlin.String,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String,

    /* The name of the Usergroupexternal */
    @Json(name = "sUsergroupexternalName")
    val sUsergroupexternalName: kotlin.String

) {


}

