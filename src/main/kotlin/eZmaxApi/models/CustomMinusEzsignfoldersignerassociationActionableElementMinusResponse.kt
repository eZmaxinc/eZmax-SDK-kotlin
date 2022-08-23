/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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

import eZmaxApi.models.CustomEzsignfoldersignerassociationActionableElementResponseAllOf
import eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompound
import eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompoundMinusUser
import eZmaxApi.models.EzsignsignerMinusResponseCompound

import com.squareup.moshi.Json

/**
 * A Ezsignfoldersignerassociation Object with actionable elements
 *
 * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param bEzsignfoldersignerassociationReceivecopy If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
 * @param tEzsignfoldersignerassociationMessage A custom text message that will be added to the email sent.
 * @param bEzsignfoldersignerassociationHasactionableelementsCurrent Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step
 * @param objUser 
 * @param objEzsignsigner 
 * @param bEzsignfoldersignerassociationHasactionableelementsFuture Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step
 */

data class CustomMinusEzsignfoldersignerassociationActionableElementMinusResponse (

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "pkiEzsignfoldersignerassociationID")
    val pkiEzsignfoldersignerassociationID: kotlin.Int,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document. */
    @Json(name = "bEzsignfoldersignerassociationReceivecopy")
    val bEzsignfoldersignerassociationReceivecopy: kotlin.Boolean,

    /* A custom text message that will be added to the email sent. */
    @Json(name = "tEzsignfoldersignerassociationMessage")
    val tEzsignfoldersignerassociationMessage: kotlin.String,

    /* Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step */
    @Json(name = "bEzsignfoldersignerassociationHasactionableelementsCurrent")
    val bEzsignfoldersignerassociationHasactionableelementsCurrent: kotlin.Boolean,

    @Json(name = "objUser")
    val objUser: EzsignfoldersignerassociationMinusResponseCompoundMinusUser? = null,

    @Json(name = "objEzsignsigner")
    val objEzsignsigner: EzsignsignerMinusResponseCompound? = null,

    /* Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step */
    @Json(name = "bEzsignfoldersignerassociationHasactionableelementsFuture")
    val bEzsignfoldersignerassociationHasactionableelementsFuture: kotlin.Boolean? = null

)

