
# ContactResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiContactID** | **kotlin.Int** | The unique ID of the Contact |  |
| **fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
| **fkiContacttitleID** | **kotlin.Int** | The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)| |  |
| **fkiContactinformationsID** | **kotlin.Int** | The unique ID of the Contactinformations |  |
| **eContactType** | [**FieldEContactType**](FieldEContactType.md) |  |  |
| **sContactFirstname** | **kotlin.String** | The First name of the contact |  |
| **sContactLastname** | **kotlin.String** | The Last name of the contact |  |
| **bContactIsactive** | **kotlin.Boolean** | Whether the contact is active or not |  |
| **objContactinformations** | [**ContactinformationsResponseCompound**](ContactinformationsResponseCompound.md) |  |  |
| **dtContactBirthdate** | **kotlin.String** | The Birth Date of the contact |  [optional] |
| **sContactCompany** | **kotlin.String** | The Company name of the contact |  [optional] |
| **sContactOccupation** | **kotlin.String** | The occupation of the Contact |  [optional] |
| **tContactNote** | **kotlin.String** | The note of the Contact |  [optional] |



