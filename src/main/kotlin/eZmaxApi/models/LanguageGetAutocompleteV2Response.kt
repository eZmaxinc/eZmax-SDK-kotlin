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

import eZmaxApi.models.CommonResponse
import eZmaxApi.models.CommonResponseObjDebug
import eZmaxApi.models.CommonResponseObjDebugPayload
import eZmaxApi.models.LanguageGetAutocompleteV2ResponseMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /2/object/language/getAutocomplete
 *
 * @param objDebugPayload 
 * @param mPayload 
 * @param objDebug 
 */


data class LanguageGetAutocompleteV2Response (

    @Json(name = "objDebugPayload")
    override val objDebugPayload: CommonResponseObjDebugPayload,

    @Json(name = "mPayload")
    val mPayload: LanguageGetAutocompleteV2ResponseMPayload,

    @Json(name = "objDebug")
    override val objDebug: CommonResponseObjDebug? = null

) : CommonResponse {


}

