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

import eZmaxApi.models.WebhookMinusListElement

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjWebhook 
 */


data class WebhookGetListV1ResponseMPayloadAllOf (

    @Json(name = "a_objWebhook")
    val aObjWebhook: kotlin.collections.List<WebhookMinusListElement>

)

