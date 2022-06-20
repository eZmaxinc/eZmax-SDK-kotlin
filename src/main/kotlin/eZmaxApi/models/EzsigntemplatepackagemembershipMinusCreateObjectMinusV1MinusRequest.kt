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

import eZmaxApi.models.EzsigntemplatepackagemembershipMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for POST /1/object/ezsigntemplatepackagemembership
 *
 * @param aObjEzsigntemplatepackagemembership 
 */

data class EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "a_objEzsigntemplatepackagemembership")
    val aObjEzsigntemplatepackagemembership: kotlin.collections.List<EzsigntemplatepackagemembershipMinusRequestCompound>

)

