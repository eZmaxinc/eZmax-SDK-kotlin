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

import eZmaxApi.models.EzsigntemplateRequestCompoundV2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /2/object/ezsigntemplate
 *
 * @param aObjEzsigntemplate 
 */


data class EzsigntemplateCreateObjectV2Request (

    @Json(name = "a_objEzsigntemplate")
    val aObjEzsigntemplate: kotlin.collections.List<EzsigntemplateRequestCompoundV2>

)
