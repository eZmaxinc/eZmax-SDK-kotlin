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

import eZmaxApi.models.EzsignformfieldgroupMinusResponseCompound
import eZmaxApi.models.EzsignsignatureMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocumentID}/getCompletedElements
 *
 * @param aObjEzsignsignature 
 * @param aObjEzsignformfieldgroup 
 */


data class EzsigndocumentMinusGetCompletedElementsMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsignsignature")
    val aObjEzsignsignature: kotlin.collections.List<EzsignsignatureMinusResponseCompound>,

    @Json(name = "a_objEzsignformfieldgroup")
    val aObjEzsignformfieldgroup: kotlin.collections.List<EzsignformfieldgroupMinusResponseCompound>

)

