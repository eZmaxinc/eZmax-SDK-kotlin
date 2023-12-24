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

import eZmaxApi.models.EzsignfoldersignerassociationResponseCompoundUser
import eZmaxApi.models.EzsignsignerResponseCompound
import eZmaxApi.models.EzsignsignergroupResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsignfoldersignerassociation Object with actionable elements
 *
 * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param bEzsignfoldersignerassociationDelayedsend If this flag is true the signatory is part of a delayed send.
 * @param bEzsignfoldersignerassociationReceivecopy If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
 * @param tEzsignfoldersignerassociationMessage A custom text message that will be added to the email sent.
 * @param bEzsignfoldersignerassociationHasactionableelementsCurrent Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step
 * @param bEzsignfoldersignerassociationHasactionableelementsFuture Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step
 * @param objEzsignsignergroup 
 * @param objUser 
 * @param objEzsignsigner 
 */


data class CustomEzsignfoldersignerassociationActionableElementResponse (

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "pkiEzsignfoldersignerassociationID")
    val pkiEzsignfoldersignerassociationID: kotlin.Int,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* If this flag is true the signatory is part of a delayed send. */
    @Json(name = "bEzsignfoldersignerassociationDelayedsend")
    val bEzsignfoldersignerassociationDelayedsend: kotlin.Boolean,

    /* If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document. */
    @Json(name = "bEzsignfoldersignerassociationReceivecopy")
    val bEzsignfoldersignerassociationReceivecopy: kotlin.Boolean,

    /* A custom text message that will be added to the email sent. */
    @Json(name = "tEzsignfoldersignerassociationMessage")
    val tEzsignfoldersignerassociationMessage: kotlin.String,

    /* Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step */
    @Json(name = "bEzsignfoldersignerassociationHasactionableelementsCurrent")
    val bEzsignfoldersignerassociationHasactionableelementsCurrent: kotlin.Boolean,

    /* Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step */
    @Json(name = "bEzsignfoldersignerassociationHasactionableelementsFuture")
    val bEzsignfoldersignerassociationHasactionableelementsFuture: kotlin.Boolean,

    @Json(name = "objEzsignsignergroup")
    val objEzsignsignergroup: EzsignsignergroupResponseCompound? = null,

    @Json(name = "objUser")
    val objUser: EzsignfoldersignerassociationResponseCompoundUser? = null,

    @Json(name = "objEzsignsigner")
    val objEzsignsigner: EzsignsignerResponseCompound? = null

)
