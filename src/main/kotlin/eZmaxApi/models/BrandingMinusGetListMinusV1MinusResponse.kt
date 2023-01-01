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

import eZmaxApi.models.BrandingMinusGetListMinusV1MinusResponseMinusMPayload
import eZmaxApi.models.CommonMinusResponseMinusObjDebug
import eZmaxApi.models.CommonMinusResponseMinusObjDebugPayloadGetList

import com.squareup.moshi.Json

/**
 * Response for GET /1/object/branding/getList
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */


data class BrandingMinusGetListMinusV1MinusResponse (

    @Json(name = "mPayload")
    val mPayload: BrandingMinusGetListMinusV1MinusResponseMinusMPayload,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayloadGetList? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)

