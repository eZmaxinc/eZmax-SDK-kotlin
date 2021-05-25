/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.43
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * Generic Error Message
 * @param sErrorMessage More detail about the error
 * @param eErrorCode The error code. See documentation for valid values
 */

data class CommonMinusResponseMinusError (
    /* More detail about the error */
    @Json(name = "sErrorMessage")
    val sErrorMessage: kotlin.String,
    /* The error code. See documentation for valid values */
    @Json(name = "eErrorCode")
    val eErrorCode: kotlin.String? = null
)

