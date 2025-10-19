
# CustomAttachmentImportIntoEDMResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiAttachmentIDSource** | **kotlin.Int** | The unique ID of the Attachment. |  [optional] |
| **pkiAttachmentIDNew** | **kotlin.Int** | The unique ID of the Attachment. |  [optional] |
| **eAttachmentStatus** | [**inline**](#EAttachmentStatus) |  |  [optional] |
| **bAllowOverwrite** | **kotlin.Boolean** | Whether we allow or not the file overwrite |  [optional] |


<a id="EAttachmentStatus"></a>
## Enum: eAttachmentStatus
| Name | Value |
| ---- | ----- |
| eAttachmentStatus | Accepted, FileExists, Forbidden, Overwrite |



