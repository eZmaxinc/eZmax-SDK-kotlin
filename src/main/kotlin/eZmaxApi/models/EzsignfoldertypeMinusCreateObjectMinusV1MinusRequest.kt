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

import eZmaxApi.models.EzsignfoldertypeMinusRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/ezsignfoldertype
 *
 * @param aObjEzsignfoldertype 
 */


data class EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "a_objEzsignfoldertype")
    val aObjEzsignfoldertype: kotlin.collections.List<EzsignfoldertypeMinusRequestCompound>

)

