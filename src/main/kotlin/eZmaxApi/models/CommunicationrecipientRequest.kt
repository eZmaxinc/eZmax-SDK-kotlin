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

import eZmaxApi.models.FieldECommunicationrecipientType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Communicationrecipient Object
 *
 * @param pkiCommunicationrecipientID The unique ID of the Communicationrecipient.
 * @param fkiAgentID The unique ID of the Agent.
 * @param fkiBrokerID The unique ID of the Broker.
 * @param fkiContactID The unique ID of the Contact
 * @param fkiCustomerID The unique ID of the Customer.
 * @param fkiEmployeeID The unique ID of the Employee.
 * @param fkiAssistantID The unique ID of the Assistant.
 * @param fkiExternalbrokerID The unique ID of the Externalbroker.
 * @param fkiEzsignsignerID The unique ID of the Ezsignsigner
 * @param fkiNotaryID The unique ID of the Notary.
 * @param fkiSupplierID The unique ID of the Supplier.
 * @param fkiUserID The unique ID of the User
 * @param fkiMailboxsharedID The unique ID of the Mailboxshared
 * @param fkiPhonelinesharedID The unique ID of the Phonelineshared
 * @param eCommunicationrecipientType 
 */


data class CommunicationrecipientRequest (

    /* The unique ID of the Communicationrecipient. */
    @Json(name = "pkiCommunicationrecipientID")
    val pkiCommunicationrecipientID: kotlin.Int? = null,

    /* The unique ID of the Agent. */
    @Json(name = "fkiAgentID")
    val fkiAgentID: kotlin.Int? = null,

    /* The unique ID of the Broker. */
    @Json(name = "fkiBrokerID")
    val fkiBrokerID: kotlin.Int? = null,

    /* The unique ID of the Contact */
    @Json(name = "fkiContactID")
    val fkiContactID: kotlin.Int? = null,

    /* The unique ID of the Customer. */
    @Json(name = "fkiCustomerID")
    val fkiCustomerID: kotlin.Int? = null,

    /* The unique ID of the Employee. */
    @Json(name = "fkiEmployeeID")
    val fkiEmployeeID: kotlin.Int? = null,

    /* The unique ID of the Assistant. */
    @Json(name = "fkiAssistantID")
    val fkiAssistantID: kotlin.Int? = null,

    /* The unique ID of the Externalbroker. */
    @Json(name = "fkiExternalbrokerID")
    val fkiExternalbrokerID: kotlin.Int? = null,

    /* The unique ID of the Ezsignsigner */
    @Json(name = "fkiEzsignsignerID")
    val fkiEzsignsignerID: kotlin.Int? = null,

    /* The unique ID of the Notary. */
    @Json(name = "fkiNotaryID")
    val fkiNotaryID: kotlin.Int? = null,

    /* The unique ID of the Supplier. */
    @Json(name = "fkiSupplierID")
    val fkiSupplierID: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Mailboxshared */
    @Json(name = "fkiMailboxsharedID")
    val fkiMailboxsharedID: kotlin.Int? = null,

    /* The unique ID of the Phonelineshared */
    @Json(name = "fkiPhonelinesharedID")
    val fkiPhonelinesharedID: kotlin.Int? = null,

    @Json(name = "eCommunicationrecipientType")
    val eCommunicationrecipientType: FieldECommunicationrecipientType? = null

) {


}

