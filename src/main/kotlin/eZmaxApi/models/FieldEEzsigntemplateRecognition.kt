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
 * Indicates whether we use the name or the content to recognize the templates to be automatically applied to documents
 *
 * Values: No,Filename,Content
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsigntemplateRecognition(val value: kotlin.String) {

    @Json(name = "No")
    No("No"),

    @Json(name = "Filename")
    Filename("Filename"),

    @Json(name = "Content")
    Content("Content");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsigntemplateRecognition) "$data" else null

        /**
         * Returns a valid [FieldEEzsigntemplateRecognition] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsigntemplateRecognition? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

