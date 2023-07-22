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

import eZmaxApi.models.CompanyMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/company/getAutocomplete
 *
 * @param aObjCompany An array of Company autocomplete element response.
 */


data class CompanyMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Company autocomplete element response. */
    @Json(name = "a_objCompany")
    val aObjCompany: kotlin.collections.List<CompanyMinusAutocompleteElementMinusResponse>? = null

)

