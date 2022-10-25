/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * @param pksCustomerCode The customer code assigned to your account
 * @param bWebhookTest Wheter the webhook received is a manual test or a real event
 */

data class CustomWebhookResponseAllOf (

    /* The customer code assigned to your account */
    @Json(name = "pksCustomerCode")
    val pksCustomerCode: kotlin.String,

    /* Wheter the webhook received is a manual test or a real event */
    @Json(name = "bWebhookTest")
    val bWebhookTest: kotlin.Boolean

)

