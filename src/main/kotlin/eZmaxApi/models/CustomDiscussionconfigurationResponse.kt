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
 * A Custom Discussionconfiguration Object
 *
 * @param bDiscussionconfigurationCompletehistorywhenadded If the added Discussionmembership will have access to the entire history or not
 * @param bDiscussionconfigurationCreateallowed If the the creation of the Discussion is allowed or not
 * @param bDiscussionconfigurationDeleteallowed If the the destruction of the Discussion is allowed or not
 * @param bDiscussionconfigurationDeletediscussionmessageallowed If the the destruction of the Discussionmessage is allowed or not
 * @param bDiscussionconfigurationEditdiscussionmessageallowed If the the creation of the Discussionmessage is allowed or not
 */


data class CustomDiscussionconfigurationResponse (

    /* If the added Discussionmembership will have access to the entire history or not */
    @Json(name = "bDiscussionconfigurationCompletehistorywhenadded")
    val bDiscussionconfigurationCompletehistorywhenadded: kotlin.Boolean,

    /* If the the creation of the Discussion is allowed or not */
    @Json(name = "bDiscussionconfigurationCreateallowed")
    val bDiscussionconfigurationCreateallowed: kotlin.Boolean,

    /* If the the destruction of the Discussion is allowed or not */
    @Json(name = "bDiscussionconfigurationDeleteallowed")
    val bDiscussionconfigurationDeleteallowed: kotlin.Boolean,

    /* If the the destruction of the Discussionmessage is allowed or not */
    @Json(name = "bDiscussionconfigurationDeletediscussionmessageallowed")
    val bDiscussionconfigurationDeletediscussionmessageallowed: kotlin.Boolean,

    /* If the the creation of the Discussionmessage is allowed or not */
    @Json(name = "bDiscussionconfigurationEditdiscussionmessageallowed")
    val bDiscussionconfigurationEditdiscussionmessageallowed: kotlin.Boolean

)

