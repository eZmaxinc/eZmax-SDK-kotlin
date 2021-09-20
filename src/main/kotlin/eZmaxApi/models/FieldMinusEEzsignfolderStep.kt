/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.47
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
 * The signature step of the Ezsignfolder.
 *
 * Values: Unsent,Sent,PartiallySigned,Expired,Signed,Completed,Archived
 */

enum class FieldMinusEEzsignfolderStep(val value: kotlin.String) {

    @Json(name = "Unsent")
    Unsent("Unsent"),

    @Json(name = "Sent")
    Sent("Sent"),

    @Json(name = "PartiallySigned")
    PartiallySigned("PartiallySigned"),

    @Json(name = "Expired")
    Expired("Expired"),

    @Json(name = "Signed")
    Signed("Signed"),

    @Json(name = "Completed")
    Completed("Completed"),

    @Json(name = "Archived")
    Archived("Archived");

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
        fun encode(data: Any?): kotlin.String? = if (data is FieldMinusEEzsignfolderStep) "$data" else null

        /**
         * Returns a valid [FieldMinusEEzsignfolderStep] for [data], null otherwise.
         */
        fun decode(data: Any?): FieldMinusEEzsignfolderStep? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

