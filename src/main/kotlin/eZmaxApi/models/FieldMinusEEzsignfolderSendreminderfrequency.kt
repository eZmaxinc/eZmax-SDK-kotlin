/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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
 * Frequency at which reminders will be sent to signers that haven't signed the documents
 *
 * Values: None,Daily,Weekly
 */

enum class FieldMinusEEzsignfolderSendreminderfrequency(val value: kotlin.String) {

    @Json(name = "None")
    None("None"),

    @Json(name = "Daily")
    Daily("Daily"),

    @Json(name = "Weekly")
    Weekly("Weekly");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldMinusEEzsignfolderSendreminderfrequency) "$data" else null

        /**
         * Returns a valid [FieldMinusEEzsignfolderSendreminderfrequency] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldMinusEEzsignfolderSendreminderfrequency? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

