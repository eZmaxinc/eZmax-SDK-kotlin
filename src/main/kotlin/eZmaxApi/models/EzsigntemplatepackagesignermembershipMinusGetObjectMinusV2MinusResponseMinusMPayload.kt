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

import eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}
 *
 * @param objEzsigntemplatepackagesignermembership 
 */


data class EzsigntemplatepackagesignermembershipMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objEzsigntemplatepackagesignermembership")
    val objEzsigntemplatepackagesignermembership: EzsigntemplatepackagesignermembershipMinusResponseCompound

)

