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

import eZmaxApi.models.FontMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for POST /2/object/font/getAutocomplete
 *
 * @param aObjFont An array of Font autocomplete element response.
 */


data class FontMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Font autocomplete element response. */
    @Json(name = "a_objFont")
    val aObjFont: kotlin.collections.List<FontMinusAutocompleteElementMinusResponse>? = null

)

