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
import eZmaxApi.models.EzsigndocumentMinusGetEzsignsignaturesAutomaticMinusV1MinusResponseMinusMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignaturesAutomatic
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */


data class EzsigndocumentMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse (

    @Json(name = "mPayload")
    val mPayload: EzsigndocumentMinusGetEzsignsignaturesAutomaticMinusV1MinusResponseMinusMPayload,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayload? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)

