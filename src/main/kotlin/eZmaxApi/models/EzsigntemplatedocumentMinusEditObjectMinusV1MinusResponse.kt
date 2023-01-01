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

import eZmaxApi.models.CommonMinusResponseMinusObjDebug
import eZmaxApi.models.CommonMinusResponseMinusObjDebugPayload
import eZmaxApi.models.CommonMinusResponseMinusWarning

import com.squareup.moshi.Json

/**
 * Response for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}
 *
 * @param objDebugPayload 
 * @param objDebug 
 * @param aObjWarning 
 */


data class EzsigntemplatedocumentMinusEditObjectMinusV1MinusResponse (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayload? = null,

    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null,

    @Json(name = "a_objWarning")
    val aObjWarning: kotlin.collections.List<CommonMinusResponseMinusWarning>? = null

)

