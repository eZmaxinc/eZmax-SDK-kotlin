/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
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

import eZmaxApi.models.EzsignsignatureMinusRequest
import eZmaxApi.models.EzsignsignatureMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsignsignature/createObject API Request
 *
 * @param objEzsignsignature 
 * @param objEzsignsignatureCompound 
 */

data class EzsignsignatureMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "objEzsignsignature")
    val objEzsignsignature: EzsignsignatureMinusRequest? = null,

    @Json(name = "objEzsignsignatureCompound")
    val objEzsignsignatureCompound: EzsignsignatureMinusRequestCompound? = null

)

