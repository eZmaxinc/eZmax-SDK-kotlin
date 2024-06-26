/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import eZmaxApi.models.CustomAttachmentResponse
import eZmaxApi.models.AttachmentResponseCompound
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEAttachmentDocumenttype
import eZmaxApi.models.FieldEAttachmentPrivacy
import eZmaxApi.models.FieldEAttachmentType
import eZmaxApi.models.FieldEAttachmentVerified

class CustomAttachmentResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomAttachmentResponse
        //val modelInstance = CustomAttachmentResponse()

        // to test the property `pkiAttachmentID` - The unique ID of the Attachment.
        should("test pkiAttachmentID") {
            // uncomment below to test the property
            //modelInstance.pkiAttachmentID shouldBe ("TODO")
        }

        // to test the property `eAttachmentDocumenttype`
        should("test eAttachmentDocumenttype") {
            // uncomment below to test the property
            //modelInstance.eAttachmentDocumenttype shouldBe ("TODO")
        }

        // to test the property `sAttachmentName` - The name of the Attachment
        should("test sAttachmentName") {
            // uncomment below to test the property
            //modelInstance.sAttachmentName shouldBe ("TODO")
        }

        // to test the property `eAttachmentPrivacy`
        should("test eAttachmentPrivacy") {
            // uncomment below to test the property
            //modelInstance.eAttachmentPrivacy shouldBe ("TODO")
        }

        // to test the property `eAttachmentType`
        should("test eAttachmentType") {
            // uncomment below to test the property
            //modelInstance.eAttachmentType shouldBe ("TODO")
        }

        // to test the property `iAttachmentSize` - The size of the Attachment
        should("test iAttachmentSize") {
            // uncomment below to test the property
            //modelInstance.iAttachmentSize shouldBe ("TODO")
        }

        // to test the property `sAttachmentMD5` - The md5 of the Attachment
        should("test sAttachmentMD5") {
            // uncomment below to test the property
            //modelInstance.sAttachmentMD5 shouldBe ("TODO")
        }

        // to test the property `bAttachmentDeleted` - Whether if it's deleted
        should("test bAttachmentDeleted") {
            // uncomment below to test the property
            //modelInstance.bAttachmentDeleted shouldBe ("TODO")
        }

        // to test the property `bAttachmentValid` - Whether if it's valid
        should("test bAttachmentValid") {
            // uncomment below to test the property
            //modelInstance.bAttachmentValid shouldBe ("TODO")
        }

        // to test the property `eAttachmentVerified`
        should("test eAttachmentVerified") {
            // uncomment below to test the property
            //modelInstance.eAttachmentVerified shouldBe ("TODO")
        }

        // to test the property `fkiComputerID` - The unique ID of the Computer
        should("test fkiComputerID") {
            // uncomment below to test the property
            //modelInstance.fkiComputerID shouldBe ("TODO")
        }

        // to test the property `fkiAdjustmentID` - The unique ID of the Adjustment
        should("test fkiAdjustmentID") {
            // uncomment below to test the property
            //modelInstance.fkiAdjustmentID shouldBe ("TODO")
        }

        // to test the property `fkiAgentID` - The unique ID of the Agent.
        should("test fkiAgentID") {
            // uncomment below to test the property
            //modelInstance.fkiAgentID shouldBe ("TODO")
        }

        // to test the property `fkiBankaccountID` - The unique ID of the Bankaccount
        should("test fkiBankaccountID") {
            // uncomment below to test the property
            //modelInstance.fkiBankaccountID shouldBe ("TODO")
        }

        // to test the property `fkiBrokerID` - The unique ID of the Broker.
        should("test fkiBrokerID") {
            // uncomment below to test the property
            //modelInstance.fkiBrokerID shouldBe ("TODO")
        }

        // to test the property `fkiCommissionadvanceID` - The unique ID of the Commissionadvance
        should("test fkiCommissionadvanceID") {
            // uncomment below to test the property
            //modelInstance.fkiCommissionadvanceID shouldBe ("TODO")
        }

        // to test the property `fkiCommunicationID` - The unique ID of the Communication.
        should("test fkiCommunicationID") {
            // uncomment below to test the property
            //modelInstance.fkiCommunicationID shouldBe ("TODO")
        }

        // to test the property `fkiCustomerID` - The unique ID of the Customer.
        should("test fkiCustomerID") {
            // uncomment below to test the property
            //modelInstance.fkiCustomerID shouldBe ("TODO")
        }

        // to test the property `fkiCustomertemplateID` - The unique ID of the Customertemplate
        should("test fkiCustomertemplateID") {
            // uncomment below to test the property
            //modelInstance.fkiCustomertemplateID shouldBe ("TODO")
        }

        // to test the property `fkiDepositID` - The unique ID of the Deposit
        should("test fkiDepositID") {
            // uncomment below to test the property
            //modelInstance.fkiDepositID shouldBe ("TODO")
        }

        // to test the property `fkiDeposittransitchequeID` - The unique ID of the Deposittransitcheque
        should("test fkiDeposittransitchequeID") {
            // uncomment below to test the property
            //modelInstance.fkiDeposittransitchequeID shouldBe ("TODO")
        }

        // to test the property `fkiElectronicfundstransferID` - The unique ID of the Electronicfundstransfer
        should("test fkiElectronicfundstransferID") {
            // uncomment below to test the property
            //modelInstance.fkiElectronicfundstransferID shouldBe ("TODO")
        }

        // to test the property `fkiEmployeeID` - The unique ID of the Employee.
        should("test fkiEmployeeID") {
            // uncomment below to test the property
            //modelInstance.fkiEmployeeID shouldBe ("TODO")
        }

        // to test the property `fkiExternalbrokerID` - The unique ID of the Externalbroker.
        should("test fkiExternalbrokerID") {
            // uncomment below to test the property
            //modelInstance.fkiExternalbrokerID shouldBe ("TODO")
        }

        // to test the property `fkiEzcomadvanceserverID` - The unique ID of the Ezcomadvanceserver
        should("test fkiEzcomadvanceserverID") {
            // uncomment below to test the property
            //modelInstance.fkiEzcomadvanceserverID shouldBe ("TODO")
        }

        // to test the property `fkiEzcomcompanyID` - The unique ID of the Ezcomcompany
        should("test fkiEzcomcompanyID") {
            // uncomment below to test the property
            //modelInstance.fkiEzcomcompanyID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigndocumentID` - The unique ID of the Ezsigndocument
        should("test fkiEzsigndocumentID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigndocumentID shouldBe ("TODO")
        }

        // to test the property `fkiGhacqcontractID` - The unique ID of the Ghacqcontract
        should("test fkiGhacqcontractID") {
            // uncomment below to test the property
            //modelInstance.fkiGhacqcontractID shouldBe ("TODO")
        }

        // to test the property `fkiInscriptionID` - The unique ID of the Inscription.
        should("test fkiInscriptionID") {
            // uncomment below to test the property
            //modelInstance.fkiInscriptionID shouldBe ("TODO")
        }

        // to test the property `fkiInscriptiontempID` - The unique ID of the Inscriptiontemp
        should("test fkiInscriptiontempID") {
            // uncomment below to test the property
            //modelInstance.fkiInscriptiontempID shouldBe ("TODO")
        }

        // to test the property `fkiInscriptionnotauthenticatedID` - The unique ID of the Inscriptionnotauthenticated.
        should("test fkiInscriptionnotauthenticatedID") {
            // uncomment below to test the property
            //modelInstance.fkiInscriptionnotauthenticatedID shouldBe ("TODO")
        }

        // to test the property `fkiInvoiceID` - The unique ID of the Invoice.
        should("test fkiInvoiceID") {
            // uncomment below to test the property
            //modelInstance.fkiInvoiceID shouldBe ("TODO")
        }

        // to test the property `fkiBuyercontractID` - The unique ID of the Buyercontract
        should("test fkiBuyercontractID") {
            // uncomment below to test the property
            //modelInstance.fkiBuyercontractID shouldBe ("TODO")
        }

        // to test the property `fkiFranchisebrokerID` - The unique ID of the Franchisebroker
        should("test fkiFranchisebrokerID") {
            // uncomment below to test the property
            //modelInstance.fkiFranchisebrokerID shouldBe ("TODO")
        }

        // to test the property `fkiFranchiseagenceID` - The unique ID of the Franchiseagence
        should("test fkiFranchiseagenceID") {
            // uncomment below to test the property
            //modelInstance.fkiFranchiseagenceID shouldBe ("TODO")
        }

        // to test the property `fkiFranchiseofficeID` - The unique ID of the Franchisereoffice
        should("test fkiFranchiseofficeID") {
            // uncomment below to test the property
            //modelInstance.fkiFranchiseofficeID shouldBe ("TODO")
        }

        // to test the property `fkiFranchisefranchiseID` - The unique ID of the Franchisefranchise
        should("test fkiFranchisefranchiseID") {
            // uncomment below to test the property
            //modelInstance.fkiFranchisefranchiseID shouldBe ("TODO")
        }

        // to test the property `fkiFranchisecomplaintID` - The unique ID of the Franchisecomplaint
        should("test fkiFranchisecomplaintID") {
            // uncomment below to test the property
            //modelInstance.fkiFranchisecomplaintID shouldBe ("TODO")
        }

        // to test the property `fkiLeadID` - The unique ID of the Lead
        should("test fkiLeadID") {
            // uncomment below to test the property
            //modelInstance.fkiLeadID shouldBe ("TODO")
        }

        // to test the property `fkiMarketingprogramID` - The unique ID of the Marketingprogram
        should("test fkiMarketingprogramID") {
            // uncomment below to test the property
            //modelInstance.fkiMarketingprogramID shouldBe ("TODO")
        }

        // to test the property `fkiMarketingfollowID` - The unique ID of the Marketingfollow
        should("test fkiMarketingfollowID") {
            // uncomment below to test the property
            //modelInstance.fkiMarketingfollowID shouldBe ("TODO")
        }

        // to test the property `fkiNotaryID` - The unique ID of the Notary.
        should("test fkiNotaryID") {
            // uncomment below to test the property
            //modelInstance.fkiNotaryID shouldBe ("TODO")
        }

        // to test the property `fkiOfficetaxreportID` - The unique ID of the Officetaxreport
        should("test fkiOfficetaxreportID") {
            // uncomment below to test the property
            //modelInstance.fkiOfficetaxreportID shouldBe ("TODO")
        }

        // to test the property `fkiOtherincomeID` - The unique ID of the Otherincome
        should("test fkiOtherincomeID") {
            // uncomment below to test the property
            //modelInstance.fkiOtherincomeID shouldBe ("TODO")
        }

        // to test the property `fkiPaymentpreparationID` - The unique ID of the Paymentpreparation
        should("test fkiPaymentpreparationID") {
            // uncomment below to test the property
            //modelInstance.fkiPaymentpreparationID shouldBe ("TODO")
        }

        // to test the property `fkiPurchaseID` - The unique ID of the Purchase
        should("test fkiPurchaseID") {
            // uncomment below to test the property
            //modelInstance.fkiPurchaseID shouldBe ("TODO")
        }

        // to test the property `fkiSalaryID` - The unique ID of the Salary
        should("test fkiSalaryID") {
            // uncomment below to test the property
            //modelInstance.fkiSalaryID shouldBe ("TODO")
        }

        // to test the property `fkiSupplierID` - The unique ID of the Supplier.
        should("test fkiSupplierID") {
            // uncomment below to test the property
            //modelInstance.fkiSupplierID shouldBe ("TODO")
        }

        // to test the property `fkiTranqcontractID` - The unique ID of the Tranqcontract
        should("test fkiTranqcontractID") {
            // uncomment below to test the property
            //modelInstance.fkiTranqcontractID shouldBe ("TODO")
        }

        // to test the property `fkiTemplateID` - The unique ID of the Template
        should("test fkiTemplateID") {
            // uncomment below to test the property
            //modelInstance.fkiTemplateID shouldBe ("TODO")
        }

        // to test the property `fkiInscriptionchecklistID` - The unique ID of the Inscriptionchecklist
        should("test fkiInscriptionchecklistID") {
            // uncomment below to test the property
            //modelInstance.fkiInscriptionchecklistID shouldBe ("TODO")
        }

        // to test the property `fkiFolderID` - The unique ID of the Folder
        should("test fkiFolderID") {
            // uncomment below to test the property
            //modelInstance.fkiFolderID shouldBe ("TODO")
        }

        // to test the property `fkiRejectedoffertopurchaseID` - The unique ID of the Rejectedoffertopurchase
        should("test fkiRejectedoffertopurchaseID") {
            // uncomment below to test the property
            //modelInstance.fkiRejectedoffertopurchaseID shouldBe ("TODO")
        }

        // to test the property `fkiDisclosureID` - The unique ID of the Disclosure
        should("test fkiDisclosureID") {
            // uncomment below to test the property
            //modelInstance.fkiDisclosureID shouldBe ("TODO")
        }

        // to test the property `fkiReconciliationID` - The unique ID of the Reconciliation
        should("test fkiReconciliationID") {
            // uncomment below to test the property
            //modelInstance.fkiReconciliationID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigndocumentIDReference` - The unique ID of the Ezsigndocument
        should("test fkiEzsigndocumentIDReference") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigndocumentIDReference shouldBe ("TODO")
        }

        // to test the property `fkiUserIDSpecific` - The unique ID of the User
        should("test fkiUserIDSpecific") {
            // uncomment below to test the property
            //modelInstance.fkiUserIDSpecific shouldBe ("TODO")
        }

        // to test the property `iAttachmentEDMmoduleflag` - The edmmoduleflag of the Attachment
        should("test iAttachmentEDMmoduleflag") {
            // uncomment below to test the property
            //modelInstance.iAttachmentEDMmoduleflag shouldBe ("TODO")
        }

        // to test the property `tAttachmentRejectioncomment` - The rejectioncomment of the Attachment
        should("test tAttachmentRejectioncomment") {
            // uncomment below to test the property
            //modelInstance.tAttachmentRejectioncomment shouldBe ("TODO")
        }

        // to test the property `fkiUserIDOwner` - The unique ID of the User
        should("test fkiUserIDOwner") {
            // uncomment below to test the property
            //modelInstance.fkiUserIDOwner shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

        // to test the property `objAttachmentProof`
        should("test objAttachmentProof") {
            // uncomment below to test the property
            //modelInstance.objAttachmentProof shouldBe ("TODO")
        }

        // to test the property `objAttachmentProofdocument`
        should("test objAttachmentProofdocument") {
            // uncomment below to test the property
            //modelInstance.objAttachmentProofdocument shouldBe ("TODO")
        }

        // to test the property `aObjAttachmentAttachment`
        should("test aObjAttachmentAttachment") {
            // uncomment below to test the property
            //modelInstance.aObjAttachmentAttachment shouldBe ("TODO")
        }

        // to test the property `aObjAttachmentVersion`
        should("test aObjAttachmentVersion") {
            // uncomment below to test the property
            //modelInstance.aObjAttachmentVersion shouldBe ("TODO")
        }

    }
}
