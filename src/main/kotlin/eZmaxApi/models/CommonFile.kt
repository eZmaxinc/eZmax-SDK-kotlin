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
 * Object representing a file used in a request or response context 
 *
 * @param sFileName The name of the file
 * @param eFileSource The source of the File
 * @param sFileUrl The URL used to reach the File
 * @param sFileBase64 The Base64 encoded binary content of the File
 */


data class CommonFile (

    /* The name of the file */
    @Json(name = "sFileName")
    val sFileName: kotlin.String,

    /* The source of the File */
    @Json(name = "eFileSource")
    val eFileSource: CommonFile.EFileSource,

    /* The URL used to reach the File */
    @Json(name = "sFileUrl")
    val sFileUrl: kotlin.String? = null,

    /* The Base64 encoded binary content of the File */
    @Json(name = "sFileBase64")
    val sFileBase64: kotlin.ByteArray? = null

) {

    /**
     * The source of the File
     *
     * Values: Base64,Url
     */
    @JsonClass(generateAdapter = false)
    enum class EFileSource(val value: kotlin.String) {
        @Json(name = "Base64") Base64("Base64"),
        @Json(name = "Url") Url("Url");
    }

}

