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

import eZmaxApi.models.EzsigntemplatedocumentResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}
 *
 * @param objEzsigntemplatedocument 
 */


data class EzsigntemplatedocumentGetObjectV2ResponseMPayload (

    @Json(name = "objEzsigntemplatedocument")
    val objEzsigntemplatedocument: EzsigntemplatedocumentResponseCompound

)
