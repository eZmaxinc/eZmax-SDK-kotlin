
# EzsignfolderRequestCompoundV3

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  |
| **sEzsignfolderDescription** | **kotlin.String** | The description of the Ezsignfolder |  |
| **iEzsignfolderSendreminderfirstdays** | **kotlin.Int** | The number of days before the the first reminder sending |  |
| **iEzsignfolderSendreminderotherdays** | **kotlin.Int** | The number of days after the first reminder sending |  |
| **pkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder |  [optional] |
| **fkiTimezoneID** | **kotlin.Int** | The unique ID of the Timezone |  [optional] |
| **fkiEzsigntsarequirementID** | **kotlin.Int** | The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| |  [optional] |
| **eEzsignfolderDocumentdependency** | [**FieldEEzsignfolderDocumentdependency**](FieldEEzsignfolderDocumentdependency.md) |  |  [optional] |
| **tEzsignfolderNote** | **kotlin.String** | Note about the Ezsignfolder |  [optional] |
| **tEzsignfolderMessage** | **kotlin.String** | A custom text message that will be added to the email sent. |  [optional] |
| **sEzsignfolderExternalid** | **kotlin.String** | This field can be used to store an External ID from the client&#39;s system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  |  [optional] |



