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

import eZmaxApi.models.AttachmentlogResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/attachment/{pkiAttachmentID}/getAttachmentlogs
 *
 * @param aObjAttachmentlog 
 */


data class AttachmentGetAttachmentlogsV1ResponseMPayload (

    @Json(name = "a_objAttachmentlog")
    val aObjAttachmentlog: kotlin.collections.List<AttachmentlogResponseCompound>

)
