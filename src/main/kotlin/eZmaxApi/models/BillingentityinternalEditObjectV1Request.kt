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

import eZmaxApi.models.BillingentityinternalRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PUT /1/object/billingentityinternal/{pkiBillingentityinternalID}
 *
 * @param objBillingentityinternal 
 */


data class BillingentityinternalEditObjectV1Request (

    @Json(name = "objBillingentityinternal")
    val objBillingentityinternal: BillingentityinternalRequestCompound

) {


}

