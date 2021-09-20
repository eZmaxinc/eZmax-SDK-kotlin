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

import eZmaxApi.models.CommonGetAutocompleteV1ResponseAllOf
import eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponseMinusMPayload
import eZmaxApi.models.CommonMinusResponse
import eZmaxApi.models.CommonMinusResponseMinusObjDebug
import eZmaxApi.models.CommonMinusResponseMinusObjDebugPayload

import com.squareup.moshi.Json

/**
 * Response for the /1/object/xxx/getAutocomplete API Request
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */

data class CommonMinusGetAutocompleteMinusV1MinusResponse (

    @Json(name = "mPayload")
    val mPayload: kotlin.collections.List<CommonMinusGetAutocompleteMinusV1MinusResponseMinusMPayload>,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayload? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)

