/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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

import eZmaxApi.models.EzsignformfieldgroupMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}
 *
 * @param objEzsignformfieldgroup 
 */

data class EzsignformfieldgroupMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objEzsignformfieldgroup")
    val objEzsignformfieldgroup: EzsignformfieldgroupMinusResponseCompound

)

