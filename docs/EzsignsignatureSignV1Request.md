
# EzsignsignatureSignV1Request

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **bIsAutomatic** | **kotlin.Boolean** | Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Signature**, **Initials** or **Stamp**.  |  |
| **fkiEzsignsigningreasonID** | **kotlin.Int** | The unique ID of the Ezsignsigningreason |  [optional] |
| **fkiFontID** | **kotlin.Int** | The unique ID of the Font |  [optional] |
| **sValue** | **kotlin.String** | The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea** |  [optional] |
| **eAttachmentsConfirmationDecision** | [**inline**](#EAttachmentsConfirmationDecision) | Whether the attachment are accepted or refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation** |  [optional] |
| **sAttachmentsRefusalReason** | **kotlin.String** | The reason of refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation** |  [optional] |
| **sSvg** | **kotlin.String** | The SVG of the signature.  This can only be set if eEzsignsignatureType is **Signature**_/_**Initials** and **bIsAutomatic** is false |  [optional] |
| **aObjFile** | [**kotlin.collections.List&lt;CommonFile&gt;**](CommonFile.md) |  |  [optional] |
| **objCreditcard** | [**CustomCreditcardRequest**](CustomCreditcardRequest.md) |  |  [optional] |


<a id="EAttachmentsConfirmationDecision"></a>
## Enum: eAttachmentsConfirmationDecision
| Name | Value |
| ---- | ----- |
| eAttachmentsConfirmationDecision | Accepted, Refused |



