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

import eZmaxApi.models.EzsignfolderResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsignfolder/{pkiEzsignfolderID}
 *
 * @param objEzsignfolder 
 */


data class EzsignfolderGetObjectV2ResponseMPayload (

    @Json(name = "objEzsignfolder")
    val objEzsignfolder: EzsignfolderResponseCompound

)
