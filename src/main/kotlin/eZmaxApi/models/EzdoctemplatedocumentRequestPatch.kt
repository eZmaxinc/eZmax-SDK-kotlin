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
 * An Ezdoctemplatedocument Object
 *
 * @param eEzdoctemplatedocumentFormat Indicates the format of the template.  This field is Required when sEzdoctemplatedocumentBase64 is set.
 * @param sEzdoctemplatedocumentFields List of field in Ezdoctemplatedocument
 * @param sEzdoctemplatedocumentBase64 The Base64 encoded binary content of the document.  This field is Required when eEzdoctemplatedocumentFormat is set.
 */


data class EzdoctemplatedocumentRequestPatch (

    /* Indicates the format of the template.  This field is Required when sEzdoctemplatedocumentBase64 is set. */
    @Json(name = "eEzdoctemplatedocumentFormat")
    val eEzdoctemplatedocumentFormat: EzdoctemplatedocumentRequestPatch.EEzdoctemplatedocumentFormat? = null,

    /* List of field in Ezdoctemplatedocument */
    @Json(name = "sEzdoctemplatedocumentFields")
    val sEzdoctemplatedocumentFields: kotlin.String? = null,

    /* The Base64 encoded binary content of the document.  This field is Required when eEzdoctemplatedocumentFormat is set. */
    @Json(name = "sEzdoctemplatedocumentBase64")
    val sEzdoctemplatedocumentBase64: kotlin.ByteArray? = null

) {

    /**
     * Indicates the format of the template.  This field is Required when sEzdoctemplatedocumentBase64 is set.
     *
     * Values: Docx,Html,Tx
     */
    @JsonClass(generateAdapter = false)
    enum class EEzdoctemplatedocumentFormat(val value: kotlin.String) {
        @Json(name = "Docx") Docx("Docx"),
        @Json(name = "Html") Html("Html"),
        @Json(name = "Tx") Tx("Tx");
    }

}

