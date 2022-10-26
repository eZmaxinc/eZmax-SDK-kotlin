/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * The type of signature.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **City** is to request the city where the document is signed. 2. **Handwritten** is for a handwritten kind of signature where users needs to \"draw\" their signature on screen. 3. **Initials** is a simple \"click to add initials\" block. 4. **Name** is a simple \"Click to sign\" block. This is the most common block of signature. 5. **Attachments** is to ask for files as attachment that may be validate in another step.
 *
 * Values: Acknowledgement,City,Handwritten,Initials,Name,Attachments
 */

enum class FieldMinusEEzsignsignatureType(val value: kotlin.String) {

    @Json(name = "Acknowledgement")
    Acknowledgement("Acknowledgement"),

    @Json(name = "City")
    City("City"),

    @Json(name = "Handwritten")
    Handwritten("Handwritten"),

    @Json(name = "Initials")
    Initials("Initials"),

    @Json(name = "Name")
    Name("Name"),

    @Json(name = "Attachments")
    Attachments("Attachments");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldMinusEEzsignsignatureType) "$data" else null

        /**
         * Returns a valid [FieldMinusEEzsignsignatureType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldMinusEEzsignsignatureType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

