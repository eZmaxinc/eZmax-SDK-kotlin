
# CustomEzsignfoldertypeResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  |
| **fkiFontIDAnnotation** | **kotlin.Int** | The unique ID of the Font |  [optional] |
| **fkiFontIDFormfield** | **kotlin.Int** | The unique ID of the Font |  [optional] |
| **fkiFontIDSignature** | **kotlin.Int** | The unique ID of the Font |  [optional] |
| **sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester |  [optional] |
| **bEzsignfoldertypeSendproofezsignsigner** | **kotlin.Boolean** | Whether we send the proof in the email to Ezsignsigner |  [optional] |
| **bEzsignfoldertypeAllowdownloadattachmentezsignsigner** | **kotlin.Boolean** | Whether we allow the Ezsigndocument to be downloaded by an Ezsignsigner |  [optional] |
| **bEzsignfoldertypeAllowdownloadproofezsignsigner** | **kotlin.Boolean** | Whether we allow the proof to be downloaded by an Ezsignsigner |  [optional] |
| **bEzsignfoldertypeAutomaticsignature** | **kotlin.Boolean** | Whether we allow the automatic signature by an User |  [optional] |
| **bEzsignfoldertypeDelegate** | **kotlin.Boolean** | Wheter if delegation of signature is allowed to another user or not |  [optional] |
| **bEzsignfoldertypeDiscussion** | **kotlin.Boolean** | Wheter if creating a new Discussion is allowed or not |  [optional] |
| **bEzsignfoldertypeReassignezsignsigner** | **kotlin.Boolean** | Wheter if Reassignment of signature is allowed by a signatory to another signatory or not |  [optional] |
| **bEzsignfoldertypeReassignuser** | **kotlin.Boolean** | Wheter if Reassignment of signature is allowed by a user to a signatory or another user or not |  [optional] |
| **bEzsignfoldertypeReassigngroup** | **kotlin.Boolean** | Wheter if Reassignment of signatures of the groups to which the user belongs is authorized by a user to himself |  [optional] |
| **iEzsignfoldertypeDeadlinedays** | **kotlin.Int** | The number of days to get all Ezsignsignatures |  [optional] |
| **iEzsignfoldertypeFontsizeannotation** | **kotlin.Int** | Font size for annotations |  [optional] |
| **iEzsignfoldertypeFontsizeformfield** | **kotlin.Int** | Font size for form fields |  [optional] |



