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
import eZmaxApi.models.EzsigntemplatesignatureGetObjectV2ResponseMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}
 *
 * @param objDebugPayload 
 * @param mPayload 
 * @param objDebug 
 */


data class EzsigntemplatesignatureGetObjectV2Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    @Json(name = "mPayload")
    val mPayload: EzsigntemplatesignatureGetObjectV2ResponseMPayload,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

)
