/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
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
import eZmaxApi.models.EzsignbulksendMinusResponse

import com.squareup.moshi.Json

/**
 * An Ezsignbulksend Object and children to create a complete structure
 *
 * @param pkiEzsignbulksendID The unique ID of the Ezsignbulksend
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEzsignbulksendDescription The description of the Ezsignbulksend
 * @param tEzsignbulksendNote Note about the Ezsignbulksend
 * @param bEzsignbulksendIsactive Whether the Ezsignbulksend is active or not
 * @param objAudit 
 */

data class EzsignbulksendMinusResponseCompound (

    /* The unique ID of the Ezsignbulksend */
    @Json(name = "pkiEzsignbulksendID")
    val pkiEzsignbulksendID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The description of the Ezsignbulksend */
    @Json(name = "sEzsignbulksendDescription")
    val sEzsignbulksendDescription: kotlin.String,

    /* Note about the Ezsignbulksend */
    @Json(name = "tEzsignbulksendNote")
    val tEzsignbulksendNote: kotlin.String,

    /* Whether the Ezsignbulksend is active or not */
    @Json(name = "bEzsignbulksendIsactive")
    val bEzsignbulksendIsactive: kotlin.Boolean,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit

)

