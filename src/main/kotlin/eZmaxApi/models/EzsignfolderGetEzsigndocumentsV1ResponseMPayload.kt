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

import eZmaxApi.models.EzsigndocumentResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsignfolder/{pkiEzsignfolder}/getEzsigndocuments
 *
 * @param aObjEzsigndocument 
 */


data class EzsignfolderGetEzsigndocumentsV1ResponseMPayload (

    @Json(name = "a_objEzsigndocument")
    val aObjEzsigndocument: kotlin.collections.List<EzsigndocumentResponseCompound>

) {


}

