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

import eZmaxApi.models.EzsigndocumentMinusRequest
import eZmaxApi.models.EzsigndocumentMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for POST /1/object/ezsigndocument
 *
 * @param objEzsigndocument 
 * @param objEzsigndocumentCompound 
 */

data class EzsigndocumentMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "objEzsigndocument")
    val objEzsigndocument: EzsigndocumentMinusRequest? = null,

    @Json(name = "objEzsigndocumentCompound")
    val objEzsigndocumentCompound: EzsigndocumentMinusRequestCompound? = null

)

