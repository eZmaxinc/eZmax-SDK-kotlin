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

import eZmaxApi.models.EzsignsignatureRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /2/object/ezsignsignature
 *
 * @param aObjEzsignsignature 
 */


data class EzsignsignatureCreateObjectV2Request (

    @Json(name = "a_objEzsignsignature")
    val aObjEzsignsignature: kotlin.collections.List<EzsignsignatureRequestCompound>

)

