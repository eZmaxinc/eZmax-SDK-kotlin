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

import eZmaxApi.models.CustomFormsDataFolderResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsignfolder/{pkiEzsigndocument}/getFormsData
 *
 * @param objFormsDataFolder 
 */


data class EzsignfolderGetFormsDataV1ResponseMPayload (

    @Json(name = "objFormsDataFolder")
    val objFormsDataFolder: CustomFormsDataFolderResponse

) {


}

