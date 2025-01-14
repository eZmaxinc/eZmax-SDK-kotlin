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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationCount
 *
 * @param iCommunicationCount The count of Communication.
 */


data class InscriptionnotauthenticatedGetCommunicationCountV1ResponseMPayload (

    /* The count of Communication. */
    @Json(name = "iCommunicationCount")
    val iCommunicationCount: kotlin.Int

) {


}

