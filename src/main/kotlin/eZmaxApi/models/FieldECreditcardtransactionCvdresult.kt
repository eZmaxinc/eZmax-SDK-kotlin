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
 * The result for the cvd validation
 *
 * Values: Match,NoMatch,NotVerified
 */

@JsonClass(generateAdapter = false)
enum class FieldECreditcardtransactionCvdresult(val value: kotlin.String) {

    @Json(name = "Match")
    Match("Match"),

    @Json(name = "NoMatch")
    NoMatch("NoMatch"),

    @Json(name = "NotVerified")
    NotVerified("NotVerified");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldECreditcardtransactionCvdresult) "$data" else null

        /**
         * Returns a valid [FieldECreditcardtransactionCvdresult] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldECreditcardtransactionCvdresult? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

