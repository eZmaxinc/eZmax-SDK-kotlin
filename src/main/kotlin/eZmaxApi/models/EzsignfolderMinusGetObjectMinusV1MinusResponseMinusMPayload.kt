/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.43
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models

import eZmaxApi.models.CommonMinusAudit
import eZmaxApi.models.EzsignfolderMinusResponse
import eZmaxApi.models.FieldMinusEEzsignfolderSendreminderfrequency
import eZmaxApi.models.FieldMinusEEzsignfolderStep

import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsignfolder/getObject API Request
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.    This value can be queried by the API and is also visible in the admin interface.    There are two types of Ezsignfoldertype. **User** and **Shared**. **User** can only be seen by the user who created the folder or its assistants. Access to **Shared** folders are configurable for access and email delivery. You should typically choose a **Shared** type here.
 * @param fkiEzsigntsarequirementID The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
 * @param sEzsignfolderDescription The description of the Ezsign Folder
 * @param tEzsignfolderNote Somes extra notes about the eZsign Folder
 * @param eEzsignfolderSendreminderfrequency 
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param dtEzsignfolderSentdate The date and time at which the Ezsign folder was sent the last time.
 * @param eEzsignfolderStep 
 * @param dtEzsignfolderClose The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely.
 * @param objAudit 
 */

data class EzsignfolderMinusGetObjectMinusV1MinusResponseMinusMPayload (
    /* The unique ID of the Ezsignfoldertype.    This value can be queried by the API and is also visible in the admin interface.    There are two types of Ezsignfoldertype. **User** and **Shared**. **User** can only be seen by the user who created the folder or its assistants. Access to **Shared** folders are configurable for access and email delivery. You should typically choose a **Shared** type here. */
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
    val eEzsignfolderSendreminderfrequency: FieldMinusEEzsignfolderSendreminderfrequency,
    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int,
    /* The date and time at which the Ezsign folder was sent the last time. */
    @Json(name = "dtEzsignfolderSentdate")
    val dtEzsignfolderSentdate: kotlin.String,
    @Json(name = "eEzsignfolderStep")
    val eEzsignfolderStep: FieldMinusEEzsignfolderStep,
    /* The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely. */
    @Json(name = "dtEzsignfolderClose")
    val dtEzsignfolderClose: kotlin.String,
    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit
)

