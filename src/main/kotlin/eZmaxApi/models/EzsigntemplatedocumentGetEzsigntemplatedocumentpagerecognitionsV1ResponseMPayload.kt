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

import eZmaxApi.models.EzsigntemplatedocumentpagerecognitionResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocument}/getEzsigntemplatedocumentpagerecognitions
 *
 * @param aObjEzsigntemplatedocumentpagerecognition 
 */


data class EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1ResponseMPayload (

    @Json(name = "a_objEzsigntemplatedocumentpagerecognition")
    val aObjEzsigntemplatedocumentpagerecognition: kotlin.collections.List<EzsigntemplatedocumentpagerecognitionResponseCompound>

) {


}

