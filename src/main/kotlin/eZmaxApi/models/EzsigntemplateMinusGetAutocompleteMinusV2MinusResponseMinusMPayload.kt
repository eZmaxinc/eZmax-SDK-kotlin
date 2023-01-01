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

import eZmaxApi.models.EzsigntemplateMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for POST /2/object/ezsigntemplate/getAutocomplete
 *
 * @param aObjEzsigntemplate An array of Ezsigntemplate autocomplete element response.
 */


data class EzsigntemplateMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Ezsigntemplate autocomplete element response. */
    @Json(name = "a_objEzsigntemplate")
    val aObjEzsigntemplate: kotlin.collections.List<EzsigntemplateMinusAutocompleteElementMinusResponse>

)

