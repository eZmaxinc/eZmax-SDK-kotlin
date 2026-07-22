
# InscriptionnotauthenticatedResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int** | The unique ID of the Inscriptionnotauthenticated. |  |
| **fkiInscriptionID** | **kotlin.Int** | The unique ID of the Inscription. |  |
| **fkiTaxassignmentID** | **kotlin.Int** | The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable| |  |
| **eInscriptionnotauthenticatedType** | [**FieldEInscriptionnotauthenticatedType**](FieldEInscriptionnotauthenticatedType.md) |  |  |
| **dInscriptionnotauthenticatedMortgageloan** | **kotlin.String** | The amount of the mortgage loan of the Inscriptionnotauthenticated |  |
| **etInscriptionnotauthenticatedMortgagetype** | [**FieldEtInscriptionnotauthenticatedMortgagetype**](FieldEtInscriptionnotauthenticatedMortgagetype.md) |  |  |
| **dInscriptionnotauthenticatedTransactionprice** | **kotlin.String** | The transaction price of the Inscriptionnotauthenticated |  |
| **eInscriptionnotauthenticatedRemunerationtype** | [**FieldEInscriptionnotauthenticatedRemunerationtype**](FieldEInscriptionnotauthenticatedRemunerationtype.md) |  |  |
| **dInscriptionnotauthenticatedRemuneration** | **kotlin.String** | The amount for the remuneration of the Inscriptionnotauthenticated |  |
| **dInscriptionnotauthenticatedRemunerationsubtotal** | **kotlin.String** | The subtotal for the remuneration of the Inscriptionnotauthenticated |  |
| **dInscriptionnotauthenticatedRemunerationtotal** | **kotlin.String** | The total for the remuneration of the Inscriptionnotauthenticated |  |
| **sInscriptionnotauthenticatedOffertopurchasenumber** | **kotlin.String** | The offer to purchase number of the Inscriptionnotauthenticated |  |
| **bInscriptionnotauthenticatedConditional** | **kotlin.Boolean** | Whether the inscriptionnotauthenticated is conditional |  |
| **bInscriptionnotauthenticatedMortgageisreferenced** | **kotlin.Boolean** | Whether if the mortgage is referenced |  |
| **bInscriptionnotauthenticatedHomeowner** | **kotlin.Boolean** | Whether if it&#39;s an home owner |  |
| **tInscriptionnotauthenticatedConditions** | **kotlin.String** | The conditions of the Inscriptionnotauthenticated |  |
| **iInscriptionnotauthenticatedOrder** | **kotlin.Int** | The order of the Inscriptionnotauthenticated |  |
| **bInscriptionnotauthenticatedIsactive** | **kotlin.Boolean** | Whether the inscriptionnotauthenticated is active or not |  |
| **eInscriptionnotauthenticatedResidenceType** | [**FieldEInscriptionnotauthenticatedResidenceType**](FieldEInscriptionnotauthenticatedResidenceType.md) |  |  |
| **tInscriptionnotauthenticatedChecklistnote** | **kotlin.String** | The checklist note of the Inscriptionnotauthenticated |  |
| **dInscriptionnotauthenticatedSelleronlyretribution** | **kotlin.String** | The amount retribution for the seller only of the Inscriptionnotauthenticated |  |
| **bInscriptionnotauthenticatedDraft** | **kotlin.Boolean** | Whether the Inscriptionnotauthenticated is a draft or not |  |
| **fkiDepartmentID** | **kotlin.Int** | The unique ID of the Department |  [optional] |
| **sDepartmentNameX** | **kotlin.String** | The Name of the Department in the language of the requester |  [optional] |
| **fkiFinancialinstitutionID** | **kotlin.Int** | The unique ID of the Financialinstitution |  [optional] |
| **sFinancialinstitutionNameX** | **kotlin.String** | The name of the Financialinstitution in the language of the requester |  [optional] |
| **fkiBuyercontractID** | **kotlin.Int** | The unique ID of the Buyercontract |  [optional] |
| **sBuyercontractContract** | **kotlin.String** | The number of the Buyercontract |  [optional] |
| **fkiMortgagesupplierID** | **kotlin.Int** | The unique ID of the Mortgagesupplier |  [optional] |
| **sMortgagesupplierNameX** | **kotlin.String** | The name of the Mortagesupplier in the language of the requester |  [optional] |
| **sTaxassignmentDescriptionX** | **kotlin.String** | The description of the Taxassignment  in the language of the requester |  [optional] |
| **dtInscriptionnotauthenticatedTransactiondate** | **kotlin.String** | The transaction date of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedTransactiondateReal** | **kotlin.String** | The real transactiondate of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedDepositdate** | **kotlin.String** | The deposit date of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedCancellationdate** | **kotlin.String** | The cancellation date of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedPossessiondate** | **kotlin.String** | The possession date of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedNotaryscheduledate** | **kotlin.String** | The notary schedule date of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedFinancingscheduledate** | **kotlin.String** | The financing schedule date of the Inscriptionnotauthenticated |  [optional] |
| **dtInscriptionnotauthenticatedConditiondeadlinedate** | **kotlin.String** | The condition deadline date of the Inscriptionnotauthenticated |  [optional] |



