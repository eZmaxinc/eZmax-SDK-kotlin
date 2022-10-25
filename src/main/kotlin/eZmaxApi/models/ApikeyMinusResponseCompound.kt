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

import eZmaxApi.models.ApikeyMinusResponse
import eZmaxApi.models.CommonMinusAudit
import eZmaxApi.models.MultilingualMinusApikeyDescription

import com.squareup.moshi.Json

/**
 * An Apikey Object and children to create a complete structure
 *
 * @param objApikeyDescription 
 * @param pkiApikeyID The unique ID of the Apikey
 * @param objAudit 
 * @param sComputedToken The secret token for the API key.  This will be returned only on creation.
 */

data class ApikeyMinusResponseCompound (

    @Json(name = "objApikeyDescription")
    val objApikeyDescription: MultilingualMinusApikeyDescription,

    /* The unique ID of the Apikey */
    @Json(name = "pkiApikeyID")
    val pkiApikeyID: kotlin.Int,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit,

    /* The secret token for the API key.  This will be returned only on creation. */
    @Json(name = "sComputedToken")
    val sComputedToken: kotlin.String? = null

)
