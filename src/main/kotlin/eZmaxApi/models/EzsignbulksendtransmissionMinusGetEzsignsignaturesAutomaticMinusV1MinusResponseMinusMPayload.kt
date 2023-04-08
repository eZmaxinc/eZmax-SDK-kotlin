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

import eZmaxApi.models.CustomMinusEzsignfolderEzsignsignaturesAutomaticMinusResponse
import eZmaxApi.models.FieldMinusEEzsignsignatureType

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getEzsignsignaturesAutomatic
 *
 * @param aEEzsignsignatureType All eEzsignsignatureType contained in the response
 * @param aObjEzsignfolder 
 */


data class EzsignbulksendtransmissionMinusGetEzsignsignaturesAutomaticMinusV1MinusResponseMinusMPayload (

    /* All eEzsignsignatureType contained in the response */
    @Json(name = "a_eEzsignsignatureType")
    val aEEzsignsignatureType: kotlin.collections.Set<FieldMinusEEzsignsignatureType>,

    @Json(name = "a_objEzsignfolder")
    val aObjEzsignfolder: kotlin.collections.List<CustomMinusEzsignfolderEzsignsignaturesAutomaticMinusResponse>

)

