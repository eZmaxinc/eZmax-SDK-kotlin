/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.35
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.MultilingualMinusApikeyDescription

import com.squareup.moshi.Json

/**
 * An Apikey Object
 * @param fkiUserID The unique ID of the User
 * @param objApikeyDescription 
 */

data class ApikeyMinusRequest (
    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,
    @Json(name = "objApikeyDescription")
    val objApikeyDescription: MultilingualMinusApikeyDescription
)

