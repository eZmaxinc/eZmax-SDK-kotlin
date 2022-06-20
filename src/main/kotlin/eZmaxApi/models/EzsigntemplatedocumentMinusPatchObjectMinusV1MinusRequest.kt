/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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

import eZmaxApi.models.EzsigntemplatedocumentMinusRequestPatch

import com.squareup.moshi.Json

/**
 * Request for PATCH /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}
 *
 * @param objEzsigntemplatedocument 
 */

data class EzsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest (

    @Json(name = "objEzsigntemplatedocument")
    val objEzsigntemplatedocument: EzsigntemplatedocumentMinusRequestPatch

)

