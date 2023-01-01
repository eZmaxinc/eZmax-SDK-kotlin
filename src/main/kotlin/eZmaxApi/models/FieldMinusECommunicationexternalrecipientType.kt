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

/**
 * The Type of Communicationexternalrecipient
 *
 * Values: To,Cc,Bcc
 */

enum class FieldMinusECommunicationexternalrecipientType(val value: kotlin.String) {

    @Json(name = "To")
    To("To"),

    @Json(name = "Cc")
    Cc("Cc"),

    @Json(name = "Bcc")
    Bcc("Bcc");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldMinusECommunicationexternalrecipientType) "$data" else null

        /**
         * Returns a valid [FieldMinusECommunicationexternalrecipientType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldMinusECommunicationexternalrecipientType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
