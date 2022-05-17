
# WebhookMinusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pksCustomerCode** | **kotlin.String** | The customer code assigned to your account | 
**pkiWebhookID** | **kotlin.Int** | The Webhook ID. This value is visible in the admin interface. | 
**eWebhookModule** | [**inline**](#EWebhookModule) | The Module generating the Event. | 
**sWebhookUrl** | **kotlin.String** | The url being called | 
**bWebhookTest** | **kotlin.Boolean** | Wheter the webhook received is a manual test or a real event | 
**bWebhookSkipsslvalidation** | **kotlin.Boolean** | Wheter the server&#39;s SSL certificate should be validated or not. Not recommended for production use. | 
**sWebhookEmailfailed** | **kotlin.String** | The email that will receive the webhook in case all attempts fail. | 
**eWebhookEzsignevent** | [**inline**](#EWebhookEzsignevent) | This Ezsign Event. This property will be set only if the Module is \&quot;Ezsign\&quot;. |  [optional]
**eWebhookManagementevent** | [**inline**](#EWebhookManagementevent) | This Management Event. This property will be set only if the Module is \&quot;Management\&quot;. |  [optional]


<a name="EWebhookModule"></a>
## Enum: eWebhookModule
Name | Value
---- | -----
eWebhookModule | Ezsign, Management


<a name="EWebhookEzsignevent"></a>
## Enum: eWebhookEzsignevent
Name | Value
---- | -----
eWebhookEzsignevent | DocumentCompleted, FolderCompleted


<a name="EWebhookManagementevent"></a>
## Enum: eWebhookManagementevent
Name | Value
---- | -----
eWebhookManagementevent | UserCreated



