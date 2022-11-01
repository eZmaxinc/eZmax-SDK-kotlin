/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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

import eZmaxApi.models.FieldMinusEVersionhistoryType
import eZmaxApi.models.FieldMinusEVersionhistoryUsertype
import eZmaxApi.models.MultilingualMinusVersionhistoryDetail
import eZmaxApi.models.VersionhistoryMinusResponse

import com.squareup.moshi.Json

/**
 * A Versionhistory Object
 *
 * @param pkiVersionhistoryID The unique ID of the Versionhistory
 * @param objVersionhistoryDetail 
 * @param dtVersionhistoryDate The date  at which the Versionhistory was published or should be published
 * @param eVersionhistoryType 
 * @param bVersionhistoryDraft Whether the Versionhistory is published or still a draft
 * @param fkiModuleID The unique ID of the Module
 * @param fkiModulesectionID The unique ID of the Modulesection
 * @param sModuleNameX The Name of the Module in the language of the requester
 * @param sModulesectionNameX The Name of the Modulesection in the language of the requester
 * @param eVersionhistoryUsertype 
 * @param dtVersionhistoryDateend The date  at which the Versionhistory will no longer be visible
 */

data class VersionhistoryMinusResponseCompound (

    /* The unique ID of the Versionhistory */
    @Json(name = "pkiVersionhistoryID")
    val pkiVersionhistoryID: kotlin.Int,

    @Json(name = "objVersionhistoryDetail")
    val objVersionhistoryDetail: MultilingualMinusVersionhistoryDetail,

    /* The date  at which the Versionhistory was published or should be published */
    @Json(name = "dtVersionhistoryDate")
    val dtVersionhistoryDate: kotlin.String,

    @Json(name = "eVersionhistoryType")
    val eVersionhistoryType: FieldMinusEVersionhistoryType,

    /* Whether the Versionhistory is published or still a draft */
    @Json(name = "bVersionhistoryDraft")
    val bVersionhistoryDraft: kotlin.Boolean,

    /* The unique ID of the Module */
    @Json(name = "fkiModuleID")
    val fkiModuleID: kotlin.Int? = null,

    /* The unique ID of the Modulesection */
    @Json(name = "fkiModulesectionID")
    val fkiModulesectionID: kotlin.Int? = null,

    /* The Name of the Module in the language of the requester */
    @Json(name = "sModuleNameX")
    val sModuleNameX: kotlin.String? = null,

    /* The Name of the Modulesection in the language of the requester */
    @Json(name = "sModulesectionNameX")
    val sModulesectionNameX: kotlin.String? = null,

    @Json(name = "eVersionhistoryUsertype")
    val eVersionhistoryUsertype: FieldMinusEVersionhistoryUsertype? = null,

    /* The date  at which the Versionhistory will no longer be visible */
    @Json(name = "dtVersionhistoryDateend")
    val dtVersionhistoryDateend: kotlin.String? = null

)

