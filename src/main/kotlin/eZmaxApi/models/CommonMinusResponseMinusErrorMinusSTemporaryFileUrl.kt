/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.CommonResponseErrorSTemporaryFileUrlAllOf

import com.squareup.moshi.Json

/**
 * Generic Error Message
 *
 * @param sErrorMessage More detail about the error
 * @param eErrorCode The error code. See documentation for valid values
 * @param sTemporaryFileUrl The Temporary File Url of the document that was uploaded. That url can be reused instead of uploading the file again.
 */

data class CommonMinusResponseMinusErrorMinusSTemporaryFileUrl (

    /* More detail about the error */
    @Json(name = "sErrorMessage")
    val sErrorMessage: kotlin.String,

    /* The error code. See documentation for valid values */
    @Json(name = "eErrorCode")
    val eErrorCode: kotlin.String,

    /* The Temporary File Url of the document that was uploaded. That url can be reused instead of uploading the file again. */
    @Json(name = "sTemporaryFileUrl")
    val sTemporaryFileUrl: kotlin.String? = null

)

