
# EzsigntsarequirementAutocompleteElementResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sEzsigntsarequirementDescriptionX** | **kotlin.String** | The description of the Ezsigntsarequirement in the language of the requester |  |
| **pkiEzsigntsarequirementID** | **kotlin.Int** | The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| |  |
| **bEzsigntsarequirementIsactive** | **kotlin.Boolean** | Whether the Ezsigntsarequirement is active or not |  |
| **bDisabled** | **kotlin.Boolean** | Indicates if the element is disabled in the context |  |



