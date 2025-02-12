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
import eZmaxApi.models.EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID}
 *
 * @param objDebugPayload 
 * @param mPayload 
 * @param objDebug 
 */


data class EzsignbulksenddocumentmappingGetObjectV2Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    @Json(name = "mPayload")
    val mPayload: EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

) {


}

