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

import eZmaxApi.models.BillingentityexternalMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/billingentityexternal/getAutocomplete
 *
 * @param aObjBillingentityexternal An array of Billingentityexternal autocomplete element response.
 */


data class BillingentityexternalMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Billingentityexternal autocomplete element response. */
    @Json(name = "a_objBillingentityexternal")
    val aObjBillingentityexternal: kotlin.collections.List<BillingentityexternalMinusAutocompleteElementMinusResponse>? = null

)

