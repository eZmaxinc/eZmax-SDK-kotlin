/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.FieldMinusEWebhookEzsignevent
import eZmaxApi.models.FieldMinusEWebhookManagementevent
import eZmaxApi.models.FieldMinusEWebhookModule
import eZmaxApi.models.WebhookMinusResponse
import eZmaxApi.models.WebhookResponseCompoundAllOf

import com.squareup.moshi.Json

/**
 * A Webhook Object
 *
 * @param pkiWebhookID The unique ID of the Webhook
 * @param sWebhookDescription The description of the Webhook
 * @param eWebhookModule 
 * @param sWebhookUrl The URL of the Webhook callback
 * @param sWebhookEmailfailed The email that will receive the Webhook in case all attempts fail
 * @param bWebhookSkipsslvalidation Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use
 * @param sWebhookEvent The concatenated string to describe the Webhook event
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param eWebhookEzsignevent 
 * @param eWebhookManagementevent 
 * @param bWebhookIsactive Whether the Webhook is active or not
 */

data class WebhookMinusResponseCompound (

    /* The unique ID of the Webhook */
    @Json(name = "pkiWebhookID")
    val pkiWebhookID: kotlin.Int,

    /* The description of the Webhook */
    @Json(name = "sWebhookDescription")
    val sWebhookDescription: kotlin.String,

    @Json(name = "eWebhookModule")
    val eWebhookModule: FieldMinusEWebhookModule,

    /* The URL of the Webhook callback */
    @Json(name = "sWebhookUrl")
    val sWebhookUrl: kotlin.String,

    /* The email that will receive the Webhook in case all attempts fail */
    @Json(name = "sWebhookEmailfailed")
    val sWebhookEmailfailed: kotlin.String,

    /* Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use */
    @Json(name = "bWebhookSkipsslvalidation")
    val bWebhookSkipsslvalidation: kotlin.Boolean,

    /* The concatenated string to describe the Webhook event */
    @Json(name = "sWebhookEvent")
    val sWebhookEvent: kotlin.String,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int? = null,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String? = null,

    @Json(name = "eWebhookEzsignevent")
    val eWebhookEzsignevent: FieldMinusEWebhookEzsignevent? = null,

    @Json(name = "eWebhookManagementevent")
    val eWebhookManagementevent: FieldMinusEWebhookManagementevent? = null,

    /* Whether the Webhook is active or not */
    @Json(name = "bWebhookIsactive")
    val bWebhookIsactive: kotlin.Boolean? = null

)

