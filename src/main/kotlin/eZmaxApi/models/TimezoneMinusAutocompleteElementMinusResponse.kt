/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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
 * A Timezone AutocompleteElement Response
 *
 * @param sTimezoneName The description of the Timezone in the language of the requester
 * @param pkiTimezoneID The unique ID of the Timezone
 * @param bTimezoneIsactive Whether the Timezone is active or not
 */

data class TimezoneMinusAutocompleteElementMinusResponse (

    /* The description of the Timezone in the language of the requester */
    @Json(name = "sTimezoneName")
    val sTimezoneName: kotlin.String,

    /* The unique ID of the Timezone */
    @Json(name = "pkiTimezoneID")
    val pkiTimezoneID: kotlin.Int,

    /* Whether the Timezone is active or not */
    @Json(name = "bTimezoneIsactive")
    val bTimezoneIsactive: kotlin.Boolean

)

