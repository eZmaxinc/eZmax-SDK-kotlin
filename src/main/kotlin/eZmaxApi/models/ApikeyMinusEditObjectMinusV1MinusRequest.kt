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

import eZmaxApi.models.ApikeyMinusRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PUT /1/object/apikey/{pkiApikeyID}
 *
 * @param objApikey 
 */


data class ApikeyMinusEditObjectMinusV1MinusRequest (

    @Json(name = "objApikey")
    val objApikey: ApikeyMinusRequestCompound

)

