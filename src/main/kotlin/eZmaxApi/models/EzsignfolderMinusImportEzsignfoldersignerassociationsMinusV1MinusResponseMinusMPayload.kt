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


import com.squareup.moshi.Json

/**
 * Payload for POST /1/object/ezsignfolder/{pkiEzsignfolder}/importEzsignfoldersignerassociations
 *
 * @param aPkiEzsignfoldersignerassociationID 
 */


data class EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_pkiEzsignfoldersignerassociationID")
    val aPkiEzsignfoldersignerassociationID: kotlin.collections.List<kotlin.Int>

)

