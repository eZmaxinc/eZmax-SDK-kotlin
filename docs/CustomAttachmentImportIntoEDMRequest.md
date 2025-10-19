
# CustomAttachmentImportIntoEDMRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eAttachmentSource** | [**inline**](#EAttachmentSource) | The source of the Attachment |  |
| **sAttachmentName** | **kotlin.String** | The name of the Attachment |  |
| **sAttachmentCategory** | **kotlin.String** | The attachment category |  |
| **eAttachmentPrivacy** | [**FieldEAttachmentPrivacy**](FieldEAttachmentPrivacy.md) |  |  |
| **fkiAttachmentID** | **kotlin.Int** | The unique ID of the Attachment. |  [optional] |
| **fkiInscriptionchecklistID** | **kotlin.Int** | The unique ID of the Inscriptionchecklist |  [optional] |
| **sAttachmentUrl** | **kotlin.String** | The url of the file to import |  [optional] |
| **sAttachmentBase64** | **kotlin.ByteArray** | The Base64 encoded binary content of the attachment. |  [optional] |
| **fkiUserIDSpecific** | **kotlin.Int** | The unique ID of the User |  [optional] |
| **sAttachmentMD5** | **kotlin.String** | The MD5 of the Attachment |  [optional] |
| **bAttachmentForceoverwrite** | **kotlin.Boolean** | Whether we force an overwrite of an existing file |  [optional] |
| **bAttachmentForcerestore** | **kotlin.Boolean** | Whether we force a restore of a deleted file |  [optional] |


<a id="EAttachmentSource"></a>
## Enum: eAttachmentSource
| Name | Value |
| ---- | ----- |
| eAttachmentSource | Attachment, Base64, Url |



