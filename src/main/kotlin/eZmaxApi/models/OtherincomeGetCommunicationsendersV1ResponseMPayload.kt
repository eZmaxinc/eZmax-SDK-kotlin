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

import eZmaxApi.models.CustomCommunicationsenderResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/otherincome/{pkiOtherincomeID}/getCommunicationsenders
 *
 * @param aObjCommunicationsenders 
 */


data class OtherincomeGetCommunicationsendersV1ResponseMPayload (

    @Json(name = "a_objCommunicationsenders")
    val aObjCommunicationsenders: kotlin.collections.List<CustomCommunicationsenderResponse>

) {


}

