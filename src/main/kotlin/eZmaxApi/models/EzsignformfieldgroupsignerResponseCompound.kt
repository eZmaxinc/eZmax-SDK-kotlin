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
import com.squareup.moshi.JsonClass

/**
 * An Ezsignformfieldgroupsigner Object and children to create a complete structure
 *
 * @param pkiEzsignformfieldgroupsignerID The unique ID of the Ezsignformfieldgroupsigner
 * @param fkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 */


data class EzsignformfieldgroupsignerResponseCompound (

    /* The unique ID of the Ezsignformfieldgroupsigner */
    @Json(name = "pkiEzsignformfieldgroupsignerID")
    val pkiEzsignformfieldgroupsignerID: kotlin.Int,

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationID")
    val fkiEzsignfoldersignerassociationID: kotlin.Int

) {


}

