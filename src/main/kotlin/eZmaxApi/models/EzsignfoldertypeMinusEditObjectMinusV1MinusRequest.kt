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

import eZmaxApi.models.EzsignfoldertypeMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for PUT /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID}
 *
 * @param objEzsignfoldertype 
 */


data class EzsignfoldertypeMinusEditObjectMinusV1MinusRequest (

    @Json(name = "objEzsignfoldertype")
    val objEzsignfoldertype: EzsignfoldertypeMinusRequestCompound

)

