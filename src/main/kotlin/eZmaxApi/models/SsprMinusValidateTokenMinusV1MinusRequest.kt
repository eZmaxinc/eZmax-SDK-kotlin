/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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

import eZmaxApi.models.FieldMinusEUserTypeSSPR

import com.squareup.moshi.Json

/**
 * Request for the /1/module/sspr/validateToken API Request
 *
 * @param pksCustomerCode The customer code assigned to your account
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param eUserTypeSSPR 
 * @param binUserSSPRtoken Hex Encoded Secret SSPR token
 * @param sEmailAddress The email address.
 * @param sUserLoginname The Login name of the User.
 */

data class SsprMinusValidateTokenMinusV1MinusRequest (

    /* The customer code assigned to your account */
    @Json(name = "pksCustomerCode")
    val pksCustomerCode: kotlin.String,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    @Json(name = "eUserTypeSSPR")
    val eUserTypeSSPR: FieldMinusEUserTypeSSPR,

    /* Hex Encoded Secret SSPR token */
    @Json(name = "binUserSSPRtoken")
    val binUserSSPRtoken: kotlin.String,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String? = null,

    /* The Login name of the User. */
    @Json(name = "sUserLoginname")
    val sUserLoginname: kotlin.String? = null

)

