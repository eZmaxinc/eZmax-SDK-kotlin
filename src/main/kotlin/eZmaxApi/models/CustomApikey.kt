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
 * A Custom Apikey Object
 *
 * @param sApikeyKey The key of the Apikey
 * @param sApikeySecret The secret of the Apikey
 */


data class CustomApikey (

    /* The key of the Apikey */
    @Json(name = "sApikeyKey")
    val sApikeyKey: kotlin.String,

    /* The secret of the Apikey */
    @Json(name = "sApikeySecret")
    val sApikeySecret: kotlin.String

) {


}

