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
 * The occurence of the pattern to add the Ezsigntemplatesignature  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates**
 *
 * Values: All,First,Last
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsigntemplatesignaturePositioningoccurence(val value: kotlin.String) {

    @Json(name = "All")
    All("All"),

    @Json(name = "First")
    First("First"),

    @Json(name = "Last")
    Last("Last");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsigntemplatesignaturePositioningoccurence) "$data" else null

        /**
         * Returns a valid [FieldEEzsigntemplatesignaturePositioningoccurence] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsigntemplatesignaturePositioningoccurence? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

