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
import eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV2MinusResponseMinusMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for POST /2/object/ezsigndocument
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */


data class EzsigndocumentMinusCreateObjectMinusV2MinusResponse (

    @Json(name = "mPayload")
    val mPayload: EzsigndocumentMinusCreateObjectMinusV2MinusResponseMinusMPayload,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayload? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)

