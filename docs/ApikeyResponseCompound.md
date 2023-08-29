
# ApikeyResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiApikeyID** | **kotlin.Int** | The unique ID of the Apikey | 
**fkiUserID** | **kotlin.Int** | The unique ID of the User | 
**objApikeyDescription** | [**MultilingualApikeyDescription**](MultilingualApikeyDescription.md) |  | 
**objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  | 
**bApikeyIsactive** | **kotlin.Boolean** | Whether the apikey is active or not | 
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 
**sApikeyApikey** | **kotlin.String** | The Apikey for the API key.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**sApikeySecret** | **kotlin.String** | The Secret for the API key.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**bApikeyIssigned** | **kotlin.Boolean** | Whether the apikey is signed or not |  [optional]



