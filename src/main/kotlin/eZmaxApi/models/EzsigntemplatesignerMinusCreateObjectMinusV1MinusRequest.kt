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

import eZmaxApi.models.EzsigntemplatesignerMinusRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/ezsigntemplatesigner
 *
 * @param aObjEzsigntemplatesigner 
 */


data class EzsigntemplatesignerMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "a_objEzsigntemplatesigner")
    val aObjEzsigntemplatesigner: kotlin.collections.List<EzsigntemplatesignerMinusRequestCompound>

)

