
# WebhookMinusGetObjectMinusV1MinusResponseMinusMPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiWebhookID** | **kotlin.Int** | The unique ID of the Webhook | 
**sWebhookDescription** | **kotlin.String** | The description of the Webhook | 
**eWebhookModule** | [**FieldMinusEWebhookModule**](FieldMinusEWebhookModule.md) |  | 
**sWebhookUrl** | **kotlin.String** | The URL of the Webhook callback | 
**sWebhookEmailfailed** | **kotlin.String** | The email that will receive the Webhook in case all attempts fail | 
**bWebhookSkipsslvalidation** | **kotlin.Boolean** | Wheter the server&#39;s SSL certificate should be validated or not. Not recommended to skip for production use | 
**fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  [optional]
**sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester |  [optional]
**eWebhookEzsignevent** | [**FieldMinusEWebhookEzsignevent**](FieldMinusEWebhookEzsignevent.md) |  |  [optional]
**eWebhookManagementevent** | [**FieldMinusEWebhookManagementevent**](FieldMinusEWebhookManagementevent.md) |  |  [optional]
**bWebhookIsactive** | **kotlin.Boolean** | Whether the Webhook is active or not |  [optional]



