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

import eZmaxApi.models.EzsigntemplatedocumentpageResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpages
 *
 * @param aObjEzsigntemplatedocumentpage 
 */


data class EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload (

    @Json(name = "a_objEzsigntemplatedocumentpage")
    val aObjEzsigntemplatedocumentpage: kotlin.collections.List<EzsigntemplatedocumentpageResponseCompound>

) {


}

