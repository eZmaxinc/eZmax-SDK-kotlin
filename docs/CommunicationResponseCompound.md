
# CommunicationResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiCommunicationID** | **kotlin.Int** | The unique ID of the Communication. | 
**eCommunicationImportance** | [**FieldECommunicationImportance**](FieldECommunicationImportance.md) |  | 
**eCommunicationType** | [**FieldECommunicationType**](FieldECommunicationType.md) |  | 
**sCommunicationSubject** | **kotlin.String** | The subject of the Communication | 
**eCommunicationDirection** | [**ComputedECommunicationDirection**](ComputedECommunicationDirection.md) |  | 
**iCommunicationrecipientCount** | **kotlin.Int** | The count of Communicationrecipient | 
**bCommunicationPrivate** | **kotlin.Boolean** | Whether the Communication is private or not | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 
**aObjCommunicationattachment** | [**kotlin.collections.List&lt;CommunicationattachmentResponseCompound&gt;**](CommunicationattachmentResponseCompound.md) |  | 
**aObjCommunicationrecipient** | [**kotlin.collections.List&lt;CommunicationrecipientResponseCompound&gt;**](CommunicationrecipientResponseCompound.md) |  | 
**aObjCommunicationexternalrecipient** | [**kotlin.collections.List&lt;CommunicationexternalrecipientResponseCompound&gt;**](CommunicationexternalrecipientResponseCompound.md) |  | 
**sCommunicationBodyurl** | **kotlin.String** | The url of the body used as body in the Communication |  [optional]
**objDescriptionstaticSender** | [**DescriptionstaticResponse**](DescriptionstaticResponse.md) |  |  [optional]
**objEmailstaticSender** | [**EmailstaticResponse**](EmailstaticResponse.md) |  |  [optional]
**objPhonestaticSender** | [**PhonestaticResponse**](PhonestaticResponse.md) |  |  [optional]



