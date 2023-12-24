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

import eZmaxApi.models.CommonResponseObjDebug
import eZmaxApi.models.CommonResponseObjDebugPayload
import eZmaxApi.models.CustomAutocompleteElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/xxx/getAutocomplete
 *
 * @param objDebugPayload 
 * @param mPayload Generic Autocomplete Response
 * @param objDebug 
 */


data class CommonGetAutocompleteV1Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    /* Generic Autocomplete Response */
    @Json(name = "mPayload")
    val mPayload: kotlin.collections.List<CustomAutocompleteElementResponse>,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

)
