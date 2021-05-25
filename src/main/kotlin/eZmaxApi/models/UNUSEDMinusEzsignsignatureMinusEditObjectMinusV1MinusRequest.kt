/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.43
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models

import eZmaxApi.models.EzsignsignatureMinusRequest

import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsignsignature/editObject API Request
 * @param objEzsignsignature 
 */

data class UNUSEDMinusEzsignsignatureMinusEditObjectMinusV1MinusRequest (
    @Json(name = "objEzsignsignature")
    val objEzsignsignature: EzsignsignatureMinusRequest? = null
)

