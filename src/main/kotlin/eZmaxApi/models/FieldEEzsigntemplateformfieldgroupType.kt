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
 * The Type of Ezsigntemplateformfieldgroup
 *
 * Values: Text,Textarea,Dropdown,Radio,Checkbox
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsigntemplateformfieldgroupType(val value: kotlin.String) {

    @Json(name = "Text")
    Text("Text"),

    @Json(name = "Textarea")
    Textarea("Textarea"),

    @Json(name = "Dropdown")
    Dropdown("Dropdown"),

    @Json(name = "Radio")
    Radio("Radio"),

    @Json(name = "Checkbox")
    Checkbox("Checkbox");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsigntemplateformfieldgroupType) "$data" else null

        /**
         * Returns a valid [FieldEEzsigntemplateformfieldgroupType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsigntemplateformfieldgroupType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

