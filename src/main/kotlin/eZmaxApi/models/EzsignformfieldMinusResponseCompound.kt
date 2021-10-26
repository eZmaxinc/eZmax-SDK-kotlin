/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.2
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

import eZmaxApi.models.EzsignformfieldMinusResponse

import com.squareup.moshi.Json

/**
 * An Ezsignformfield Object and children to create a complete structure
 *
 * @param sEzsignformfieldLabel The Label for the Ezsignformfield
 * @param sEzsignformfieldValue The Value for the Ezsignformfield
 */

data class EzsignformfieldMinusResponseCompound (

    /* The Label for the Ezsignformfield */
    @Json(name = "sEzsignformfieldLabel")
    val sEzsignformfieldLabel: kotlin.String,

    /* The Value for the Ezsignformfield */
    @Json(name = "sEzsignformfieldValue")
    val sEzsignformfieldValue: kotlin.String

)

