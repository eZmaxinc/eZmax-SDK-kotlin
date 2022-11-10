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

import eZmaxApi.models.BrandingMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for POST /2/object/branding/getAutocomplete
 *
 * @param aObjBranding An array of Branding object containing the description, ID and active status about the element.
 */

data class BrandingMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Branding object containing the description, ID and active status about the element. */
    @Json(name = "a_objBranding")
    val aObjBranding: kotlin.collections.List<BrandingMinusAutocompleteElementMinusResponse>

)

