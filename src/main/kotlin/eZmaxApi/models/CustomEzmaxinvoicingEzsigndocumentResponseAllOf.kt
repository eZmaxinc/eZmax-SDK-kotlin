/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * 
 *
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param sName 
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 * @param bEzsignfolderAllowed 
 */

data class CustomEzmaxinvoicingEzsigndocumentResponseAllOf (

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

    @Json(name = "bEzsignfolderAllowed")
    val bEzsignfolderAllowed: kotlin.Boolean

)
