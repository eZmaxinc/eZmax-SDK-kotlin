
# EzsignfoldertypeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**objEzsignfoldertypeName** | [**MultilingualEzsignfoldertypeName**](MultilingualEzsignfoldertypeName.md) |  | 
**fkiBrandingID** | **kotlin.Int** | The unique ID of the Branding | 
**eEzsignfoldertypePrivacylevel** | [**FieldEEzsignfoldertypePrivacylevel**](FieldEEzsignfoldertypePrivacylevel.md) |  | 
**iEzsignfoldertypeArchivaldays** | **kotlin.Int** | The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype | 
**eEzsignfoldertypeDisposal** | [**FieldEEzsignfoldertypeDisposal**](FieldEEzsignfoldertypeDisposal.md) |  | 
**iEzsignfoldertypeDeadlinedays** | **kotlin.Int** | The number of days to get all Ezsignsignatures | 
**bEzsignfoldertypeSendsignedtodocumentowner** | **kotlin.Boolean** | Whether we send the signed Ezsigndocument to the Ezsigndocument&#39;s owner | 
**bEzsignfoldertypeSendsignedtofolderowner** | **kotlin.Boolean** | Whether we send the signed Ezsigndocument to the Ezsignfolder&#39;s owner | 
**bEzsignfoldertypeSendsignedtocolleague** | **kotlin.Boolean** | Whether we send the signed Ezsigndocument to the colleagues | 
**bEzsignfoldertypeSendsummarytodocumentowner** | **kotlin.Boolean** | Whether we send the summary to the Ezsigndocument&#39;s owner | 
**bEzsignfoldertypeSendsummarytofolderowner** | **kotlin.Boolean** | Whether we send the summary to the Ezsignfolder&#39;s owner | 
**bEzsignfoldertypeSendsummarytocolleague** | **kotlin.Boolean** | Whether we send the summary to the colleagues | 
**bEzsignfoldertypeIncludeproofuser** | **kotlin.Boolean** | Whether we include the proof with the signed Ezsigndocument for users | 
**bEzsignfoldertypeIsactive** | **kotlin.Boolean** | Whether the Ezsignfoldertype is active or not | 
**pkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  [optional]
**fkiBillingentityinternalID** | **kotlin.Int** | The unique ID of the Billingentityinternal. |  [optional]
**fkiUsergroupID** | **kotlin.Int** | The unique ID of the Usergroup |  [optional]
**fkiUsergroupIDRestricted** | **kotlin.Int** | The unique ID of the Usergroup |  [optional]
**fkiEzsigntsarequirementID** | **kotlin.Int** | The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| |  [optional]
**sEmailAddressSigned** | **kotlin.String** | The email address. |  [optional]
**sEmailAddressSummary** | **kotlin.String** | The email address. |  [optional]
**eEzsignfoldertypeSendreminderfrequency** | [**FieldEEzsignfoldertypeSendreminderfrequency**](FieldEEzsignfoldertypeSendreminderfrequency.md) |  |  [optional]
**iEzsignfoldertypeDisposaldays** | **kotlin.Int** | The number of days after the archival before the disposal of the Ezsignfolder |  [optional]
**bEzsignfoldertypeDelegate** | **kotlin.Boolean** | Wheter if delegation of signature is allowed to another user or not |  [optional]
**bEzsignfoldertypeReassign** | **kotlin.Boolean** | Wheter if Reassignment of signature is allowed to another signatory or not |  [optional]
**bEzsignfoldertypeSendattatchmentsigner** | **kotlin.Boolean** | THIS FIELD WILL BE DELETED. Whether we send the Ezsigndocument and the proof as attachment in the email |  [optional]
**bEzsignfoldertypeSendsignedtoezsignsigner** | **kotlin.Boolean** | Whether we send an email to Ezsignsigner  when document is completed |  [optional]
**bEzsignfoldertypeSendsignedtouser** | **kotlin.Boolean** | Whether we send an email to User who signed when document is completed |  [optional]
**bEzsignfoldertypeSendattachmentezsignsigner** | **kotlin.Boolean** | Whether we send the Ezsigndocument in the email to Ezsignsigner |  [optional]
**bEzsignfoldertypeSendproofezsignsigner** | **kotlin.Boolean** | Whether we send the proof in the email to Ezsignsigner |  [optional]
**bEzsignfoldertypeSendattachmentuser** | **kotlin.Boolean** | Whether we send the Ezsigndocument in the email to User |  [optional]
**bEzsignfoldertypeSendproofuser** | **kotlin.Boolean** | Whether we send the proof in the email to User |  [optional]
**bEzsignfoldertypeSendproofemail** | **kotlin.Boolean** | Whether we send the proof in the email to external recipient |  [optional]
**bEzsignfoldertypeAllowdownloadattachmentezsignsigner** | **kotlin.Boolean** | Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner |  [optional]
**bEzsignfoldertypeAllowdownloadproofezsignsigner** | **kotlin.Boolean** | Whether we allow the proof to be downloaded by an Ezsignsigner |  [optional]
**bEzsignfoldertypeSendproofreceivealldocument** | **kotlin.Boolean** | Whether we send the proof to user and Ezsignsigner who receive all documents. |  [optional]
**bEzsignfoldertypeSendsignedtofullgroup** | **kotlin.Boolean** | Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders |  [optional]
**bEzsignfoldertypeSendsignedtolimitedgroup** | **kotlin.Boolean** | THIS FIELD WILL BE DELETED. Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders |  [optional]
**bEzsignfoldertypeSendsummarytofullgroup** | **kotlin.Boolean** | Whether we send the summary to the Usergroup that has acces to all Ezsignfolders |  [optional]
**bEzsignfoldertypeSendsummarytolimitedgroup** | **kotlin.Boolean** | Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders |  [optional]
**bEzsignfoldertypeIncludeproofsigner** | **kotlin.Boolean** | THIS FIELD WILL BE DELETED. Whether we include the proof with the signed Ezsigndocument for Ezsignsigners |  [optional]



