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

import eZmaxApi.models.WebsocketResponseGetWebsocketIDV1MPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for Websocket GetWebsocketID V1
 *
 * @param eWebsocketMessagetype The Type of message
 * @param mPayload 
 */


data class WebsocketResponseGetWebsocketIDV1 (

    /* The Type of message */
    @Json(name = "eWebsocketMessagetype")
    val eWebsocketMessagetype: WebsocketResponseGetWebsocketIDV1.EWebsocketMessagetype,

    @Json(name = "mPayload")
    val mPayload: WebsocketResponseGetWebsocketIDV1MPayload

) {

    /**
     * The Type of message
     *
     * Values: ResponseMinusGetWebsocketIDMinusV1
     */
    @JsonClass(generateAdapter = false)
    enum class EWebsocketMessagetype(val value: kotlin.String) {
        @Json(name = "Response-GetWebsocketID-V1") ResponseMinusGetWebsocketIDMinusV1("Response-GetWebsocketID-V1");
    }
}

