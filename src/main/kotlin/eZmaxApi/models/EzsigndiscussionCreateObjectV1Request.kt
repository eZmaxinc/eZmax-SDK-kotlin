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

import eZmaxApi.models.EzsigndiscussionRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/ezsigndiscussion
 *
 * @param aObjEzsigndiscussion 
 */


data class EzsigndiscussionCreateObjectV1Request (

    @Json(name = "a_objEzsigndiscussion")
    val aObjEzsigndiscussion: kotlin.collections.List<EzsigndiscussionRequestCompound>

) {


}

