
# CustomCommunicationsenderResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eCommunicationsenderObjecttype** | [**inline**](#ECommunicationsenderObjecttype) |  |  |
| **objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  |  |
| **fkiAgentID** | **kotlin.Int** | The unique ID of the Agent. |  [optional] |
| **fkiBrokerID** | **kotlin.Int** | The unique ID of the Broker. |  [optional] |
| **fkiUserID** | **kotlin.Int** | The unique ID of the User |  [optional] |
| **fkiMailboxsharedID** | **kotlin.Int** | The unique ID of the Mailboxshared |  [optional] |
| **fkiPhonelinesharedID** | **kotlin.Int** | The unique ID of the Phonelineshared |  [optional] |
| **objEmail** | [**EmailResponse**](EmailResponse.md) | An Email Object and children to create a complete structure |  [optional] |
| **objPhoneFax** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional] |
| **objPhoneSMS** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional] |


<a id="ECommunicationsenderObjecttype"></a>
## Enum: eCommunicationsenderObjecttype
| Name | Value |
| ---- | ----- |
| eCommunicationsenderObjecttype | Agent, Broker, User, Mailboxshared, Phonelineshared |



