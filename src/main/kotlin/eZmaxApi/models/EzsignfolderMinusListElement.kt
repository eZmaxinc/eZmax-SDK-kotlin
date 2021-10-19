/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
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
import eZmaxApi.models.OneOfLessThanStringCommaObjectGreaterThan

import com.squareup.moshi.Json

/**
 * An Ezsignfolder List Element
 *
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param sEzsignfolderDescription The description of the Ezsign Folder
 * @param eEzsignfolderStep 
 * @param dtCreatedDate The date and time at which the object was created
 * @param dtEzsignfolderSentdate 
 * @param dtDueDate The date at which no more signature will be accepted on the folder
 * @param iTotalDocument The total number of Ezsigndocument in the folder
 * @param iTotalDocumentEdm The total number of Ezsigndocument in the folder that were saved in the edm system
 * @param iTotalSignature The total number of signature blocks in all Ezsigndocuments in the folder
 * @param iTotalSignatureSigned The total number of already signed signature blocks in all Ezsigndocuments in the folder
 */

data class EzsignfolderMinusListElement (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* The description of the Ezsign Folder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    @Json(name = "eEzsignfolderStep")
    val eEzsignfolderStep: FieldMinusEEzsignfolderStep,

    /* The date and time at which the object was created */
    @Json(name = "dtCreatedDate")
    val dtCreatedDate: kotlin.String,

    @Json(name = "dtEzsignfolderSentdate")
    val dtEzsignfolderSentdate: OneOfLessThanStringCommaObjectGreaterThan?,

    /* The date at which no more signature will be accepted on the folder */
    @Json(name = "dtDueDate")
    val dtDueDate: OneOfLessThanStringCommaObjectGreaterThan?,

    /* The total number of Ezsigndocument in the folder */
    @Json(name = "iTotalDocument")
    val iTotalDocument: kotlin.Int,

    /* The total number of Ezsigndocument in the folder that were saved in the edm system */
    @Json(name = "iTotalDocumentEdm")
    val iTotalDocumentEdm: kotlin.Int,

    /* The total number of signature blocks in all Ezsigndocuments in the folder */
    @Json(name = "iTotalSignature")
    val iTotalSignature: kotlin.Int,

    /* The total number of already signed signature blocks in all Ezsigndocuments in the folder */
    @Json(name = "iTotalSignatureSigned")
    val iTotalSignatureSigned: kotlin.Int

)
