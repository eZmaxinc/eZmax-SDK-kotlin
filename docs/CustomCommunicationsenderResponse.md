
# CustomCommunicationsenderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eCommunicationsenderObjecttype** | [**inline**](#ECommunicationsenderObjecttype) |  | 
**objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  | 
**fkiAgentID** | **kotlin.Int** | The unique ID of the Agent. |  [optional]
**fkiBrokerID** | **kotlin.Int** | The unique ID of the Broker. |  [optional]
**fkiUserID** | **kotlin.Int** | The unique ID of the User |  [optional]
**fkiMailboxsharedID** | **kotlin.Int** | The unique ID of the Mailboxshared |  [optional]
**sEmailAddress** | **kotlin.String** | The email address. |  [optional]
**sPhoneE164** | **kotlin.String** | A phone number in E.164 Format |  [optional]


<a id="ECommunicationsenderObjecttype"></a>
## Enum: eCommunicationsenderObjecttype
Name | Value
---- | -----
eCommunicationsenderObjecttype | Agent, Broker, User, Mailboxshared



