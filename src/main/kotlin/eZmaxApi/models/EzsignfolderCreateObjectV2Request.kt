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

import eZmaxApi.models.EzsignfolderRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /2/object/ezsignfolder
 *
 * @param aObjEzsignfolder 
 */


data class EzsignfolderCreateObjectV2Request (

    @Json(name = "a_objEzsignfolder")
    val aObjEzsignfolder: kotlin.collections.List<EzsignfolderRequestCompound>

)
