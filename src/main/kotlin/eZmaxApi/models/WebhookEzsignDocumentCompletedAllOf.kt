/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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

import eZmaxApi.models.EzsigndocumentMinusResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param objEzsigndocument 
 */

data class WebhookEzsignDocumentCompletedAllOf (

    @Json(name = "objEzsigndocument")
    val objEzsigndocument: EzsigndocumentMinusResponse

)

