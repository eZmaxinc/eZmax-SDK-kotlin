
# ApikeyMinusResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiApikeyID** | **kotlin.Int** | The unique ID of the Apikey | 
**fkiUserID** | **kotlin.Int** | The unique ID of the User | 
**objApikeyDescription** | [**MultilingualMinusApikeyDescription**](MultilingualMinusApikeyDescription.md) |  | 
**objContactName** | [**CustomMinusContactNameMinusResponse**](CustomMinusContactNameMinusResponse.md) |  | 
**bApikeyIsactive** | **kotlin.Boolean** | Whether the apikey is active or not | 
**objAudit** | [**CommonMinusAudit**](CommonMinusAudit.md) |  | 
**sApikeyApikey** | **kotlin.String** | The Apikey for the API key.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**sApikeySecret** | **kotlin.String** | The Secret for the API key.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**bApikeyIssigned** | **kotlin.Boolean** | Whether the apikey is signed or not |  [optional]



