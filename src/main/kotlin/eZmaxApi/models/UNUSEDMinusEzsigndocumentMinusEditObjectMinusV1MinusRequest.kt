/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.48
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

import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsigndocument/editObject API Request
 *
 * @param objEzsigndocument 
 */

data class UNUSEDMinusEzsigndocumentMinusEditObjectMinusV1MinusRequest (

    @Json(name = "objEzsigndocument")
    val objEzsigndocument: EzsigndocumentMinusRequest? = null

)
