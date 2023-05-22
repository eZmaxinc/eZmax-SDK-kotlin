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

import eZmaxApi.models.CommonMinusAudit
import eZmaxApi.models.CommunicationattachmentMinusResponseCompound
import eZmaxApi.models.CommunicationexternalrecipientMinusResponseCompound
import eZmaxApi.models.CommunicationrecipientMinusResponseCompound
import eZmaxApi.models.ComputedMinusECommunicationDirection
import eZmaxApi.models.DescriptionstaticMinusResponse
import eZmaxApi.models.EmailstaticMinusResponse
import eZmaxApi.models.FieldMinusECommunicationImportance
import eZmaxApi.models.FieldMinusECommunicationType
import eZmaxApi.models.PhonestaticMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Communication Object
 *
 * @param pkiCommunicationID The unique ID of the Communication.
 * @param eCommunicationImportance 
 * @param eCommunicationType 
 * @param sCommunicationSubject The subject of the Communication
 * @param eCommunicationDirection 
 * @param iCommunicationrecipientCount The count of Communicationrecipient
 * @param objAudit 
 * @param aObjCommunicationattachment 
 * @param aObjCommunicationrecipient 
 * @param aObjCommunicationexternalrecipient 
 * @param sCommunicationBodyurl The url of the body used as body in the Communication
 * @param objDescriptionstaticSender 
 * @param objEmailstaticSender 
 * @param objPhonestaticSender 
 */


data class CommunicationMinusResponseCompound (

    /* The unique ID of the Communication. */
    @Json(name = "pkiCommunicationID")
    val pkiCommunicationID: kotlin.Int,

    @Json(name = "eCommunicationImportance")
    val eCommunicationImportance: FieldMinusECommunicationImportance,

    @Json(name = "eCommunicationType")
    val eCommunicationType: FieldMinusECommunicationType,

    /* The subject of the Communication */
    @Json(name = "sCommunicationSubject")
    val sCommunicationSubject: kotlin.String,

    @Json(name = "eCommunicationDirection")
    val eCommunicationDirection: ComputedMinusECommunicationDirection,

    /* The count of Communicationrecipient */
    @Json(name = "iCommunicationrecipientCount")
    val iCommunicationrecipientCount: kotlin.Int,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit,

    @Json(name = "a_objCommunicationattachment")
    val aObjCommunicationattachment: kotlin.collections.List<CommunicationattachmentMinusResponseCompound>,

    @Json(name = "a_objCommunicationrecipient")
    val aObjCommunicationrecipient: kotlin.collections.List<CommunicationrecipientMinusResponseCompound>,

    @Json(name = "a_objCommunicationexternalrecipient")
    val aObjCommunicationexternalrecipient: kotlin.collections.List<CommunicationexternalrecipientMinusResponseCompound>,

    /* The url of the body used as body in the Communication */
    @Json(name = "sCommunicationBodyurl")
    val sCommunicationBodyurl: kotlin.String? = null,

    @Json(name = "objDescriptionstaticSender")
    val objDescriptionstaticSender: DescriptionstaticMinusResponse? = null,

    @Json(name = "objEmailstaticSender")
    val objEmailstaticSender: EmailstaticMinusResponse? = null,

    @Json(name = "objPhonestaticSender")
    val objPhonestaticSender: PhonestaticMinusResponse? = null

)

