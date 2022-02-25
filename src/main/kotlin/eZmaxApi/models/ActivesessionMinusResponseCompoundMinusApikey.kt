/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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


import com.squareup.moshi.Json

/**
 * An Activesession->Apikey object and children to create a complete structure
 *
 * @param pkiApikeyID The unique ID of the Apikey
 * @param sApikeyDescriptionX The description of the Apikey in the language of the requester
 */

data class ActivesessionMinusResponseCompoundMinusApikey (

    /* The unique ID of the Apikey */
    @Json(name = "pkiApikeyID")
    val pkiApikeyID: kotlin.Int,

    /* The description of the Apikey in the language of the requester */
    @Json(name = "sApikeyDescriptionX")
    val sApikeyDescriptionX: kotlin.String

)

