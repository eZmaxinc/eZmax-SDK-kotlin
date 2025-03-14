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
 * A Communicationreference Object
 *
 * @param pkiCommunicationreferenceID The unique ID of the Communicationreference
 * @param fkiBuyercontractID The unique ID of the Buyercontract
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param fkiInscriptionID The unique ID of the Inscription.
 * @param fkiInscriptiontempID The unique ID of the Inscriptiontemp
 * @param fkiInvoiceID The unique ID of the Invoice.
 * @param fkiOtherincomeID The unique ID of the Otherincome
 * @param fkiElectronicfundstransferID The unique ID of the Electronicfundstransfer
 * @param fkiRejectedoffertopurchaseID The unique ID of the Rejectedoffertopurchase
 */


data class CommunicationreferenceRequest (

    /* The unique ID of the Communicationreference */
    @Json(name = "pkiCommunicationreferenceID")
    val pkiCommunicationreferenceID: kotlin.Int? = null,

    /* The unique ID of the Buyercontract */
    @Json(name = "fkiBuyercontractID")
    val fkiBuyercontractID: kotlin.Int? = null,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int? = null,

    /* The unique ID of the Inscription. */
    @Json(name = "fkiInscriptionID")
    val fkiInscriptionID: kotlin.Int? = null,

    /* The unique ID of the Inscriptiontemp */
    @Json(name = "fkiInscriptiontempID")
    val fkiInscriptiontempID: kotlin.Int? = null,

    /* The unique ID of the Invoice. */
    @Json(name = "fkiInvoiceID")
    val fkiInvoiceID: kotlin.Int? = null,

    /* The unique ID of the Otherincome */
    @Json(name = "fkiOtherincomeID")
    val fkiOtherincomeID: kotlin.Int? = null,

    /* The unique ID of the Electronicfundstransfer */
    @Json(name = "fkiElectronicfundstransferID")
    val fkiElectronicfundstransferID: kotlin.Int? = null,

    /* The unique ID of the Rejectedoffertopurchase */
    @Json(name = "fkiRejectedoffertopurchaseID")
    val fkiRejectedoffertopurchaseID: kotlin.Int? = null

) {


}

