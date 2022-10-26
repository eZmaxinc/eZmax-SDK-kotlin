/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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

import eZmaxApi.models.EzsignpageMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsignpages
 *
 * @param aObjEzsignpage 
 */

data class EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsignpage")
    val aObjEzsignpage: kotlin.collections.List<EzsignpageMinusResponseCompound>

)

