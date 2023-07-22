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
 * A Timezone AutocompleteElement Response
 *
 * @param sTimezoneName The description of the Timezone
 * @param pkiTimezoneID The unique ID of the Timezone
 * @param bTimezoneIsactive Whether the Timezone is active or not
 */


data class TimezoneMinusAutocompleteElementMinusResponse (

    /* The description of the Timezone */
    @Json(name = "sTimezoneName")
    val sTimezoneName: kotlin.String,

    /* The unique ID of the Timezone */
    @Json(name = "pkiTimezoneID")
    val pkiTimezoneID: kotlin.Int,

    /* Whether the Timezone is active or not */
    @Json(name = "bTimezoneIsactive")
    val bTimezoneIsactive: kotlin.Boolean

)

