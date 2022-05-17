/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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

import eZmaxApi.models.EzsignfoldersignerassociationMinusRequest
import eZmaxApi.models.EzsignfoldersignerassociationRequestCompoundAllOf
import eZmaxApi.models.EzsignsignerMinusRequestCompound

import com.squareup.moshi.Json

/**
 * An Ezsignfoldersignerassociation Object and children to create a complete structure
 *
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param fkiUserID The unique ID of the User
 * @param bEzsignfoldersignerassociationReceivecopy If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
 * @param objEzsignsigner 
 */

data class EzsignfoldersignerassociationMinusRequestCompound (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "pkiEzsignfoldersignerassociationID")
    val pkiEzsignfoldersignerassociationID: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null,

    /* If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document. */
    @Json(name = "bEzsignfoldersignerassociationReceivecopy")
    val bEzsignfoldersignerassociationReceivecopy: kotlin.Boolean? = null,

    @Json(name = "objEzsignsigner")
    val objEzsignsigner: EzsignsignerMinusRequestCompound? = null

)

