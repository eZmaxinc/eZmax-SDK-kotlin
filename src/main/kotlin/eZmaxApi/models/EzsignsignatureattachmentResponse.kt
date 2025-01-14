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
 * An Ezsignsignatureattachment Object
 *
 * @param pkiEzsignsignatureattachmentID The unique ID of the Ezsignsignatureattachment
 * @param fkiEzsignsignatureID The unique ID of the Ezsignsignature
 * @param binEzsignsignatureattachmentMD5 The md5 of the Ezsignsignatureattachment
 * @param sEzsignsignatureattachmentName The name of the Ezsignsignatureattachment
 * @param sDownloadUrl The Url to the requested document.  Url will expire after 3 hours.
 */


data class EzsignsignatureattachmentResponse (

    /* The unique ID of the Ezsignsignatureattachment */
    @Json(name = "pkiEzsignsignatureattachmentID")
    val pkiEzsignsignatureattachmentID: kotlin.Int,

    /* The unique ID of the Ezsignsignature */
    @Json(name = "fkiEzsignsignatureID")
    val fkiEzsignsignatureID: kotlin.Int,

    /* The md5 of the Ezsignsignatureattachment */
    @Json(name = "binEzsignsignatureattachmentMD5")
    val binEzsignsignatureattachmentMD5: kotlin.String,

    /* The name of the Ezsignsignatureattachment */
    @Json(name = "sEzsignsignatureattachmentName")
    val sEzsignsignatureattachmentName: kotlin.String,

    /* The Url to the requested document.  Url will expire after 3 hours. */
    @Json(name = "sDownloadUrl")
    val sDownloadUrl: kotlin.String

) {


}

