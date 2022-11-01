/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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

import eZmaxApi.models.EzsignbulksendtransmissionMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission
 *
 * @param objEzsignbulksendtransmission 
 */

data class EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponseMinusMPayload (

    @Json(name = "objEzsignbulksendtransmission")
    val objEzsignbulksendtransmission: EzsignbulksendtransmissionMinusResponse

)

