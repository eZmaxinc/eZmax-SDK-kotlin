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

import eZmaxApi.models.EzsigntemplateMinusListElement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param aObjEzsigntemplate 
 */


data class EzsigntemplateGetListV1ResponseMPayloadAllOf (

    @Json(name = "a_objEzsigntemplate")
    val aObjEzsigntemplate: kotlin.collections.List<EzsigntemplateMinusListElement>

)

