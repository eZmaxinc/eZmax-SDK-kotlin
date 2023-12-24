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

import eZmaxApi.models.WebhookResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/webhook
 *
 * @param aObjWebhook 
 */


data class WebhookCreateObjectV2ResponseMPayload (

    @Json(name = "a_objWebhook")
    val aObjWebhook: kotlin.collections.List<WebhookResponseCompound>

)

