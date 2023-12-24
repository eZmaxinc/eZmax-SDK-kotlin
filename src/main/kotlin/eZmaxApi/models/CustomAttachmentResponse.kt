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

import eZmaxApi.models.AttachmentResponseCompound
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEAttachmentDocumenttype
import eZmaxApi.models.FieldEAttachmentPrivacy
import eZmaxApi.models.FieldEAttachmentType
import eZmaxApi.models.FieldEAttachmentVerified

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Custom Attachment Object
 *
 * @param pkiAttachmentID The unique ID of the Attachment.
 * @param eAttachmentDocumenttype 
 * @param sAttachmentName The name of the Attachment
 * @param eAttachmentPrivacy 
 * @param eAttachmentType 
 * @param iAttachmentSize The size of the Attachment
 * @param sAttachmentMD5 The md5 of the Attachment
 * @param bAttachmentDeleted Whether if it's deleted
 * @param bAttachmentValid Whether if it's valid
 * @param eAttachmentVerified 
 * @param fkiComputerID The unique ID of the Computer
 * @param fkiAdjustmentID The unique ID of the Adjustment
 * @param fkiAgentID The unique ID of the Agent.
 * @param fkiBankaccountID The unique ID of the Bankaccount
 * @param fkiBrokerID The unique ID of the Broker.
 * @param fkiCommissionadvanceID The unique ID of the Commissionadvance
 * @param fkiCommunicationID The unique ID of the Communication.
 * @param fkiCustomerID The unique ID of the Customer.
 * @param fkiCustomertemplateID The unique ID of the Customertemplate
 * @param fkiDepositID The unique ID of the Deposit
 * @param fkiDeposittransitchequeID The unique ID of the Deposittransitcheque
 * @param fkiElectronicfundstransferID The unique ID of the Electronicfundstransfer
 * @param fkiEmployeeID The unique ID of the Employee.
 * @param fkiExternalbrokerID The unique ID of the Externalbroker.
 * @param fkiEzcomadvanceserverID The unique ID of the Ezcomadvanceserver
 * @param fkiEzcomcompanyID The unique ID of the Ezcomcompany
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param fkiGhacqcontractID The unique ID of the Ghacqcontract
 * @param fkiInscriptionID The unique ID of the Inscription.
 * @param fkiInscriptiontempID The unique ID of the Inscriptiontemp
 * @param fkiInscriptionnotauthenticatedID The unique ID of the Inscriptionnotauthenticated.
 * @param fkiInvoiceID The unique ID of the Invoice.
 * @param fkiBuyercontractID The unique ID of the Buyercontract
 * @param fkiFranchisebrokerID The unique ID of the Franchisebroker
 * @param fkiFranchiseagenceID The unique ID of the Franchiseagence
 * @param fkiFranchiseofficeID The unique ID of the Franchisereoffice
 * @param fkiFranchisefranchiseID The unique ID of the Franchisefranchise
 * @param fkiFranchisecomplaintID The unique ID of the Franchisecomplaint
 * @param fkiLeadID The unique ID of the Lead
 * @param fkiMarketingprogramID The unique ID of the Marketingprogram
 * @param fkiMarketingfollowID The unique ID of the Marketingfollow
 * @param fkiNotaryID The unique ID of the Notary.
 * @param fkiOfficetaxreportID The unique ID of the Officetaxreport
 * @param fkiOtherincomeID The unique ID of the Otherincome
 * @param fkiPaymentpreparationID The unique ID of the Paymentpreparation
 * @param fkiPurchaseID The unique ID of the Purchase
 * @param fkiSalaryID The unique ID of the Salary
 * @param fkiSupplierID The unique ID of the Supplier.
 * @param fkiTranqcontractID The unique ID of the Tranqcontract
 * @param fkiTemplateID The unique ID of the Template
 * @param fkiInscriptionchecklistID The unique ID of the Inscriptionchecklist
 * @param fkiFolderID The unique ID of the Folder
 * @param fkiRejectedoffertopurchaseID The unique ID of the Rejectedoffertopurchase
 * @param fkiDisclosureID The unique ID of the Disclosure
 * @param fkiReconciliationID The unique ID of the Reconciliation
 * @param fkiEzsigndocumentIDReference The unique ID of the Ezsigndocument
 * @param fkiUserIDSpecific The unique ID of the User
 * @param iAttachmentEDMmoduleflag The edmmoduleflag of the Attachment
 * @param tAttachmentRejectioncomment The rejectioncomment of the Attachment
 * @param fkiUserIDOwner The unique ID of the User
 * @param objAudit 
 * @param objAttachmentProof 
 * @param objAttachmentProofdocument 
 * @param aObjAttachmentAttachment 
 * @param aObjAttachmentVersion 
 */


