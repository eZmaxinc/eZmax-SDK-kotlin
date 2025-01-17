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

import eZmaxApi.models.BillingentityinternalResponse
import eZmaxApi.models.BillingentityinternalproductResponseCompound
import eZmaxApi.models.MultilingualBillingentityinternalDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Billingentityinternal Object
 *
 * @param pkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param objBillingentityinternalDescription 
 * @param aObjBillingentityinternalproduct 
 */


data class BillingentityinternalResponseCompound (

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "pkiBillingentityinternalID")
    override val pkiBillingentityinternalID: kotlin.Int,

    @Json(name = "objBillingentityinternalDescription")
    override val objBillingentityinternalDescription: MultilingualBillingentityinternalDescription,

    @Json(name = "a_objBillingentityinternalproduct")
    val aObjBillingentityinternalproduct: kotlin.collections.List<BillingentityinternalproductResponseCompound>

) : BillingentityinternalResponse {


}

