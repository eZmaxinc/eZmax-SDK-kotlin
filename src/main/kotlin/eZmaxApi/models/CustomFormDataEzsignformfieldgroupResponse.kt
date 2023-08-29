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

import eZmaxApi.models.CustomFormDataEzsignformfieldResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An FormDataSigner->Ezsignformfieldgroup Object and children to create a complete structure
 *
 * @param sEzsignformfieldgroupLabel The Label for the Ezsignformfieldgroup
 * @param aObjEzsignformfield 
 */


data class CustomFormDataEzsignformfieldgroupResponse (

    /* The Label for the Ezsignformfieldgroup */
    @Json(name = "sEzsignformfieldgroupLabel")
    val sEzsignformfieldgroupLabel: kotlin.String,

    @Json(name = "a_objEzsignformfield")
    val aObjEzsignformfield: kotlin.collections.List<CustomFormDataEzsignformfieldResponse>

)

