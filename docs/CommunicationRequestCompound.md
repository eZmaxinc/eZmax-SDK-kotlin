
# CommunicationRequestCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eCommunicationType** | [**FieldECommunicationType**](FieldECommunicationType.md) |  | 
**tCommunicationBody** | **kotlin.String** | The Body of the Communication | 
**bCommunicationPrivate** | **kotlin.Boolean** | Whether the Communication is private or not | 
**aObjCommunicationattachment** | [**kotlin.collections.List&lt;CustomCommunicationattachmentRequest&gt;**](CustomCommunicationattachmentRequest.md) |  | 
**aObjCommunicationrecipient** | [**kotlin.collections.List&lt;CommunicationrecipientRequestCompound&gt;**](CommunicationrecipientRequestCompound.md) |  | 
**aObjCommunicationreference** | [**kotlin.collections.List&lt;CommunicationreferenceRequestCompound&gt;**](CommunicationreferenceRequestCompound.md) |  | 
**aObjCommunicationexternalrecipient** | [**kotlin.collections.List&lt;CommunicationexternalrecipientRequestCompound&gt;**](CommunicationexternalrecipientRequestCompound.md) |  | 
**pkiCommunicationID** | **kotlin.Int** | The unique ID of the Communication. |  [optional]
**eCommunicationImportance** | [**FieldECommunicationImportance**](FieldECommunicationImportance.md) |  |  [optional]
**objCommunicationsender** | [**CustomCommunicationsenderRequest**](CustomCommunicationsenderRequest.md) |  |  [optional]
**sCommunicationSubject** | **kotlin.String** | The subject of the Communication |  [optional]
**eCommunicationAttachmenttype** | [**inline**](#ECommunicationAttachmenttype) | How the attachment should be included in the email.   Only used if eCommunicationType is **Email** |  [optional]
**iCommunicationAttachmentlinkexpiration** | **kotlin.Int** | The number of days before the attachment link expired.   Only used if eCommunicationType is **Email** and eCommunicationattachmentType is **Link** |  [optional]
**bCommunicationReadreceipt** | **kotlin.Boolean** | Whether we ask for a read receipt or not. |  [optional]


<a id="ECommunicationAttachmenttype"></a>
## Enum: eCommunicationAttachmenttype
Name | Value
---- | -----
eCommunicationAttachmenttype | Attachment, Url



