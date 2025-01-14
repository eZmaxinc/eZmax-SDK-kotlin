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

import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEWebhookEzsignevent
import eZmaxApi.models.FieldEWebhookManagementevent
import eZmaxApi.models.FieldEWebhookModule

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A webhook object
 *
 * @param pkiWebhookID The unique ID of the Webhook
 * @param sWebhookDescription The description of the Webhook
 * @param eWebhookModule 
 * @param sWebhookUrl The URL of the Webhook callback
 * @param sWebhookEmailfailed The email that will receive the Webhook in case all attempts fail
 * @param bWebhookIsactive Whether the Webhook is active or not
 * @param bWebhookIssigned Whether the requests will be signed or not
 * @param bWebhookSkipsslvalidation Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use
 * @param objAudit 
 * @param fkiAuthenticationexternalID The unique ID of the Authenticationexternal
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param eWebhookEzsignevent 
 * @param eWebhookManagementevent 
 * @param sWebhookApikey The Apikey for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey.
 * @param sWebhookSecret The Secret for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey.
 * @param sAuthenticationexternalDescription The description of the Authenticationexternal
 */


data class WebhookResponse (

    /* The unique ID of the Webhook */
    @Json(name = "pkiWebhookID")
    val pkiWebhookID: kotlin.Int,

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

    /* Whether the requests will be signed or not */
    @Json(name = "bWebhookIssigned")
    val bWebhookIssigned: kotlin.Boolean,

    /* Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use */
    @Json(name = "bWebhookSkipsslvalidation")
    val bWebhookSkipsslvalidation: kotlin.Boolean,

    @Json(name = "objAudit")
    val objAudit: CommonAudit,

    /* The unique ID of the Authenticationexternal */
    @Json(name = "fkiAuthenticationexternalID")
    val fkiAuthenticationexternalID: kotlin.Int? = null,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int? = null,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String? = null,

    @Json(name = "eWebhookEzsignevent")
    val eWebhookEzsignevent: FieldEWebhookEzsignevent? = null,

    @Json(name = "eWebhookManagementevent")
    val eWebhookManagementevent: FieldEWebhookManagementevent? = null,

    /* The Apikey for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey. */
    @Json(name = "sWebhookApikey")
    val sWebhookApikey: kotlin.String? = null,

    /* The Secret for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey. */
    @Json(name = "sWebhookSecret")
    val sWebhookSecret: kotlin.String? = null,

    /* The description of the Authenticationexternal */
    @Json(name = "sAuthenticationexternalDescription")
    val sAuthenticationexternalDescription: kotlin.String? = null

) {


}

