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

import eZmaxApi.models.CustomDiscussionconfigurationResponse
import eZmaxApi.models.DiscussionmembershipResponseCompound
import eZmaxApi.models.DiscussionmessageResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Discussion Object
 *
 * @param pkiDiscussionID The unique ID of the Discussion
 * @param sDiscussionDescription The description of the Discussion
 * @param bDiscussionClosed Whether if it's an closed
 * @param iDiscussionmessageCount The count of Attachment.
 * @param iDiscussionmessageCountunread The count of Attachment.
 * @param aObjDiscussionmembership 
 * @param aObjDiscussionmessage 
 * @param dtDiscussionLastread The date the Discussion was last read
 * @param objDiscussionconfiguration 
 */


data class DiscussionResponseCompound (

    /* The unique ID of the Discussion */
    @Json(name = "pkiDiscussionID")
    val pkiDiscussionID: kotlin.Int,

    /* The description of the Discussion */
    @Json(name = "sDiscussionDescription")
    val sDiscussionDescription: kotlin.String,

    /* Whether if it's an closed */
    @Json(name = "bDiscussionClosed")
    val bDiscussionClosed: kotlin.Boolean,

    /* The count of Attachment. */
    @Json(name = "iDiscussionmessageCount")
    val iDiscussionmessageCount: kotlin.Int,

    /* The count of Attachment. */
    @Json(name = "iDiscussionmessageCountunread")
    val iDiscussionmessageCountunread: kotlin.Int,

    @Json(name = "a_objDiscussionmembership")
    val aObjDiscussionmembership: kotlin.collections.List<DiscussionmembershipResponseCompound>,

    @Json(name = "a_objDiscussionmessage")
    val aObjDiscussionmessage: kotlin.collections.List<DiscussionmessageResponseCompound>,

    /* The date the Discussion was last read */
    @Json(name = "dtDiscussionLastread")
    val dtDiscussionLastread: kotlin.String? = null,

    @Json(name = "objDiscussionconfiguration")
    val objDiscussionconfiguration: CustomDiscussionconfigurationResponse? = null

) {


}

