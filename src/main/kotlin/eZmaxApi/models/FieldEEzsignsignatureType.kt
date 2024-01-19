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
 * The type of signature.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **City** is to request the city where the document is signed. 3. **Handwritten** is for a handwritten kind of signature where users needs to \"draw\" their signature on screen. 4. **Initials** is a simple \"click to add initials\" block. 5. **Name** is a simple \"Click to sign\" block. This is the most common block of signature. 6. **NameReason** is to ask for a signing reason.  7. **Attachments** is to ask for files as attachment that may be validate in another step.  8. **FieldText** is to ask for a short text. 9. **Fieldtextarea** is to ask for a text
 *
 * Values: Acknowledgement,City,Handwritten,Initials,Name,NameReason,Attachments,AttachmentsConfirmation,FieldText,FieldTextarea,Consultation
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsignsignatureType(val value: kotlin.String) {

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

    @Json(name = "AttachmentsConfirmation")
    AttachmentsConfirmation("AttachmentsConfirmation"),

    @Json(name = "FieldText")
    FieldText("FieldText"),

    @Json(name = "FieldTextarea")
    FieldTextarea("FieldTextarea"),

    @Json(name = "Consultation")
    Consultation("Consultation");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsignsignatureType) "$data" else null

        /**
         * Returns a valid [FieldEEzsignsignatureType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsignsignatureType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

