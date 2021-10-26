/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.2
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

import eZmaxApi.models.EzsignfoldersignerassociationMinusRequest
import eZmaxApi.models.EzsignfoldersignerassociationMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsignfoldersignerassociation/createObject API Request
 *
 * @param objEzsignfoldersignerassociation 
 * @param objEzsignfoldersignerassociationCompound 
 */

data class EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest (

    @Json(name = "objEzsignfoldersignerassociation")
    val objEzsignfoldersignerassociation: EzsignfoldersignerassociationMinusRequest? = null,

    @Json(name = "objEzsignfoldersignerassociationCompound")
    val objEzsignfoldersignerassociationCompound: EzsignfoldersignerassociationMinusRequestCompound? = null

)

