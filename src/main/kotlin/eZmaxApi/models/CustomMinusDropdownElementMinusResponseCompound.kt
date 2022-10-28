/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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

import eZmaxApi.models.CustomMinusDropdownElementMinusResponse

import com.squareup.moshi.Json

/**
 * A Generic DropdownElement Object and children to create a complete structure
 *
 * @param sLabel The Description of the element
 * @param sValue The Value of the element
 */

data class CustomMinusDropdownElementMinusResponseCompound (

    /* The Description of the element */
    @Json(name = "sLabel")
    val sLabel: kotlin.String,

    /* The Value of the element */
    @Json(name = "sValue")
    val sValue: kotlin.String

)

