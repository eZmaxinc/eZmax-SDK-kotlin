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

import eZmaxApi.models.PeriodMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json

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

