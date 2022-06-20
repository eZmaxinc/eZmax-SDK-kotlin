/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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

import eZmaxApi.models.CommonMinusResponse
import eZmaxApi.models.CommonMinusResponseMinusObjDebug
import eZmaxApi.models.CommonMinusResponseMinusObjDebugPayload
import eZmaxApi.models.EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseAllOf
import eZmaxApi.models.EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponseMinusMPayload

import com.squareup.moshi.Json

/**
 * Response for GET /1/object/ezsignbulksend/{pkiEzsignbulksend}/getEzsignbulksendtransmissions
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */

data class EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse (

    @Json(name = "mPayload")
    val mPayload: EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponseMinusMPayload,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayload? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)

