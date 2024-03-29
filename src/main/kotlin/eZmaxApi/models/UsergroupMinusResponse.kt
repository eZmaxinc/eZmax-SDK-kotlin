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

import eZmaxApi.models.MultilingualMinusUsergroupName

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Usergroup Object
 *
 * @param pkiUsergroupID The unique ID of the Usergroup
 * @param objUsergroupName 
 */


data class UsergroupMinusResponse (

    /* The unique ID of the Usergroup */
    @Json(name = "pkiUsergroupID")
    val pkiUsergroupID: kotlin.Int,

    @Json(name = "objUsergroupName")
    val objUsergroupName: MultilingualMinusUsergroupName

)

