/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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


import com.squareup.moshi.Json

/**
 * Request for POST /1/object/ezsigntemplate/{pkiEzsigntemplateID}/copy
 *
 * @param aFkiEzsignfoldertypeID 
 */

data class EzsigntemplateMinusCopyMinusV1MinusRequest (

    @Json(name = "a_fkiEzsignfoldertypeID")
    val aFkiEzsignfoldertypeID: kotlin.collections.List<kotlin.Int>

)

