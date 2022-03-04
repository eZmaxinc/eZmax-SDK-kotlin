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

import eZmaxApi.models.EzsignformfieldgroupMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsignformfieldgroups API Request
 *
 * @param aObjEzsignformfieldgroup 
 */

data class EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsignformfieldgroup")
    val aObjEzsignformfieldgroup: kotlin.collections.List<EzsignformfieldgroupMinusResponseCompound>? = null

)

