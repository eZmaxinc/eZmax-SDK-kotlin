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

import eZmaxApi.models.EzsignfoldersignerassociationRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /2/object/ezsignfoldersignerassociation
 *
 * @param aObjEzsignfoldersignerassociation 
 */


data class EzsignfoldersignerassociationCreateObjectV2Request (

    @Json(name = "a_objEzsignfoldersignerassociation")
    val aObjEzsignfoldersignerassociation: kotlin.collections.List<EzsignfoldersignerassociationRequestCompound>

)

