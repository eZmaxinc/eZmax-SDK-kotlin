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

import eZmaxApi.models.EzsigntemplatepackagesignermembershipRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/ezsigntemplatepackagesignermembership
 *
 * @param aObjEzsigntemplatepackagesignermembership 
 */


data class EzsigntemplatepackagesignermembershipCreateObjectV1Request (

    @Json(name = "a_objEzsigntemplatepackagesignermembership")
    val aObjEzsigntemplatepackagesignermembership: kotlin.collections.List<EzsigntemplatepackagesignermembershipRequestCompound>

) {


}

