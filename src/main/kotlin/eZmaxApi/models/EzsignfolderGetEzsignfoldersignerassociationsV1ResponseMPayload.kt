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

import eZmaxApi.models.CustomEzsignfoldersignerassociationActionableElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsignfolder/{pkiEzsignfolder}/getEzsignfoldersignerassociations
 *
 * @param aObjEzsignfoldersignerassociation 
 */


data class EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload (

    @Json(name = "a_objEzsignfoldersignerassociation")
    val aObjEzsignfoldersignerassociation: kotlin.collections.List<CustomEzsignfoldersignerassociationActionableElementResponse>

) {


}

