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

import eZmaxApi.models.CustomMinusDropdownElementMinusResponseCompound
import eZmaxApi.models.EzsigntemplateformfieldMinusResponseCompound
import eZmaxApi.models.EzsigntemplateformfieldgroupsignerMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param aObjEzsigntemplateformfieldgroupsigner 
 * @param aObjEzsigntemplateformfield 
 * @param aObjDropdownElement 
 */


data class EzsigntemplateformfieldgroupResponseCompoundAllOf (

    @Json(name = "a_objEzsigntemplateformfieldgroupsigner")
    val aObjEzsigntemplateformfieldgroupsigner: kotlin.collections.List<EzsigntemplateformfieldgroupsignerMinusResponseCompound>,

    @Json(name = "a_objEzsigntemplateformfield")
    val aObjEzsigntemplateformfield: kotlin.collections.List<EzsigntemplateformfieldMinusResponseCompound>,

    @Json(name = "a_objDropdownElement")
    val aObjDropdownElement: kotlin.collections.List<CustomMinusDropdownElementMinusResponseCompound>? = null

)

