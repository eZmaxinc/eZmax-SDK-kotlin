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

import eZmaxApi.models.EzsignbulksenddocumentmappingRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/ezsignbulksenddocumentmapping
 *
 * @param aObjEzsignbulksenddocumentmapping 
 */


data class EzsignbulksenddocumentmappingCreateObjectV1Request (

    @Json(name = "a_objEzsignbulksenddocumentmapping")
    val aObjEzsignbulksenddocumentmapping: kotlin.collections.List<EzsignbulksenddocumentmappingRequestCompound>

)
