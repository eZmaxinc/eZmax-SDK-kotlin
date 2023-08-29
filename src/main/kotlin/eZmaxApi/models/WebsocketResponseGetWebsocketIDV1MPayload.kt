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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for Websocket GetWebsocketID V1
 *
 * @param sWebsocketID The Unique ID of the Websocket Connection
 */


data class WebsocketResponseGetWebsocketIDV1MPayload (

    /* The Unique ID of the Websocket Connection */
    @Json(name = "sWebsocketID")
    val sWebsocketID: kotlin.String

)

