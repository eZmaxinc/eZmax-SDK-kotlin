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
 * The display status for the Notificationtest.
 *
 * Values: Show,Hide,Pin
 */

enum class FieldMinusENotificationpreferenceStatus(val value: kotlin.String) {

    @Json(name = "Show")
    Show("Show"),

    @Json(name = "Hide")
    Hide("Hide"),

    @Json(name = "Pin")
    Pin("Pin");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldMinusENotificationpreferenceStatus) "$data" else null

        /**
         * Returns a valid [FieldMinusENotificationpreferenceStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldMinusENotificationpreferenceStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

