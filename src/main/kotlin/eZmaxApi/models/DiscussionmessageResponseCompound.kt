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

import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEDiscussionmessageStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Discussionmessage Object and children
 *
 * @param pkiDiscussionmessageID The unique ID of the Discussionmessage
 * @param fkiDiscussionID The unique ID of the Discussion
 * @param eDiscussionmessageStatus 
 * @param tDiscussionmessageContent The content of the Discussionmessage
 * @param sDiscussionmessageCreatorname The name the creator of the Discussionmessage.
 * @param objAudit 
 * @param fkiDiscussionmembershipID The unique ID of the Discussionmembership
 * @param fkiDiscussionmembershipIDActionrequired The unique ID of the Discussionmembership
 * @param sDiscussionmessageActionrequiredname The name the Actionrequired of the Discussionmessage.
 */


data class DiscussionmessageResponseCompound (

    /* The unique ID of the Discussionmessage */
    @Json(name = "pkiDiscussionmessageID")
    val pkiDiscussionmessageID: kotlin.Int,

    /* The unique ID of the Discussion */
    @Json(name = "fkiDiscussionID")
    val fkiDiscussionID: kotlin.Int,

    @Json(name = "eDiscussionmessageStatus")
    val eDiscussionmessageStatus: FieldEDiscussionmessageStatus,

    /* The content of the Discussionmessage */
    @Json(name = "tDiscussionmessageContent")
    val tDiscussionmessageContent: kotlin.String,

    /* The name the creator of the Discussionmessage. */
    @Json(name = "sDiscussionmessageCreatorname")
    val sDiscussionmessageCreatorname: kotlin.String,

    @Json(name = "objAudit")
    val objAudit: CommonAudit,

    /* The unique ID of the Discussionmembership */
    @Json(name = "fkiDiscussionmembershipID")
    val fkiDiscussionmembershipID: kotlin.Int? = null,

    /* The unique ID of the Discussionmembership */
    @Json(name = "fkiDiscussionmembershipIDActionrequired")
    val fkiDiscussionmembershipIDActionrequired: kotlin.Int? = null,

    /* The name the Actionrequired of the Discussionmessage. */
    @Json(name = "sDiscussionmessageActionrequiredname")
    val sDiscussionmessageActionrequiredname: kotlin.String? = null

)

