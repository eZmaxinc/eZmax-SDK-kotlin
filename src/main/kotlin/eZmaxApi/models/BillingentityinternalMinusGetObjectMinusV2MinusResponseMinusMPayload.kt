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

import eZmaxApi.models.BillingentityinternalMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /2/object/billingentityinternal/{pkiBillingentityinternalID}
 *
 * @param objBillingentityinternal 
 */


data class BillingentityinternalMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objBillingentityinternal")
    val objBillingentityinternal: BillingentityinternalMinusResponseCompound

)
