/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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
 * The Ezsigndocumentlog Type.
 *
 * Values: Clone,Login,Sendcode,Badcode,Goodcode,Authentication,Createpage,Download,Send,Sign,Upload,View,Completion,Changelimitdate,Unsign,ImportFromInstanet,SendEmail,FormCompletion,SignatureAttachmentAdd,SignatureAttachmentValidation,SignatureAttachmentRefused,SignatureAttachmentDeleted,DeclinedToSign
 */

enum class FieldMinusEEzsigndocumentlogType(val value: kotlin.String) {

    @Json(name = "Clone")
    Clone("Clone"),

    @Json(name = "Login")
    Login("Login"),

    @Json(name = "Sendcode")
    Sendcode("Sendcode"),

    @Json(name = "Badcode")
    Badcode("Badcode"),

    @Json(name = "Goodcode")
    Goodcode("Goodcode"),

    @Json(name = "Authentication")
    Authentication("Authentication"),

    @Json(name = "Createpage")
    Createpage("Createpage"),

    @Json(name = "Download")
    Download("Download"),

    @Json(name = "Send")
    Send("Send"),

    @Json(name = "Sign")
    Sign("Sign"),

    @Json(name = "Upload")
    Upload("Upload"),

    @Json(name = "View")
    View("View"),

    @Json(name = "Completion")
    Completion("Completion"),

    @Json(name = "Changelimitdate")
    Changelimitdate("Changelimitdate"),

    @Json(name = "Unsign")
    Unsign("Unsign"),

    @Json(name = "ImportFromInstanet")
    ImportFromInstanet("ImportFromInstanet"),

    @Json(name = "SendEmail")
    SendEmail("SendEmail"),

    @Json(name = "FormCompletion")
    FormCompletion("FormCompletion"),

    @Json(name = "SignatureAttachmentAdd")
    SignatureAttachmentAdd("SignatureAttachmentAdd"),

    @Json(name = "SignatureAttachmentValidation")
    SignatureAttachmentValidation("SignatureAttachmentValidation"),

    @Json(name = "SignatureAttachmentRefused")
    SignatureAttachmentRefused("SignatureAttachmentRefused"),

    @Json(name = "SignatureAttachmentDeleted")
    SignatureAttachmentDeleted("SignatureAttachmentDeleted"),

    @Json(name = "DeclinedToSign")
    DeclinedToSign("DeclinedToSign");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldMinusEEzsigndocumentlogType) "$data" else null

        /**
         * Returns a valid [FieldMinusEEzsigndocumentlogType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldMinusEEzsigndocumentlogType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

