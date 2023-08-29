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
 * The description of the Billingentityinternal
 *
 * @param sBillingentityinternalDescription1 The description of the Billingentityinternal in French
 * @param sBillingentityinternalDescription2 The description of the Billingentityinternal in English
 */


data class MultilingualBillingentityinternalDescription (

    /* The description of the Billingentityinternal in French */
    @Json(name = "sBillingentityinternalDescription1")
    val sBillingentityinternalDescription1: kotlin.String? = null,

    /* The description of the Billingentityinternal in English */
    @Json(name = "sBillingentityinternalDescription2")
    val sBillingentityinternalDescription2: kotlin.String? = null

)

