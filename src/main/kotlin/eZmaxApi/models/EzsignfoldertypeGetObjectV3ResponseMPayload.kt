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

import eZmaxApi.models.EzsignfoldertypeResponseCompoundV3

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /3/object/ezsignfoldertype/{pkiEzsignfoldertypeID}
 *
 * @param objEzsignfoldertype 
 */


data class EzsignfoldertypeGetObjectV3ResponseMPayload (

    @Json(name = "objEzsignfoldertype")
    val objEzsignfoldertype: EzsignfoldertypeResponseCompoundV3

)

