/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.ApikeyMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for POST /2/object/apikey
 *
 * @param aObjApikey 
 */

data class ApikeyMinusCreateObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "a_objApikey")
    val aObjApikey: kotlin.collections.List<ApikeyMinusResponseCompound>

)

