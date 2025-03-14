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

import eZmaxApi.models.CustomBrandingResponse
import eZmaxApi.models.FieldESystemconfigurationEzsign
import eZmaxApi.models.FieldESystemconfigurationEzsignofficeplan
import eZmaxApi.models.FieldESystemconfigurationLanguage1
import eZmaxApi.models.FieldESystemconfigurationLanguage2
import eZmaxApi.models.FieldESystemconfigurationNewexternaluseraction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Systemconfiguration Object
 *
 * @param pkiSystemconfigurationID The unique ID of the Systemconfiguration
 * @param fkiSystemconfigurationtypeID The unique ID of the Systemconfigurationtype
 * @param sSystemconfigurationtypeDescriptionX The description of the Systemconfigurationtype in the language of the requester
 * @param eSystemconfigurationNewexternaluseraction 
 * @param eSystemconfigurationLanguage1 
 * @param eSystemconfigurationLanguage2 
 * @param bSystemconfigurationEzsignpersonnal Whether if we allow the creation of personal files in eZsign
 * @param bSystemconfigurationSspr Whether if we allow SSPR
 * @param fkiBrandingID The unique ID of the Branding
 * @param eSystemconfigurationEzsign 
 * @param eSystemconfigurationEzsignofficeplan 
 * @param bSystemconfigurationEzsignpaidbyoffice Whether if Ezsign is paid by the company or not
 * @param bSystemconfigurationHascreditcardmerchant Whether there is a creditcard merchant configured or not
 * @param bSystemconfigurationIsdisposalactive Whether is Disposal processus is active or not
 * @param dtSystemconfigurationReadonlyexpirationstart The start date where the system will be in read only
 * @param dtSystemconfigurationReadonlyexpirationend The end date where the system will be in read only
 * @param objBranding 
 */


data class SystemconfigurationResponseCompound (

    /* The unique ID of the Systemconfiguration */
    @Json(name = "pkiSystemconfigurationID")
    val pkiSystemconfigurationID: kotlin.Int,

    /* The unique ID of the Systemconfigurationtype */
    @Json(name = "fkiSystemconfigurationtypeID")
    val fkiSystemconfigurationtypeID: kotlin.Int,

    /* The description of the Systemconfigurationtype in the language of the requester */
    @Json(name = "sSystemconfigurationtypeDescriptionX")
    val sSystemconfigurationtypeDescriptionX: kotlin.String,

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

    /* The unique ID of the Branding */
    @Json(name = "fkiBrandingID")
    val fkiBrandingID: kotlin.Int? = null,

    @Json(name = "eSystemconfigurationEzsign")
    @Deprecated(message = "This property is deprecated.")
    val eSystemconfigurationEzsign: FieldESystemconfigurationEzsign? = null,

    @Json(name = "eSystemconfigurationEzsignofficeplan")
    val eSystemconfigurationEzsignofficeplan: FieldESystemconfigurationEzsignofficeplan? = null,

    /* Whether if Ezsign is paid by the company or not */
    @Json(name = "bSystemconfigurationEzsignpaidbyoffice")
    val bSystemconfigurationEzsignpaidbyoffice: kotlin.Boolean? = null,

    /* Whether there is a creditcard merchant configured or not */
    @Json(name = "bSystemconfigurationHascreditcardmerchant")
    val bSystemconfigurationHascreditcardmerchant: kotlin.Boolean? = null,

    /* Whether is Disposal processus is active or not */
    @Json(name = "bSystemconfigurationIsdisposalactive")
    val bSystemconfigurationIsdisposalactive: kotlin.Boolean? = null,

    /* The start date where the system will be in read only */
    @Json(name = "dtSystemconfigurationReadonlyexpirationstart")
    val dtSystemconfigurationReadonlyexpirationstart: kotlin.String? = null,

    /* The end date where the system will be in read only */
    @Json(name = "dtSystemconfigurationReadonlyexpirationend")
    val dtSystemconfigurationReadonlyexpirationend: kotlin.String? = null,

    @Json(name = "objBranding")
    val objBranding: CustomBrandingResponse? = null

) {


}

