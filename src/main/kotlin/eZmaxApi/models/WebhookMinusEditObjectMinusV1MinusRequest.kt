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

import eZmaxApi.models.WebhookMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for PUT /1/object/webhook/{pkiWebhookID}
 *
 * @param objWebhook 
 */


data class WebhookMinusEditObjectMinusV1MinusRequest (

    @Json(name = "objWebhook")
    val objWebhook: WebhookMinusRequestCompound

)

