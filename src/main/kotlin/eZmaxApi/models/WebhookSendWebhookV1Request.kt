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

import eZmaxApi.models.CustomEWebhookEzsignevent
import eZmaxApi.models.FieldEWebhookManagementevent
import eZmaxApi.models.FieldEWebhookModule

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/webhook/sendWebhook
 *
 * @param eWebhookModule 
 * @param eWebhookEzsignevent 
 * @param eWebhookManagementevent 
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param fkiEzsignsignerID The unique ID of the Ezsignsigner
 * @param fkiUserID The unique ID of the User
 * @param fkiUserstagedID The unique ID of the Userstaged
 */


data class WebhookSendWebhookV1Request (

    @Json(name = "eWebhookModule")
    val eWebhookModule: FieldEWebhookModule,

    @Json(name = "eWebhookEzsignevent")
    val eWebhookEzsignevent: CustomEWebhookEzsignevent? = null,

    @Json(name = "eWebhookManagementevent")
    val eWebhookManagementevent: FieldEWebhookManagementevent? = null,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int? = null,

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int? = null,

    /* The unique ID of the Ezsignsigner */
    @Json(name = "fkiEzsignsignerID")
    val fkiEzsignsignerID: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Userstaged */
    @Json(name = "fkiUserstagedID")
    val fkiUserstagedID: kotlin.Int? = null

) {


}

