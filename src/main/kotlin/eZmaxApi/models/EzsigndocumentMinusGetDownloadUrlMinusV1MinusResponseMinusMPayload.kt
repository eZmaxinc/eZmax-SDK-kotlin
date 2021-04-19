/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.40
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsigndocument/{pkiEzsigndocument}/getDownloadUrl API Request
 * @param sDownloadUrl The Url to the requested document.  Url will expire after 5 minutes.
 */

data class EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponseMinusMPayload (
    /* The Url to the requested document.  Url will expire after 5 minutes. */
    @Json(name = "sDownloadUrl")
    val sDownloadUrl: kotlin.String
)

