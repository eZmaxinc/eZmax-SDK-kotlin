
# EzsignfoldertypeResponseCompoundV4

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  |
| **objEzsignfoldertypeName** | [**MultilingualEzsignfoldertypeName**](MultilingualEzsignfoldertypeName.md) |  |  |
| **fkiBrandingID** | **kotlin.Int** | The unique ID of the Branding |  |
| **sBrandingDescriptionX** | **kotlin.String** | The Description of the Branding in the language of the requester |  |
| **eEzsignfoldertypePrivacylevel** | [**FieldEEzsignfoldertypePrivacylevel**](FieldEEzsignfoldertypePrivacylevel.md) |  |  |
| **iEzsignfoldertypeArchivaldays** | **kotlin.Int** | The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype |  |
| **eEzsignfoldertypeDisposal** | [**FieldEEzsignfoldertypeDisposal**](FieldEEzsignfoldertypeDisposal.md) |  |  |
| **eEzsignfoldertypeCompletion** | [**FieldEEzsignfoldertypeCompletion**](FieldEEzsignfoldertypeCompletion.md) |  |  |
| **iEzsignfoldertypeDeadlinedays** | **kotlin.Int** | The number of days to get all Ezsignsignatures |  |
| **bEzsignfoldertypeSendsignedtodocumentowner** | **kotlin.Boolean** | Whether we send the signed Ezsigndocument to the Ezsigndocument&#39;s owner |  |
| **bEzsignfoldertypeSendsignedtofolderowner** | **kotlin.Boolean** | Whether we send the signed Ezsigndocument to the Ezsignfolder&#39;s owner |  |
| **bEzsignfoldertypeSendsignedtocolleague** | **kotlin.Boolean** | Whether we send the signed Ezsigndocument to the colleagues |  |
| **bEzsignfoldertypeSendsummarytodocumentowner** | **kotlin.Boolean** | Whether we send the summary to the Ezsigndocument&#39;s owner |  |
| **bEzsignfoldertypeSendsummarytofolderowner** | **kotlin.Boolean** | Whether we send the summary to the Ezsignfolder&#39;s owner |  |
| **bEzsignfoldertypeSendsummarytocolleague** | **kotlin.Boolean** | Whether we send the summary to the colleagues |  |
| **bEzsignfoldertypeIsactive** | **kotlin.Boolean** | Whether the Ezsignfoldertype is active or not |  |
| **aObjUserlogintype** | [**kotlin.collections.List&lt;UserlogintypeResponse&gt;**](UserlogintypeResponse.md) |  |  |
| **objAudit** | [**CommonAudit**](CommonAudit.md) |  |  |
| **fkiBillingentityinternalID** | **kotlin.Int** | The unique ID of the Billingentityinternal. |  [optional] |
| **fkiEzsigntsarequirementID** | **kotlin.Int** | The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| |  [optional] |
| **fkiFontIDAnnotation** | **kotlin.Int** | The unique ID of the Font |  [optional] |
| **fkiFontIDFormfield** | **kotlin.Int** | The unique ID of the Font |  [optional] |
| **fkiFontIDSignature** | **kotlin.Int** | The unique ID of the Font |  [optional] |
| **fkiPdfalevelIDConvert** | **kotlin.Int** | The unique ID of the Pdfalevel |  [optional] |
| **eEzsignfoldertypeDocumentdependency** | [**FieldEEzsignfoldertypeDocumentdependency**](FieldEEzsignfoldertypeDocumentdependency.md) |  |  [optional] |
| **sBillingentityinternalDescriptionX** | **kotlin.String** | The description of the Billingentityinternal in the language of the requester |  [optional] |
| **sEzsigntsarequirementDescriptionX** | **kotlin.String** | The description of the Ezsigntsarequirement in the language of the requester |  [optional] |
| **sEmailAddressSigned** | **kotlin.String** | The email address. |  [optional] |
| **sEmailAddressSummary** | **kotlin.String** | The email address. |  [optional] |
| **eEzsignfoldertypePdfarequirement** | [**FieldEEzsignfoldertypePdfarequirement**](FieldEEzsignfoldertypePdfarequirement.md) |  |  [optional] |
| **eEzsignfoldertypePdfanoncompliantaction** | [**FieldEEzsignfoldertypePdfanoncompliantaction**](FieldEEzsignfoldertypePdfanoncompliantaction.md) |  |  [optional] |
| **iEzsignfoldertypeFontsizeannotation** | **kotlin.Int** | Font size for annotations |  [optional] |
| **iEzsignfoldertypeFontsizeformfield** | **kotlin.Int** | Font size for form fields |  [optional] |
| **iEzsignfoldertypeSendreminderfirstdays** | **kotlin.Int** | The number of days before the the first reminder sending |  [optional] |
| **iEzsignfoldertypeSendreminderotherdays** | **kotlin.Int** | The number of days after the first reminder sending |  [optional] |
| **iEzsignfoldertypeDisposaldays** | **kotlin.Int** | The number of days after the archival before the disposal of the Ezsignfolder |  [optional] |
| **bEzsignfoldertypePrematurelyendautomatically** | **kotlin.Boolean** | Wheter if document will be ended prematurely after Ezsignfolder expires. |  [optional] |
| **iEzsignfoldertypePrematurelyendautomaticallydays** | **kotlin.Int** | Number of days between Ezsignfolder expiration and automatic prematurely end of Ezsigndocuments. |  [optional] |
| **bEzsignfoldertypeAutomaticsignature** | **kotlin.Boolean** | Whether we allow the automatic signature by an User |  [optional] |
| **bEzsignfoldertypeDelegate** | **kotlin.Boolean** | Wheter if delegation of signature is allowed to another user or not |  [optional] |
| **bEzsignfoldertypeDiscussion** | **kotlin.Boolean** | Wheter if creating a new Discussion is allowed or not |  [optional] |
| **bEzsignfoldertypeLogrecipientinproof** | **kotlin.Boolean** | Whether we log recipient of signed document in proof |  [optional] |
| **bEzsignfoldertypeReassignezsignsigner** | **kotlin.Boolean** | Wheter if Reassignment of signature is allowed by a signatory to another signatory or not |  [optional] |
| **bEzsignfoldertypeReassignuser** | **kotlin.Boolean** | Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not |  [optional] |
| **bEzsignfoldertypeReassigngroup** | **kotlin.Boolean** | Wheter if Reassignment of signatures of the groups to which the user belongs is authorized by a user to himself |  [optional] |
| **bEzsignfoldertypeSendsignedtoezsignsigner** | **kotlin.Boolean** | Whether we send an email to Ezsignsigner  when document is completed |  [optional] |
| **bEzsignfoldertypeSendsignedtouser** | **kotlin.Boolean** | Whether we send an email to User who signed when document is completed |  [optional] |
| **bEzsignfoldertypeSendattachmentezsignsigner** | **kotlin.Boolean** | Whether we send the Ezsigndocument in the email to Ezsignsigner |  [optional] |
| **bEzsignfoldertypeSendproofezsignsigner** | **kotlin.Boolean** | Whether we send the proof in the email to Ezsignsigner |  [optional] |
| **bEzsignfoldertypeSendattachmentuser** | **kotlin.Boolean** | Whether we send the Ezsigndocument in the email to User |  [optional] |
| **bEzsignfoldertypeSendproofuser** | **kotlin.Boolean** | Whether we send the proof in the email to User |  [optional] |
| **bEzsignfoldertypeSendproofemail** | **kotlin.Boolean** | Whether we send the proof in the email to external recipient |  [optional] |
| **bEzsignfoldertypeAllowdownloadattachmentezsignsigner** | **kotlin.Boolean** | Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner |  [optional] |
| **bEzsignfoldertypeAllowdownloadproofezsignsigner** | **kotlin.Boolean** | Whether we allow the proof to be downloaded by an Ezsignsigner |  [optional] |
| **bEzsignfoldertypeSendproofreceivealldocument** | **kotlin.Boolean** | Whether we send the proof to user and Ezsignsigner who receive all documents. |  [optional] |
| **bEzsignfoldertypeSendsignedtofullgroup** | **kotlin.Boolean** | Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders |  [optional] |
| **bEzsignfoldertypeSendsignedtolimitedgroup** | **kotlin.Boolean** | THIS FIELD WILL BE DELETED. Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders |  [optional] |
| **bEzsignfoldertypeSendsummarytofullgroup** | **kotlin.Boolean** | Whether we send the summary to the Usergroup that has acces to all Ezsignfolders |  [optional] |
| **bEzsignfoldertypeSendsummarytolimitedgroup** | **kotlin.Boolean** | Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders |  [optional] |
| **eEzsignfoldertypeSigneraccess** | [**FieldEEzsignfoldertypeSigneraccess**](FieldEEzsignfoldertypeSigneraccess.md) |  |  [optional] |
| **aFkiPdfalevelID** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |
| **aObjUsergroupAll** | [**kotlin.collections.List&lt;UsergroupResponse&gt;**](UsergroupResponse.md) |  |  [optional] |
| **aObjUsergroupRestricted** | [**kotlin.collections.List&lt;UsergroupResponse&gt;**](UsergroupResponse.md) |  |  [optional] |
| **aObjUsergroupTemplate** | [**kotlin.collections.List&lt;UsergroupResponse&gt;**](UsergroupResponse.md) |  |  [optional] |
| **aFkiUserIDSigned** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |
| **aFkiUserIDSummary** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional] |



