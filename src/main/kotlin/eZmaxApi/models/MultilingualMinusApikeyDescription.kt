/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * Description of the API Key
 *
 * @param sApikeyDescription1 The description of the Apikey in French
 * @param sApikeyDescription2 The description of the Apikey in English
 */

data class MultilingualMinusApikeyDescription (

    /* The description of the Apikey in French */
    @Json(name = "sApikeyDescription1")
    val sApikeyDescription1: kotlin.String? = null,

    /* The description of the Apikey in English */
    @Json(name = "sApikeyDescription2")
    val sApikeyDescription2: kotlin.String? = null

)

