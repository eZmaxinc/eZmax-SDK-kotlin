/**
 * eZmax API Definition
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

import eZmaxApi.models.FieldMinusEEzsignfolderStep
import eZmaxApi.models.FieldMinusEEzsignfoldertypePrivacylevel

import com.squareup.moshi.Json

/**
 * An Ezsignfolder List Element
 *
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param eEzsignfoldertypePrivacylevel 
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param eEzsignfolderStep 
 * @param dtCreatedDate The date and time at which the object was created
 * @param dtEzsignfolderSentdate The date and time at which the Ezsign folder was sent the last time.
 * @param dtDueDate Represent a Date Time. The timezone is the one configured in the User's profile.
 * @param iEzsigndocument The total number of Ezsigndocument in the folder
 * @param iEzsigndocumentEdm The total number of Ezsigndocument in the folder that were saved in the edm system
 * @param iEzsignsignature The total number of signature blocks in all Ezsigndocuments in the folder
 * @param iEzsignsignatureSigned The total number of already signed signature blocks in all Ezsigndocuments in the folder
 */

data class EzsignfolderMinusListElement (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    @Json(name = "eEzsignfoldertypePrivacylevel")
    val eEzsignfoldertypePrivacylevel: FieldMinusEEzsignfoldertypePrivacylevel,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* The description of the Ezsignfolder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    @Json(name = "eEzsignfolderStep")
    val eEzsignfolderStep: FieldMinusEEzsignfolderStep,

    /* The date and time at which the object was created */
    @Json(name = "dtCreatedDate")
    val dtCreatedDate: kotlin.String,

    /* The date and time at which the Ezsign folder was sent the last time. */
    @Json(name = "dtEzsignfolderSentdate")
    val dtEzsignfolderSentdate: kotlin.String?,

    /* Represent a Date Time. The timezone is the one configured in the User's profile. */
    @Json(name = "dtDueDate")
    val dtDueDate: kotlin.String?,

    /* The total number of Ezsigndocument in the folder */
    @Json(name = "iEzsigndocument")
    val iEzsigndocument: kotlin.Int,

    /* The total number of Ezsigndocument in the folder that were saved in the edm system */
    @Json(name = "iEzsigndocumentEdm")
    val iEzsigndocumentEdm: kotlin.Int,

    /* The total number of signature blocks in all Ezsigndocuments in the folder */
    @Json(name = "iEzsignsignature")
    val iEzsignsignature: kotlin.Int,

    /* The total number of already signed signature blocks in all Ezsigndocuments in the folder */
    @Json(name = "iEzsignsignatureSigned")
    val iEzsignsignatureSigned: kotlin.Int

)

