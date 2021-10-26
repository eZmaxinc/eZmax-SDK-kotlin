/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.2
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

import eZmaxApi.models.EzsignfolderMinusRequest
import eZmaxApi.models.EzsignfolderRequestCompoundAllOf
import eZmaxApi.models.EzsignfoldersignerassociationMinusRequest
import eZmaxApi.models.FieldMinusEEzsignfolderSendreminderfrequency

import com.squareup.moshi.Json

/**
 * An Ezsignfolder Object and children to create a complete structure
 *
 * @param aEzsignfoldersignerassociation An array of signers that will be invited to sign the Ezsigndocuments
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiEzsigntsarequirementID The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
 * @param sEzsignfolderDescription The description of the Ezsign Folder
 * @param tEzsignfolderNote Somes extra notes about the eZsign Folder
 * @param eEzsignfolderSendreminderfrequency 
 */

data class EzsignfolderMinusRequestCompound (

    /* An array of signers that will be invited to sign the Ezsigndocuments */
    @Json(name = "a_Ezsignfoldersignerassociation")
    val aEzsignfoldersignerassociation: kotlin.collections.List<EzsignfoldersignerassociationMinusRequest>,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| */
    @Json(name = "fkiEzsigntsarequirementID")
    val fkiEzsigntsarequirementID: kotlin.Int,

    /* The description of the Ezsign Folder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    /* Somes extra notes about the eZsign Folder */
    @Json(name = "tEzsignfolderNote")
    val tEzsignfolderNote: kotlin.String,

    @Json(name = "eEzsignfolderSendreminderfrequency")
    val eEzsignfolderSendreminderfrequency: FieldMinusEEzsignfolderSendreminderfrequency

)

