/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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

import eZmaxApi.models.EzsigntemplatepackageMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for POST /1/object/ezsigntemplatepackage
 *
 * @param aObjEzsigntemplatepackage 
 */

data class EzsigntemplatepackageMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "a_objEzsigntemplatepackage")
    val aObjEzsigntemplatepackage: kotlin.collections.List<EzsigntemplatepackageMinusRequestCompound>

)

