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
 * Request for Websocket GetWebsocketID V1
 *
 * @param eWebsocketMessagetype The Type of message
 */


data class WebsocketRequestServerGetWebsocketIDV1 (

    /* The Type of message */
    @Json(name = "eWebsocketMessagetype")
    val eWebsocketMessagetype: WebsocketRequestServerGetWebsocketIDV1.EWebsocketMessagetype

) {

    /**
     * The Type of message
     *
     * Values: RequestServerMinusGetWebsocketIDMinusV1
     */
    @JsonClass(generateAdapter = false)
    enum class EWebsocketMessagetype(val value: kotlin.String) {
        @Json(name = "RequestServer-GetWebsocketID-V1") RequestServerMinusGetWebsocketIDMinusV1("RequestServer-GetWebsocketID-V1");
    }
}
