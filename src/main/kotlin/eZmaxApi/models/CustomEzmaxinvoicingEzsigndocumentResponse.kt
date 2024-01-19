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
 * An EzmaxinvoicingEzsigndocument object containing information about the Ezmaxinvoicing for an Ezsigndocument
 *
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param sName 
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 * @param bEzsignfolderAllowed Whether you have access to the Ezsignfolder or not
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 */


data class CustomEzmaxinvoicingEzsigndocumentResponse (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    @Json(name = "sName")
    val sName: kotlin.String,

    /* The description of the Ezsignfolder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    /* The name of the document that will be presented to Ezsignfoldersignerassociations */
    @Json(name = "sEzsigndocumentName")
    val sEzsigndocumentName: kotlin.String,

    /* Whether you have access to the Ezsignfolder or not */
    @Json(name = "bEzsignfolderAllowed")
    val bEzsignfolderAllowed: kotlin.Boolean,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int? = null

)

