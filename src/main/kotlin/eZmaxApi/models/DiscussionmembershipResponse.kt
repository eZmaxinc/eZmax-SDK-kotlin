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
 * A Discussionmembership Object
 *
 * @param pkiDiscussionmembershipID The unique ID of the Discussionmembership
 * @param fkiDiscussionID The unique ID of the Discussion
 * @param sDiscussionmembershipDescription The Description containing the detail of who the Discussionmembership refers to
 * @param dtDiscussionmembershipJoined The joined date of the Discussionmembership
 * @param fkiUserID The unique ID of the User
 * @param fkiUsergroupID The unique ID of the Usergroup
 * @param fkiModulesectionID The unique ID of the Modulesection
 */


data class DiscussionmembershipResponse (

    /* The unique ID of the Discussionmembership */
    @Json(name = "pkiDiscussionmembershipID")
    val pkiDiscussionmembershipID: kotlin.Int,

    /* The unique ID of the Discussion */
    @Json(name = "fkiDiscussionID")
    val fkiDiscussionID: kotlin.Int,

    /* The Description containing the detail of who the Discussionmembership refers to */
    @Json(name = "sDiscussionmembershipDescription")
    val sDiscussionmembershipDescription: kotlin.String,

    /* The joined date of the Discussionmembership */
    @Json(name = "dtDiscussionmembershipJoined")
    val dtDiscussionmembershipJoined: kotlin.String,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupID")
    val fkiUsergroupID: kotlin.Int? = null,

    /* The unique ID of the Modulesection */
    @Json(name = "fkiModulesectionID")
    val fkiModulesectionID: kotlin.Int? = null

)
