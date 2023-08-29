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

import eZmaxApi.models.DescriptionstaticResponseCompound
import eZmaxApi.models.EmailstaticResponseCompound
import eZmaxApi.models.FieldECommunicationrecipientObjecttype
import eZmaxApi.models.FieldECommunicationrecipientType
import eZmaxApi.models.PhonestaticResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Communicationreciient Object
 *
 * @param pkiCommunicationrecipientID The unique ID of the Communicationrecipient.
 * @param eCommunicationrecipientType 
 * @param objDescriptionstatic 
 * @param eCommunicationrecipientObjecttype 
 * @param fkiAgentID The unique ID of the Agent.
 * @param fkiBrokerID The unique ID of the Broker.
 * @param fkiContactID The unique ID of the Contact
 * @param fkiCustomerID The unique ID of the Customer.
 * @param fkiEmployeeID The unique ID of the Employee.
 * @param fkiEzsignsignerID The unique ID of the Ezsignsigner
 * @param fkiFranchiseofficeID The unique ID of the Franchisereoffice
 * @param fkiUserID The unique ID of the User
 * @param fkiAgentincorporationID The unique ID of the Agentincorporation.
 * @param fkiAssistantID The unique ID of the Assistant.
 * @param fkiExternalbrokerID The unique ID of the Externalbroker.
 * @param fkiEzcomagentID The unique ID of the Ezcomagent.
 * @param fkiNotaryID The unique ID of the Notary.
 * @param fkiRewardmemberID The unique ID of the Rewardmember.
 * @param fkiSupplierID The unique ID of the Supplier.
 * @param objEmailstatic 
 * @param objPhonestatic 
 */


data class CommunicationrecipientResponseCompound (

    /* The unique ID of the Communicationrecipient. */
    @Json(name = "pkiCommunicationrecipientID")
    val pkiCommunicationrecipientID: kotlin.Int,

    @Json(name = "eCommunicationrecipientType")
    val eCommunicationrecipientType: FieldECommunicationrecipientType,

    @Json(name = "objDescriptionstatic")
    val objDescriptionstatic: DescriptionstaticResponseCompound,

    @Json(name = "eCommunicationrecipientObjecttype")
    val eCommunicationrecipientObjecttype: FieldECommunicationrecipientObjecttype? = null,

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

    /* The unique ID of the Ezsignsigner */
    @Json(name = "fkiEzsignsignerID")
    val fkiEzsignsignerID: kotlin.Int? = null,

    /* The unique ID of the Franchisereoffice */
    @Json(name = "fkiFranchiseofficeID")
    val fkiFranchiseofficeID: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Agentincorporation. */
    @Json(name = "fkiAgentincorporationID")
    val fkiAgentincorporationID: kotlin.Int? = null,

    /* The unique ID of the Assistant. */
    @Json(name = "fkiAssistantID")
    val fkiAssistantID: kotlin.Int? = null,

    /* The unique ID of the Externalbroker. */
    @Json(name = "fkiExternalbrokerID")
    val fkiExternalbrokerID: kotlin.Int? = null,

    /* The unique ID of the Ezcomagent. */
    @Json(name = "fkiEzcomagentID")
    val fkiEzcomagentID: kotlin.Int? = null,

    /* The unique ID of the Notary. */
    @Json(name = "fkiNotaryID")
    val fkiNotaryID: kotlin.Int? = null,

    /* The unique ID of the Rewardmember. */
    @Json(name = "fkiRewardmemberID")
    val fkiRewardmemberID: kotlin.Int? = null,

    /* The unique ID of the Supplier. */
    @Json(name = "fkiSupplierID")
    val fkiSupplierID: kotlin.Int? = null,

    @Json(name = "objEmailstatic")
    val objEmailstatic: EmailstaticResponseCompound? = null,

    @Json(name = "objPhonestatic")
    val objPhonestatic: PhonestaticResponseCompound? = null

)

