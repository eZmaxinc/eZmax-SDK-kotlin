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

import eZmaxApi.models.CustomAttachmentdocumenttypeResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/ezsigndocument/{pkiEzsigndocumentID}/getAttachments
 *
 * @param aObjAttachmentdocumenttype 
 */


data class EzsigndocumentGetAttachmentsV1ResponseMPayload (

    @Json(name = "a_objAttachmentdocumenttype")
    val aObjAttachmentdocumenttype: kotlin.collections.List<CustomAttachmentdocumenttypeResponse>

) {


}

