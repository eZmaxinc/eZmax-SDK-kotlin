
# InscriptionListElement

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int** | The unique ID of the Inscription. |  |
| **fkiInscriptiontypeID** | **kotlin.Int** | The unique ID of the Inscriptiontype |  |
| **sInscriptiontypeNameX** | **kotlin.String** | The name of the Inscriptiontype in the language of the requester |  |
| **fkiInscriptionbuildingtypeID** | **kotlin.Int** | The unique ID of the Inscriptionbuildingtype |  |
| **sInscriptionbuildingtypeNameX** | **kotlin.String** | The name of the Inscriptionbuildingtype in the language of the requester |  |
| **fkiInscriptioncategoryID** | **kotlin.Int** | The unique ID of the Inscriptioncategory |  |
| **sInscriptioncategoryNameX** | **kotlin.String** | The name of the Inscriptioncategory in the language of the requester |  |
| **eInscriptionStep** | [**FieldEInscriptionStep**](FieldEInscriptionStep.md) |  |  |
| **eInscriptionType** | [**FieldEInscriptionType**](FieldEInscriptionType.md) |  |  |
| **sInscriptionCivicend** | **kotlin.String** | The civicend of the Inscription |  |
| **dInscriptionSaleprice** | **kotlin.String** | The saleprice of the Inscription |  |
| **dInscriptionRentprice** | **kotlin.String** | The rentprice of the Inscription |  |
| **bInscriptionIsactive** | **kotlin.Boolean** | Whether the inscription is active or not |  |
| **bInscriptionArchived** | **kotlin.Boolean** | Whether the inscription is archived or not |  |
| **iInscriptionnotauthenticatedCanceled** | **kotlin.Int** | The numbre of inscriptionnotauthenticated was canceled in this Inscription |  |
| **iInscriptionUnit** | **kotlin.Int** | The unit of the Inscription |  |
| **bAllowedCopyintoinscriptionedm** | **kotlin.Boolean** | Whether we are allowed to copy into the Inscription EDM |  |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int** | The unique ID of the Inscriptionnotauthenticated. |  [optional] |
| **fkiBuyercontractID** | **kotlin.Int** | The unique ID of the Buyercontract |  [optional] |
| **sBuyercontractContract** | **kotlin.String** | The number of the Buyercontract |  [optional] |
| **sInscriptionMLS** | **kotlin.String** | The mls of the Inscription |  [optional] |
| **sInscriptionContract** | **kotlin.String** | The sale contract number |  [optional] |
| **dtInscriptionDate** | **kotlin.String** | The date of the Inscription |  [optional] |
| **dtInscriptionExpirationdate** | **kotlin.String** | The expirationdate of the Inscription |  [optional] |
| **dtInscriptionNotarydate** | **kotlin.String** | The notarydate of the Inscription |  [optional] |
| **bInscriptionInspection** | **kotlin.Boolean** | Whether the inscription can be acces by an inspector |  [optional] |
| **dtInscriptionnotauthenticatedNotaryscheduledate** | **kotlin.String** | The notaryscheduledate of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedTransactiondate** | **kotlin.String** | The transactiondate of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedTransactiondateReal** | **kotlin.String** | The transactiondatereal of the Inscriptionnotauthenticated |  [optional] |
| **bInscriptionnotauthenticatedConditional** | **kotlin.Boolean** | Whether the inscriptionnotauthenticated is conditional |  [optional] |
| **bInscriptionnotauthenticatedIsactive** | **kotlin.Boolean** | Whether the inscriptionnotauthenticated is active or not |  [optional] |
| **sAddressCivic** | **kotlin.String** | The Civic number. |  [optional] |
| **sAddressStreet** | **kotlin.String** | The Street Name |  [optional] |
| **sAddressSuite** | **kotlin.String** | The Suite or appartment number |  [optional] |
| **sAddressCity** | **kotlin.String** | The City name |  [optional] |
| **sAddressZip** | **kotlin.String** | The Postal/Zip Code  The value must be entered without spaces |  [optional] |
| **fkiProvinceID** | **kotlin.Int** | The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming| |  [optional] |
| **sProvinceNameX** | **kotlin.String** | The name of the Province in the language of the requester |  [optional] |
| **fkiCountryID** | **kotlin.Int** | The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States| |  [optional] |
| **sCountryNameX** | **kotlin.String** | The name of the Country in the language of the requester |  [optional] |



