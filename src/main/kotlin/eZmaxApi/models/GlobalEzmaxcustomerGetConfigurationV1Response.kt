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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/ezmaxcustomer/{pksEzmaxcustomerCode}/getConfiguration
 *
 * @param sInfrastructureregionCode The region code
 * @param sInfrastructureregionCodeWeb The region code
 * @param sInfrastructureenvironmenttypeDescription The environment type Description
 * @param sCognitoClientIDEzmaxpublic The ID of the client in Cognito
 * @param sCognitoClientIDExternal The ID of the client in Cognito
 */


data class GlobalEzmaxcustomerGetConfigurationV1Response (

    /* The region code */
    @Json(name = "sInfrastructureregionCode")
    val sInfrastructureregionCode: kotlin.String,

    /* The region code */
    @Json(name = "sInfrastructureregionCodeWeb")
    val sInfrastructureregionCodeWeb: kotlin.String,

    /* The environment type Description */
    @Json(name = "sInfrastructureenvironmenttypeDescription")
    val sInfrastructureenvironmenttypeDescription: kotlin.String,

    /* The ID of the client in Cognito */
    @Json(name = "sCognitoClientIDEzmaxpublic")
    val sCognitoClientIDEzmaxpublic: kotlin.String,

    /* The ID of the client in Cognito */
    @Json(name = "sCognitoClientIDExternal")
    val sCognitoClientIDExternal: kotlin.String? = null

) {


}

