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

import eZmaxApi.models.EzsigntemplateformfieldgroupResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}
 *
 * @param objEzsigntemplateformfieldgroup 
 */


data class EzsigntemplateformfieldgroupGetObjectV2ResponseMPayload (

    @Json(name = "objEzsigntemplateformfieldgroup")
    val objEzsigntemplateformfieldgroup: EzsigntemplateformfieldgroupResponseCompound

)
