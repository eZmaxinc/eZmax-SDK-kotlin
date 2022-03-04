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

import eZmaxApi.models.FranchisereferalincomeMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /2/object/franchisereferalincome/createObject API Request
 *
 * @param aObjFranchisereferalincome 
 */

data class FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest (

    @Json(name = "a_objFranchisereferalincome")
    val aObjFranchisereferalincome: kotlin.collections.List<FranchisereferalincomeMinusRequestCompound>

)

