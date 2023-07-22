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

import eZmaxApi.models.CustomMinusEzsignformfielderrorMinusResponse
import eZmaxApi.models.FieldMinusEErrorCode

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Generic Error Message
 *
 * @param sErrorMessage The message giving details about the error
 * @param eErrorCode 
 */


data class CommonMinusResponseMinusErrorMinusEzsignformValidation (

    /* The message giving details about the error */
    @Json(name = "sErrorMessage")
    val sErrorMessage: kotlin.String,

    @Json(name = "eErrorCode")
    val eErrorCode: FieldMinusEErrorCode

)

