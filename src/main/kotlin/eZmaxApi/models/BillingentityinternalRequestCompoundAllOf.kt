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

import eZmaxApi.models.BillingentityinternalproductMinusRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param aObjBillingentityinternalproduct 
 */


data class BillingentityinternalRequestCompoundAllOf (

    @Json(name = "a_objBillingentityinternalproduct")
    val aObjBillingentityinternalproduct: kotlin.collections.List<BillingentityinternalproductMinusRequestCompound>

)

