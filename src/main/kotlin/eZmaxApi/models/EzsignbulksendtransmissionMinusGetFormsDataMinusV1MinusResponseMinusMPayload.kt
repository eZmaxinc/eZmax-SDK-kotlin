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

import eZmaxApi.models.CustomMinusFormsDataFolderMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData
 *
 * @param aObjFormsDataFolder 
 */


data class EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objFormsDataFolder")
    val aObjFormsDataFolder: kotlin.collections.List<CustomMinusFormsDataFolderMinusResponse>

)

