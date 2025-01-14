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
 * An Ezsignformfield Object
 *
 * @param sEzsignformfieldLabel The Label for the Ezsignformfield
 * @param sEzsignformfieldValue The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio
 */


data class CustomFormDataEzsignformfieldResponse (

    /* The Label for the Ezsignformfield */
    @Json(name = "sEzsignformfieldLabel")
    val sEzsignformfieldLabel: kotlin.String,

    /* The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio */
    @Json(name = "sEzsignformfieldValue")
    val sEzsignformfieldValue: kotlin.String

) {


}

