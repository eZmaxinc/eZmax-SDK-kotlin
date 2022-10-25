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

import eZmaxApi.models.EzsigntemplateMinusResponseCompound
import eZmaxApi.models.EzsigntemplatepackageMinusResponseCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param objEzsigntemplate 
 * @param objEzsigntemplatepackage 
 */

data class EzsignbulksenddocumentmappingResponseCompoundAllOf (

    @Json(name = "objEzsigntemplate")
    val objEzsigntemplate: EzsigntemplateMinusResponseCompound? = null,

    @Json(name = "objEzsigntemplatepackage")
    val objEzsigntemplatepackage: EzsigntemplatepackageMinusResponseCompound? = null

)

