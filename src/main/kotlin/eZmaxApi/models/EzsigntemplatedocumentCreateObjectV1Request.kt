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

import eZmaxApi.models.EzsigntemplatedocumentRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/ezsigntemplatedocument
 *
 * @param aObjEzsigntemplatedocument 
 */


data class EzsigntemplatedocumentCreateObjectV1Request (

    @Json(name = "a_objEzsigntemplatedocument")
    val aObjEzsigntemplatedocument: kotlin.collections.List<EzsigntemplatedocumentRequestCompound>

) {


}

