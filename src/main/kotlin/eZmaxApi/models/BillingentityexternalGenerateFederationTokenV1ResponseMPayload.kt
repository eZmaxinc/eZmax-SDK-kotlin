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

import eZmaxApi.models.CustomApikeyfederation

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /1/object/billingentityexternal/{pkiBillingentityexternalID}/generateFederationToken
 *
 * @param objApikeyfederation 
 * @param sEzmaxcustomercodeUrl The url of the server the Ezmaxcustomer is located
 */


data class BillingentityexternalGenerateFederationTokenV1ResponseMPayload (

    @Json(name = "objApikeyfederation")
    val objApikeyfederation: CustomApikeyfederation,

    /* The url of the server the Ezmaxcustomer is located */
    @Json(name = "sEzmaxcustomercodeUrl")
    val sEzmaxcustomercodeUrl: kotlin.String

) {


}

