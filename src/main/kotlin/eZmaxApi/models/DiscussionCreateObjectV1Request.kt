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

import eZmaxApi.models.DiscussionRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/discussion
 *
 * @param aObjDiscussion 
 */


data class DiscussionCreateObjectV1Request (

    @Json(name = "a_objDiscussion")
    val aObjDiscussion: kotlin.collections.List<DiscussionRequestCompound>

) {


}

