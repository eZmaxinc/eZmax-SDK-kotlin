/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
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

import eZmaxApi.models.EzsignbulksendtransmissionMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsignbulksend/{pkiEzsignbulksend}/getEzsignbulksendtransmissions API Request
 *
 * @param aObjEzsignbulksendtransmission 
 */

data class EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsignbulksendtransmission")
    val aObjEzsignbulksendtransmission: kotlin.collections.List<EzsignbulksendtransmissionMinusResponseCompound>

)

