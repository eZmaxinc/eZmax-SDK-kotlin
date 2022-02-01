/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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

import eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompound
import eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompoundMinusUser
import eZmaxApi.models.EzsignsignerMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsignfoldersignerassociation/getObject API Request
 *
 * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param bEzsignfoldersignerassociationReceivecopy If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
 * @param objUser 
 * @param objEzsignsigner 
 */

data class EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponseMinusMPayload (

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "pkiEzsignfoldersignerassociationID")
    val pkiEzsignfoldersignerassociationID: kotlin.Int,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document. */
    @Json(name = "bEzsignfoldersignerassociationReceivecopy")
    val bEzsignfoldersignerassociationReceivecopy: kotlin.Boolean,

    @Json(name = "objUser")
    val objUser: EzsignfoldersignerassociationMinusResponseCompoundMinusUser? = null,

    @Json(name = "objEzsignsigner")
    val objEzsignsigner: EzsignsignerMinusResponseCompound? = null

)

