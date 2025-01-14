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

import eZmaxApi.models.FieldEAuthenticationexternalType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Authenticationexternal List Element
 *
 * @param pkiAuthenticationexternalID The unique ID of the Authenticationexternal
 * @param sAuthenticationexternalDescription The description of the Authenticationexternal
 * @param eAuthenticationexternalType 
 * @param bAuthenticationexternalConnected Whether the Authenticationexternal has been connected or not
 */


data class AuthenticationexternalListElement (

    /* The unique ID of the Authenticationexternal */
    @Json(name = "pkiAuthenticationexternalID")
    val pkiAuthenticationexternalID: kotlin.Int,

    /* The description of the Authenticationexternal */
    @Json(name = "sAuthenticationexternalDescription")
    val sAuthenticationexternalDescription: kotlin.String,

    @Json(name = "eAuthenticationexternalType")
    val eAuthenticationexternalType: FieldEAuthenticationexternalType,

    /* Whether the Authenticationexternal has been connected or not */
    @Json(name = "bAuthenticationexternalConnected")
    val bAuthenticationexternalConnected: kotlin.Boolean

) {


}

