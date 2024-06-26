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
 * The error code. See documentation for valid values
 *
 * Values: BADREQUEST,BADREQUEST_CLOCKSKEW,UNAUTHORIZED_BADAUTH,UNAUTHORIZED_BADMFA,UNAUTHORIZED_EXPIRED,UNAUTHORIZED_REQUEST,FORBIDDEN,FORBIDDEN_CONFIGURATION,FORBIDDEN_MODULE,FORBIDDEN_NOACCESS,FORBIDDEN_PERMISSION,FORBIDDEN_SUBSCRIPTION,FORBIDDEN_USERTYPE,FORBIDDEN_USER_ORIGIN_EXTERNAL,NOTFOUND,NOTFOUND_OBJECT,NOTFOUND_ROUTE,METHODNOTALLOWED,NOTACCEPTABLE_CONTENT,NOTACCEPTABLE_LANGUAGE,UNPROCESSABLEENTITY_ACTIVESESSION_ALREADY_CLONING,UNPROCESSABLEENTITY_CANNOTDELETE,UNPROCESSABLEENTITY_CANNOTMODIFY,UNPROCESSABLEENTITY_CHANGEPASSWORD_INVALID_CURRENT,UNPROCESSABLEENTITY_CHANGEPASSWORD_SAME,UNPROCESSABLEENTITY_DATA_MISSING,UNPROCESSABLEENTITY_DATA_UNIQUE,UNPROCESSABLEENTITY_DATA_VALIDATION,UNPROCESSABLEENTITY_DATA_OUTOFBOUND,UNPROCESSABLEENTITY_DOWNLOAD_ERROR,UNPROCESSABLEENTITY_EZSIGNFORM_VALIDATION,UNPROCESSABLEENTITY_EZSIGNSIGNERCONNECTED,UNPROCESSABLEENTITY_NOTHINGTODO,UNPROCESSABLEENTITY_NOTREADY,UNPROCESSABLEENTITY_PDF_FORM,UNPROCESSABLEENTITY_PDF_SIGNATURE,UNPROCESSABLEENTITY_PDF_FORM_AND_SIGNATURE,UNPROCESSABLEENTITY_PDF_INCOMPATIBLE,UNPROCESSABLEENTITY_PDF_PASSWORD,UNPROCESSABLEENTITY_PDF_WRONG_PASSWORD,UNPROCESSABLEENTITY_PDF_REPAIRABLE,UNPROCESSABLEENTITY_PDF_XFA,UNPROCESSABLEENTITY_TEMPLATE_MISMATCH,UNPROCESSABLEENTITY_UNMODIFIABLE_FIELD,UNPROCESSABLEENTITY_USER_STAGED,TOOMANYREQUESTS,TOOMANYREQUESTS_THIRDPARTY,ERROR_INTERNAL,ERROR_CONFIGURATION,ERROR_NOTIMPLEMENTED
 */

@JsonClass(generateAdapter = false)
enum class FieldEErrorCode(val value: kotlin.String) {

    @Json(name = "BADREQUEST")
    BADREQUEST("BADREQUEST"),

    @Json(name = "BADREQUEST_CLOCKSKEW")
    BADREQUEST_CLOCKSKEW("BADREQUEST_CLOCKSKEW"),

    @Json(name = "UNAUTHORIZED_BADAUTH")
    UNAUTHORIZED_BADAUTH("UNAUTHORIZED_BADAUTH"),

    @Json(name = "UNAUTHORIZED_BADMFA")
    UNAUTHORIZED_BADMFA("UNAUTHORIZED_BADMFA"),

    @Json(name = "UNAUTHORIZED_EXPIRED")
    UNAUTHORIZED_EXPIRED("UNAUTHORIZED_EXPIRED"),

    @Json(name = "UNAUTHORIZED_REQUEST")
    UNAUTHORIZED_REQUEST("UNAUTHORIZED_REQUEST"),

    @Json(name = "FORBIDDEN")
    FORBIDDEN("FORBIDDEN"),

    @Json(name = "FORBIDDEN_CONFIGURATION")
    FORBIDDEN_CONFIGURATION("FORBIDDEN_CONFIGURATION"),

    @Json(name = "FORBIDDEN_MODULE")
    FORBIDDEN_MODULE("FORBIDDEN_MODULE"),

