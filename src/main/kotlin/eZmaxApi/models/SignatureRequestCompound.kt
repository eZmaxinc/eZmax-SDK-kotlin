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
 * A Signature Object and children
 *
 * @param tSignatureSvg The svg of the Signature
 * @param pkiSignatureID The unique ID of the Signature
 */


data class SignatureRequestCompound (

    /* The svg of the Signature */
    @Json(name = "tSignatureSvg")
    val tSignatureSvg: kotlin.String,

    /* The unique ID of the Signature */
    @Json(name = "pkiSignatureID")
    val pkiSignatureID: kotlin.Int? = null

)

