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

import eZmaxApi.models.EzsignfoldertypeRequestCompoundV3

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /3/object/ezsignfoldertype
 *
 * @param aObjEzsignfoldertype 
 */


data class EzsignfoldertypeCreateObjectV3Request (

    @Json(name = "a_objEzsignfoldertype")
    val aObjEzsignfoldertype: kotlin.collections.List<EzsignfoldertypeRequestCompoundV3>

) {


}

