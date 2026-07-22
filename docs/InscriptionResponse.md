
# InscriptionResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int** | The unique ID of the Inscription. |  |
| **fkiRealestateboardID** | **kotlin.Int** | The unique ID of the Realestateboard |  |
| **fkiAddressID** | **kotlin.Int** | The unique ID of the Address |  |
| **fkiInscriptionbuildingtypeID** | **kotlin.Int** | The unique ID of the Inscriptionbuildingtype |  |
| **fkiInscriptiontypeID** | **kotlin.Int** | The unique ID of the Inscriptiontype |  |
| **fkiInscriptioncategoryID** | **kotlin.Int** | The unique ID of the Inscriptioncategory |  |
| **eInscriptionStep** | [**FieldEInscriptionStep**](FieldEInscriptionStep.md) |  |  |
| **eInscriptionResidenceType** | [**FieldEInscriptionResidenceType**](FieldEInscriptionResidenceType.md) |  |  |
| **sInscriptionCivicend** | **kotlin.String** | The address civic end of the Inscription |  |
| **sInscriptionContract** | **kotlin.String** | The sale contract number |  |
| **iInscriptionSellerdeclaration** | **kotlin.Int** | The seller declaration number of the Inscription |  |
| **eInscriptionType** | [**FieldEInscriptionType**](FieldEInscriptionType.md) |  |  |
| **dInscriptionInitialsaleprice** | **kotlin.String** | The initial sale price of the Inscription |  |
| **dInscriptionSaleprice** | **kotlin.String** | The saleprice of the Inscription |  |
| **dInscriptionRentprice** | **kotlin.String** | The rent price of the Inscription |  |
| **eInscriptionRemunerationtype** | [**FieldEInscriptionRemunerationtype**](FieldEInscriptionRemunerationtype.md) |  |  |
| **eInscriptionRemunerationinscriptorsellertype** | [**FieldEInscriptionRemunerationinscriptorsellertype**](FieldEInscriptionRemunerationinscriptorsellertype.md) |  |  |
| **eInscriptionRemunerationreferencetype** | [**FieldEInscriptionRemunerationreferencetype**](FieldEInscriptionRemunerationreferencetype.md) |  |  |
| **eInscriptionRemunerationtotaltype** | [**FieldEInscriptionRemunerationtotaltype**](FieldEInscriptionRemunerationtotaltype.md) |  |  |
| **dInscriptionRemuneration** | **kotlin.String** | The remuneration amount of the Inscription |  |
| **dInscriptionRemunerationinscriptorseller** | **kotlin.String** | The remuneration amount for the inscriptor or seller of the Inscription |  |
| **dInscriptionRemunerationreference** | **kotlin.String** | The remuneration amount for the reference of the Inscription |  |
| **dInscriptionRemunerationtotal** | **kotlin.String** | The remuneration amount total of the Inscription |  |
| **dInscriptionMortgagesold** | **kotlin.String** | The balande for the mortgage of the Inscription |  |
| **tInscriptionCadastre** | **kotlin.String** | The cadastre of the Inscription |  |
| **bInscriptionReference** | **kotlin.Boolean** | Whether if it&#39;s an reference |  |
| **bInscriptionInspection** | **kotlin.Boolean** | Whether the inscription can be acces by an inspector |  |
| **bInscriptionIsactive** | **kotlin.Boolean** | Whether the inscription is active or not |  |
| **tInscriptionChecklistnote** | **kotlin.String** | The checklist note of the Inscription |  |
| **bInscriptionNew** | **kotlin.Boolean** | Whether if it&#39;s an new |  |
| **bInscriptionHomeowner** | **kotlin.Boolean** | Whether if it&#39;s an homeowner |  |
| **bInscriptionArchived** | **kotlin.Boolean** | Whether the inscription is archived or not |  |
| **bInscriptionLitigation** | **kotlin.Boolean** | Whether if it&#39;s an litigation |  |
| **bInscriptionRepossession** | **kotlin.Boolean** | Whether if it&#39;s an repossession |  |
| **bInscriptionIssolicitation** | **kotlin.Boolean** | Whether if it&#39;s a solicitation |  |
| **bInscriptionSalebyowner** | **kotlin.Boolean** | Whether if it&#39;s a sale by the owner |  |
| **bInscriptionSoldwithoutlegalwarranty** | **kotlin.Boolean** | Whether if it&#39;s sold without the legal warranty |  |
| **iInscriptionConstructionyear** | **kotlin.Int** | The construction year of the Inscription |  |
| **iInscriptionUnit** | **kotlin.Int** | The number of unit for the Inscription |  |
| **fkiDepartmentID** | **kotlin.Int** | The unique ID of the Department |  [optional] |
| **sDepartmentNameX** | **kotlin.String** | The Name of the Department in the language of the requester |  [optional] |
| **sRealestateboardNameX** | **kotlin.String** | The name of the Realestateboard |  [optional] |
| **objAddress** | [**AddressResponseCompound**](AddressResponseCompound.md) |  |  [optional] |
| **sInscriptionbuildingtypeNameX** | **kotlin.String** | The name of the Inscriptionbuildingtype in the language of the requester |  [optional] |
| **sInscriptiontypeNameX** | **kotlin.String** | The name of the Inscriptiontype in the language of the requester |  [optional] |
| **sInscriptioncategoryNameX** | **kotlin.String** | The name of the Inscriptioncategory in the language of the requester |  [optional] |
| **sInscriptionMLS** | **kotlin.String** | The mls of the Inscription |  [optional] |
| **dtInscriptionDate** | **kotlin.String** | The date of the Inscription |  [optional] |
| **dtInscriptionCancellationdate** | **kotlin.String** | The cancellation date of the Inscription |  [optional] |
| **dtInscriptionInitialexpirationdate** | **kotlin.String** | The initial expiration date of the Inscription |  [optional] |
| **dtInscriptionExpirationdate** | **kotlin.String** | The expiration date of the Inscription |  [optional] |
| **dtInscriptionNotarydate** | **kotlin.String** | The notary date of the Inscription |  [optional] |
| **dtInscriptionNotaryentereddate** | **kotlin.String** | The notary entered date of the Inscription |  [optional] |
| **objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional] |



