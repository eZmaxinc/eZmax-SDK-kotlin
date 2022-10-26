/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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

import eZmaxApi.models.FieldMinusEActivesessionUsertype
import eZmaxApi.models.FieldMinusEActivesessionWeekdaystart

import com.squareup.moshi.Json

/**
 * An Activesession Object
 *
 * @param eActivesessionUsertype 
 * @param eActivesessionWeekdaystart 
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sCompanyNameX The Name of the Company in the language of the requester
 * @param sDepartmentNameX The Name of the Department in the language of the requester
 * @param bActivesessionDebug Whether the active session is in debug or not
 * @param pksCustomerCode The customer code assigned to your account
 * @param fkiSystemconfigurationtypeID The unique ID of the Systemconfigurationtype
 */

data class ActivesessionMinusResponse (

    @Json(name = "eActivesessionUsertype")
    val eActivesessionUsertype: FieldMinusEActivesessionUsertype,

    @Json(name = "eActivesessionWeekdaystart")
    val eActivesessionWeekdaystart: FieldMinusEActivesessionWeekdaystart,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The Name of the Company in the language of the requester */
    @Json(name = "sCompanyNameX")
    val sCompanyNameX: kotlin.String,

    /* The Name of the Department in the language of the requester */
    @Json(name = "sDepartmentNameX")
    val sDepartmentNameX: kotlin.String,

    /* Whether the active session is in debug or not */
    @Json(name = "bActivesessionDebug")
    val bActivesessionDebug: kotlin.Boolean,

    /* The customer code assigned to your account */
    @Json(name = "pksCustomerCode")
    val pksCustomerCode: kotlin.String,

    /* The unique ID of the Systemconfigurationtype */
    @Json(name = "fkiSystemconfigurationtypeID")
    val fkiSystemconfigurationtypeID: kotlin.Int? = null

)

