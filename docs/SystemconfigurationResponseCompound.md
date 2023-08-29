
# SystemconfigurationResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiSystemconfigurationID** | **kotlin.Int** | The unique ID of the Systemconfiguration | 
**fkiSystemconfigurationtypeID** | **kotlin.Int** | The unique ID of the Systemconfigurationtype | 
**sSystemconfigurationtypeDescriptionX** | **kotlin.String** | The description of the Systemconfigurationtype in the language of the requester | 
**eSystemconfigurationNewexternaluseraction** | [**FieldESystemconfigurationNewexternaluseraction**](FieldESystemconfigurationNewexternaluseraction.md) |  | 
**eSystemconfigurationLanguage1** | [**FieldESystemconfigurationLanguage1**](FieldESystemconfigurationLanguage1.md) |  | 
**eSystemconfigurationLanguage2** | [**FieldESystemconfigurationLanguage2**](FieldESystemconfigurationLanguage2.md) |  | 
**eSystemconfigurationEzsign** | [**FieldESystemconfigurationEzsign**](FieldESystemconfigurationEzsign.md) |  | 
**bSystemconfigurationEzsignpersonnal** | **kotlin.Boolean** | Whether if we allow the creation of personal files in eZsign | 
**bSystemconfigurationSspr** | **kotlin.Boolean** | Whether if we allow SSPR | 
**dtSystemconfigurationReadonlyexpirationstart** | **kotlin.String** | The start date where the system will be in read only |  [optional]
**dtSystemconfigurationReadonlyexpirationend** | **kotlin.String** | The end date where the system will be in read only |  [optional]



