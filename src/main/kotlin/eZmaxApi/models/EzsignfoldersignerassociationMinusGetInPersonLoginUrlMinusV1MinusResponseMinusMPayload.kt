/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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
 * Payload for GET /1/object/ezsignfoldersignerassociation/getInPersonLoginUrl
 *
 * @param sLoginUrl The Url to login to the signing application.    Url will expire after 30 minutes.  
 */

data class EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponseMinusMPayload (

    /* The Url to login to the signing application.    Url will expire after 30 minutes.   */
    @Json(name = "sLoginUrl")
    val sLoginUrl: kotlin.String

)

