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

import eZmaxApi.models.WebhookRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/webhook
 *
 * @param aObjWebhook 
 */


data class WebhookCreateObjectV1Request (

    @Json(name = "a_objWebhook")
    val aObjWebhook: kotlin.collections.List<WebhookRequestCompound>

)

