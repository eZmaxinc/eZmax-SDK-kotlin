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

import eZmaxApi.models.AuthenticationexternalRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/authenticationexternal
 *
 * @param aObjAuthenticationexternal 
 */


data class AuthenticationexternalCreateObjectV1Request (

    @Json(name = "a_objAuthenticationexternal")
    val aObjAuthenticationexternal: kotlin.collections.List<AuthenticationexternalRequestCompound>

) {


}

