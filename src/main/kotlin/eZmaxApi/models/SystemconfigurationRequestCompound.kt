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

import eZmaxApi.models.FieldESystemconfigurationEzsign
import eZmaxApi.models.FieldESystemconfigurationLanguage1
import eZmaxApi.models.FieldESystemconfigurationLanguage2
import eZmaxApi.models.FieldESystemconfigurationNewexternaluseraction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Systemconfiguration Object and children
 *
 * @param eSystemconfigurationNewexternaluseraction 
 * @param eSystemconfigurationLanguage1 
 * @param eSystemconfigurationLanguage2 
 * @param bSystemconfigurationEzsignpersonnal Whether if we allow the creation of personal files in eZsign
 * @param bSystemconfigurationSspr Whether if we allow SSPR
 * @param pkiSystemconfigurationID The unique ID of the Systemconfiguration
 * @param eSystemconfigurationEzsign 
 * @param dtSystemconfigurationReadonlyexpirationstart The start date where the system will be in read only
 * @param dtSystemconfigurationReadonlyexpirationend The end date where the system will be in read only
 */


data class SystemconfigurationRequestCompound (

    @Json(name = "eSystemconfigurationNewexternaluseraction")
    val eSystemconfigurationNewexternaluseraction: FieldESystemconfigurationNewexternaluseraction,

    @Json(name = "eSystemconfigurationLanguage1")
    val eSystemconfigurationLanguage1: FieldESystemconfigurationLanguage1,

    @Json(name = "eSystemconfigurationLanguage2")
    val eSystemconfigurationLanguage2: FieldESystemconfigurationLanguage2,

    /* Whether if we allow the creation of personal files in eZsign */
    @Json(name = "bSystemconfigurationEzsignpersonnal")
    val bSystemconfigurationEzsignpersonnal: kotlin.Boolean,

    /* Whether if we allow SSPR */
    @Json(name = "bSystemconfigurationSspr")
    val bSystemconfigurationSspr: kotlin.Boolean,

    /* The unique ID of the Systemconfiguration */
    @Json(name = "pkiSystemconfigurationID")
    val pkiSystemconfigurationID: kotlin.Int? = null,

    @Json(name = "eSystemconfigurationEzsign")
    val eSystemconfigurationEzsign: FieldESystemconfigurationEzsign? = null,

    /* The start date where the system will be in read only */
    @Json(name = "dtSystemconfigurationReadonlyexpirationstart")
    val dtSystemconfigurationReadonlyexpirationstart: kotlin.String? = null,

    /* The end date where the system will be in read only */
    @Json(name = "dtSystemconfigurationReadonlyexpirationend")
    val dtSystemconfigurationReadonlyexpirationend: kotlin.String? = null

)

