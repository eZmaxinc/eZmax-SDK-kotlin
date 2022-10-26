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

import eZmaxApi.models.CommonMinusAuditdetail

import com.squareup.moshi.Json

/**
 * Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, objAuditdetailModified won't be returned. 
 *
 * @param objAuditdetailCreated 
 * @param objAuditdetailModified 
 */

data class CommonMinusAudit (

    @Json(name = "objAuditdetailCreated")
    val objAuditdetailCreated: CommonMinusAuditdetail,

    @Json(name = "objAuditdetailModified")
    val objAuditdetailModified: CommonMinusAuditdetail? = null

)

