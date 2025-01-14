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
 * A Discussionmessage Object
 *
 * @param fkiDiscussionID The unique ID of the Discussion
 * @param tDiscussionmessageContent The content of the Discussionmessage
 * @param pkiDiscussionmessageID The unique ID of the Discussionmessage
 * @param fkiDiscussionmembershipIDActionrequired The unique ID of the Discussionmembership
 */


data class DiscussionmessageRequest (

    /* The unique ID of the Discussion */
    @Json(name = "fkiDiscussionID")
    val fkiDiscussionID: kotlin.Int,

    /* The content of the Discussionmessage */
    @Json(name = "tDiscussionmessageContent")
    val tDiscussionmessageContent: kotlin.String,

    /* The unique ID of the Discussionmessage */
    @Json(name = "pkiDiscussionmessageID")
    val pkiDiscussionmessageID: kotlin.Int? = null,

    /* The unique ID of the Discussionmembership */
    @Json(name = "fkiDiscussionmembershipIDActionrequired")
    val fkiDiscussionmembershipIDActionrequired: kotlin.Int? = null

) {


}

