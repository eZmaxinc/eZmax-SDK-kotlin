/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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

import eZmaxApi.models.EzsignbulksendMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /2/object/ezsignbulksend/{pkiEzsignbulksendID}
 *
 * @param objEzsignbulksend 
 */

data class EzsignbulksendMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objEzsignbulksend")
    val objEzsignbulksend: EzsignbulksendMinusResponseCompound

)

