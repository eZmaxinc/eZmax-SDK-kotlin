/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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

import eZmaxApi.models.FranchisereferalincomeMinusRequest
import eZmaxApi.models.FranchisereferalincomeMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for POST /1/object/franchisereferalincome
 *
 * @param objFranchisereferalincome 
 * @param objFranchisereferalincomeCompound 
 */

data class FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "objFranchisereferalincome")
    val objFranchisereferalincome: FranchisereferalincomeMinusRequest? = null,

    @Json(name = "objFranchisereferalincomeCompound")
    val objFranchisereferalincomeCompound: FranchisereferalincomeMinusRequestCompound? = null

)

