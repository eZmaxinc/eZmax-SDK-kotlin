
# WebhookRequestCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sWebhookDescription** | **kotlin.String** | The description of the Webhook | 
**eWebhookModule** | [**FieldEWebhookModule**](FieldEWebhookModule.md) |  | 
**sWebhookUrl** | **kotlin.String** | The URL of the Webhook callback | 
**sWebhookEmailfailed** | **kotlin.String** | The email that will receive the Webhook in case all attempts fail | 
**bWebhookIsactive** | **kotlin.Boolean** | Whether the Webhook is active or not | 
**bWebhookSkipsslvalidation** | **kotlin.Boolean** | Wheter the server&#39;s SSL certificate should be validated or not. Not recommended to skip for production use | 
**pkiWebhookID** | **kotlin.Int** | The unique ID of the Webhook |  [optional]
**fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  [optional]
**eWebhookEzsignevent** | [**FieldEWebhookEzsignevent**](FieldEWebhookEzsignevent.md) |  |  [optional]
**eWebhookManagementevent** | [**FieldEWebhookManagementevent**](FieldEWebhookManagementevent.md) |  |  [optional]
**bWebhookIssigned** | **kotlin.Boolean** | Whether the requests will be signed or not |  [optional]
**aObjWebhookheader** | [**kotlin.collections.List&lt;WebhookheaderRequestCompound&gt;**](WebhookheaderRequestCompound.md) |  |  [optional]



