/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.47
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
 * Response for the /1/customer/{pksCustomerCode}/endpoint API Request
 *
 * @param sEndpointURL The endpoint's URL
 */

data class GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse (

    /* The endpoint's URL */
    @Json(name = "sEndpointURL")
    val sEndpointURL: kotlin.String

)

