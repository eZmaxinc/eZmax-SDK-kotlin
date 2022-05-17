/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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

import eZmaxApi.models.EzsigntemplateformfieldgroupMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplateformfieldgroups
 *
 * @param aObjEzsigntemplateformfieldgroup 
 */

data class EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest (

    @Json(name = "a_objEzsigntemplateformfieldgroup")
    val aObjEzsigntemplateformfieldgroup: kotlin.collections.List<EzsigntemplateformfieldgroupMinusRequestCompound>

)

