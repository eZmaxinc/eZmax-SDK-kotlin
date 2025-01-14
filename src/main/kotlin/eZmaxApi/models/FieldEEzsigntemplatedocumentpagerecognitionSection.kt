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
 * The section of the Ezsigntemplatedocumentpagerecognition
 *
 * Values: FirstLine,LastLine,Page,Region
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsigntemplatedocumentpagerecognitionSection(val value: kotlin.String) {

    @Json(name = "FirstLine")
    FirstLine("FirstLine"),

    @Json(name = "LastLine")
    LastLine("LastLine"),

    @Json(name = "Page")
    Page("Page"),

    @Json(name = "Region")
    Region("Region");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsigntemplatedocumentpagerecognitionSection) "$data" else null

        /**
         * Returns a valid [FieldEEzsigntemplatedocumentpagerecognitionSection] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsigntemplatedocumentpagerecognitionSection? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

