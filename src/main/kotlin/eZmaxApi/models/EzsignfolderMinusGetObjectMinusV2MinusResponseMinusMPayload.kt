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

import eZmaxApi.models.EzsignfolderMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsignfolder/{pkiEzsignfolderID}
 *
 * @param objEzsignfolder 
 */


data class EzsignfolderMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objEzsignfolder")
    val objEzsignfolder: EzsignfolderMinusResponseCompound

)

