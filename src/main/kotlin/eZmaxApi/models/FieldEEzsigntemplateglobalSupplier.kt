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
 * The Supplier of the Ezsigntemplateglobal
 *
 * Values: Centris,Webforms,GHACQ
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsigntemplateglobalSupplier(val value: kotlin.String) {

    @Json(name = "Centris")
    Centris("Centris"),

    @Json(name = "Webforms")
    Webforms("Webforms"),

    @Json(name = "GHACQ")
    GHACQ("GHACQ");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsigntemplateglobalSupplier) "$data" else null

        /**
         * Returns a valid [FieldEEzsigntemplateglobalSupplier] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsigntemplateglobalSupplier? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

