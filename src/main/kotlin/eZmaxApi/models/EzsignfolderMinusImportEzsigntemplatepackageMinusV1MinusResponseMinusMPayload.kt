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
 * Payload for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage
 *
 * @param aObjEzsigndocument 
 */


data class EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsigndocument")
    val aObjEzsigndocument: kotlin.collections.List<EzsigndocumentMinusResponseCompound>

)

