/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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
 * 
 *
 * @param sTemporaryFileUrl The Temporary File Url of the document that was uploaded. That url can be reused instead of uploading the file again.
 */

data class CommonResponseErrorSTemporaryFileUrlAllOf (

    /* The Temporary File Url of the document that was uploaded. That url can be reused instead of uploading the file again. */
    @Json(name = "sTemporaryFileUrl")
    val sTemporaryFileUrl: kotlin.String? = null

)

