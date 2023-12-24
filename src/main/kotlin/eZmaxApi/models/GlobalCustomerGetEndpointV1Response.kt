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
 * Response for GET /1/customer/{pksCustomerCode}/endpoint
 *
 * @param sEndpointURL The endpoint's URL
 */


data class GlobalCustomerGetEndpointV1Response (

    /* The endpoint's URL */
    @Json(name = "sEndpointURL")
    val sEndpointURL: kotlin.String

)
