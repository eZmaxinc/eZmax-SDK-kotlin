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

import eZmaxApi.models.CustomWebhooklogResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/webhook/{pkiWebhookID}/getHistory
 *
 * @param aObjWebhooklog 
 */


data class WebhookGetHistoryV1ResponseMPayload (

    @Json(name = "a_objWebhooklog")
    val aObjWebhooklog: kotlin.collections.List<CustomWebhooklogResponse>

)
