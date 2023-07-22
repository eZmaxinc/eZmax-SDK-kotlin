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
 * The user type of the User.
 *
 * Values: AgentBroker,Assistant,Employee,EzsignUser,Normal
 */

@JsonClass(generateAdapter = false)
enum class FieldMinusEUserType(val value: kotlin.String) {

    @Json(name = "AgentBroker")
    AgentBroker("AgentBroker"),

    @Json(name = "Assistant")
    Assistant("Assistant"),

    @Json(name = "Employee")
    Employee("Employee"),

    @Json(name = "EzsignUser")
    EzsignUser("EzsignUser"),

    @Json(name = "Normal")
    Normal("Normal");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldMinusEUserType) "$data" else null

        /**
         * Returns a valid [FieldMinusEUserType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldMinusEUserType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

