
# EzsignfolderListElement

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder |  |
| **fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  |
| **eEzsignfoldertypePrivacylevel** | [**FieldEEzsignfoldertypePrivacylevel**](FieldEEzsignfoldertypePrivacylevel.md) |  |  |
| **sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester |  |
| **sEzsignfolderDescription** | **kotlin.String** | The description of the Ezsignfolder |  |
| **eEzsignfolderStep** | [**FieldEEzsignfolderStep**](FieldEEzsignfolderStep.md) |  |  |
| **dtCreatedDate** | **kotlin.String** | The date and time at which the object was created |  |
| **iEzsigndocument** | **kotlin.Int** | The total number of Ezsigndocument in the folder |  |
| **iEzsigndocumentEdm** | **kotlin.Int** | The total number of Ezsigndocument in the folder that were saved in the edm system |  |
| **iEzsignsignature** | **kotlin.Int** | The total number of signature blocks in all Ezsigndocuments in the folder |  |
| **iEzsignsignatureSigned** | **kotlin.Int** | The total number of already signed signature blocks in all Ezsigndocuments in the folder |  |
| **iEzsignformfieldgroup** | **kotlin.Int** | The total number of Ezsignformfieldgroup in all Ezsigndocuments in the folder |  |
| **iEzsignformfieldgroupCompleted** | **kotlin.Int** | The total number of completed Ezsignformfieldgroup in all Ezsigndocuments in the folder |  |
| **dEzsignfolderCompletedpercentage** | **kotlin.String** | Percentage of Ezsignform/Ezsignsignatures has completed |  |
| **dEzsignfolderFormcompletedpercentage** | **kotlin.String** | Percentage of Ezsignform has completed |  |
| **dEzsignfolderSignaturecompletedpercentage** | **kotlin.String** | Percentage of Ezsignsignatures has signed |  |
| **dtEzsignfolderDelayedsenddate** | **kotlin.String** | The date and time at which the Ezsignfolder will be sent in the future. |  [optional] |
| **dtEzsignfolderSentdate** | **kotlin.String** | The date and time at which the Ezsignfolder was sent the last time. |  [optional] |
| **dtEzsignfolderDuedate** | **kotlin.String** | The maximum date and time at which the Ezsignfolder can be signed. |  [optional] |
| **bEzsignformHasdependencies** | **kotlin.Boolean** | Whether the Ezsignform/Ezsignsignatures has dependencies or not |  [optional] |
| **bEzsignfolderSigner** | **kotlin.Boolean** | Whether the Ezsignfolder has an Ezsignsignatures that need to be signed or an Ezsignformfieldgroups that need to be filled by the current user |  [optional] |



