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

import eZmaxApi.models.EzsignfolderResponseCompoundV3

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /3/object/ezsignfolder/{pkiEzsignfolderID}
 *
 * @param objEzsignfolder 
 */


data class EzsignfolderGetObjectV3ResponseMPayload (

    @Json(name = "objEzsignfolder")
    val objEzsignfolder: EzsignfolderResponseCompoundV3

) {


}

