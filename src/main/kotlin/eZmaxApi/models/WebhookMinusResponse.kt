/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
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


import com.squareup.moshi.Json

/**
 * A webhook object
 *
 * @param pkiWebhookID The Webhook ID. This value is visible in the admin interface.
 * @param eWebhookModule The Module generating the Event.
 * @param pksCustomerCode The customer code assigned to your account
 * @param sWebhookUrl The url being called
 * @param sWebhookEmailfailed The email that will receive the webhook in case all attempts fail.
 * @param eWebhookEzsignevent This Ezsign Event. This property will be set only if the Module is \"Ezsign\".
 * @param eWebhookManagementevent This Management Event. This property will be set only if the Module is \"Management\".
 */

data class WebhookMinusResponse (

    /* The Webhook ID. This value is visible in the admin interface. */
    @Json(name = "pkiWebhookID")
    val pkiWebhookID: kotlin.Int,

    /* The Module generating the Event. */
    @Json(name = "eWebhookModule")
    val eWebhookModule: WebhookMinusResponse.EWebhookModule,

    /* The customer code assigned to your account */
    @Json(name = "pksCustomerCode")
    val pksCustomerCode: kotlin.String,

    /* The url being called */
    @Json(name = "sWebhookUrl")
    val sWebhookUrl: kotlin.String,

    /* The email that will receive the webhook in case all attempts fail. */
    @Json(name = "sWebhookEmailfailed")
    val sWebhookEmailfailed: kotlin.String,

    /* This Ezsign Event. This property will be set only if the Module is \"Ezsign\". */
    @Json(name = "eWebhookEzsignevent")
    val eWebhookEzsignevent: WebhookMinusResponse.EWebhookEzsignevent? = null,

    /* This Management Event. This property will be set only if the Module is \"Management\". */
    @Json(name = "eWebhookManagementevent")
    val eWebhookManagementevent: WebhookMinusResponse.EWebhookManagementevent? = null

) {

    /**
     * The Module generating the Event.
     *
     * Values: Ezsign,Management
     */
    enum class EWebhookModule(val value: kotlin.String) {
        @Json(name = "Ezsign") Ezsign("Ezsign"),
        @Json(name = "Management") Management("Management");
    }
    /**
     * This Ezsign Event. This property will be set only if the Module is \"Ezsign\".
     *
     * Values: DocumentCompleted,FolderCompleted
     */
    enum class EWebhookEzsignevent(val value: kotlin.String) {
        @Json(name = "DocumentCompleted") DocumentCompleted("DocumentCompleted"),
        @Json(name = "FolderCompleted") FolderCompleted("FolderCompleted");
    }
    /**
     * This Management Event. This property will be set only if the Module is \"Management\".
     *
     * Values: UserCreated
     */
    enum class EWebhookManagementevent(val value: kotlin.String) {
        @Json(name = "UserCreated") UserCreated("UserCreated");
    }
}

