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

import eZmaxApi.models.UserMinusRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/user
 *
 * @param aObjUser 
 */


data class UserMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "a_objUser")
    val aObjUser: kotlin.collections.List<UserMinusRequestCompound>

)

