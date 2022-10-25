/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.ActivesessionMinusResponseCompoundMinusApikey
import eZmaxApi.models.ActivesessionMinusResponseCompoundMinusUser

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aPkiPermissionID An array of permissions granted to the user or api key
 * @param objUserReal 
 * @param aEModuleInternalname An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.
 * @param objUserCloned 
 * @param objApikey 
 */

data class ActivesessionResponseCompoundAllOf (

    /* An array of permissions granted to the user or api key */
    @Json(name = "a_pkiPermissionID")
    val aPkiPermissionID: kotlin.collections.List<kotlin.Int>,

    @Json(name = "objUserReal")
    val objUserReal: ActivesessionMinusResponseCompoundMinusUser,

    /* An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. */
    @Json(name = "a_eModuleInternalname")
    val aEModuleInternalname: kotlin.collections.List<kotlin.String>,

    @Json(name = "objUserCloned")
    val objUserCloned: ActivesessionMinusResponseCompoundMinusUser? = null,

    @Json(name = "objApikey")
    val objApikey: ActivesessionMinusResponseCompoundMinusApikey? = null

)

