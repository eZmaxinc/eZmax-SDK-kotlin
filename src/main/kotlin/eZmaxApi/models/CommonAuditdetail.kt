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
 * Gives informations about the user that created the object or the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same. 
 *
 * @param fkiUserID The unique ID of the User
 * @param sUserLoginname The login name of the User.
 * @param sUserLastname The last name of the user
 * @param sUserFirstname The first name of the user
 * @param dtAuditdetailDate Represent a Date Time. The timezone is the one configured in the User's profile.
 * @param fkiApikeyID The unique ID of the Apikey
 * @param sApikeyDescriptionX The description of the Apikey in the language of the requester
 */


data class CommonAuditdetail (

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,

    /* The login name of the User. */
    @Json(name = "sUserLoginname")
    val sUserLoginname: kotlin.String,

    /* The last name of the user */
    @Json(name = "sUserLastname")
    val sUserLastname: kotlin.String,

    /* The first name of the user */
    @Json(name = "sUserFirstname")
    val sUserFirstname: kotlin.String,

    /* Represent a Date Time. The timezone is the one configured in the User's profile. */
    @Json(name = "dtAuditdetailDate")
    val dtAuditdetailDate: kotlin.String,

    /* The unique ID of the Apikey */
    @Json(name = "fkiApikeyID")
    val fkiApikeyID: kotlin.Int? = null,

    /* The description of the Apikey in the language of the requester */
    @Json(name = "sApikeyDescriptionX")
    val sApikeyDescriptionX: kotlin.String? = null

) {


}

