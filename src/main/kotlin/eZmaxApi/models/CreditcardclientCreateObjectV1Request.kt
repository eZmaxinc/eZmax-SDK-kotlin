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

import eZmaxApi.models.CreditcardclientRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/creditcardclient
 *
 * @param aObjCreditcardclient 
 */


data class CreditcardclientCreateObjectV1Request (

    @Json(name = "a_objCreditcardclient")
    val aObjCreditcardclient: kotlin.collections.List<CreditcardclientRequestCompound>

)
