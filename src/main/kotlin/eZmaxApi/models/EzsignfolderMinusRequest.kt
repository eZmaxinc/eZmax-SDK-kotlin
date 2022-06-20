/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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

import eZmaxApi.models.FieldMinusEEzsignfolderSendreminderfrequency

import com.squareup.moshi.Json

/**
 * An Ezsignfolder Object
 *
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param tEzsignfolderNote Note about the Ezsignfolder
 * @param eEzsignfolderSendreminderfrequency 
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param fkiEzsigntsarequirementID The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
 */

data class EzsignfolderMinusRequest (

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The description of the Ezsignfolder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    /* Note about the Ezsignfolder */
    @Json(name = "tEzsignfolderNote")
    val tEzsignfolderNote: kotlin.String,

    @Json(name = "eEzsignfolderSendreminderfrequency")
    val eEzsignfolderSendreminderfrequency: FieldMinusEEzsignfolderSendreminderfrequency,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**| */
    @Json(name = "fkiEzsigntsarequirementID")
    val fkiEzsigntsarequirementID: kotlin.Int? = null

)

