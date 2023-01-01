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

import eZmaxApi.models.FranchisebrokerMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for POST /2/object/franchisebroker/getAutocomplete
 *
 * @param aObjFranchisebroker An array of Franchisebroker autocomplete element response.
 */


data class FranchisebrokerMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Franchisebroker autocomplete element response. */
    @Json(name = "a_objFranchisebroker")
    val aObjFranchisebroker: kotlin.collections.List<FranchisebrokerMinusAutocompleteElementMinusResponse>? = null

)
