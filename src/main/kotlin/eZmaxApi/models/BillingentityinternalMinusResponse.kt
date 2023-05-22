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

import eZmaxApi.models.MultilingualMinusBillingentityinternalDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Billingentityinternal Object
 *
 * @param pkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param objBillingentityinternalDescription 
 */


data class BillingentityinternalMinusResponse (

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "pkiBillingentityinternalID")
    val pkiBillingentityinternalID: kotlin.Int,

    @Json(name = "objBillingentityinternalDescription")
    val objBillingentityinternalDescription: MultilingualMinusBillingentityinternalDescription

)

