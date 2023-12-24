
# CustomAttachmentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiAttachmentID** | **kotlin.Int** | The unique ID of the Attachment. | 
**eAttachmentDocumenttype** | [**FieldEAttachmentDocumenttype**](FieldEAttachmentDocumenttype.md) |  | 
**sAttachmentName** | **kotlin.String** | The name of the Attachment | 
**eAttachmentPrivacy** | [**FieldEAttachmentPrivacy**](FieldEAttachmentPrivacy.md) |  | 
**eAttachmentType** | [**FieldEAttachmentType**](FieldEAttachmentType.md) |  | 
**iAttachmentSize** | **kotlin.Int** | The size of the Attachment | 
**sAttachmentMD5** | **kotlin.String** | The md5 of the Attachment | 
**bAttachmentDeleted** | **kotlin.Boolean** | Whether if it&#39;s deleted | 
**bAttachmentValid** | **kotlin.Boolean** | Whether if it&#39;s valid | 
**eAttachmentVerified** | [**FieldEAttachmentVerified**](FieldEAttachmentVerified.md) |  | 
**fkiComputerID** | **kotlin.Int** | The unique ID of the Computer |  [optional]
**fkiAdjustmentID** | **kotlin.Int** | The unique ID of the Adjustment |  [optional]
**fkiAgentID** | **kotlin.Int** | The unique ID of the Agent. |  [optional]
**fkiBankaccountID** | **kotlin.Int** | The unique ID of the Bankaccount |  [optional]
**fkiBrokerID** | **kotlin.Int** | The unique ID of the Broker. |  [optional]
**fkiCommissionadvanceID** | **kotlin.Int** | The unique ID of the Commissionadvance |  [optional]
**fkiCommunicationID** | **kotlin.Int** | The unique ID of the Communication. |  [optional]
**fkiCustomerID** | **kotlin.Int** | The unique ID of the Customer. |  [optional]
**fkiCustomertemplateID** | **kotlin.Int** | The unique ID of the Customertemplate |  [optional]
**fkiDepositID** | **kotlin.Int** | The unique ID of the Deposit |  [optional]
**fkiDeposittransitchequeID** | **kotlin.Int** | The unique ID of the Deposittransitcheque |  [optional]
**fkiElectronicfundstransferID** | **kotlin.Int** | The unique ID of the Electronicfundstransfer |  [optional]
**fkiEmployeeID** | **kotlin.Int** | The unique ID of the Employee. |  [optional]
**fkiExternalbrokerID** | **kotlin.Int** | The unique ID of the Externalbroker. |  [optional]
**fkiEzcomadvanceserverID** | **kotlin.Int** | The unique ID of the Ezcomadvanceserver |  [optional]
**fkiEzcomcompanyID** | **kotlin.Int** | The unique ID of the Ezcomcompany |  [optional]
**fkiEzsigndocumentID** | **kotlin.Int** | The unique ID of the Ezsigndocument |  [optional]
**fkiGhacqcontractID** | **kotlin.Int** | The unique ID of the Ghacqcontract |  [optional]
**fkiInscriptionID** | **kotlin.Int** | The unique ID of the Inscription. |  [optional]
**fkiInscriptiontempID** | **kotlin.Int** | The unique ID of the Inscriptiontemp |  [optional]
**fkiInscriptionnotauthenticatedID** | **kotlin.Int** | The unique ID of the Inscriptionnotauthenticated. |  [optional]
**fkiInvoiceID** | **kotlin.Int** | The unique ID of the Invoice. |  [optional]
**fkiBuyercontractID** | **kotlin.Int** | The unique ID of the Buyercontract |  [optional]
**fkiFranchisebrokerID** | **kotlin.Int** | The unique ID of the Franchisebroker |  [optional]
**fkiFranchiseagenceID** | **kotlin.Int** | The unique ID of the Franchiseagence |  [optional]
**fkiFranchiseofficeID** | **kotlin.Int** | The unique ID of the Franchisereoffice |  [optional]
**fkiFranchisefranchiseID** | **kotlin.Int** | The unique ID of the Franchisefranchise |  [optional]
**fkiFranchisecomplaintID** | **kotlin.Int** | The unique ID of the Franchisecomplaint |  [optional]
**fkiLeadID** | **kotlin.Int** | The unique ID of the Lead |  [optional]
**fkiMarketingprogramID** | **kotlin.Int** | The unique ID of the Marketingprogram |  [optional]
**fkiMarketingfollowID** | **kotlin.Int** | The unique ID of the Marketingfollow |  [optional]
**fkiNotaryID** | **kotlin.Int** | The unique ID of the Notary. |  [optional]
**fkiOfficetaxreportID** | **kotlin.Int** | The unique ID of the Officetaxreport |  [optional]
**fkiOtherincomeID** | **kotlin.Int** | The unique ID of the Otherincome |  [optional]
**fkiPaymentpreparationID** | **kotlin.Int** | The unique ID of the Paymentpreparation |  [optional]
**fkiPurchaseID** | **kotlin.Int** | The unique ID of the Purchase |  [optional]
**fkiSalaryID** | **kotlin.Int** | The unique ID of the Salary |  [optional]
**fkiSupplierID** | **kotlin.Int** | The unique ID of the Supplier. |  [optional]
**fkiTranqcontractID** | **kotlin.Int** | The unique ID of the Tranqcontract |  [optional]
**fkiTemplateID** | **kotlin.Int** | The unique ID of the Template |  [optional]
**fkiInscriptionchecklistID** | **kotlin.Int** | The unique ID of the Inscriptionchecklist |  [optional]
**fkiFolderID** | **kotlin.Int** | The unique ID of the Folder |  [optional]
**fkiRejectedoffertopurchaseID** | **kotlin.Int** | The unique ID of the Rejectedoffertopurchase |  [optional]
**fkiDisclosureID** | **kotlin.Int** | The unique ID of the Disclosure |  [optional]
**fkiReconciliationID** | **kotlin.Int** | The unique ID of the Reconciliation |  [optional]
**fkiEzsigndocumentIDReference** | **kotlin.Int** | The unique ID of the Ezsigndocument |  [optional]
**fkiUserIDSpecific** | **kotlin.Int** | The unique ID of the User |  [optional]
**iAttachmentEDMmoduleflag** | **kotlin.Int** | The edmmoduleflag of the Attachment |  [optional]
**tAttachmentRejectioncomment** | **kotlin.String** | The rejectioncomment of the Attachment |  [optional]
**fkiUserIDOwner** | **kotlin.Int** | The unique ID of the User |  [optional]
**objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional]
**objAttachmentProof** | [**AttachmentResponseCompound**](AttachmentResponseCompound.md) |  |  [optional]
**objAttachmentProofdocument** | [**AttachmentResponseCompound**](AttachmentResponseCompound.md) |  |  [optional]
**aObjAttachmentAttachment** | [**kotlin.collections.List&lt;AttachmentResponseCompound&gt;**](AttachmentResponseCompound.md) |  |  [optional]
**aObjAttachmentVersion** | [**kotlin.collections.List&lt;AttachmentResponseCompound&gt;**](AttachmentResponseCompound.md) |  |  [optional]



