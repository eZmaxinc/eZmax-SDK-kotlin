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

import eZmaxApi.models.EzsignfoldertypeMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/ezsignfoldertype/getAutocomplete
 *
 * @param aObjEzsignfoldertype An array of Ezsignfoldertype autocomplete element response.
 */


data class EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Ezsignfoldertype autocomplete element response. */
    @Json(name = "a_objEzsignfoldertype")
    val aObjEzsignfoldertype: kotlin.collections.List<EzsignfoldertypeMinusAutocompleteElementMinusResponse>

)

