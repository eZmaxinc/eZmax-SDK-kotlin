/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.CommonMinusAudit
import eZmaxApi.models.EzsignfolderMinusResponse
import eZmaxApi.models.FieldMinusEEzsignfolderSendreminderfrequency
import eZmaxApi.models.FieldMinusEEzsignfolderStep

import com.squareup.moshi.Json

/**
 * An Ezsignfolder Object and children to create a complete structure
 *
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param sBillingentityinternalDescriptionX The description of the Billingentityinternal in the language of the requester
 * @param fkiEzsigntsarequirementID The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
 * @param sEzsigntsarequirementDescriptionX The description of the Ezsigntsarequirement in the language of the requester
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param tEzsignfolderNote Note about the Ezsignfolder
 * @param eEzsignfolderSendreminderfrequency 
 * @param dtEzsignfolderDuedate The maximum date and time at which the Ezsignfolder can be signed.
 * @param dtEzsignfolderSentdate The date and time at which the Ezsign folder was sent the last time.
 * @param dtEzsignfolderScheduledarchive The scheduled date and time at which the Ezsignfolder should be archived.
 * @param dtEzsignfolderScheduleddestruction The scheduled date and time at which the Ezsignfolder should be Destroyed.
 * @param eEzsignfolderStep 
 * @param dtEzsignfolderClose The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely.
 * @param objAudit 
 */

data class EzsignfolderMinusResponseCompound (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int,

    /* The description of the Billingentityinternal in the language of the requester */
    @Json(name = "sBillingentityinternalDescriptionX")
    val sBillingentityinternalDescriptionX: kotlin.String,

    /* The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| */
    @Json(name = "fkiEzsigntsarequirementID")
    val fkiEzsigntsarequirementID: kotlin.Int,

    /* The description of the Ezsigntsarequirement in the language of the requester */
    @Json(name = "sEzsigntsarequirementDescriptionX")
    val sEzsigntsarequirementDescriptionX: kotlin.String,

    /* The description of the Ezsignfolder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    /* Note about the Ezsignfolder */
    @Json(name = "tEzsignfolderNote")
    val tEzsignfolderNote: kotlin.String,

    @Json(name = "eEzsignfolderSendreminderfrequency")
    val eEzsignfolderSendreminderfrequency: FieldMinusEEzsignfolderSendreminderfrequency,

    /* The maximum date and time at which the Ezsignfolder can be signed. */
    @Json(name = "dtEzsignfolderDuedate")
    val dtEzsignfolderDuedate: kotlin.String,

    /* The date and time at which the Ezsign folder was sent the last time. */
    @Json(name = "dtEzsignfolderSentdate")
    val dtEzsignfolderSentdate: kotlin.String?,

    /* The scheduled date and time at which the Ezsignfolder should be archived. */
    @Json(name = "dtEzsignfolderScheduledarchive")
    val dtEzsignfolderScheduledarchive: kotlin.String,

    /* The scheduled date and time at which the Ezsignfolder should be Destroyed. */
    @Json(name = "dtEzsignfolderScheduleddestruction")
    val dtEzsignfolderScheduleddestruction: kotlin.String,

    @Json(name = "eEzsignfolderStep")
    val eEzsignfolderStep: FieldMinusEEzsignfolderStep,

    /* The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely. */
    @Json(name = "dtEzsignfolderClose")
    val dtEzsignfolderClose: kotlin.String,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit

)

