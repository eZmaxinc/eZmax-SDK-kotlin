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

import eZmaxApi.models.CountryAutocompleteElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/country/getAutocomplete
 *
 * @param aObjCountry An array of Country autocomplete element response.
 */


data class CountryGetAutocompleteV2ResponseMPayload (

    /* An array of Country autocomplete element response. */
    @Json(name = "a_objCountry")
    val aObjCountry: kotlin.collections.List<CountryAutocompleteElementResponse>

) {


}

