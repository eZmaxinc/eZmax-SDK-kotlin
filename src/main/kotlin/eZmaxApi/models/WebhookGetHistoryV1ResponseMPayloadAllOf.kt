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

import eZmaxApi.models.CustomMinusWebhooklogMinusResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjWebhooklog 
 */


data class WebhookGetHistoryV1ResponseMPayloadAllOf (

    @Json(name = "a_objWebhooklog")
    val aObjWebhooklog: kotlin.collections.List<CustomMinusWebhooklogMinusResponse>

)

