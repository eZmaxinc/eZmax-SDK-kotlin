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

import eZmaxApi.models.FieldEAttachmentlogType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Attachmentlog Object
 *
 * @param fkiAttachmentID The unique ID of the Attachment.
 * @param fkiUserID The unique ID of the User
 * @param dtAttachmentlogDatetime The created date
 * @param eAttachmentlogType 
 * @param sAttachmentlogDetail The additionnal detail
 */


data class AttachmentlogResponse (

    /* The unique ID of the Attachment. */
    @Json(name = "fkiAttachmentID")
    val fkiAttachmentID: kotlin.Int,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,

    /* The created date */
    @Json(name = "dtAttachmentlogDatetime")
    val dtAttachmentlogDatetime: kotlin.String,

    @Json(name = "eAttachmentlogType")
    val eAttachmentlogType: FieldEAttachmentlogType,

    /* The additionnal detail */
    @Json(name = "sAttachmentlogDetail")
    val sAttachmentlogDetail: kotlin.String? = null

)