    @Json(name = "FORBIDDEN_NOACCESS")
    FORBIDDEN_NOACCESS("FORBIDDEN_NOACCESS"),

    @Json(name = "FORBIDDEN_PERMISSION")
    FORBIDDEN_PERMISSION("FORBIDDEN_PERMISSION"),

    @Json(name = "FORBIDDEN_SUBSCRIPTION")
    FORBIDDEN_SUBSCRIPTION("FORBIDDEN_SUBSCRIPTION"),

    @Json(name = "FORBIDDEN_USERTYPE")
    FORBIDDEN_USERTYPE("FORBIDDEN_USERTYPE"),

    @Json(name = "FORBIDDEN_USER_ORIGIN_EXTERNAL")
    FORBIDDEN_USER_ORIGIN_EXTERNAL("FORBIDDEN_USER_ORIGIN_EXTERNAL"),

    @Json(name = "NOTFOUND")
    NOTFOUND("NOTFOUND"),

    @Json(name = "NOTFOUND_OBJECT")
    NOTFOUND_OBJECT("NOTFOUND_OBJECT"),

    @Json(name = "NOTFOUND_ROUTE")
    NOTFOUND_ROUTE("NOTFOUND_ROUTE"),

    @Json(name = "METHODNOTALLOWED")
    METHODNOTALLOWED("METHODNOTALLOWED"),

    @Json(name = "NOTACCEPTABLE_CONTENT")
    NOTACCEPTABLE_CONTENT("NOTACCEPTABLE_CONTENT"),

    @Json(name = "NOTACCEPTABLE_LANGUAGE")
    NOTACCEPTABLE_LANGUAGE("NOTACCEPTABLE_LANGUAGE"),

    @Json(name = "UNPROCESSABLEENTITY_ACTIVESESSION_ALREADY_CLONING")
    UNPROCESSABLEENTITY_ACTIVESESSION_ALREADY_CLONING("UNPROCESSABLEENTITY_ACTIVESESSION_ALREADY_CLONING"),

    @Json(name = "UNPROCESSABLEENTITY_CANNOTDELETE")
    UNPROCESSABLEENTITY_CANNOTDELETE("UNPROCESSABLEENTITY_CANNOTDELETE"),

    @Json(name = "UNPROCESSABLEENTITY_CANNOTMODIFY")
    UNPROCESSABLEENTITY_CANNOTMODIFY("UNPROCESSABLEENTITY_CANNOTMODIFY"),

    @Json(name = "UNPROCESSABLEENTITY_CHANGEPASSWORD_INVALID_CURRENT")
    UNPROCESSABLEENTITY_CHANGEPASSWORD_INVALID_CURRENT("UNPROCESSABLEENTITY_CHANGEPASSWORD_INVALID_CURRENT"),

    @Json(name = "UNPROCESSABLEENTITY_CHANGEPASSWORD_SAME")
    UNPROCESSABLEENTITY_CHANGEPASSWORD_SAME("UNPROCESSABLEENTITY_CHANGEPASSWORD_SAME"),

    @Json(name = "UNPROCESSABLEENTITY_DATA_MISSING")
    UNPROCESSABLEENTITY_DATA_MISSING("UNPROCESSABLEENTITY_DATA_MISSING"),

    @Json(name = "UNPROCESSABLEENTITY_DATA_UNIQUE")
    UNPROCESSABLEENTITY_DATA_UNIQUE("UNPROCESSABLEENTITY_DATA_UNIQUE"),

    @Json(name = "UNPROCESSABLEENTITY_DATA_VALIDATION")
    UNPROCESSABLEENTITY_DATA_VALIDATION("UNPROCESSABLEENTITY_DATA_VALIDATION"),

    @Json(name = "UNPROCESSABLEENTITY_DATA_OUTOFBOUND")
    UNPROCESSABLEENTITY_DATA_OUTOFBOUND("UNPROCESSABLEENTITY_DATA_OUTOFBOUND"),

    @Json(name = "UNPROCESSABLEENTITY_DOWNLOAD_ERROR")
    UNPROCESSABLEENTITY_DOWNLOAD_ERROR("UNPROCESSABLEENTITY_DOWNLOAD_ERROR"),

    @Json(name = "UNPROCESSABLEENTITY_EZSIGNFORM_VALIDATION")
    UNPROCESSABLEENTITY_EZSIGNFORM_VALIDATION("UNPROCESSABLEENTITY_EZSIGNFORM_VALIDATION"),

