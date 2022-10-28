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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param dtWebhooklogDate The date and time at which the Webhooklog happened.
 * @param tWebhooklogJson The Json containing the Webhook call and return
 */

data class CustomWebhooklogResponseAllOf (

    /* The date and time at which the Webhooklog happened. */
    @Json(name = "dtWebhooklogDate")
    val dtWebhooklogDate: kotlin.String,

    /* The Json containing the Webhook call and return */
    @Json(name = "tWebhooklogJson")
    val tWebhooklogJson: kotlin.String

)

