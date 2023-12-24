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
 * Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getAttachmentCount
 *
 * @param iAttachmentCount The count of Attachment.
 */


data class EzsignfolderGetAttachmentCountV1ResponseMPayload (

    /* The count of Attachment. */
    @Json(name = "iAttachmentCount")
    val iAttachmentCount: kotlin.Int

)

