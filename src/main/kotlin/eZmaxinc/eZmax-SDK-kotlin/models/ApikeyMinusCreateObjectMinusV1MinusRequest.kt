/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
*
* The version of the OpenAPI document: 1.0.28
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/apikey/createObject API Request
 * @param objApikey 
 * @param objApikeyCompound 
 */

data class ApikeyMinusCreateObjectMinusV1MinusRequest (
    @Json(name = "objApikey")
    val objApikey: ApikeyMinusRequest? = null,
    @Json(name = "objApikeyCompound")
    val objApikeyCompound: ApikeyMinusRequestCompound? = null
)

