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


import com.squareup.moshi.Json

/**
 * A Billingentityinternal AutocompleteElement Response
 *
 * @param sBillingentityinternalDescriptionX The description of the Billingentityinternal in the language of the requester
 * @param pkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param bBillingentityinternalIsactive Whether the Billingentityinternal is active or not
 */


data class BillingentityinternalMinusAutocompleteElementMinusResponse (

    /* The description of the Billingentityinternal in the language of the requester */
    @Json(name = "sBillingentityinternalDescriptionX")
    val sBillingentityinternalDescriptionX: kotlin.String,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "pkiBillingentityinternalID")
    val pkiBillingentityinternalID: kotlin.Int,

    /* Whether the Billingentityinternal is active or not */
    @Json(name = "bBillingentityinternalIsactive")
    val bBillingentityinternalIsactive: kotlin.Boolean

)

