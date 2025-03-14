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

import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEAuthenticationexternalType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Authenticationexternal Object
 *
 * @param pkiAuthenticationexternalID The unique ID of the Authenticationexternal
 * @param sAuthenticationexternalDescription The description of the Authenticationexternal
 * @param eAuthenticationexternalType 
 * @param objAudit 
 * @param bAuthenticationexternalConnected Whether the Authenticationexternal has been connected or not
 * @param sAuthenticationexternalAuthorizationurl The url to authorize the Authenticationexternal
 */


data class AuthenticationexternalResponse (

    /* The unique ID of the Authenticationexternal */
    @Json(name = "pkiAuthenticationexternalID")
    val pkiAuthenticationexternalID: kotlin.Int,

    /* The description of the Authenticationexternal */
    @Json(name = "sAuthenticationexternalDescription")
    val sAuthenticationexternalDescription: kotlin.String,

    @Json(name = "eAuthenticationexternalType")
    val eAuthenticationexternalType: FieldEAuthenticationexternalType,

    @Json(name = "objAudit")
    val objAudit: CommonAudit,

    /* Whether the Authenticationexternal has been connected or not */
    @Json(name = "bAuthenticationexternalConnected")
    val bAuthenticationexternalConnected: kotlin.Boolean? = null,

    /* The url to authorize the Authenticationexternal */
    @Json(name = "sAuthenticationexternalAuthorizationurl")
    val sAuthenticationexternalAuthorizationurl: kotlin.String? = null

) {


}

