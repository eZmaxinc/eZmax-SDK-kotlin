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

import eZmaxApi.models.CommonAudit
import eZmaxApi.models.ComputedEEzsignfolderAccess
import eZmaxApi.models.CustomEzsignfoldertypeResponse
import eZmaxApi.models.FieldEEzsignfolderCompletion
import eZmaxApi.models.FieldEEzsignfolderDocumentdependency
import eZmaxApi.models.FieldEEzsignfolderStep

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignfolder Object
 *
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param eEzsignfolderCompletion 
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param objEzsignfoldertype 
 * @param fkiTimezoneID The unique ID of the Timezone
 * @param eEzsignfolderDocumentdependency 
 * @param sEzsignfoldertypeNameX 
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param sBillingentityinternalDescriptionX The description of the Billingentityinternal in the language of the requester
 * @param fkiEzsigntsarequirementID The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
 * @param sEzsigntsarequirementDescriptionX The description of the Ezsigntsarequirement in the language of the requester
 * @param tEzsignfolderNote Note about the Ezsignfolder
 * @param bEzsignfolderIsdisposable If the Ezsigndocument can be disposed
 * @param iEzsignfolderSendreminderfirstdays The number of days before the the first reminder sending
 * @param iEzsignfolderSendreminderotherdays The number of days after the first reminder sending
 * @param dtEzsignfolderDelayedsenddate The date and time at which the Ezsignfolder will be sent in the future.
 * @param dtEzsignfolderDuedate The maximum date and time at which the Ezsignfolder can be signed.
 * @param dtEzsignfolderSentdate The date and time at which the Ezsignfolder was sent the last time.
 * @param dtEzsignfolderScheduledarchive The scheduled date and time at which the Ezsignfolder should be archived.
 * @param dtEzsignfolderScheduleddispose The scheduled date at which the Ezsignfolder should be Disposed.
 * @param eEzsignfolderStep 
 * @param dtEzsignfolderClose The date and time at which the Ezsignfolder was closed. Either by applying the last signature or by completing it prematurely.
 * @param dtEzsignfolderArchive The date and time at which the Ezsignfolder was archived.
 * @param dtEzsignfolderDispose The date and time at which the Ezsignfolder was disposed.
 * @param tEzsignfolderMessage A custom text message that will be added to the email sent.
 * @param objAudit 
 * @param sEzsignfolderExternalid This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. 
 * @param eEzsignfolderAccess 
 */


data class EzsignfolderResponseV3 (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int,

    @Json(name = "eEzsignfolderCompletion")
    val eEzsignfolderCompletion: FieldEEzsignfolderCompletion,

    /* The description of the Ezsignfolder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int? = null,

    @Json(name = "objEzsignfoldertype")
    val objEzsignfoldertype: CustomEzsignfoldertypeResponse? = null,

    /* The unique ID of the Timezone */
    @Json(name = "fkiTimezoneID")
    val fkiTimezoneID: kotlin.Int? = null,

    @Json(name = "eEzsignfolderDocumentdependency")
    val eEzsignfolderDocumentdependency: FieldEEzsignfolderDocumentdependency? = null,

    @Json(name = "sEzsignfoldertypeNameX")
    @Deprecated(message = "This property is deprecated.")
    val sEzsignfoldertypeNameX: kotlin.String? = null,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int? = null,

    /* The description of the Billingentityinternal in the language of the requester */
    @Json(name = "sBillingentityinternalDescriptionX")
    val sBillingentityinternalDescriptionX: kotlin.String? = null,

    /* The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| */
    @Json(name = "fkiEzsigntsarequirementID")
    val fkiEzsigntsarequirementID: kotlin.Int? = null,

    /* The description of the Ezsigntsarequirement in the language of the requester */
    @Json(name = "sEzsigntsarequirementDescriptionX")
    val sEzsigntsarequirementDescriptionX: kotlin.String? = null,

    /* Note about the Ezsignfolder */
    @Json(name = "tEzsignfolderNote")
    val tEzsignfolderNote: kotlin.String? = null,

    /* If the Ezsigndocument can be disposed */
    @Json(name = "bEzsignfolderIsdisposable")
    val bEzsignfolderIsdisposable: kotlin.Boolean? = null,

    /* The number of days before the the first reminder sending */
    @Json(name = "iEzsignfolderSendreminderfirstdays")
    val iEzsignfolderSendreminderfirstdays: kotlin.Int? = null,

    /* The number of days after the first reminder sending */
    @Json(name = "iEzsignfolderSendreminderotherdays")
    val iEzsignfolderSendreminderotherdays: kotlin.Int? = null,

    /* The date and time at which the Ezsignfolder will be sent in the future. */
    @Json(name = "dtEzsignfolderDelayedsenddate")
    val dtEzsignfolderDelayedsenddate: kotlin.String? = null,

    /* The maximum date and time at which the Ezsignfolder can be signed. */
    @Json(name = "dtEzsignfolderDuedate")
    val dtEzsignfolderDuedate: kotlin.String? = null,

    /* The date and time at which the Ezsignfolder was sent the last time. */
    @Json(name = "dtEzsignfolderSentdate")
    val dtEzsignfolderSentdate: kotlin.String? = null,

    /* The scheduled date and time at which the Ezsignfolder should be archived. */
    @Json(name = "dtEzsignfolderScheduledarchive")
    val dtEzsignfolderScheduledarchive: kotlin.String? = null,

    /* The scheduled date at which the Ezsignfolder should be Disposed. */
    @Json(name = "dtEzsignfolderScheduleddispose")
    val dtEzsignfolderScheduleddispose: kotlin.String? = null,

    @Json(name = "eEzsignfolderStep")
    val eEzsignfolderStep: FieldEEzsignfolderStep? = null,

    /* The date and time at which the Ezsignfolder was closed. Either by applying the last signature or by completing it prematurely. */
    @Json(name = "dtEzsignfolderClose")
    val dtEzsignfolderClose: kotlin.String? = null,

    /* The date and time at which the Ezsignfolder was archived. */
    @Json(name = "dtEzsignfolderArchive")
    val dtEzsignfolderArchive: kotlin.String? = null,

    /* The date and time at which the Ezsignfolder was disposed. */
    @Json(name = "dtEzsignfolderDispose")
    val dtEzsignfolderDispose: kotlin.String? = null,

    /* A custom text message that will be added to the email sent. */
    @Json(name = "tEzsignfolderMessage")
    val tEzsignfolderMessage: kotlin.String? = null,

    @Json(name = "objAudit")
    val objAudit: CommonAudit? = null,

    /* This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  */
    @Json(name = "sEzsignfolderExternalid")
    val sEzsignfolderExternalid: kotlin.String? = null,

    @Json(name = "eEzsignfolderAccess")
    val eEzsignfolderAccess: ComputedEEzsignfolderAccess? = null

) {


}

