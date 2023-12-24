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
 * The type of signature.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **City** is to request the city where the document is signed. 3. **Handwritten** is for a handwritten kind of signature where users needs to \"draw\" their signature on screen. 4. **Initials** is a simple \"click to add initials\" block. 5. **Name** is a simple \"Click to sign\" block. This is the most common block of signature. 6. **NameReason** is to ask for a signing reason.  7. **Attachments** is to ask for files as attachment that may be validate in another step.    
 *
 * Values: Acknowledgement,City,Handwritten,Initials,Name,NameReason,Attachments,FieldText,FieldTextarea
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsigntemplatesignatureType(val value: kotlin.String) {

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

    @Json(name = "NameReason")
    NameReason("NameReason"),

    @Json(name = "Attachments")
    Attachments("Attachments"),

    @Json(name = "FieldText")
    FieldText("FieldText"),

    @Json(name = "FieldTextarea")
    FieldTextarea("FieldTextarea");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsigntemplatesignatureType) "$data" else null

        /**
         * Returns a valid [FieldEEzsigntemplatesignatureType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsigntemplatesignatureType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
