/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.47
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.EzsignfolderMinusResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param objEzsignfolder 
 */

data class WebhookEzsignFolderCompletedAllOf (

    @Json(name = "objEzsignfolder")
    val objEzsignfolder: EzsignfolderMinusResponse

)

