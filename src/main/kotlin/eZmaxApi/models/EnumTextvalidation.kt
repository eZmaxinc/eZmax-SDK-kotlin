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
 * The text validation
 *
 * Values: None,Date_Left_ParenthesisYYYYMinusMMMinusDDRight_Parenthesis,Date_Left_ParenthesisMMSlashDDSlashYYYYRight_Parenthesis,Date_Left_ParenthesisMMSlashDDSlashYYRight_Parenthesis,Date_Left_ParenthesisDDSlashMMSlashYYYYRight_Parenthesis,Date_Left_ParenthesisDDSlashMMSlashYYRight_Parenthesis,Email,Letters,Numbers,Zip,ZipPlus4,PostalCode,Custom
 */

@JsonClass(generateAdapter = false)
enum class EnumTextvalidation(val value: kotlin.String) {

    @Json(name = "None")
    None("None"),

    @Json(name = "Date (YYYY-MM-DD)")
    Date_Left_ParenthesisYYYYMinusMMMinusDDRight_Parenthesis("Date (YYYY-MM-DD)"),

    @Json(name = "Date (MM/DD/YYYY)")
    Date_Left_ParenthesisMMSlashDDSlashYYYYRight_Parenthesis("Date (MM/DD/YYYY)"),

    @Json(name = "Date (MM/DD/YY)")
    Date_Left_ParenthesisMMSlashDDSlashYYRight_Parenthesis("Date (MM/DD/YY)"),

    @Json(name = "Date (DD/MM/YYYY)")
    Date_Left_ParenthesisDDSlashMMSlashYYYYRight_Parenthesis("Date (DD/MM/YYYY)"),

    @Json(name = "Date (DD/MM/YY)")
    Date_Left_ParenthesisDDSlashMMSlashYYRight_Parenthesis("Date (DD/MM/YY)"),

    @Json(name = "Email")
    Email("Email"),

    @Json(name = "Letters")
    Letters("Letters"),

    @Json(name = "Numbers")
    Numbers("Numbers"),

    @Json(name = "Zip")
    Zip("Zip"),

    @Json(name = "Zip+4")
    ZipPlus4("Zip+4"),

    @Json(name = "PostalCode")
    PostalCode("PostalCode"),

    @Json(name = "Custom")
    Custom("Custom");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is EnumTextvalidation) "$data" else null

        /**
         * Returns a valid [EnumTextvalidation] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): EnumTextvalidation? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

