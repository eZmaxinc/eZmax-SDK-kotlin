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

import eZmaxApi.models.ActivesessionResponseCompoundApikey
import eZmaxApi.models.ActivesessionResponseCompoundUser
import eZmaxApi.models.FieldEActivesessionOrigin
import eZmaxApi.models.FieldEActivesessionUsertype
import eZmaxApi.models.FieldEActivesessionWeekdaystart
import eZmaxApi.models.FieldEUserEzsignaccess
import eZmaxApi.models.FieldEUserEzsignprepaid

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/activesession/getCurrent
 *
 * @param eActivesessionUsertype 
 * @param eActivesessionOrigin 
 * @param eActivesessionWeekdaystart 
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sCompanyNameX The Name of the Company in the language of the requester
 * @param sDepartmentNameX The Name of the Department in the language of the requester
 * @param bActivesessionDebug Whether the active session is in debug or not
 * @param bActivesessionIssuperadmin Whether the active session is superadmin or not
 * @param pksCustomerCode The customer code assigned to your account
 * @param fkiSystemconfigurationtypeID The unique ID of the Systemconfigurationtype
 * @param eUserEzsignaccess 
 * @param aPkiPermissionID An array of permissions granted to the user or api key
 * @param objUserReal 
 * @param aEModuleInternalname An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.
 * @param fkiSignatureID The unique ID of the Signature
 * @param eUserEzsignprepaid 
 * @param dtUserEzsignprepaidexpiration The eZsign prepaid expiration date
 * @param objUserCloned 
 * @param objApikey 
 */


data class ActivesessionGetCurrentV1ResponseMPayload (

    @Json(name = "eActivesessionUsertype")
    val eActivesessionUsertype: FieldEActivesessionUsertype,

    @Json(name = "eActivesessionOrigin")
    val eActivesessionOrigin: FieldEActivesessionOrigin,

    @Json(name = "eActivesessionWeekdaystart")
    val eActivesessionWeekdaystart: FieldEActivesessionWeekdaystart,

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

    /* Whether the active session is superadmin or not */
    @Json(name = "bActivesessionIssuperadmin")
    val bActivesessionIssuperadmin: kotlin.Boolean,

    /* The customer code assigned to your account */
    @Json(name = "pksCustomerCode")
    val pksCustomerCode: kotlin.String,

    /* The unique ID of the Systemconfigurationtype */
    @Json(name = "fkiSystemconfigurationtypeID")
    val fkiSystemconfigurationtypeID: kotlin.Int,

    @Json(name = "eUserEzsignaccess")
    val eUserEzsignaccess: FieldEUserEzsignaccess,

    /* An array of permissions granted to the user or api key */
    @Json(name = "a_pkiPermissionID")
    val aPkiPermissionID: kotlin.collections.List<kotlin.Int>,

    @Json(name = "objUserReal")
    val objUserReal: ActivesessionResponseCompoundUser,

    /* An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. */
    @Json(name = "a_eModuleInternalname")
    val aEModuleInternalname: kotlin.collections.List<kotlin.String>,

    /* The unique ID of the Signature */
    @Json(name = "fkiSignatureID")
    val fkiSignatureID: kotlin.Int? = null,

    @Json(name = "eUserEzsignprepaid")
    val eUserEzsignprepaid: FieldEUserEzsignprepaid? = null,

    /* The eZsign prepaid expiration date */
    @Json(name = "dtUserEzsignprepaidexpiration")
    val dtUserEzsignprepaidexpiration: kotlin.String? = null,

    @Json(name = "objUserCloned")
    val objUserCloned: ActivesessionResponseCompoundUser? = null,

    @Json(name = "objApikey")
    val objApikey: ActivesessionResponseCompoundApikey? = null

)

