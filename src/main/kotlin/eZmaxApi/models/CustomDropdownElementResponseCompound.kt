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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Generic DropdownElement Object and children to create a complete structure
 *
 * @param sLabel The Description of the element
 * @param sValue The Value of the element
 */


data class CustomDropdownElementResponseCompound (

    /* The Description of the element */
    @Json(name = "sLabel")
    val sLabel: kotlin.String,

    /* The Value of the element */
    @Json(name = "sValue")
    val sValue: kotlin.String

)

