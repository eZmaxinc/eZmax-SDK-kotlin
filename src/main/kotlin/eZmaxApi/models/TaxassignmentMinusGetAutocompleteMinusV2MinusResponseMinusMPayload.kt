/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.TaxassignmentMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for POST /2/object/taxassignment/getAutocomplete
 *
 * @param aObjTaxassignment An array of Taxassignment autocomplete element response.
 */

data class TaxassignmentMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Taxassignment autocomplete element response. */
    @Json(name = "a_objTaxassignment")
    val aObjTaxassignment: kotlin.collections.List<TaxassignmentMinusAutocompleteElementMinusResponse>

)
