/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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

import eZmaxApi.models.EzsigntemplatepackagemembershipMinusResponseCompound
import eZmaxApi.models.EzsigntemplatepackagesignerMinusResponseCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjEzsigntemplatepackagesigner 
 * @param aObjEzsigntemplatepackagemembership 
 */

data class EzsigntemplatepackageResponseCompoundAllOf (

    @Json(name = "a_objEzsigntemplatepackagesigner")
    val aObjEzsigntemplatepackagesigner: kotlin.collections.List<EzsigntemplatepackagesignerMinusResponseCompound>,

    @Json(name = "a_objEzsigntemplatepackagemembership")
    val aObjEzsigntemplatepackagemembership: kotlin.collections.List<EzsigntemplatepackagemembershipMinusResponseCompound>

)

