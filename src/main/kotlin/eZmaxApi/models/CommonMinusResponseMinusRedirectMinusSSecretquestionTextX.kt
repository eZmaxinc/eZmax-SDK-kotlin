/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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


import com.squareup.moshi.Json

/**
 * 352 Redirect Message containing secret question
 *
 * @param sSecretquestionTextX The text of the Secretquestion in the language of the requester
 */

data class CommonMinusResponseMinusRedirectMinusSSecretquestionTextX (

    /* The text of the Secretquestion in the language of the requester */
    @Json(name = "sSecretquestionTextX")
    val sSecretquestionTextX: kotlin.String

)

