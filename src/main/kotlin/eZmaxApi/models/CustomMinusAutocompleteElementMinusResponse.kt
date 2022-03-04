/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
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


import com.squareup.moshi.Json

/**
 * Generic AutocompleteElement Response
 *
 * @param sCategory The Category for the dropdown or an empty string if not categorized
 * @param sLabel The Description of the element
 * @param mValue The Unique ID of the element
 */

data class CustomMinusAutocompleteElementMinusResponse (

    /* The Category for the dropdown or an empty string if not categorized */
    @Json(name = "sCategory")
    val sCategory: kotlin.String,

    /* The Description of the element */
    @Json(name = "sLabel")
    val sLabel: kotlin.String,

    /* The Unique ID of the element */
    @Json(name = "mValue")
    val mValue: kotlin.String

)

