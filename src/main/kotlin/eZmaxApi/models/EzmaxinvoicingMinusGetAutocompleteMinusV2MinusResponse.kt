/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.CommonMinusResponse
import eZmaxApi.models.CommonMinusResponseMinusObjDebug
import eZmaxApi.models.CommonMinusResponseMinusObjDebugPayload
import eZmaxApi.models.EzmaxinvoicingGetAutocompleteV2ResponseAllOf
import eZmaxApi.models.EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponseMinusMPayload

import com.squareup.moshi.Json

/**
 * Response for GET /2/object/ezmaxinvoicing/getAutocomplete
 *
 * @param mPayload 
 * @param objDebugPayload 
 * @param objDebug 
 */

data class EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse (

    @Json(name = "mPayload")
    val mPayload: EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponseMinusMPayload,

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayload? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null

)
