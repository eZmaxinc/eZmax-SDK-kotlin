/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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

import eZmaxApi.models.EzsigndocumentMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage
 *
 * @param aObjEzsigndocument 
 */

data class EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsigndocument")
    val aObjEzsigndocument: kotlin.collections.List<EzsigndocumentMinusResponseCompound>

)

