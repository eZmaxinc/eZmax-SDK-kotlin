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
 * The Signer requirement of the Ezsignformfieldgroup. **All** means anyone can fill it, **One** means a specific person must fill it.
 *
 * Values: All,One
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsignformfieldgroupSignerrequirement(val value: kotlin.String) {

    @Json(name = "All")
    All("All"),

    @Json(name = "One")
    One("One");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsignformfieldgroupSignerrequirement) "$data" else null

        /**
         * Returns a valid [FieldEEzsignformfieldgroupSignerrequirement] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsignformfieldgroupSignerrequirement? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