data class CustomAttachmentResponse (

    /* The unique ID of the Attachment. */
    @Json(name = "pkiAttachmentID")
    val pkiAttachmentID: kotlin.Int,

    @Json(name = "eAttachmentDocumenttype")
    val eAttachmentDocumenttype: FieldEAttachmentDocumenttype,

    /* The name of the Attachment */
    @Json(name = "sAttachmentName")
    val sAttachmentName: kotlin.String,

    @Json(name = "eAttachmentPrivacy")
    val eAttachmentPrivacy: FieldEAttachmentPrivacy,

    @Json(name = "eAttachmentType")
    val eAttachmentType: FieldEAttachmentType,

    /* The size of the Attachment */
    @Json(name = "iAttachmentSize")
    val iAttachmentSize: kotlin.Int,

    /* The md5 of the Attachment */
    @Json(name = "sAttachmentMD5")
    val sAttachmentMD5: kotlin.String,

    /* Whether if it's deleted */
    @Json(name = "bAttachmentDeleted")
    val bAttachmentDeleted: kotlin.Boolean,

    /* Whether if it's valid */
    @Json(name = "bAttachmentValid")
    val bAttachmentValid: kotlin.Boolean,

    @Json(name = "eAttachmentVerified")
    val eAttachmentVerified: FieldEAttachmentVerified,

    /* The unique ID of the Computer */
    @Json(name = "fkiComputerID")
    val fkiComputerID: kotlin.Int? = null,

    /* The unique ID of the Adjustment */
    @Json(name = "fkiAdjustmentID")
    val fkiAdjustmentID: kotlin.Int? = null,

    /* The unique ID of the Agent. */
    @Json(name = "fkiAgentID")
    val fkiAgentID: kotlin.Int? = null,

    /* The unique ID of the Bankaccount */
    @Json(name = "fkiBankaccountID")
    val fkiBankaccountID: kotlin.Int? = null,

    /* The unique ID of the Broker. */
    @Json(name = "fkiBrokerID")
    val fkiBrokerID: kotlin.Int? = null,

    /* The unique ID of the Commissionadvance */
    @Json(name = "fkiCommissionadvanceID")
    val fkiCommissionadvanceID: kotlin.Int? = null,

    /* The unique ID of the Communication. */
    @Json(name = "fkiCommunicationID")
    val fkiCommunicationID: kotlin.Int? = null,

    /* The unique ID of the Customer. */
    @Json(name = "fkiCustomerID")
    val fkiCustomerID: kotlin.Int? = null,

    /* The unique ID of the Customertemplate */
    @Json(name = "fkiCustomertemplateID")
    val fkiCustomertemplateID: kotlin.Int? = null,

    /* The unique ID of the Deposit */
    @Json(name = "fkiDepositID")
    val fkiDepositID: kotlin.Int? = null,

    /* The unique ID of the Deposittransitcheque */
    @Json(name = "fkiDeposittransitchequeID")
    val fkiDeposittransitchequeID: kotlin.Int? = null,

    /* The unique ID of the Electronicfundstransfer */
    @Json(name = "fkiElectronicfundstransferID")
    val fkiElectronicfundstransferID: kotlin.Int? = null,

    /* The unique ID of the Employee. */
    @Json(name = "fkiEmployeeID")
    val fkiEmployeeID: kotlin.Int? = null,

    /* The unique ID of the Externalbroker. */
    @Json(name = "fkiExternalbrokerID")
    val fkiExternalbrokerID: kotlin.Int? = null,

    /* The unique ID of the Ezcomadvanceserver */
    @Json(name = "fkiEzcomadvanceserverID")
    val fkiEzcomadvanceserverID: kotlin.Int? = null,

    /* The unique ID of the Ezcomcompany */
    @Json(name = "fkiEzcomcompanyID")
    val fkiEzcomcompanyID: kotlin.Int? = null,

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int? = null,

    /* The unique ID of the Ghacqcontract */
    @Json(name = "fkiGhacqcontractID")
    val fkiGhacqcontractID: kotlin.Int? = null,

    /* The unique ID of the Inscription. */
    @Json(name = "fkiInscriptionID")
    val fkiInscriptionID: kotlin.Int? = null,

    /* The unique ID of the Inscriptiontemp */
    @Json(name = "fkiInscriptiontempID")
    val fkiInscriptiontempID: kotlin.Int? = null,

    /* The unique ID of the Inscriptionnotauthenticated. */
    @Json(name = "fkiInscriptionnotauthenticatedID")
    val fkiInscriptionnotauthenticatedID: kotlin.Int? = null,

    /* The unique ID of the Invoice. */
    @Json(name = "fkiInvoiceID")
    val fkiInvoiceID: kotlin.Int? = null,

    /* The unique ID of the Buyercontract */
    @Json(name = "fkiBuyercontractID")
    val fkiBuyercontractID: kotlin.Int? = null,

    /* The unique ID of the Franchisebroker */
    @Json(name = "fkiFranchisebrokerID")
    val fkiFranchisebrokerID: kotlin.Int? = null,

    /* The unique ID of the Franchiseagence */
    @Json(name = "fkiFranchiseagenceID")
    val fkiFranchiseagenceID: kotlin.Int? = null,

    /* The unique ID of the Franchisereoffice */
    @Json(name = "fkiFranchiseofficeID")
    val fkiFranchiseofficeID: kotlin.Int? = null,

    /* The unique ID of the Franchisefranchise */
    @Json(name = "fkiFranchisefranchiseID")
    val fkiFranchisefranchiseID: kotlin.Int? = null,

    /* The unique ID of the Franchisecomplaint */
    @Json(name = "fkiFranchisecomplaintID")
    val fkiFranchisecomplaintID: kotlin.Int? = null,

    /* The unique ID of the Lead */
    @Json(name = "fkiLeadID")
    val fkiLeadID: kotlin.Int? = null,

    /* The unique ID of the Marketingprogram */
    @Json(name = "fkiMarketingprogramID")
    val fkiMarketingprogramID: kotlin.Int? = null,

    /* The unique ID of the Marketingfollow */
    @Json(name = "fkiMarketingfollowID")
    val fkiMarketingfollowID: kotlin.Int? = null,

    /* The unique ID of the Notary. */
    @Json(name = "fkiNotaryID")
    val fkiNotaryID: kotlin.Int? = null,

    /* The unique ID of the Officetaxreport */
    @Json(name = "fkiOfficetaxreportID")
    val fkiOfficetaxreportID: kotlin.Int? = null,

    /* The unique ID of the Otherincome */
    @Json(name = "fkiOtherincomeID")
    val fkiOtherincomeID: kotlin.Int? = null,

    /* The unique ID of the Paymentpreparation */
    @Json(name = "fkiPaymentpreparationID")
    val fkiPaymentpreparationID: kotlin.Int? = null,

    /* The unique ID of the Purchase */
    @Json(name = "fkiPurchaseID")
    val fkiPurchaseID: kotlin.Int? = null,

    /* The unique ID of the Salary */
    @Json(name = "fkiSalaryID")
    val fkiSalaryID: kotlin.Int? = null,

    /* The unique ID of the Supplier. */
    @Json(name = "fkiSupplierID")
    val fkiSupplierID: kotlin.Int? = null,

    /* The unique ID of the Tranqcontract */
    @Json(name = "fkiTranqcontractID")
    val fkiTranqcontractID: kotlin.Int? = null,

    /* The unique ID of the Template */
    @Json(name = "fkiTemplateID")
    val fkiTemplateID: kotlin.Int? = null,

    /* The unique ID of the Inscriptionchecklist */
    @Json(name = "fkiInscriptionchecklistID")
    val fkiInscriptionchecklistID: kotlin.Int? = null,

    /* The unique ID of the Folder */
    @Json(name = "fkiFolderID")
    val fkiFolderID: kotlin.Int? = null,

    /* The unique ID of the Rejectedoffertopurchase */
    @Json(name = "fkiRejectedoffertopurchaseID")
    val fkiRejectedoffertopurchaseID: kotlin.Int? = null,

    /* The unique ID of the Disclosure */
    @Json(name = "fkiDisclosureID")
    val fkiDisclosureID: kotlin.Int? = null,

    /* The unique ID of the Reconciliation */
    @Json(name = "fkiReconciliationID")
    val fkiReconciliationID: kotlin.Int? = null,

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentIDReference")
    val fkiEzsigndocumentIDReference: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserIDSpecific")
    val fkiUserIDSpecific: kotlin.Int? = null,

    /* The edmmoduleflag of the Attachment */
    @Json(name = "iAttachmentEDMmoduleflag")
    val iAttachmentEDMmoduleflag: kotlin.Int? = null,

    /* The rejectioncomment of the Attachment */
    @Json(name = "tAttachmentRejectioncomment")
    val tAttachmentRejectioncomment: kotlin.String? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserIDOwner")
    val fkiUserIDOwner: kotlin.Int? = null,

    @Json(name = "objAudit")
    val objAudit: CommonAudit? = null,

    @Json(name = "objAttachmentProof")
    val objAttachmentProof: AttachmentResponseCompound? = null,

    @Json(name = "objAttachmentProofdocument")
    val objAttachmentProofdocument: AttachmentResponseCompound? = null,

    @Json(name = "a_objAttachmentAttachment")
    val aObjAttachmentAttachment: kotlin.collections.List<AttachmentResponseCompound>? = null,

    @Json(name = "a_objAttachmentVersion")
    val aObjAttachmentVersion: kotlin.collections.List<AttachmentResponseCompound>? = null

)

