/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.CustomMinusDropdownElementMinusRequestCompound
import eZmaxApi.models.EzsignformfieldMinusRequestCompound
import eZmaxApi.models.EzsignformfieldgroupsignerMinusRequestCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjEzsignformfieldgroupsigner 
 * @param aObjEzsignformfield 
 * @param aObjDropdownElement 
 */

data class EzsignformfieldgroupRequestCompoundAllOf (

    @Json(name = "a_objEzsignformfieldgroupsigner")
    val aObjEzsignformfieldgroupsigner: kotlin.collections.List<EzsignformfieldgroupsignerMinusRequestCompound>,

    @Json(name = "a_objEzsignformfield")
    val aObjEzsignformfield: kotlin.collections.List<EzsignformfieldMinusRequestCompound>,

    @Json(name = "a_objDropdownElement")
    val aObjDropdownElement: kotlin.collections.List<CustomMinusDropdownElementMinusRequestCompound>? = null

)

