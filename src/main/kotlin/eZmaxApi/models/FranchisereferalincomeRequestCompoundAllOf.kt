/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.AddressMinusRequest
import eZmaxApi.models.ContactMinusRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param aObjContact 
 * @param objAddress 
 */


data class FranchisereferalincomeRequestCompoundAllOf (

    @Json(name = "a_objContact")
    val aObjContact: kotlin.collections.List<ContactMinusRequestCompound>,

    @Json(name = "objAddress")
    val objAddress: AddressMinusRequest? = null

)

