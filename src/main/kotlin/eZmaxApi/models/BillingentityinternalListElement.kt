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
import com.squareup.moshi.JsonClass

/**
 * A Billingentityinternal List Element
 *
 * @param pkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param sBillingentityinternalDescriptionX The description of the Billingentityinternal in the language of the requester
 */


data class BillingentityinternalListElement (

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "pkiBillingentityinternalID")
    val pkiBillingentityinternalID: kotlin.Int,

    /* The description of the Billingentityinternal in the language of the requester */
    @Json(name = "sBillingentityinternalDescriptionX")
    val sBillingentityinternalDescriptionX: kotlin.String

)

