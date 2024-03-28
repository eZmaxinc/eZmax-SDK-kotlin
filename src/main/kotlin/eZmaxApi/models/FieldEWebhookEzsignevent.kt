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
 * This Ezsign Event. This property will be set only if the Module is \"Ezsign\"
 *
 * Values: DocumentCompleted,DocumentFormCompleted,DocumentUnsent,EzsignsignerAcceptclause,EzsignsignerConnect,FolderCompleted,FolderDisposed,FolderSent,FolderUnsent,SignatureSigned
 */

@JsonClass(generateAdapter = false)
enum class FieldEWebhookEzsignevent(val value: kotlin.String) {

    @Json(name = "DocumentCompleted")
    DocumentCompleted("DocumentCompleted"),

    @Json(name = "DocumentFormCompleted")
    DocumentFormCompleted("DocumentFormCompleted"),

    @Json(name = "DocumentUnsent")
    DocumentUnsent("DocumentUnsent"),

    @Json(name = "EzsignsignerAcceptclause")
    EzsignsignerAcceptclause("EzsignsignerAcceptclause"),

    @Json(name = "EzsignsignerConnect")
    EzsignsignerConnect("EzsignsignerConnect"),

    @Json(name = "FolderCompleted")
    FolderCompleted("FolderCompleted"),

    @Json(name = "FolderDisposed")
    FolderDisposed("FolderDisposed"),

    @Json(name = "FolderSent")
    FolderSent("FolderSent"),

    @Json(name = "FolderUnsent")
    FolderUnsent("FolderUnsent"),

    @Json(name = "SignatureSigned")
    SignatureSigned("SignatureSigned");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEWebhookEzsignevent) "$data" else null

        /**
         * Returns a valid [FieldEWebhookEzsignevent] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEWebhookEzsignevent? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

