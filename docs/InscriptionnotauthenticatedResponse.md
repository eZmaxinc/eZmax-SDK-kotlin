
# InscriptionnotauthenticatedResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int** | The unique ID of the Inscriptionnotauthenticated. |  |
| **fkiCompanyID** | **kotlin.Int** | The unique ID of the Company |  |
| **fkiInscriptionID** | **kotlin.Int** | The unique ID of the Inscription. |  |
| **fkiDepartmentID** | **kotlin.Int** | The unique ID of the Department |  |
| **fkiFinancialinstitutionID** | **kotlin.Int** | The unique ID of the Financialinstitution |  |
| **fkiBuyercontractID** | **kotlin.Int** | The unique ID of the Buyercontract |  |
| **fkiMortgagesupplierID** | **kotlin.Int** | The unique ID of the Mortgagesupplier |  |
| **fkiTaxassignmentID** | **kotlin.Int** | The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable| |  |
| **dtInscriptionnotauthenticatedTransactiondate** | **kotlin.String** | The transactiondate of the Inscriptionnotauthenticated |  |
| **dtInscriptionnotauthenticatedTransactiondateReal** | **kotlin.String** | The transactiondatereal of the Inscriptionnotauthenticated |  |
| **dtInscriptionnotauthenticatedDepositdate** | **kotlin.String** | The depositdate of the Inscriptionnotauthenticated |  |
| **eInscriptionnotauthenticatedType** | [**FieldEInscriptionnotauthenticatedType**](FieldEInscriptionnotauthenticatedType.md) |  |  |
| **dInscriptionnotauthenticatedMortgageloan** | **kotlin.String** | The mortgageloan of the Inscriptionnotauthenticated |  |
| **etInscriptionnotauthenticatedMortgagetype** | [**FieldEtInscriptionnotauthenticatedMortgagetype**](FieldEtInscriptionnotauthenticatedMortgagetype.md) |  |  |
| **dInscriptionnotauthenticatedTransactionprice** | **kotlin.String** | The transactionprice of the Inscriptionnotauthenticated |  |
| **eInscriptionnotauthenticatedRemunerationtype** | [**FieldEInscriptionnotauthenticatedRemunerationtype**](FieldEInscriptionnotauthenticatedRemunerationtype.md) |  |  |
| **dInscriptionnotauthenticatedRemuneration** | **kotlin.String** | The remuneration of the Inscriptionnotauthenticated |  |
| **dInscriptionnotauthenticatedRemunerationsubtotal** | **kotlin.String** | The remunerationsubtotal of the Inscriptionnotauthenticated |  |
| **dInscriptionnotauthenticatedRemunerationtotal** | **kotlin.String** | The remunerationtotal of the Inscriptionnotauthenticated |  |
| **dtInscriptionnotauthenticatedCancellationdate** | **kotlin.String** | The cancellationdate of the Inscriptionnotauthenticated |  |
| **dtInscriptionnotauthenticatedPossessiondate** | **kotlin.String** | The possessiondate of the Inscriptionnotauthenticated |  |
| **sInscriptionnotauthenticatedOffertopurchasenumber** | **kotlin.String** | The Offer to purchase number |  |
| **dtInscriptionnotauthenticatedNotaryscheduledate** | **kotlin.String** | The notaryscheduledate of the Inscriptionnotauthenticated |  |
| **dtInscriptionnotauthenticatedFinancingscheduledate** | **kotlin.String** | The financingscheduledate of the Inscriptionnotauthenticated |  |
| **bInscriptionnotauthenticatedConditional** | **kotlin.Boolean** | Whether the inscriptionnotauthenticated is conditional |  |
| **bInscriptionnotauthenticatedMortgageisreferenced** | **kotlin.Boolean** | Whether if it&#39;s an mortgageisreferenced |  |
| **bInscriptionnotauthenticatedHomeowner** | **kotlin.Boolean** | Whether if it&#39;s an homeowner |  |
| **tInscriptionnotauthenticatedConditions** | **kotlin.String** | The conditions of the Inscriptionnotauthenticated |  |
| **dtInscriptionnotauthenticatedConditiondeadlinedate** | **kotlin.String** | The conditiondeadlinedate of the Inscriptionnotauthenticated |  |
| **iInscriptionnotauthenticatedOrder** | **kotlin.Int** | The order of the Inscriptionnotauthenticated |  |
| **bInscriptionnotauthenticatedIsactive** | **kotlin.Boolean** | Whether the inscriptionnotauthenticated is active or not |  |
| **eInscriptionnotauthenticatedResidenceType** | [**FieldEInscriptionnotauthenticatedResidenceType**](FieldEInscriptionnotauthenticatedResidenceType.md) |  |  |
| **tInscriptionnotauthenticatedChecklistnote** | **kotlin.String** | The checklistnote of the Inscriptionnotauthenticated |  |
| **dInscriptionnotauthenticatedSelleronlyretribution** | **kotlin.String** | The selleronlyretribution of the Inscriptionnotauthenticated |  |
| **bInscriptionnotauthenticatedDraft** | **kotlin.Boolean** | Whether the inscriptionnotauthenticated is a draft or not |  |
| **sCompanyNameX** | **kotlin.String** | The Name of the Company in the language of the requester |  [optional] |
| **sDepartmentNameX** | **kotlin.String** | The Name of the Department in the language of the requester |  [optional] |
| **sFinancialinstitutionNameX** | **kotlin.String** | The name of the Financialinstitution in the language of the requester |  [optional] |
| **sBuyercontractContract** | **kotlin.String** | The number of the Buyercontract |  [optional] |
| **sMortgagesupplierNameX** | **kotlin.String** | The name of the Mortagesupplier in the language of the requester |  [optional] |
| **sTaxassignmentDescriptionX** | **kotlin.String** | The description of the Taxassignment  in the language of the requester |  [optional] |



