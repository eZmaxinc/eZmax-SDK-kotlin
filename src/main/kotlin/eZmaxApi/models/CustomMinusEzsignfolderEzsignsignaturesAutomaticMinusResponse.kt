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

import eZmaxApi.models.CustomMinusEzsigndocumentEzsignsignaturesAutomaticMinusResponse

import com.squareup.moshi.Json

/**
 * An Ezsignfolder Object in the context of an EzsignsignaturesAutomatic path
 *
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param aObjEzsigndocument 
 */


data class CustomMinusEzsignfolderEzsignsignaturesAutomaticMinusResponse (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int,

    /* The description of the Ezsignfolder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    @Json(name = "a_objEzsigndocument")
    val aObjEzsigndocument: kotlin.collections.List<CustomMinusEzsigndocumentEzsignsignaturesAutomaticMinusResponse>

)

