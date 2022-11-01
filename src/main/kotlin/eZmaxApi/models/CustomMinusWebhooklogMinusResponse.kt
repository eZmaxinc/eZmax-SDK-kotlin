/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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

import eZmaxApi.models.CustomWebhooklogResponseAllOf

import com.squareup.moshi.Json

/**
 * A custom Webhooklog object
 *
 * @param dtWebhooklogDate The date and time at which the Webhooklog happened.
 * @param tWebhooklogJson The Json containing the Webhook call and return
 */

data class CustomMinusWebhooklogMinusResponse (

    /* The date and time at which the Webhooklog happened. */
    @Json(name = "dtWebhooklogDate")
    val dtWebhooklogDate: kotlin.String,

    /* The Json containing the Webhook call and return */
    @Json(name = "tWebhooklogJson")
    val tWebhooklogJson: kotlin.String

)

