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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The documenttype of the Attachment
 *
 * Values: Adjustment,Agent,Bankaccount,Broker,Buyercontract,Commissionadvance,Communication,Customer,Customertemplate,Deposit,Deposittransitcheque,Disclosure,Electronicfundstransfer,Employee,Externalbroker,Ezcomadvanceserver,Ezcomcompany,Ezsigndocument,EzsigndocumentProof,EzsigndocumentProofdocument,Ezsigndocumentgroup,EzsigndocumentgroupProof,EzsigndocumentgroupProofdocument,EzsigndocumentAttachment,Folder,Franchiseagence,Franchisebroker,Franchisecomplaint,Franchisefranchise,Franchiseoffice,Ghacqcontract,Inscription,Inscriptionnotauthenticated,Inscriptiontemp,Invoice,Lead,Marketingfollow,Marketingprogram,Notary,Officetaxreport,Otherincome,Paymentpreparation,Purchase,Reconciliation,Rejectedoffertopurchase,Salary,Supplier,Template,Tranqcontract
 */

@JsonClass(generateAdapter = false)
enum class FieldEAttachmentDocumenttype(val value: kotlin.String) {

    @Json(name = "Adjustment")
    Adjustment("Adjustment"),

    @Json(name = "Agent")
    Agent("Agent"),

    @Json(name = "Bankaccount")
    Bankaccount("Bankaccount"),

    @Json(name = "Broker")
    Broker("Broker"),

    @Json(name = "Buyercontract")
    Buyercontract("Buyercontract"),

    @Json(name = "Commissionadvance")
    Commissionadvance("Commissionadvance"),

    @Json(name = "Communication")
    Communication("Communication"),

    @Json(name = "Customer")
    Customer("Customer"),

    @Json(name = "Customertemplate")
    Customertemplate("Customertemplate"),

    @Json(name = "Deposit")
    Deposit("Deposit"),

    @Json(name = "Deposittransitcheque")
    Deposittransitcheque("Deposittransitcheque"),

    @Json(name = "Disclosure")
    Disclosure("Disclosure"),

    @Json(name = "Electronicfundstransfer")
    Electronicfundstransfer("Electronicfundstransfer"),

    @Json(name = "Employee")
    Employee("Employee"),

    @Json(name = "Externalbroker")
    Externalbroker("Externalbroker"),

    @Json(name = "Ezcomadvanceserver")
    Ezcomadvanceserver("Ezcomadvanceserver"),

    @Json(name = "Ezcomcompany")
    Ezcomcompany("Ezcomcompany"),

    @Json(name = "Ezsigndocument")
    Ezsigndocument("Ezsigndocument"),

    @Json(name = "EzsigndocumentProof")
    EzsigndocumentProof("EzsigndocumentProof"),

    @Json(name = "EzsigndocumentProofdocument")
    EzsigndocumentProofdocument("EzsigndocumentProofdocument"),

    @Json(name = "Ezsigndocumentgroup")
    Ezsigndocumentgroup("Ezsigndocumentgroup"),

    @Json(name = "EzsigndocumentgroupProof")
    EzsigndocumentgroupProof("EzsigndocumentgroupProof"),

    @Json(name = "EzsigndocumentgroupProofdocument")
    EzsigndocumentgroupProofdocument("EzsigndocumentgroupProofdocument"),

    @Json(name = "EzsigndocumentAttachment")
    EzsigndocumentAttachment("EzsigndocumentAttachment"),

    @Json(name = "Folder")
    Folder("Folder"),

    @Json(name = "Franchiseagence")
    Franchiseagence("Franchiseagence"),

    @Json(name = "Franchisebroker")
    Franchisebroker("Franchisebroker"),

    @Json(name = "Franchisecomplaint")
    Franchisecomplaint("Franchisecomplaint"),

    @Json(name = "Franchisefranchise")
    Franchisefranchise("Franchisefranchise"),

    @Json(name = "Franchiseoffice")
    Franchiseoffice("Franchiseoffice"),

    @Json(name = "Ghacqcontract")
    Ghacqcontract("Ghacqcontract"),

    @Json(name = "Inscription")
    Inscription("Inscription"),

    @Json(name = "Inscriptionnotauthenticated")
    Inscriptionnotauthenticated("Inscriptionnotauthenticated"),

    @Json(name = "Inscriptiontemp")
    Inscriptiontemp("Inscriptiontemp"),

    @Json(name = "Invoice")
    Invoice("Invoice"),

    @Json(name = "Lead")
    Lead("Lead"),

    @Json(name = "Marketingfollow")
    Marketingfollow("Marketingfollow"),

    @Json(name = "Marketingprogram")
    Marketingprogram("Marketingprogram"),

    @Json(name = "Notary")
    Notary("Notary"),

    @Json(name = "Officetaxreport")
    Officetaxreport("Officetaxreport"),

    @Json(name = "Otherincome")
    Otherincome("Otherincome"),

    @Json(name = "Paymentpreparation")
    Paymentpreparation("Paymentpreparation"),

    @Json(name = "Purchase")
    Purchase("Purchase"),

    @Json(name = "Reconciliation")
    Reconciliation("Reconciliation"),

    @Json(name = "Rejectedoffertopurchase")
    Rejectedoffertopurchase("Rejectedoffertopurchase"),

    @Json(name = "Salary")
    Salary("Salary"),

    @Json(name = "Supplier")
    Supplier("Supplier"),

    @Json(name = "Template")
    Template("Template"),

    @Json(name = "Tranqcontract")
    Tranqcontract("Tranqcontract");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEAttachmentDocumenttype) "$data" else null

        /**
         * Returns a valid [FieldEAttachmentDocumenttype] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEAttachmentDocumenttype? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

