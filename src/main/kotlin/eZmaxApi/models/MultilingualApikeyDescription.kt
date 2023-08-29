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
 * Description of the API Key
 *
 * @param sApikeyDescription1 The description of the Apikey in French
 * @param sApikeyDescription2 The description of the Apikey in English
 */


data class MultilingualApikeyDescription (

    /* The description of the Apikey in French */
    @Json(name = "sApikeyDescription1")
    val sApikeyDescription1: kotlin.String? = null,

    /* The description of the Apikey in English */
    @Json(name = "sApikeyDescription2")
    val sApikeyDescription2: kotlin.String? = null

)

