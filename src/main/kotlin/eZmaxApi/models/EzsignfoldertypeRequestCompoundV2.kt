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

import eZmaxApi.models.FieldEEzsignfoldertypeCompletion
import eZmaxApi.models.FieldEEzsignfoldertypeDisposal
import eZmaxApi.models.FieldEEzsignfoldertypePrivacylevel
import eZmaxApi.models.FieldEEzsignfoldertypeSendreminderfrequency
import eZmaxApi.models.MultilingualEzsignfoldertypeName

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsignfoldertype Object and children
 *
 * @param objEzsignfoldertypeName 
 * @param fkiBrandingID The unique ID of the Branding
 * @param aFkiUserlogintypeID 
 * @param eEzsignfoldertypePrivacylevel 
 * @param iEzsignfoldertypeArchivaldays The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype
 * @param eEzsignfoldertypeDisposal 
 * @param eEzsignfoldertypeCompletion 
 * @param iEzsignfoldertypeDeadlinedays The number of days to get all Ezsignsignatures
 * @param bEzsignfoldertypeSendsignedtodocumentowner Whether we send the signed Ezsigndocument to the Ezsigndocument's owner
 * @param bEzsignfoldertypeSendsignedtofolderowner Whether we send the signed Ezsigndocument to the Ezsignfolder's owner
 * @param bEzsignfoldertypeSendsignedtocolleague Whether we send the signed Ezsigndocument to the colleagues
 * @param bEzsignfoldertypeSendsummarytodocumentowner Whether we send the summary to the Ezsigndocument's owner
 * @param bEzsignfoldertypeSendsummarytofolderowner Whether we send the summary to the Ezsignfolder's owner
 * @param bEzsignfoldertypeSendsummarytocolleague Whether we send the summary to the colleagues
 * @param bEzsignfoldertypeIsactive Whether the Ezsignfoldertype is active or not
 * @param pkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param fkiEzsigntsarequirementID The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
 * @param aFkiUsergroupIDAll 
 * @param aFkiUsergroupIDRestricted 
 * @param aFkiUsergroupIDTemplate 
 * @param sEmailAddressSigned The email address.
 * @param sEmailAddressSummary The email address.
 * @param eEzsignfoldertypeSendreminderfrequency 
 * @param iEzsignfoldertypeDisposaldays The number of days after the archival before the disposal of the Ezsignfolder
 * @param bEzsignfoldertypeDelegate Wheter if delegation of signature is allowed to another user or not
 * @param bEzsignfoldertypeDiscussion Wheter if creating a new Discussion is allowed or not
 * @param bEzsignfoldertypeReassignezsignsigner Wheter if Reassignment of signature is allowed by a signatory to another signatory or not
 * @param bEzsignfoldertypeReassignuser Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not
 * @param bEzsignfoldertypeSendsignedtoezsignsigner Whether we send an email to Ezsignsigner  when document is completed
 * @param bEzsignfoldertypeSendsignedtouser Whether we send an email to User who signed when document is completed
 * @param bEzsignfoldertypeSendattachmentezsignsigner Whether we send the Ezsigndocument in the email to Ezsignsigner
 * @param bEzsignfoldertypeSendproofezsignsigner Whether we send the proof in the email to Ezsignsigner
 * @param bEzsignfoldertypeSendattachmentuser Whether we send the Ezsigndocument in the email to User
 * @param bEzsignfoldertypeSendproofuser Whether we send the proof in the email to User
 * @param bEzsignfoldertypeSendproofemail Whether we send the proof in the email to external recipient
 * @param bEzsignfoldertypeAllowdownloadattachmentezsignsigner Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner
 * @param bEzsignfoldertypeAllowdownloadproofezsignsigner Whether we allow the proof to be downloaded by an Ezsignsigner
 * @param bEzsignfoldertypeSendproofreceivealldocument Whether we send the proof to user and Ezsignsigner who receive all documents.
 * @param bEzsignfoldertypeSendsignedtofullgroup Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders
 * @param bEzsignfoldertypeSendsignedtolimitedgroup THIS FIELD WILL BE DELETED. Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders
 * @param bEzsignfoldertypeSendsummarytofullgroup Whether we send the summary to the Usergroup that has acces to all Ezsignfolders
 * @param bEzsignfoldertypeSendsummarytolimitedgroup Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders
 * @param aFkiUserIDSigned 
 * @param aFkiUserIDSummary 
 */


