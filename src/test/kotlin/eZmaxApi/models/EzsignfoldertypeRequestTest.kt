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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import eZmaxApi.models.EzsignfoldertypeRequest
import eZmaxApi.models.FieldEEzsignfoldertypeCompletion
import eZmaxApi.models.FieldEEzsignfoldertypeDisposal
import eZmaxApi.models.FieldEEzsignfoldertypePrivacylevel
import eZmaxApi.models.FieldEEzsignfoldertypeSendreminderfrequency
import eZmaxApi.models.MultilingualEzsignfoldertypeName

class EzsignfoldertypeRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignfoldertypeRequest
        //val modelInstance = EzsignfoldertypeRequest()

        // to test the property `objEzsignfoldertypeName`
        should("test objEzsignfoldertypeName") {
            // uncomment below to test the property
            //modelInstance.objEzsignfoldertypeName shouldBe ("TODO")
        }

        // to test the property `fkiBrandingID` - The unique ID of the Branding
        should("test fkiBrandingID") {
            // uncomment below to test the property
            //modelInstance.fkiBrandingID shouldBe ("TODO")
        }

        // to test the property `eEzsignfoldertypePrivacylevel`
        should("test eEzsignfoldertypePrivacylevel") {
            // uncomment below to test the property
            //modelInstance.eEzsignfoldertypePrivacylevel shouldBe ("TODO")
        }

        // to test the property `iEzsignfoldertypeArchivaldays` - The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype
        should("test iEzsignfoldertypeArchivaldays") {
            // uncomment below to test the property
            //modelInstance.iEzsignfoldertypeArchivaldays shouldBe ("TODO")
        }

        // to test the property `eEzsignfoldertypeDisposal`
        should("test eEzsignfoldertypeDisposal") {
            // uncomment below to test the property
            //modelInstance.eEzsignfoldertypeDisposal shouldBe ("TODO")
        }

        // to test the property `eEzsignfoldertypeCompletion`
        should("test eEzsignfoldertypeCompletion") {
            // uncomment below to test the property
            //modelInstance.eEzsignfoldertypeCompletion shouldBe ("TODO")
        }

        // to test the property `iEzsignfoldertypeDeadlinedays` - The number of days to get all Ezsignsignatures
        should("test iEzsignfoldertypeDeadlinedays") {
            // uncomment below to test the property
            //modelInstance.iEzsignfoldertypeDeadlinedays shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsignedtodocumentowner` - Whether we send the signed Ezsigndocument to the Ezsigndocument's owner
        should("test bEzsignfoldertypeSendsignedtodocumentowner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsignedtodocumentowner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsignedtofolderowner` - Whether we send the signed Ezsigndocument to the Ezsignfolder's owner
        should("test bEzsignfoldertypeSendsignedtofolderowner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsignedtofolderowner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsignedtocolleague` - Whether we send the signed Ezsigndocument to the colleagues
        should("test bEzsignfoldertypeSendsignedtocolleague") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsignedtocolleague shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsummarytodocumentowner` - Whether we send the summary to the Ezsigndocument's owner
        should("test bEzsignfoldertypeSendsummarytodocumentowner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsummarytodocumentowner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsummarytofolderowner` - Whether we send the summary to the Ezsignfolder's owner
        should("test bEzsignfoldertypeSendsummarytofolderowner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsummarytofolderowner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsummarytocolleague` - Whether we send the summary to the colleagues
        should("test bEzsignfoldertypeSendsummarytocolleague") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsummarytocolleague shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeIsactive` - Whether the Ezsignfoldertype is active or not
        should("test bEzsignfoldertypeIsactive") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeIsactive shouldBe ("TODO")
        }

        // to test the property `pkiEzsignfoldertypeID` - The unique ID of the Ezsignfoldertype.
        should("test pkiEzsignfoldertypeID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignfoldertypeID shouldBe ("TODO")
        }

        // to test the property `fkiBillingentityinternalID` - The unique ID of the Billingentityinternal.
        should("test fkiBillingentityinternalID") {
            // uncomment below to test the property
            //modelInstance.fkiBillingentityinternalID shouldBe ("TODO")
        }

        // to test the property `fkiUsergroupID` - The unique ID of the Usergroup
        should("test fkiUsergroupID") {
            // uncomment below to test the property
            //modelInstance.fkiUsergroupID shouldBe ("TODO")
        }

        // to test the property `fkiUsergroupIDRestricted` - The unique ID of the Usergroup
        should("test fkiUsergroupIDRestricted") {
            // uncomment below to test the property
            //modelInstance.fkiUsergroupIDRestricted shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntsarequirementID` - The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
        should("test fkiEzsigntsarequirementID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntsarequirementID shouldBe ("TODO")
        }

        // to test the property `sEmailAddressSigned` - The email address.
        should("test sEmailAddressSigned") {
            // uncomment below to test the property
            //modelInstance.sEmailAddressSigned shouldBe ("TODO")
        }

        // to test the property `sEmailAddressSummary` - The email address.
        should("test sEmailAddressSummary") {
            // uncomment below to test the property
            //modelInstance.sEmailAddressSummary shouldBe ("TODO")
        }

        // to test the property `eEzsignfoldertypeSendreminderfrequency`
        should("test eEzsignfoldertypeSendreminderfrequency") {
            // uncomment below to test the property
            //modelInstance.eEzsignfoldertypeSendreminderfrequency shouldBe ("TODO")
        }

        // to test the property `iEzsignfoldertypeDisposaldays` - The number of days after the archival before the disposal of the Ezsignfolder
        should("test iEzsignfoldertypeDisposaldays") {
            // uncomment below to test the property
            //modelInstance.iEzsignfoldertypeDisposaldays shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeDelegate` - Wheter if delegation of signature is allowed to another user or not
        should("test bEzsignfoldertypeDelegate") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeDelegate shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeDiscussion` - Wheter if creating a new Discussion is allowed or not
        should("test bEzsignfoldertypeDiscussion") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeDiscussion shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeReassignezsignsigner` - Wheter if Reassignment of signature is allowed by a signatory to another signatory or not
        should("test bEzsignfoldertypeReassignezsignsigner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeReassignezsignsigner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeReassignuser` - Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not
        should("test bEzsignfoldertypeReassignuser") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeReassignuser shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsignedtoezsignsigner` - Whether we send an email to Ezsignsigner  when document is completed
        should("test bEzsignfoldertypeSendsignedtoezsignsigner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsignedtoezsignsigner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsignedtouser` - Whether we send an email to User who signed when document is completed
        should("test bEzsignfoldertypeSendsignedtouser") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsignedtouser shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendattachmentezsignsigner` - Whether we send the Ezsigndocument in the email to Ezsignsigner
        should("test bEzsignfoldertypeSendattachmentezsignsigner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendattachmentezsignsigner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendproofezsignsigner` - Whether we send the proof in the email to Ezsignsigner
        should("test bEzsignfoldertypeSendproofezsignsigner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendproofezsignsigner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendattachmentuser` - Whether we send the Ezsigndocument in the email to User
        should("test bEzsignfoldertypeSendattachmentuser") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendattachmentuser shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendproofuser` - Whether we send the proof in the email to User
        should("test bEzsignfoldertypeSendproofuser") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendproofuser shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendproofemail` - Whether we send the proof in the email to external recipient
        should("test bEzsignfoldertypeSendproofemail") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendproofemail shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeAllowdownloadattachmentezsignsigner` - Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner
        should("test bEzsignfoldertypeAllowdownloadattachmentezsignsigner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeAllowdownloadattachmentezsignsigner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeAllowdownloadproofezsignsigner` - Whether we allow the proof to be downloaded by an Ezsignsigner
        should("test bEzsignfoldertypeAllowdownloadproofezsignsigner") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeAllowdownloadproofezsignsigner shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendproofreceivealldocument` - Whether we send the proof to user and Ezsignsigner who receive all documents.
        should("test bEzsignfoldertypeSendproofreceivealldocument") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendproofreceivealldocument shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsignedtofullgroup` - Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders
        should("test bEzsignfoldertypeSendsignedtofullgroup") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsignedtofullgroup shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsignedtolimitedgroup` - THIS FIELD WILL BE DELETED. Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders
        should("test bEzsignfoldertypeSendsignedtolimitedgroup") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsignedtolimitedgroup shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsummarytofullgroup` - Whether we send the summary to the Usergroup that has acces to all Ezsignfolders
        should("test bEzsignfoldertypeSendsummarytofullgroup") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsummarytofullgroup shouldBe ("TODO")
        }

        // to test the property `bEzsignfoldertypeSendsummarytolimitedgroup` - Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders
        should("test bEzsignfoldertypeSendsummarytolimitedgroup") {
            // uncomment below to test the property
            //modelInstance.bEzsignfoldertypeSendsummarytolimitedgroup shouldBe ("TODO")
        }

    }
}
