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

import eZmaxApi.models.CreditcardclientResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/creditcardclient/{pkiCreditcardclientID}
 *
 * @param objCreditcardclient 
 */


data class CreditcardclientGetObjectV2ResponseMPayload (

    @Json(name = "objCreditcardclient")
    val objCreditcardclient: CreditcardclientResponseCompound

) {


}

