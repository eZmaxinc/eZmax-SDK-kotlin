/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
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


import com.squareup.moshi.Json

/**
 * An Ezsignformfield Object
 *
 * @param sEzsignformfieldLabel The Label for the Ezsignformfield
 * @param sEzsignformfieldValue The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio
 */

data class CustomMinusFormDataEzsignformfieldMinusResponse (

    /* The Label for the Ezsignformfield */
    @Json(name = "sEzsignformfieldLabel")
    val sEzsignformfieldLabel: kotlin.String,

    /* The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio */
    @Json(name = "sEzsignformfieldValue")
    val sEzsignformfieldValue: kotlin.String

)

