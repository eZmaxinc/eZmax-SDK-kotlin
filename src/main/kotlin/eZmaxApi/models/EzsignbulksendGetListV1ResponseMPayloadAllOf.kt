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

import eZmaxApi.models.EzsignbulksendMinusListElement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param aObjEzsignbulksend 
 */


data class EzsignbulksendGetListV1ResponseMPayloadAllOf (

    @Json(name = "a_objEzsignbulksend")
    val aObjEzsignbulksend: kotlin.collections.List<EzsignbulksendMinusListElement>

)

