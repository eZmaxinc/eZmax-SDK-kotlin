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

import eZmaxApi.models.EzsigntemplatepackageMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/ezsigntemplatepackage/getAutocomplete
 *
 * @param aObjEzsigntemplatepackage An array of Ezsigntemplatepackage autocomplete element response.
 */


data class EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Ezsigntemplatepackage autocomplete element response. */
    @Json(name = "a_objEzsigntemplatepackage")
    val aObjEzsigntemplatepackage: kotlin.collections.List<EzsigntemplatepackageMinusAutocompleteElementMinusResponse>

)

