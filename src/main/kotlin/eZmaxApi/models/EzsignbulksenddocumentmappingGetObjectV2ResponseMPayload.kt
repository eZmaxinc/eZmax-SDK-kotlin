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

import eZmaxApi.models.EzsignbulksenddocumentmappingResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}
 *
 * @param objEzsignbulksenddocumentmapping 
 */


data class EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload (

    @Json(name = "objEzsignbulksenddocumentmapping")
    val objEzsignbulksenddocumentmapping: EzsignbulksenddocumentmappingResponseCompound

)
