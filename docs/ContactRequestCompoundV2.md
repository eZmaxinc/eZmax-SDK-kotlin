
# ContactRequestCompoundV2

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fkiContacttitleID** | **kotlin.Int** | The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)| |  |
| **fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
| **eContactType** | [**FieldEContactType**](FieldEContactType.md) |  |  |
| **sContactFirstname** | **kotlin.String** | The First name of the contact |  |
| **sContactLastname** | **kotlin.String** | The Last name of the contact |  |
| **objContactinformations** | [**ContactinformationsRequestCompoundV2**](ContactinformationsRequestCompoundV2.md) |  |  |
| **sContactCompany** | **kotlin.String** | The Company name of the contact |  [optional] |
| **dtContactBirthdate** | **kotlin.String** | The Birth Date of the contact |  [optional] |
| **sContactOccupation** | **kotlin.String** | The occupation of the Contact |  [optional] |
| **tContactNote** | **kotlin.String** | The note of the Contact |  [optional] |
| **bContactIsactive** | **kotlin.Boolean** | Whether the contact is active or not |  [optional] |



