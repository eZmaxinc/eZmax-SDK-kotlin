/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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

import eZmaxApi.models.AddressMinusRequest
import eZmaxApi.models.ContactMinusRequestCompound

import com.squareup.moshi.Json

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

