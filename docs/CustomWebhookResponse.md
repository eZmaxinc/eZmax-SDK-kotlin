
# CustomWebhookResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiWebhookID** | **kotlin.Int** | The unique ID of the Webhook | 
**sWebhookDescription** | **kotlin.String** | The description of the Webhook | 
**eWebhookModule** | [**FieldEWebhookModule**](FieldEWebhookModule.md) |  | 
**sWebhookUrl** | **kotlin.String** | The URL of the Webhook callback | 
**sWebhookEmailfailed** | **kotlin.String** | The email that will receive the Webhook in case all attempts fail | 
**bWebhookIsactive** | **kotlin.Boolean** | Whether the Webhook is active or not | 
**bWebhookIssigned** | **kotlin.Boolean** | Whether the requests will be signed or not | 
**bWebhookSkipsslvalidation** | **kotlin.Boolean** | Wheter the server&#39;s SSL certificate should be validated or not. Not recommended to skip for production use | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 
**pksCustomerCode** | **kotlin.String** | The customer code assigned to your account | 
**bWebhookTest** | **kotlin.Boolean** | Wheter the webhook received is a manual test or a real event | 
**fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  [optional]
**sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester |  [optional]
**eWebhookEzsignevent** | [**FieldEWebhookEzsignevent**](FieldEWebhookEzsignevent.md) |  |  [optional]
**eWebhookManagementevent** | [**FieldEWebhookManagementevent**](FieldEWebhookManagementevent.md) |  |  [optional]
**sWebhookApikey** | **kotlin.String** | The Apikey for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**sWebhookSecret** | **kotlin.String** | The Secret for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**sWebhookEvent** | **kotlin.String** | The concatenated string to describe the Webhook event |  [optional]
**aObjWebhookheader** | [**kotlin.collections.List&lt;WebhookheaderResponseCompound&gt;**](WebhookheaderResponseCompound.md) |  |  [optional]



