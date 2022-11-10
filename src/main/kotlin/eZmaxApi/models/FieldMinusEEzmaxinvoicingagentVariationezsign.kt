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
 * Variation type for eZsign
 *
 * Values: Charge,Refund,Same
 */

enum class FieldMinusEEzmaxinvoicingagentVariationezsign(val value: kotlin.String) {

    @Json(name = "Charge")
    Charge("Charge"),

    @Json(name = "Refund")
    Refund("Refund"),

    @Json(name = "Same")
    Same("Same");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldMinusEEzmaxinvoicingagentVariationezsign) "$data" else null

        /**
         * Returns a valid [FieldMinusEEzmaxinvoicingagentVariationezsign] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldMinusEEzmaxinvoicingagentVariationezsign? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

