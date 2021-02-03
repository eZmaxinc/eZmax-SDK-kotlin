
# WebhookMinusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiWebhookID** | **kotlin.Int** | The Webhook ID. This value is visible in the admin interface. | 
**eWebhookModule** | [**inline**](#EWebhookModuleEnum) | The Module generating the Event. | 
**pksCustomerCode** | **kotlin.String** | The Customer Code in which the event was generated | 
**sWebhookUrl** | **kotlin.String** | The url being called | 
**sWebhookEmailfailed** | **kotlin.String** | The email that will receive the webhook in case all attempts fail. | 
**eWebhookEzsignevent** | [**inline**](#EWebhookEzsigneventEnum) | This Ezsign Event. This property will be set only if the Module is \&quot;Ezsign\&quot;. |  [optional]
**eWebhookManagementevent** | [**inline**](#EWebhookManagementeventEnum) | This Management Event. This property will be set only if the Module is \&quot;Management\&quot;. |  [optional]


<a name="EWebhookModuleEnum"></a>
## Enum: eWebhookModule
Name | Value
---- | -----
eWebhookModule | Ezsign, Management


<a name="EWebhookEzsigneventEnum"></a>
## Enum: eWebhookEzsignevent
Name | Value
---- | -----
eWebhookEzsignevent | DocumentCompleted, FolderCompleted


<a name="EWebhookManagementeventEnum"></a>
## Enum: eWebhookManagementevent
Name | Value
---- | -----
eWebhookManagementevent | UserCreated



