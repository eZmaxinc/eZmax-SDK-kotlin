/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
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

import eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload

import com.squareup.moshi.Json

/**
 * 
 *
 * @param mPayload 
 */

data class EzsignsignatureCreateObjectV1ResponseAllOf (

    @Json(name = "mPayload")
    val mPayload: EzsignsignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload

)

