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

import eZmaxApi.models.CustomCommunicationListElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/otherincome/{pkiOtherincomeID}/getCommunicationList
 *
 * @param aObjCommunication 
 */


data class OtherincomeGetCommunicationListV1ResponseMPayload (

    @Json(name = "a_objCommunication")
    val aObjCommunication: kotlin.collections.List<CustomCommunicationListElementResponse>

) {


}

