/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.EzsigntemplateformfieldgroupMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocument}/getEzsigntemplateformfieldgroups
 *
 * @param aObjEzsigntemplateformfieldgroup 
 */

data class EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsigntemplateformfieldgroup")
    val aObjEzsigntemplateformfieldgroup: kotlin.collections.List<EzsigntemplateformfieldgroupMinusResponseCompound>

)

