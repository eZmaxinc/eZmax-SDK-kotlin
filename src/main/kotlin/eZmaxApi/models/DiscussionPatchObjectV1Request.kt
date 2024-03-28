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

import eZmaxApi.models.DiscussionRequestPatch

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PATCH /1/object/discussion/{pkiDiscussionID}
 *
 * @param objDiscussion 
 */


data class DiscussionPatchObjectV1Request (

    @Json(name = "objDiscussion")
    val objDiscussion: DiscussionRequestPatch

)
