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

import eZmaxApi.models.FieldMinusEEzsignfoldertypeDisposal
import eZmaxApi.models.FieldMinusEEzsignfoldertypePrivacylevel
import eZmaxApi.models.FieldMinusEEzsignfoldertypeSendreminderfrequency
import eZmaxApi.models.MultilingualMinusEzsignfoldertypeName

import com.squareup.moshi.Json

/**
 * A Ezsignfoldertype Object
 *
 * @param objEzsignfoldertypeName 
 * @param fkiBrandingID The unique ID of the Branding
 * @param eEzsignfoldertypePrivacylevel 
 * @param iEzsignfoldertypeArchivaldays The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype
 * @param eEzsignfoldertypeDisposal 
 * @param iEzsignfoldertypeDeadlinedays The number of days to get all Ezsignsignatures
 * @param bEzsignfoldertypeSendattatchmentsigner Whether we send the Ezsigndocument and the proof as attachment in the email
 * @param bEzsignfoldertypeSendsignedtodocumentowner Whether we send the signed Ezsigndocument to the Ezsigndocument's owner
 * @param bEzsignfoldertypeSendsignedtofolderowner Whether we send the signed Ezsigndocument to the Ezsignfolder's owner
 * @param bEzsignfoldertypeSendsignedtocolleague Whether we send the signed Ezsigndocument to the colleagues
 * @param bEzsignfoldertypeSendsummarytodocumentowner Whether we send the summary to the Ezsigndocument's owner
 * @param bEzsignfoldertypeSendsummarytofolderowner Whether we send the summary to the Ezsignfolder's owner
 * @param bEzsignfoldertypeSendsummarytocolleague Whether we send the summary to the colleagues
 * @param bEzsignfoldertypeIncludeproofsigner Whether we include the proof with the signed Ezsigndocument for Ezsignsigners
 * @param bEzsignfoldertypeIncludeproofuser Whether we include the proof with the signed Ezsigndocument for users
 * @param bEzsignfoldertypeIsactive Whether the Ezsignfoldertype is active or not
 * @param pkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param fkiUsergroupID The unique ID of the Usergroup
 * @param fkiUsergroupIDRestricted The unique ID of the Usergroup
 * @param fkiEzsigntsarequirementID The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
 * @param sEmailAddressSigned The email address.
 * @param sEmailAddressSummary The email address.
 * @param eEzsignfoldertypeSendreminderfrequency 
 * @param iEzsignfoldertypeDisposaldays The number of days after the archival before the disposal of the Ezsignfolder
 * @param bEzsignfoldertypeSendsignedtofullgroup Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders
 * @param bEzsignfoldertypeSendsignedtolimitedgroup Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders
 * @param bEzsignfoldertypeSendsummarytofullgroup Whether we send the summary to the Usergroup that has acces to all Ezsignfolders
 * @param bEzsignfoldertypeSendsummarytolimitedgroup Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders
 */

data class EzsignfoldertypeMinusRequest (

    @Json(name = "objEzsignfoldertypeName")
    val objEzsignfoldertypeName: MultilingualMinusEzsignfoldertypeName,

    /* The unique ID of the Branding */
    @Json(name = "fkiBrandingID")
    val fkiBrandingID: kotlin.Int,

    @Json(name = "eEzsignfoldertypePrivacylevel")
    val eEzsignfoldertypePrivacylevel: FieldMinusEEzsignfoldertypePrivacylevel,

    /* The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype */
    @Json(name = "iEzsignfoldertypeArchivaldays")
    val iEzsignfoldertypeArchivaldays: kotlin.Int,

    @Json(name = "eEzsignfoldertypeDisposal")
    val eEzsignfoldertypeDisposal: FieldMinusEEzsignfoldertypeDisposal,

    /* The number of days to get all Ezsignsignatures */
    @Json(name = "iEzsignfoldertypeDeadlinedays")
    val iEzsignfoldertypeDeadlinedays: kotlin.Int,

    /* Whether we send the Ezsigndocument and the proof as attachment in the email */
    @Json(name = "bEzsignfoldertypeSendattatchmentsigner")
    val bEzsignfoldertypeSendattatchmentsigner: kotlin.Boolean,

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

    /* Whether we include the proof with the signed Ezsigndocument for Ezsignsigners */
    @Json(name = "bEzsignfoldertypeIncludeproofsigner")
    val bEzsignfoldertypeIncludeproofsigner: kotlin.Boolean,

    /* Whether we include the proof with the signed Ezsigndocument for users */
    @Json(name = "bEzsignfoldertypeIncludeproofuser")
    val bEzsignfoldertypeIncludeproofuser: kotlin.Boolean,

    /* Whether the Ezsignfoldertype is active or not */
    @Json(name = "bEzsignfoldertypeIsactive")
    val bEzsignfoldertypeIsactive: kotlin.Boolean,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "pkiEzsignfoldertypeID")
    val pkiEzsignfoldertypeID: kotlin.Int? = null,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int? = null,

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupID")
    val fkiUsergroupID: kotlin.Int? = null,

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupIDRestricted")
    val fkiUsergroupIDRestricted: kotlin.Int? = null,

    /* The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| */
    @Json(name = "fkiEzsigntsarequirementID")
    val fkiEzsigntsarequirementID: kotlin.Int? = null,

    /* The email address. */
    @Json(name = "sEmailAddressSigned")
    val sEmailAddressSigned: kotlin.String? = null,

    /* The email address. */
    @Json(name = "sEmailAddressSummary")
    val sEmailAddressSummary: kotlin.String? = null,

    @Json(name = "eEzsignfoldertypeSendreminderfrequency")
    val eEzsignfoldertypeSendreminderfrequency: FieldMinusEEzsignfoldertypeSendreminderfrequency? = null,

    /* The number of days after the archival before the disposal of the Ezsignfolder */
    @Json(name = "iEzsignfoldertypeDisposaldays")
    val iEzsignfoldertypeDisposaldays: kotlin.Int? = null,

    /* Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders */
    @Json(name = "bEzsignfoldertypeSendsignedtofullgroup")
    val bEzsignfoldertypeSendsignedtofullgroup: kotlin.Boolean? = null,

    /* Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders */
    @Json(name = "bEzsignfoldertypeSendsignedtolimitedgroup")
    val bEzsignfoldertypeSendsignedtolimitedgroup: kotlin.Boolean? = null,

    /* Whether we send the summary to the Usergroup that has acces to all Ezsignfolders */
    @Json(name = "bEzsignfoldertypeSendsummarytofullgroup")
    val bEzsignfoldertypeSendsummarytofullgroup: kotlin.Boolean? = null,

    /* Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders */
    @Json(name = "bEzsignfoldertypeSendsummarytolimitedgroup")
    val bEzsignfoldertypeSendsummarytolimitedgroup: kotlin.Boolean? = null

)

