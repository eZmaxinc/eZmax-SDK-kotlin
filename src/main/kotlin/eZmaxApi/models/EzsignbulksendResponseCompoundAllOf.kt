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

import eZmaxApi.models.EzsignbulksenddocumentmappingMinusResponseCompound
import eZmaxApi.models.EzsignbulksendsignermappingMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param aObjEzsignbulksenddocumentmapping 
 * @param aObjEzsignbulksendsignermapping 
 */


data class EzsignbulksendResponseCompoundAllOf (

    @Json(name = "a_objEzsignbulksenddocumentmapping")
    val aObjEzsignbulksenddocumentmapping: kotlin.collections.List<EzsignbulksenddocumentmappingMinusResponseCompound>,

    @Json(name = "a_objEzsignbulksendsignermapping")
    val aObjEzsignbulksendsignermapping: kotlin.collections.List<EzsignbulksendsignermappingMinusResponse>

)

