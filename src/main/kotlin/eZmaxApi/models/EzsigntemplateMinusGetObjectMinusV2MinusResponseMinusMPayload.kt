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

import eZmaxApi.models.EzsigntemplateMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsigntemplate/{pkiEzsigntemplateID}
 *
 * @param objEzsigntemplate 
 */


data class EzsigntemplateMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objEzsigntemplate")
    val objEzsigntemplate: EzsigntemplateMinusResponseCompound

)

