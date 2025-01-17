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

import eZmaxApi.models.CommonResponse
import eZmaxApi.models.CommonResponseObjDebug
import eZmaxApi.models.CommonResponseObjDebugPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for PATCH /1/object/discussionmessage/{pkiDiscussionmessageID}
 *
 * @param objDebugPayload 
 * @param objDebug 
 */


class DiscussionmessagePatchObjectV1Response (

    @Json(name = "objDebugPayload")
    override val objDebugPayload: CommonResponseObjDebugPayload,

    @Json(name = "objDebug")
    override val objDebug: CommonResponseObjDebug? = null

) : CommonResponse {


}

