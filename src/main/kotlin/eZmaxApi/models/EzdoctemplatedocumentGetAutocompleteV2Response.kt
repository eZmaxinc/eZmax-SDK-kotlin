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
import eZmaxApi.models.EzdoctemplatedocumentGetAutocompleteV2ResponseMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /2/object/ezdoctemplatedocument/getAutocomplete
 *
 * @param objDebugPayload 
 * @param mPayload 
 * @param objDebug 
 */


data class EzdoctemplatedocumentGetAutocompleteV2Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    @Json(name = "mPayload")
    val mPayload: EzdoctemplatedocumentGetAutocompleteV2ResponseMPayload,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

) {


}

