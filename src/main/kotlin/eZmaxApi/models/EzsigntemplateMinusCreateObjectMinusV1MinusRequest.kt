/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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

import eZmaxApi.models.EzsigntemplateMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for POST /1/object/ezsigntemplate
 *
 * @param aObjEzsigntemplate 
 */

data class EzsigntemplateMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "a_objEzsigntemplate")
    val aObjEzsigntemplate: kotlin.collections.List<EzsigntemplateMinusRequestCompound>

)

