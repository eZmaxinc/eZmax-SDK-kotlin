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

import eZmaxApi.models.CommunicationRequest
import eZmaxApi.models.CommunicationexternalrecipientRequestCompound
import eZmaxApi.models.CommunicationrecipientRequestCompound
import eZmaxApi.models.CommunicationreferenceRequest
import eZmaxApi.models.CustomCommunicationattachmentRequest
import eZmaxApi.models.CustomCommunicationsenderRequest
import eZmaxApi.models.FieldECommunicationImportance
import eZmaxApi.models.FieldECommunicationType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/communication
 *
 * @param eCommunicationType 
 * @param tCommunicationBody The Body of the Communication
 * @param bCommunicationPrivate Whether the Communication is private or not
 * @param aObjCommunicationattachment 
 * @param aObjCommunicationrecipient 
 * @param aObjCommunicationreference 
 * @param aObjCommunicationexternalrecipient 
 * @param pkiCommunicationID The unique ID of the Communication.
 * @param eCommunicationImportance 
 * @param objCommunicationsender 
 * @param sCommunicationSubject The subject of the Communication
 * @param eCommunicationAttachmenttype How the attachment should be included in the email.   Only used if eCommunicationType is **Email**
 * @param iCommunicationAttachmentlinkexpiration The number of days before the attachment link expired.   Only used if eCommunicationType is **Email** and eCommunicationattachmentType is **Link**
 * @param bCommunicationReadreceipt Whether we ask for a read receipt or not.
 */


data class CommunicationRequestCompound (

    @Json(name = "eCommunicationType")
    override val eCommunicationType: FieldECommunicationType,

    /* The Body of the Communication */
    @Json(name = "tCommunicationBody")
    override val tCommunicationBody: kotlin.String,

    /* Whether the Communication is private or not */
    @Json(name = "bCommunicationPrivate")
    override val bCommunicationPrivate: kotlin.Boolean,

    @Json(name = "a_objCommunicationattachment")
    val aObjCommunicationattachment: kotlin.collections.List<CustomCommunicationattachmentRequest>,

    @Json(name = "a_objCommunicationrecipient")
    val aObjCommunicationrecipient: kotlin.collections.List<CommunicationrecipientRequestCompound>,

    @Json(name = "a_objCommunicationreference")
    val aObjCommunicationreference: kotlin.collections.List<CommunicationreferenceRequest>,

    @Json(name = "a_objCommunicationexternalrecipient")
    val aObjCommunicationexternalrecipient: kotlin.collections.List<CommunicationexternalrecipientRequestCompound>,

    /* The unique ID of the Communication. */
    @Json(name = "pkiCommunicationID")
    override val pkiCommunicationID: kotlin.Int? = null,

    @Json(name = "eCommunicationImportance")
    override val eCommunicationImportance: FieldECommunicationImportance? = null,

    @Json(name = "objCommunicationsender")
    override val objCommunicationsender: CustomCommunicationsenderRequest? = null,

    /* The subject of the Communication */
    @Json(name = "sCommunicationSubject")
    override val sCommunicationSubject: kotlin.String? = null,

    /* How the attachment should be included in the email.   Only used if eCommunicationType is **Email** */
    @Json(name = "eCommunicationAttachmenttype")
    override val eCommunicationAttachmenttype: CommunicationRequestCompound.ECommunicationAttachmenttype? = null,

    /* The number of days before the attachment link expired.   Only used if eCommunicationType is **Email** and eCommunicationattachmentType is **Link** */
    @Json(name = "iCommunicationAttachmentlinkexpiration")
    override val iCommunicationAttachmentlinkexpiration: kotlin.Int? = null,

    /* Whether we ask for a read receipt or not. */
    @Json(name = "bCommunicationReadreceipt")
    override val bCommunicationReadreceipt: kotlin.Boolean? = null

) : CommunicationRequest {


}

