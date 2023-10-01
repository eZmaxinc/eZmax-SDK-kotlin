
# ActivesessionResponseCompound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eActivesessionUsertype** | [**FieldEActivesessionUsertype**](FieldEActivesessionUsertype.md) |  | 
**eActivesessionOrigin** | [**FieldEActivesessionOrigin**](FieldEActivesessionOrigin.md) |  | 
**eActivesessionWeekdaystart** | [**FieldEActivesessionWeekdaystart**](FieldEActivesessionWeekdaystart.md) |  | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**sCompanyNameX** | **kotlin.String** | The Name of the Company in the language of the requester | 
**sDepartmentNameX** | **kotlin.String** | The Name of the Department in the language of the requester | 
**bActivesessionDebug** | **kotlin.Boolean** | Whether the active session is in debug or not | 
**bActivesessionIssuperadmin** | **kotlin.Boolean** | Whether the active session is superadmin or not | 
**pksCustomerCode** | **kotlin.String** | The customer code assigned to your account | 
**fkiSystemconfigurationtypeID** | **kotlin.Int** | The unique ID of the Systemconfigurationtype | 
**aPkiPermissionID** | **kotlin.collections.List&lt;kotlin.Int&gt;** | An array of permissions granted to the user or api key | 
**objUserReal** | [**ActivesessionResponseCompoundUser**](ActivesessionResponseCompoundUser.md) |  | 
**aEModuleInternalname** | **kotlin.collections.List&lt;kotlin.String&gt;** | An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. | 
**fkiSignatureID** | **kotlin.Int** | The unique ID of the Signature |  [optional]
**objUserCloned** | [**ActivesessionResponseCompoundUser**](ActivesessionResponseCompoundUser.md) |  |  [optional]
**objApikey** | [**ActivesessionResponseCompoundApikey**](ActivesessionResponseCompoundApikey.md) |  |  [optional]



