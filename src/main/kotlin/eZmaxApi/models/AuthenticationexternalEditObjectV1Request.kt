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
 * Request for PUT /1/object/authenticationexternal/{pkiAuthenticationexternalID}
 *
 * @param objAuthenticationexternal 
 */


data class AuthenticationexternalEditObjectV1Request (

    @Json(name = "objAuthenticationexternal")
    val objAuthenticationexternal: AuthenticationexternalRequestCompound

) {


}

