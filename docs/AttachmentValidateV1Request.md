
# AttachmentValidateV1Request

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eAttachmentVerified** | [**FieldEAttachmentVerified**](FieldEAttachmentVerified.md) |  |  |
| **fkiAttachmentrejectreasonID** | **kotlin.Int** | The unique ID of the Attachmentrejectreason |  [optional] |
| **tAttachmentRejectioncomment** | **kotlin.String** | The rejectioncomment of the Attachment |  [optional] |
| **aSNotificationEmailAddress** | **kotlin.collections.Set&lt;kotlin.String&gt;** | A list of email addresses to send a rejection notification to. |  [optional] |
| **tNotificationMessage** | **kotlin.String** | The email body to send to the notification recipients. |  [optional] |
| **bNotificationIncludeAttachment** | **kotlin.Boolean** | Should a copy of the attachment be included in the email. |  [optional] |



