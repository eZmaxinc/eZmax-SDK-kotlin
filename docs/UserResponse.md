
# UserResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiUserID** | **kotlin.Int** | The unique ID of the User |  |
| **fkiCompanyIDDefault** | **kotlin.Int** | The unique ID of the Company |  |
| **sCompanyNameX** | **kotlin.String** | The Name of the Company in the language of the requester |  |
| **fkiDepartmentIDDefault** | **kotlin.Int** | The unique ID of the Department |  |
| **sDepartmentNameX** | **kotlin.String** | The Name of the Department in the language of the requester |  |
| **fkiTimezoneID** | **kotlin.Int** | The unique ID of the Timezone |  |
| **sTimezoneName** | **kotlin.String** | The description of the Timezone |  |
| **fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
| **sLanguageNameX** | **kotlin.String** | The Name of the Language in the language of the requester |  |
| **objEmail** | [**EmailResponseCompound**](EmailResponseCompound.md) |  |  |
| **fkiBillingentityinternalID** | **kotlin.Int** | The unique ID of the Billingentityinternal. |  |
| **sBillingentityinternalDescriptionX** | **kotlin.String** | The description of the Billingentityinternal in the language of the requester |  |
| **eUserOrigin** | [**FieldEUserOrigin**](FieldEUserOrigin.md) |  |  |
| **eUserType** | [**FieldEUserType**](FieldEUserType.md) |  |  |
| **eUserLogintype** | [**FieldEUserLogintype**](FieldEUserLogintype.md) |  |  |
| **sUserFirstname** | **kotlin.String** | The first name of the user |  |
| **sUserLastname** | **kotlin.String** | The last name of the user |  |
| **sUserLoginname** | **kotlin.String** | The login name of the User. |  |
| **eUserEzsignaccess** | [**FieldEUserEzsignaccess**](FieldEUserEzsignaccess.md) |  |  |
| **bUserIsactive** | **kotlin.Boolean** | Whether the User is active or not |  |
| **bUserChangepassword** | **kotlin.Boolean** | Whether if the User is forced to change its password |  |
| **objAudit** | [**CommonAudit**](CommonAudit.md) |  |  |
| **fkiAgentID** | **kotlin.Int** | The unique ID of the Agent. |  [optional] |
| **fkiBrokerID** | **kotlin.Int** | The unique ID of the Broker. |  [optional] |
| **fkiAssistantID** | **kotlin.Int** | The unique ID of the Assistant. |  [optional] |
| **fkiEmployeeID** | **kotlin.Int** | The unique ID of the Employee. |  [optional] |
| **objPhoneHome** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional] |
| **objPhoneSMS** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional] |
| **fkiSecretquestionID** | **kotlin.Int** | The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father&#39;s middle name| |15|Your mother&#39;s maiden name| |16|Name of your eldest child| |17|Your spouse&#39;s middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat&#39;s name| |22|Date of Birth (YYYY-MM-DD)| |22|Secret Code| |22|Your reference code| |  [optional] |
| **fkiModuleIDForm** | **kotlin.Int** | The unique ID of the Module |  [optional] |
| **sModuleNameX** | **kotlin.String** | The Name of the Module in the language of the requester |  [optional] |
| **sUserJobtitle** | **kotlin.String** | The job title of the user |  [optional] |
| **dtUserLastlogondate** | **kotlin.String** | The last logon date of the User |  [optional] |
| **dtUserPasswordchanged** | **kotlin.String** | The date at which the User&#39;s password was last changed |  [optional] |
| **dtUserEzsignprepaidexpiration** | **kotlin.String** | The eZsign prepaid expiration date |  [optional] |
| **bUserValidatebyadministration** | **kotlin.Boolean** | Whether if the transactions in which the User is implicated must be validated by administrative personnel or not |  [optional] |
| **bUserValidatebydirector** | **kotlin.Boolean** | Whether if the transactions in which the User is implicated must be validated by a director or not |  [optional] |
| **bUserAttachmentautoverified** | **kotlin.Boolean** | Whether if Attachments uploaded by the User must be validated or not |  [optional] |



