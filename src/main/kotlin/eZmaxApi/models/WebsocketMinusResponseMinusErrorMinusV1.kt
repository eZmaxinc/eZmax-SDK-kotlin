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

import eZmaxApi.models.WebsocketMinusResponseMinusErrorMinusV1MinusMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for Websocket Error V1
 *
 * @param eWebsocketMessagetype The Type of message
 * @param mPayload 
 */


data class WebsocketMinusResponseMinusErrorMinusV1 (

    /* The Type of message */
    @Json(name = "eWebsocketMessagetype")
    val eWebsocketMessagetype: WebsocketMinusResponseMinusErrorMinusV1.EWebsocketMessagetype,

    @Json(name = "mPayload")
    val mPayload: WebsocketMinusResponseMinusErrorMinusV1MinusMPayload

) {

    /**
     * The Type of message
     *
     * Values: ResponseMinusErrorMinusV1
     */
    @JsonClass(generateAdapter = false)
    enum class EWebsocketMessagetype(val value: kotlin.String) {
        @Json(name = "Response-Error-V1") ResponseMinusErrorMinusV1("Response-Error-V1");
    }
}

