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

import eZmaxApi.models.CustomMinusDropdownElementMinusResponseCompound
import eZmaxApi.models.EzsignformfieldMinusResponseCompound
import eZmaxApi.models.EzsignformfieldgroupsignerMinusResponseCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjEzsignformfield 
 * @param aObjEzsignformfieldgroupsigner 
 * @param aObjDropdownElement 
 */

data class EzsignformfieldgroupResponseCompoundAllOf (

    @Json(name = "a_objEzsignformfield")
    val aObjEzsignformfield: kotlin.collections.List<EzsignformfieldMinusResponseCompound>,

    @Json(name = "a_objEzsignformfieldgroupsigner")
    val aObjEzsignformfieldgroupsigner: kotlin.collections.List<EzsignformfieldgroupsignerMinusResponseCompound>,

    @Json(name = "a_objDropdownElement")
    val aObjDropdownElement: kotlin.collections.List<CustomMinusDropdownElementMinusResponseCompound>? = null

)

