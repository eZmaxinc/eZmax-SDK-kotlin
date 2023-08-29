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
 * A Usergroupmembership Object
 *
 * @param fkiUsergroupID The unique ID of the Usergroup
 * @param fkiUserID The unique ID of the User
 * @param pkiUsergroupmembershipID The unique ID of the Usergroupmembership
 */


data class UsergroupmembershipRequest (

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupID")
    val fkiUsergroupID: kotlin.Int,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,

    /* The unique ID of the Usergroupmembership */
    @Json(name = "pkiUsergroupmembershipID")
    val pkiUsergroupmembershipID: kotlin.Int? = null

)

