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

import eZmaxApi.models.EzsigndocumentMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsigndocument/{pkiEzsigndocumentID}
 *
 * @param objEzsigndocument 
 */


data class EzsigndocumentMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objEzsigndocument")
    val objEzsigndocument: EzsigndocumentMinusResponseCompound

)

