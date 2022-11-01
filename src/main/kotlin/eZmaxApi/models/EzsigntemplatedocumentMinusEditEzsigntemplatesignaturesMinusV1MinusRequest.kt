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

import eZmaxApi.models.EzsigntemplatesignatureMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures
 *
 * @param aObjEzsigntemplatesignature 
 */

data class EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest (

    @Json(name = "a_objEzsigntemplatesignature")
    val aObjEzsigntemplatesignature: kotlin.collections.List<EzsigntemplatesignatureMinusRequestCompound>

)

