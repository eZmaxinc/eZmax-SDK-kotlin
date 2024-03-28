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
 * A Custom Ezsignfoldertype Object
 *
 * @param pkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param bEzsignfoldertypeSendproofezsignsigner Whether we send the proof in the email to Ezsignsigner
 * @param bEzsignfoldertypeAllowdownloadattachmentezsignsigner Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner
 * @param bEzsignfoldertypeAllowdownloadproofezsignsigner Whether we allow the proof to be downloaded by an Ezsignsigner
 * @param bEzsignfoldertypeDelegate Wheter if delegation of signature is allowed to another user or not
 * @param bEzsignfoldertypeDiscussion Wheter if creating a new Discussion is allowed or not
 * @param bEzsignfoldertypeReassignezsignsigner Wheter if Reassignment of signature is allowed by a signatory to another signatory or not
 * @param bEzsignfoldertypeReassignuser Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not
 */


data class CustomEzsignfoldertypeResponse (

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "pkiEzsignfoldertypeID")
    val pkiEzsignfoldertypeID: kotlin.Int,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String? = null,

    /* Whether we send the proof in the email to Ezsignsigner */
    @Json(name = "bEzsignfoldertypeSendproofezsignsigner")
    val bEzsignfoldertypeSendproofezsignsigner: kotlin.Boolean? = null,

    /* Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner */
    @Json(name = "bEzsignfoldertypeAllowdownloadattachmentezsignsigner")
    val bEzsignfoldertypeAllowdownloadattachmentezsignsigner: kotlin.Boolean? = null,

    /* Whether we allow the proof to be downloaded by an Ezsignsigner */
    @Json(name = "bEzsignfoldertypeAllowdownloadproofezsignsigner")
    val bEzsignfoldertypeAllowdownloadproofezsignsigner: kotlin.Boolean? = null,

    /* Wheter if delegation of signature is allowed to another user or not */
    @Json(name = "bEzsignfoldertypeDelegate")
    val bEzsignfoldertypeDelegate: kotlin.Boolean? = null,

    /* Wheter if creating a new Discussion is allowed or not */
    @Json(name = "bEzsignfoldertypeDiscussion")
    val bEzsignfoldertypeDiscussion: kotlin.Boolean? = null,

    /* Wheter if Reassignment of signature is allowed by a signatory to another signatory or not */
    @Json(name = "bEzsignfoldertypeReassignezsignsigner")
    val bEzsignfoldertypeReassignezsignsigner: kotlin.Boolean? = null,

    /* Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not */
    @Json(name = "bEzsignfoldertypeReassignuser")
    val bEzsignfoldertypeReassignuser: kotlin.Boolean? = null

)

