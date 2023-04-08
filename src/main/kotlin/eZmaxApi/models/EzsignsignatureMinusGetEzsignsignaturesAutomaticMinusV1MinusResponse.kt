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

import eZmaxApi.models.CommonMinusResponseMinusObjDebug
import eZmaxApi.models.CommonMinusResponseMinusObjDebugPayload
import eZmaxApi.models.EzsignsignatureMinusGetEzsignsignaturesAutomaticMinusV1MinusResponseMinusMPayload

import com.squareup.moshi.Json

/**
 * Response for GET /1/object/ezsignsignature/getEzsignsignaturesAutomatic
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */


data class EzsignsignatureMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse (

    @Json(name = "mPayload")
    val mPayload: EzsignsignatureMinusGetEzsignsignaturesAutomaticMinusV1MinusResponseMinusMPayload,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayload? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)

