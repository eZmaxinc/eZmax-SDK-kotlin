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

import eZmaxApi.models.PeriodMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/period/getAutocomplete
 *
 * @param aObjPeriod An array of Period autocomplete element response.
 */


data class PeriodMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Period autocomplete element response. */
    @Json(name = "a_objPeriod")
    val aObjPeriod: kotlin.collections.List<PeriodMinusAutocompleteElementMinusResponse>? = null

)

