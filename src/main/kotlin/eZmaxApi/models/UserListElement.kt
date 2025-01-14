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

import eZmaxApi.models.FieldEUserEzsignaccess
import eZmaxApi.models.FieldEUserOrigin
import eZmaxApi.models.FieldEUserType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A User List Element
 *
 * @param pkiUserID The unique ID of the User
 * @param sUserFirstname The first name of the user
 * @param sUserLastname The last name of the user
 * @param sUserLoginname The login name of the User.
 * @param bUserIsactive Whether the User is active or not
 * @param eUserType 
 * @param eUserOrigin 
 * @param eUserEzsignaccess 
 * @param sEmailAddress The email address.
 * @param dtUserEzsignprepaidexpiration The eZsign prepaid expiration date
 * @param sUserJobtitle The job title of the user
 */


data class UserListElement (

    /* The unique ID of the User */
    @Json(name = "pkiUserID")
    val pkiUserID: kotlin.Int,

    /* The first name of the user */
    @Json(name = "sUserFirstname")
    val sUserFirstname: kotlin.String,

    /* The last name of the user */
    @Json(name = "sUserLastname")
    val sUserLastname: kotlin.String,

    /* The login name of the User. */
    @Json(name = "sUserLoginname")
    val sUserLoginname: kotlin.String,

    /* Whether the User is active or not */
    @Json(name = "bUserIsactive")
    val bUserIsactive: kotlin.Boolean,

    @Json(name = "eUserType")
    val eUserType: FieldEUserType,

    @Json(name = "eUserOrigin")
    val eUserOrigin: FieldEUserOrigin,

    @Json(name = "eUserEzsignaccess")
    val eUserEzsignaccess: FieldEUserEzsignaccess,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String,

    /* The eZsign prepaid expiration date */
    @Json(name = "dtUserEzsignprepaidexpiration")
    val dtUserEzsignprepaidexpiration: kotlin.String? = null,

    /* The job title of the user */
    @Json(name = "sUserJobtitle")
    val sUserJobtitle: kotlin.String? = null

) {


}

