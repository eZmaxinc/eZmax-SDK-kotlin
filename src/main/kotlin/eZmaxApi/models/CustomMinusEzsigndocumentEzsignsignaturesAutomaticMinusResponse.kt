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

import eZmaxApi.models.CustomMinusEzsignsignatureEzsignsignaturesAutomaticMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsigndocument Object in the context of an EzsignsignaturesAutomatic path
 *
 * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 * @param aObjEzsignsignature 
 */


data class CustomMinusEzsigndocumentEzsignsignaturesAutomaticMinusResponse (

    /* The unique ID of the Ezsigndocument */
    @Json(name = "pkiEzsigndocumentID")
    val pkiEzsigndocumentID: kotlin.Int,

    /* The name of the document that will be presented to Ezsignfoldersignerassociations */
    @Json(name = "sEzsigndocumentName")
    val sEzsigndocumentName: kotlin.String,

    @Json(name = "a_objEzsignsignature")
    val aObjEzsignsignature: kotlin.collections.List<CustomMinusEzsignsignatureEzsignsignaturesAutomaticMinusResponse>

)

