/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
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

import eZmaxApi.models.ApikeyMinusRequest
import eZmaxApi.models.ApikeyMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/apikey/createObject API Request
 *
 * @param objApikey 
 * @param objApikeyCompound 
 */

data class ApikeyMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "objApikey")
    val objApikey: ApikeyMinusRequest? = null,

    @Json(name = "objApikeyCompound")
    val objApikeyCompound: ApikeyMinusRequestCompound? = null

)

