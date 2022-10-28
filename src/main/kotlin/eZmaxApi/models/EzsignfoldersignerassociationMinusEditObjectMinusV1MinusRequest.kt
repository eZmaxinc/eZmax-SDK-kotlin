/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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

import eZmaxApi.models.EzsignfoldersignerassociationMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for PUT /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}
 *
 * @param objEzsignfoldersignerassociation 
 */

data class EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest (

    @Json(name = "objEzsignfoldersignerassociation")
    val objEzsignfoldersignerassociation: EzsignfoldersignerassociationMinusRequestCompound

)

