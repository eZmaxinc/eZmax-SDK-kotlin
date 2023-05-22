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

import eZmaxApi.models.BillingentityinternalMinusGetListMinusV1MinusResponseMinusMPayload
import eZmaxApi.models.CommonMinusResponseMinusObjDebug
import eZmaxApi.models.CommonMinusResponseMinusObjDebugPayloadGetList

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/billingentityinternal/getList
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */


data class BillingentityinternalMinusGetListMinusV1MinusResponse (

    @Json(name = "mPayload")
    val mPayload: BillingentityinternalMinusGetListMinusV1MinusResponseMinusMPayload,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayloadGetList? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)

