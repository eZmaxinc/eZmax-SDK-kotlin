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

import eZmaxApi.models.DiscussionmessageRequestPatch

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PATCH /1/object/discussionmessage/{pkiDiscussionmessageID}
 *
 * @param objDiscussionmessage 
 */


data class DiscussionmessagePatchObjectV1Request (

    @Json(name = "objDiscussionmessage")
    val objDiscussionmessage: DiscussionmessageRequestPatch

)

