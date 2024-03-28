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

import eZmaxApi.models.FieldEWebhookEzsignevent
import eZmaxApi.models.FieldEWebhookManagementevent
import eZmaxApi.models.FieldEWebhookModule
import eZmaxApi.models.WebhookheaderRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Webhook Object and children
 *
 * @param sWebhookDescription The description of the Webhook
 * @param eWebhookModule 
 * @param sWebhookUrl The URL of the Webhook callback
 * @param sWebhookEmailfailed The email that will receive the Webhook in case all attempts fail
 * @param bWebhookIsactive Whether the Webhook is active or not
 * @param bWebhookSkipsslvalidation Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use
 * @param pkiWebhookID The unique ID of the Webhook
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param eWebhookEzsignevent 
 * @param eWebhookManagementevent 
 * @param bWebhookIssigned Whether the requests will be signed or not
 * @param aObjWebhookheader 
 */


data class WebhookRequestCompound (

    /* The description of the Webhook */
    @Json(name = "sWebhookDescription")
    val sWebhookDescription: kotlin.String,

    @Json(name = "eWebhookModule")
    val eWebhookModule: FieldEWebhookModule,

    /* The URL of the Webhook callback */
    @Json(name = "sWebhookUrl")
    val sWebhookUrl: kotlin.String,

    /* The email that will receive the Webhook in case all attempts fail */
    @Json(name = "sWebhookEmailfailed")
    val sWebhookEmailfailed: kotlin.String,

    /* Whether the Webhook is active or not */
    @Json(name = "bWebhookIsactive")
    val bWebhookIsactive: kotlin.Boolean,

    /* Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use */
    @Json(name = "bWebhookSkipsslvalidation")
    val bWebhookSkipsslvalidation: kotlin.Boolean,

    /* The unique ID of the Webhook */
    @Json(name = "pkiWebhookID")
    val pkiWebhookID: kotlin.Int? = null,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int? = null,

    @Json(name = "eWebhookEzsignevent")
    val eWebhookEzsignevent: FieldEWebhookEzsignevent? = null,

    @Json(name = "eWebhookManagementevent")
    val eWebhookManagementevent: FieldEWebhookManagementevent? = null,

    /* Whether the requests will be signed or not */
    @Json(name = "bWebhookIssigned")
    val bWebhookIssigned: kotlin.Boolean? = null,

    @Json(name = "a_objWebhookheader")
    val aObjWebhookheader: kotlin.collections.List<WebhookheaderRequestCompound>? = null

)