    @Json(name = "UNPROCESSABLEENTITY_EZSIGNSIGNERCONNECTED")
    UNPROCESSABLEENTITY_EZSIGNSIGNERCONNECTED("UNPROCESSABLEENTITY_EZSIGNSIGNERCONNECTED"),

    @Json(name = "UNPROCESSABLEENTITY_NOTHINGTODO")
    UNPROCESSABLEENTITY_NOTHINGTODO("UNPROCESSABLEENTITY_NOTHINGTODO"),

    @Json(name = "UNPROCESSABLEENTITY_NOTREADY")
    UNPROCESSABLEENTITY_NOTREADY("UNPROCESSABLEENTITY_NOTREADY"),

    @Json(name = "UNPROCESSABLEENTITY_PDF_FORM")
    UNPROCESSABLEENTITY_PDF_FORM("UNPROCESSABLEENTITY_PDF_FORM"),

    @Json(name = "UNPROCESSABLEENTITY_PDF_SIGNATURE")
    UNPROCESSABLEENTITY_PDF_SIGNATURE("UNPROCESSABLEENTITY_PDF_SIGNATURE"),

    @Json(name = "UNPROCESSABLEENTITY_PDF_FORM_AND_SIGNATURE")
    UNPROCESSABLEENTITY_PDF_FORM_AND_SIGNATURE("UNPROCESSABLEENTITY_PDF_FORM_AND_SIGNATURE"),

    @Json(name = "UNPROCESSABLEENTITY_PDF_INCOMPATIBLE")
    UNPROCESSABLEENTITY_PDF_INCOMPATIBLE("UNPROCESSABLEENTITY_PDF_INCOMPATIBLE"),

    @Json(name = "UNPROCESSABLEENTITY_PDF_PASSWORD")
    UNPROCESSABLEENTITY_PDF_PASSWORD("UNPROCESSABLEENTITY_PDF_PASSWORD"),

    @Json(name = "UNPROCESSABLEENTITY_PDF_WRONG_PASSWORD")
    UNPROCESSABLEENTITY_PDF_WRONG_PASSWORD("UNPROCESSABLEENTITY_PDF_WRONG_PASSWORD"),

    @Json(name = "UNPROCESSABLEENTITY_PDF_REPAIRABLE")
    UNPROCESSABLEENTITY_PDF_REPAIRABLE("UNPROCESSABLEENTITY_PDF_REPAIRABLE"),

    @Json(name = "UNPROCESSABLEENTITY_PDF_XFA")
    UNPROCESSABLEENTITY_PDF_XFA("UNPROCESSABLEENTITY_PDF_XFA"),

    @Json(name = "UNPROCESSABLEENTITY_TEMPLATE_MISMATCH")
    UNPROCESSABLEENTITY_TEMPLATE_MISMATCH("UNPROCESSABLEENTITY_TEMPLATE_MISMATCH"),

    @Json(name = "UNPROCESSABLEENTITY_UNMODIFIABLE_FIELD")
    UNPROCESSABLEENTITY_UNMODIFIABLE_FIELD("UNPROCESSABLEENTITY_UNMODIFIABLE_FIELD"),

    @Json(name = "UNPROCESSABLEENTITY_USER_STAGED")
    UNPROCESSABLEENTITY_USER_STAGED("UNPROCESSABLEENTITY_USER_STAGED"),

    @Json(name = "TOOMANYREQUESTS")
    TOOMANYREQUESTS("TOOMANYREQUESTS"),

    @Json(name = "TOOMANYREQUESTS_THIRDPARTY")
    TOOMANYREQUESTS_THIRDPARTY("TOOMANYREQUESTS_THIRDPARTY"),

    @Json(name = "ERROR_INTERNAL")
    ERROR_INTERNAL("ERROR_INTERNAL"),

    @Json(name = "ERROR_CONFIGURATION")
    ERROR_CONFIGURATION("ERROR_CONFIGURATION"),

    @Json(name = "ERROR_NOTIMPLEMENTED")
    ERROR_NOTIMPLEMENTED("ERROR_NOTIMPLEMENTED");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEErrorCode) "$data" else null

        /**
         * Returns a valid [FieldEErrorCode] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEErrorCode? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

