/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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
import eZmaxApi.models.EzsigntemplateformfieldMinusRequestCompound
import eZmaxApi.models.EzsigntemplateformfieldgroupsignerMinusRequestCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjEzsigntemplateformfieldgroupsigner 
 * @param aObjEzsigntemplateformfield 
 * @param aObjDropdownElement 
 */

data class EzsigntemplateformfieldgroupRequestCompoundAllOf (

    @Json(name = "a_objEzsigntemplateformfieldgroupsigner")
    val aObjEzsigntemplateformfieldgroupsigner: kotlin.collections.List<EzsigntemplateformfieldgroupsignerMinusRequestCompound>,

    @Json(name = "a_objEzsigntemplateformfield")
    val aObjEzsigntemplateformfield: kotlin.collections.List<EzsigntemplateformfieldMinusRequestCompound>,

    @Json(name = "a_objDropdownElement")
    val aObjDropdownElement: kotlin.collections.List<CustomMinusDropdownElementMinusRequestCompound>? = null

)

