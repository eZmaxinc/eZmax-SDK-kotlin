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

import eZmaxApi.models.EzsigntemplatepackagemembershipRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/ezsigntemplatepackagemembership
 *
 * @param aObjEzsigntemplatepackagemembership 
 */


data class EzsigntemplatepackagemembershipCreateObjectV1Request (

    @Json(name = "a_objEzsigntemplatepackagemembership")
    val aObjEzsigntemplatepackagemembership: kotlin.collections.List<EzsigntemplatepackagemembershipRequestCompound>

) {


}

