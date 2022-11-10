/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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

import eZmaxApi.models.EzsignfolderMinusRequest
import eZmaxApi.models.EzsignfolderMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for POST /1/object/ezsignfolder
 *
 * @param objEzsignfolder 
 * @param objEzsignfolderCompound 
 */

data class EzsignfolderMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "objEzsignfolder")
    val objEzsignfolder: EzsignfolderMinusRequest? = null,

    @Json(name = "objEzsignfolderCompound")
    val objEzsignfolderCompound: EzsignfolderMinusRequestCompound? = null

)

