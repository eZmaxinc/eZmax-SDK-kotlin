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

import eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /2/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}
 *
 * @param objEzsignfoldersignerassociation 
 */


data class EzsignfoldersignerassociationMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objEzsignfoldersignerassociation")
    val objEzsignfoldersignerassociation: EzsignfoldersignerassociationMinusResponseCompound

)

