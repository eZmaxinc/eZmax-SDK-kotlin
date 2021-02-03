
# ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sCustomerCode** | **kotlin.String** | The customer code specific to the client in which the API request is being made | 
**eActivesessionSessiontype** | [**inline**](#EActivesessionSessiontypeEnum) | The type of session used for the API request call | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sCompanyNameX** | **kotlin.String** | The name of the active Company in the current language | 
**sDepartmentNameX** | **kotlin.String** | The name of the active Department in the current language | 
**aRegisteredModules** | **kotlin.collections.List&lt;kotlin.String&gt;** | An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. | 
**aPermissions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | An array of permissions granted to the user or api key | 


<a name="EActivesessionSessiontypeEnum"></a>
## Enum: eActivesessionSessiontype
Name | Value
---- | -----
eActivesessionSessiontype | Normal



