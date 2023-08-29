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
 * The location of the tooltip relative to the Ezsigntemplatesignature's location.
 *
 * Values: TopLeft,TopCenter,TopRight,MiddleLeft,MiddleRight,BottomLeft,BottomCenter,BottomRight
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsigntemplatesignatureTooltipposition(val value: kotlin.String) {

    @Json(name = "TopLeft")
    TopLeft("TopLeft"),

    @Json(name = "TopCenter")
    TopCenter("TopCenter"),

    @Json(name = "TopRight")
    TopRight("TopRight"),

    @Json(name = "MiddleLeft")
    MiddleLeft("MiddleLeft"),

    @Json(name = "MiddleRight")
    MiddleRight("MiddleRight"),

    @Json(name = "BottomLeft")
    BottomLeft("BottomLeft"),

    @Json(name = "BottomCenter")
    BottomCenter("BottomCenter"),

    @Json(name = "BottomRight")
    BottomRight("BottomRight");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsigntemplatesignatureTooltipposition) "$data" else null

        /**
         * Returns a valid [FieldEEzsigntemplatesignatureTooltipposition] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsigntemplatesignatureTooltipposition? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

