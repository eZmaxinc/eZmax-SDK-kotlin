/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.CommonMinusResponseGetList
import eZmaxApi.models.CommonMinusResponseMinusObjDebug
import eZmaxApi.models.CommonMinusResponseMinusObjDebugPayloadGetList
import eZmaxApi.models.EzsignbulksendGetListV1ResponseAllOf
import eZmaxApi.models.EzsignbulksendMinusGetListMinusV1MinusResponseMinusMPayload

import com.squareup.moshi.Json

/**
 * Response for the /1/object/ezsignbulksend/getList API Request
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */

data class EzsignbulksendMinusGetListMinusV1MinusResponse (

    @Json(name = "mPayload")
    val mPayload: EzsignbulksendMinusGetListMinusV1MinusResponseMinusMPayload,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayloadGetList? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)