data class EzsignfoldertypeRequestCompoundV2 (

    @Json(name = "objEzsignfoldertypeName")
    val objEzsignfoldertypeName: MultilingualEzsignfoldertypeName,

    /* The unique ID of the Branding */
    @Json(name = "fkiBrandingID")
    val fkiBrandingID: kotlin.Int,

    @Json(name = "a_fkiUserlogintypeID")
    val aFkiUserlogintypeID: kotlin.collections.List<kotlin.Int>,

    @Json(name = "eEzsignfoldertypePrivacylevel")
    val eEzsignfoldertypePrivacylevel: FieldEEzsignfoldertypePrivacylevel,

    /* The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype */
    @Json(name = "iEzsignfoldertypeArchivaldays")
    val iEzsignfoldertypeArchivaldays: kotlin.Int,

    @Json(name = "eEzsignfoldertypeDisposal")
    val eEzsignfoldertypeDisposal: FieldEEzsignfoldertypeDisposal,

    @Json(name = "eEzsignfoldertypeCompletion")
    val eEzsignfoldertypeCompletion: FieldEEzsignfoldertypeCompletion,

    /* The number of days to get all Ezsignsignatures */
    @Json(name = "iEzsignfoldertypeDeadlinedays")
    val iEzsignfoldertypeDeadlinedays: kotlin.Int,

    /* Whether we send the signed Ezsigndocument to the Ezsigndocument's owner */
    @Json(name = "bEzsignfoldertypeSendsignedtodocumentowner")
    val bEzsignfoldertypeSendsignedtodocumentowner: kotlin.Boolean,

    /* Whether we send the signed Ezsigndocument to the Ezsignfolder's owner */
    @Json(name = "bEzsignfoldertypeSendsignedtofolderowner")
    val bEzsignfoldertypeSendsignedtofolderowner: kotlin.Boolean,

    /* Whether we send the signed Ezsigndocument to the colleagues */
    @Json(name = "bEzsignfoldertypeSendsignedtocolleague")
    val bEzsignfoldertypeSendsignedtocolleague: kotlin.Boolean,

    /* Whether we send the summary to the Ezsigndocument's owner */
    @Json(name = "bEzsignfoldertypeSendsummarytodocumentowner")
    val bEzsignfoldertypeSendsummarytodocumentowner: kotlin.Boolean,

    /* Whether we send the summary to the Ezsignfolder's owner */
    @Json(name = "bEzsignfoldertypeSendsummarytofolderowner")
    val bEzsignfoldertypeSendsummarytofolderowner: kotlin.Boolean,

    /* Whether we send the summary to the colleagues */
    @Json(name = "bEzsignfoldertypeSendsummarytocolleague")
    val bEzsignfoldertypeSendsummarytocolleague: kotlin.Boolean,

    /* Whether the Ezsignfoldertype is active or not */
    @Json(name = "bEzsignfoldertypeIsactive")
    val bEzsignfoldertypeIsactive: kotlin.Boolean,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "pkiEzsignfoldertypeID")
    val pkiEzsignfoldertypeID: kotlin.Int? = null,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| */
    @Json(name = "fkiEzsigntsarequirementID")
    val fkiEzsigntsarequirementID: kotlin.Int? = null,

    @Json(name = "a_fkiUsergroupIDAll")
    val aFkiUsergroupIDAll: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "a_fkiUsergroupIDRestricted")
    val aFkiUsergroupIDRestricted: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "a_fkiUsergroupIDTemplate")
    val aFkiUsergroupIDTemplate: kotlin.collections.List<kotlin.Int>? = null,

    /* The email address. */
    @Json(name = "sEmailAddressSigned")
    val sEmailAddressSigned: kotlin.String? = null,

    /* The email address. */
    @Json(name = "sEmailAddressSummary")
    val sEmailAddressSummary: kotlin.String? = null,

    @Json(name = "eEzsignfoldertypeSendreminderfrequency")
    val eEzsignfoldertypeSendreminderfrequency: FieldEEzsignfoldertypeSendreminderfrequency? = null,

    /* The number of days after the archival before the disposal of the Ezsignfolder */
    @Json(name = "iEzsignfoldertypeDisposaldays")
    val iEzsignfoldertypeDisposaldays: kotlin.Int? = null,

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
    val bEzsignfoldertypeReassignuser: kotlin.Boolean? = null,

    /* Whether we send an email to Ezsignsigner  when document is completed */
    @Json(name = "bEzsignfoldertypeSendsignedtoezsignsigner")
    val bEzsignfoldertypeSendsignedtoezsignsigner: kotlin.Boolean? = null,

    /* Whether we send an email to User who signed when document is completed */
    @Json(name = "bEzsignfoldertypeSendsignedtouser")
    val bEzsignfoldertypeSendsignedtouser: kotlin.Boolean? = null,

    /* Whether we send the Ezsigndocument in the email to Ezsignsigner */
    @Json(name = "bEzsignfoldertypeSendattachmentezsignsigner")
    val bEzsignfoldertypeSendattachmentezsignsigner: kotlin.Boolean? = null,

    /* Whether we send the proof in the email to Ezsignsigner */
    @Json(name = "bEzsignfoldertypeSendproofezsignsigner")
    val bEzsignfoldertypeSendproofezsignsigner: kotlin.Boolean? = null,

    /* Whether we send the Ezsigndocument in the email to User */
    @Json(name = "bEzsignfoldertypeSendattachmentuser")
    val bEzsignfoldertypeSendattachmentuser: kotlin.Boolean? = null,

    /* Whether we send the proof in the email to User */
    @Json(name = "bEzsignfoldertypeSendproofuser")
    val bEzsignfoldertypeSendproofuser: kotlin.Boolean? = null,

    /* Whether we send the proof in the email to external recipient */
    @Json(name = "bEzsignfoldertypeSendproofemail")
    val bEzsignfoldertypeSendproofemail: kotlin.Boolean? = null,

    /* Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner */
    @Json(name = "bEzsignfoldertypeAllowdownloadattachmentezsignsigner")
    val bEzsignfoldertypeAllowdownloadattachmentezsignsigner: kotlin.Boolean? = null,

    /* Whether we allow the proof to be downloaded by an Ezsignsigner */
    @Json(name = "bEzsignfoldertypeAllowdownloadproofezsignsigner")
    val bEzsignfoldertypeAllowdownloadproofezsignsigner: kotlin.Boolean? = null,

    /* Whether we send the proof to user and Ezsignsigner who receive all documents. */
    @Json(name = "bEzsignfoldertypeSendproofreceivealldocument")
    val bEzsignfoldertypeSendproofreceivealldocument: kotlin.Boolean? = null,

    /* Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders */
    @Json(name = "bEzsignfoldertypeSendsignedtofullgroup")
    val bEzsignfoldertypeSendsignedtofullgroup: kotlin.Boolean? = null,

    /* THIS FIELD WILL BE DELETED. Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders */
    @Json(name = "bEzsignfoldertypeSendsignedtolimitedgroup")
    val bEzsignfoldertypeSendsignedtolimitedgroup: kotlin.Boolean? = null,

    /* Whether we send the summary to the Usergroup that has acces to all Ezsignfolders */
    @Json(name = "bEzsignfoldertypeSendsummarytofullgroup")
    val bEzsignfoldertypeSendsummarytofullgroup: kotlin.Boolean? = null,

    /* Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders */
    @Json(name = "bEzsignfoldertypeSendsummarytolimitedgroup")
    val bEzsignfoldertypeSendsummarytolimitedgroup: kotlin.Boolean? = null,

    @Json(name = "a_fkiUserIDSigned")
    val aFkiUserIDSigned: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "a_fkiUserIDSummary")
    val aFkiUserIDSummary: kotlin.collections.List<kotlin.Int>? = null

)

