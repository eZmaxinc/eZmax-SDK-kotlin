
# EzsignfolderResponseCompoundV3

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder |  |
| **eEzsignfolderCompletion** | [**FieldEEzsignfolderCompletion**](FieldEEzsignfolderCompletion.md) |  |  |
| **sEzsignfolderDescription** | **kotlin.String** | The description of the Ezsignfolder |  |
| **fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  [optional] |
| **objEzsignfoldertype** | [**CustomEzsignfoldertypeResponse**](CustomEzsignfoldertypeResponse.md) |  |  [optional] |
| **fkiTimezoneID** | **kotlin.Int** | The unique ID of the Timezone |  [optional] |
| **eEzsignfolderDocumentdependency** | [**FieldEEzsignfolderDocumentdependency**](FieldEEzsignfolderDocumentdependency.md) |  |  [optional] |
| **sEzsignfoldertypeNameX** | **kotlin.String** |  |  [optional] |
| **fkiBillingentityinternalID** | **kotlin.Int** | The unique ID of the Billingentityinternal. |  [optional] |
| **sBillingentityinternalDescriptionX** | **kotlin.String** | The description of the Billingentityinternal in the language of the requester |  [optional] |
| **fkiEzsigntsarequirementID** | **kotlin.Int** | The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| |  [optional] |
| **sEzsigntsarequirementDescriptionX** | **kotlin.String** | The description of the Ezsigntsarequirement in the language of the requester |  [optional] |
| **tEzsignfolderNote** | **kotlin.String** | Note about the Ezsignfolder |  [optional] |
| **bEzsignfolderIsdisposable** | **kotlin.Boolean** | If the Ezsigndocument can be disposed |  [optional] |
| **iEzsignfolderSendreminderfirstdays** | **kotlin.Int** | The number of days before the the first reminder sending |  [optional] |
| **iEzsignfolderSendreminderotherdays** | **kotlin.Int** | The number of days after the first reminder sending |  [optional] |
| **dtEzsignfolderDelayedsenddate** | **kotlin.String** | The date and time at which the Ezsignfolder will be sent in the future. |  [optional] |
| **dtEzsignfolderDuedate** | **kotlin.String** | The maximum date and time at which the Ezsignfolder can be signed. |  [optional] |
| **dtEzsignfolderSentdate** | **kotlin.String** | The date and time at which the Ezsignfolder was sent the last time. |  [optional] |
| **dtEzsignfolderScheduledarchive** | **kotlin.String** | The scheduled date and time at which the Ezsignfolder should be archived. |  [optional] |
| **dtEzsignfolderScheduleddispose** | **kotlin.String** | The scheduled date at which the Ezsignfolder should be Disposed. |  [optional] |
| **eEzsignfolderStep** | [**FieldEEzsignfolderStep**](FieldEEzsignfolderStep.md) |  |  [optional] |
| **dtEzsignfolderClose** | **kotlin.String** | The date and time at which the Ezsignfolder was closed. Either by applying the last signature or by completing it prematurely. |  [optional] |
| **dtEzsignfolderArchive** | **kotlin.String** | The date and time at which the Ezsignfolder was archived. |  [optional] |
| **dtEzsignfolderDispose** | **kotlin.String** | The date and time at which the Ezsignfolder was disposed. |  [optional] |
| **tEzsignfolderMessage** | **kotlin.String** | A custom text message that will be added to the email sent. |  [optional] |
| **objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional] |
| **sEzsignfolderExternalid** | **kotlin.String** | This field can be used to store an External ID from the client&#39;s system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  |  [optional] |
| **eEzsignfolderAccess** | [**ComputedEEzsignfolderAccess**](ComputedEEzsignfolderAccess.md) |  |  [optional] |
| **objTimezone** | [**CustomTimezoneWithCodeResponse**](CustomTimezoneWithCodeResponse.md) |  |  [optional] |



